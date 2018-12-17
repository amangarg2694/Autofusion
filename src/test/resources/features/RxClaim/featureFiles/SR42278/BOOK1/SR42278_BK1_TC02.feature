#Author:mudethula_venkateshwarlu@optum.com
#QE: Zelewsky, John
#Step Definition file: MemberAdjustmentLoadwithMedicalDataFile.java

#Environment: BOOK1
#@tag
Feature: FIX-IT: Member Adjustment Load with Medical Data File Closing Issue

 #@Regression
  Scenario Outline: SN003417_SR42278_TC02: Verify member is loaded with medical data, file status does not return Error Code41(File Open) File 2
    Given I am on RxClaim PlanAdministrator Menu
    When I create physical file with "<cmdCreatePhyFile>", "<FileName>", "<Library>"
    And I work with file "<cmdWorkWithFile>", "<FileName>", "<Library>"
    Then I add record in book one with "<cmdWorkWithFile>", "<FileName>", "<Library>", "<Carrier>", "<Account>", "<Group>", "<MemberID>", "<AdjustmentDate>", "<ReasonCode>", "<AdjustmentAmount>", "<RecordTimestamp>",  "<RecordOrder>", "<AmountType>", "<AdjustmentTime>", "<AdjustmentTimeMS>"
   
		And I select Option "CCT700" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "8" to navigate to "Loads to Member Files"
		And I select Option "3" to navigate to "Member Adjustment Load with Medical Data"
		Then I submit Member Adjustment Load with Medical Data with "<FileName>", "<Library>"
		
		And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "2" to navigate to "Member"
	  Then I call member details "<MemberID>"
		And I press "F8" Key
		And I select option Adjustment in MemberDetailList Screen
		And I select option Member Accumulation Adjustments in Adjustment screen
		Then I validate Manual Adjustment details page with "<Carrier>", "<Account>", "<Group>", "<MemberID>", "<AdjustmentDate>", "<ReasonCode>", "<Amount>", "<Timestamp>", "<AmountType>", "<AdjustmentTime>", "<AdjustmentTimeMS>"
	
    Examples: 
    |cmdRCMAD725		 |cmdCreatePhyFile |FileName |Library     |cmdWorkWithFile |Carrier   |Account	 |Group    |MemberID  |AdjustmentDate |AccumulationCode |ReasonCode |AdjustmentAmount |AdjustmentType|RecordTimestamp						 |RecordOrder|AmountType|SenderType|AdjustmentTime |AdjustmentTimeMS|                                     
    |CALL RCMAD725 ''|CRTPF            |VM341722 |JZELTEST    |UPDDTA FILE	   |SR42278C  |SR42278AC |SR42278G |SR42278M1 |112018	        |UHCOUT 		  		|COMMERCIAL |53    					  |O						 |2018-11-03-15.29.03.090000 |1          |B				  |M				 |143050         |0 			  	    |
   
    #|cmdCreatePhyFile |FileName |Library     |cmdWorkWithFile |Carrier   |Account	 	 |Group     |MemberID   |AdjustmentDate |ReasonCode|AdjustmentAmount |RecordTimestamp									 |AmountType |AdjustmentTime |AdjustmentTimeMS|
    #|CRTPF            |VM341712 |VENKATLIBR  |UPDDTA FILE	 	  |SR42278C  |SR42278AC  |SR42278G  |SR42278M1  |1181120	      |COMMERCIAL|31     					 |2018-11-02-15.29.03.09000000001  |BC         |143050 		     |123 				    |
   
  
      
    #UPDDTA FILE(JZELTEST/JZ34171) [BOOK1]
    #UPDDTA FILE(VENKATLIBR/VM341711)