Feature: Add logic to CAMS outbound process to check HFB table (ACMP240T)
 
 Scenario Outline: Verfify claims will be included from CAMS reporting and will not show up in CAMS dash board
  
    Given I am on RxClaim PlanAdministrator Menu
    When I press "F3" Key 
    
   	#1-Carrier Id is part of the CAMS Carrier list -Menu Path – CCT600/9/6/1 - Carrier List
    And I verify adding "<carrier>" into CAMS Carrier list
    
    #2-Add Library 'DBU10' to library list
    And I enter DBU "<Library>" to library list
    
    #3-CAG details added to file ACMP240T Table
    And I enter cag details "<ACMPTable>","<carrier>","<account>","<group>" into DBU
    
    #4-Menu Path – CCT600/1/2/option 2 on member/Attach Savings Account Schedule
    And I verify "<member>","<plan>"and attach Savings Account Schedule
    
    #5-Submit Claim adjudicated for HRA amount
    When I submit claim with "<member>" by updating "<RxNo>"
    
    #6-Run SQL Query delete data from "<ACMP_Table>" for the "<carrier>"
    And I run sql Query to delete data from "<ACMPTable>" for the "<carrier>"
       
    #7-verify the claims are added in the CAMS Dashboard after deletion
    And I submit query after deletion and verify  CAMS Dashboard "<CAMSTable>"
    Then I verify "<carrier>" exists or not
     
    #And I run sql Query to delete data from "<ACMPTable>" for the "<carrier>"
    #And I verify "<carrier>" exists or not
    
    #select * from acmp240t where carrier ='NA2017'
    #delete from acmp240t where carrier ='NA2017'
    #Plan INMFFSTEST  
    #Member  40768000100
    #select * from rx28090p2 where LGCLAIM# 
    #181843196394001 
    #181860789369001
    
     Examples: 
      |Library	|ACMPTable	|carrier	|account	|group	|member				|plan				|RxNo					|CAMSTable	|
      |DBU10		|ACMP240T		|NA2017		|1000			|100		|40768000100	|INMFFSTEST	|94699964828	|rx28090p2	|

