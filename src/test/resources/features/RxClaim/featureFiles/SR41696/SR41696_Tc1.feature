Feature: Verify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
As a RxClaim User I want to cVerify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
    
@Regression         
   Scenario Outline: Verify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key 
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen" 
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I enter override plan "<Plan1>" on MemberdetailScreen
    And I press "Enter" Key    
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    And Validate "Member Added." message should displayed on "AddMemberScreen"
    And  I am on RxClaim PlanAdministrator Menu 
    And I submit a claim for medlimit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Qual>","<Prescid>"
    Then Validate Claim Status is "R"
    And  I am on RxClaim PlanAdministrator Menu 
    And I submit a claim for medlimit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo1>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS1>","<PSC1>","<Cost>","<Qual>","<Prescid>"
    Then Validate Claim Status is "R"
    And I press "F7" Key
    And I press "F17" Key
    And I enter option "5" in DUR/PPS Information screen
    And I press "F8" Key
    And I press "F8" Key
    Then I validate the Medlimit PA Prediction Summary screen 
    
    
   
    Examples:
    | CarrierID | AccountID   | GroupID     |Plan1     | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate   | ProductID  | DspQty | DS | PSC | Cost      |Qual|Prescid|DS1|PSC1|RxNo1|
	#|	NARESH01  | NARESH_ACC01 |NARESH GRP  |MEDLIMIT12| MEMSR46000 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139      |	777777  | QET     |	*ALL  | 0556540      | 765488802232 | 00     | 091118    | 00054421925  |10     |7  |00   |100   |12  |AL4392748|10|3|765411577832|
	#book1 test data	|MEDLIMIT1 | MEDLIMIT1|MEDLIMIT1  |MEDLIMITB1| MEMSR49000 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139      |	777777  | ASHE     |	TEST  | 0556540      | 765488821432 | 00     | 091118    | 00024033705  |35     |7  |00   |100   |12  |AL4392748|35|3|765411531832|
	|	NARESH01  | NARESH_ACC01 |NARESH GRP  |SR42243| MEMSR47510 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139      |	777777  | ASHE     |	*ALL  | 2400074      | 765466112232 | 00     | 091118    | 00574704512  |90    |30  |00   |100   |12  |AL4392748|10|3|765224577832|