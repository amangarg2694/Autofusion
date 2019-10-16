#Author:mudethula_venkateshwarlu@optum.com
#QE: Zelewsky, John
#Step Definition file: MemberAdjustmentLoadwithMedicalDataFile.java
#SN003417_SR42278
#Environment: CORE/BOOK-A

Feature: FIX-IT: Member Adjustment Load with Medical Data File Closing Issue

 #@Regression
  Scenario Outline: SN003417_SR42278_TC01: Verify member is loaded with medical data, file status does not return Error Code41(File Open)
    Given I am on RxClaim PlanAdministrator Menu
    When I call Member Adjustment API Test Prompt Screen with command "<cmdRCMAD725>"
    And I enter data in Member Adjustment API Response screen with "<Carrier>", "<Account>", "<Group>", "<MemberID>", "<AdjustmentDate>", "<AccumulationCode>" "<ReasonCode>", "<AdjustmentAmount>", "<AdjustmentType>", "<RecordTimestamp>", "<RecordOrder>", "<AmountType>", "<SenderType>", "<AdjustmentTime>", "<AdjustmentTimeMS>"
    Then I verify error codes in Member Adjustment API Response screen

   Examples: 
    |cmdRCMAD725		 |cmdCreatePhyFile |FileName |Library     |cmdWorkWithFile |Carrier   |Account	 		  |Group         |MemberID   |AdjustmentDate |AccumulationCode |ReasonCode |AdjustmentAmount |AdjustmentType|RecordTimestamp						|RecordOrder|AmountType|SenderType|AdjustmentTime |AdjustmentTimeMS|                                     
    |CALL RCMAD725 ''|CRTPF            |VM341711 |VENKATLIBR  |YWRKF				   |JZTEST341 |JZ3417TESTLOAD |JZ3417TESTING |JZ3417MBR1 |112018	       |UHCOUT 		  		 |COMMERCIAL |31    					 |O						  |2018-11-02-15.29.03.090000 |1          |B				 |M				  |04913        |00 				     |
      