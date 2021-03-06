#Author:mudethula_venkateshwarlu@optum.com
#QE: Zelewsky, John
#Step Definition file: MemberAdjustmentLoadwithMedicalDataFile.java
#SN003417_SR42278
#Environment: CORE/BOOK-A

#@tag
Feature: FIX-IT: Member Adjustment Load with Medical Data File Closing Issue

 #@Regression
  Scenario Outline: SN003417_SR42278_TC01: Verify member is loaded with medical data, file status does not return Error Code41(File Open)
    Given I am on RxClaim PlanAdministrator Menu
    When I create physical file with "<cmdCreatePhyFile>", "<FileName>", "<Library>"
    And I work with file "<cmdWorkWithFile>", "<FileName>", "<Library>"
    Then I add record in CORE with "<cmdWorkWithFile>", "<FileName>", "<Library>", "<Carrier>", "<Account>", "<Group>", "<MemberID>","<AdjustmentDate>", "<ReasonCode>", "<AdjustmentAmount>", "<AdjustmentType>", "<RecordTimestamp>", "<RecordOrder>", "<AmountType>", "<SenderType>", "<SENDERTIMESTAMP>", "<AdjustmentTime>", "<AdjustmentTimeMS>"
    #Note: Please delete the record @YPDDAMI: Work with File - Multi record display screen    
           
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "8" to navigate to "Loads to Member Files"
		And I select Option "3" to navigate to "Member Adjustment Load with Medical Data"
		Then I submit Member Adjustment Load with Medical Data with "<FileName>", "<Library>"
		
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "2" to navigate to "Member"
	  Then I call member details "<MemberID>"
		And I press "F8" Key
		And I select option Adjustment in MemberDetailList Screen
		And I select option Member Accumulation Adjustments in Adjustment screen
		Then I validate Manual Adjustment details page with "<Carrier>", "<Account>", "<Group>", "<MemberID>","<AdjustmentDate>", "<ReasonCode>", "<AdjustmentAmount>", "<AdjustmentType>", "<RecordTimestamp>", "<RecordOrder>", "<AmountType>", "<SenderType>", "<SENDERTIMESTAMP>", "<AdjustmentTime>", "<AdjustmentTimeMS>"
	  #Note: Please delete the record @RCMAD001: Active Manual Adjustmen screen
    Examples: 
    |cmdRCMAD725		 |cmdCreatePhyFile |FileName |Library   |cmdWorkWithFile |Carrier   |Account	 		  |Group         |MemberID   |AdjustmentDate |AccumulationCode |ReasonCode |AdjustmentAmount |AdjustmentType|RecordTimestamp						|RecordOrder|AmountType|SenderType|AdjustmentTime |AdjustmentTimeMS|SENDERTIMESTAMP						|                                     
    |CALL RCMAD725 ''|CRTPF            |T341711  |JZELTEST  |YWRKF				   |JZTEST341 |JZ3417TESTLOAD |JZ3417TESTING |JZ3417MBR1 |1181120	       |UHCOUT 		  		 |COMMERCIAL |000005300				 |5						  |2018-11-02-15.29.03.090000 |00001      |B				 |C				  |143050         |123 			  	   |2018-11-01-05.29.03.090000|

