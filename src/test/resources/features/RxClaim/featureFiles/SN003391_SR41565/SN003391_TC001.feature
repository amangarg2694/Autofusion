Feature: Add logic to CAMS outbound process to check HFB table (ACMP240T)
 
 Scenario Outline: Verfify claims will be excluded from CAMS reporting and will not show up in CAMS dash board
  
    Given I am on RxClaim PlanAdministrator Menu
    When I press "F3" Key 
    
   	#1-Carrier Id is part of the CAMS Carrier list -Menu Path – CCT600/9/6/1 - Carrier List
    And I verify adding "<carrier>" into CAMS Carrier list
    
    #2-Add Library 'DBU10' to library list
    And I enter DBU "<Library>" to library list
    
    #Make Sure you should not have CAG details added to ACMP240T table
    #select * from acmp240t where carrier ='NA2017'
    #delete from acmp240t where carrier ='NA2017'
    
    #3-CAG details added to file ACMP240T Table
    And I enter cag details "<ACMPTable>","<carrier>","<account>","<group>" into DBU
    
    #4-Submit Claim adjudicated for HRA amount
    When I submit claim with "<member>" by updating "<RxNo>"
    
    #4-Menu Path – CCT600/1/2/option 2 on member/Attach Savings Account Schedule
    #And I verify "<member>","<plan>"and attach Savings Account Schedule
    
    #5-Run SQL Query retrieve data from "<ACMP_Table>" for the "<carrier>"
    And I run sql Query to retrieve data from "<ACMPTable>" for the "<carrier>"
    And I verify "<carrier>" exists or not
    
    #6-verify the claims are added in the CAMS Dashboard
    And I submit query and verify  CAMS Dashboard "<CAMSTable>"
    Then I verify "<carrier>" exists or not
     
    #select * from acmp240t where carrier ='NA2017'
    #delete from acmp240t where carrier ='NA2017'
    #select * from rx28090p2 where LGCLAIM# 
    #member: SB-21-002827-M01
    # RxClaim#  181920657926002 
     
     Examples: 
      |Library	|ACMPTable	|carrier	|account	|group			|member						|plan				|RxNo					|CAMSTable	|
      |DBU10		|ACMP240T		|CITRUS1	|CITRACC1	|CITRUSGRP2	|SB-21-002827-M01	|INMFFSTEST	|11235447465	|rx28090p2	|
 	  	#|DBU10		|ACMP240T		|NA2017		|1000			|100				|40768000100			|INMFFSTEST	|70967481028	|rx28090p2	|
