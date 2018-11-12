Feature: Verify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
As a RxClaim User I want to cVerify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
    
             
   Scenario Outline: Verify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
    Given I am on RxClaim PlanAdministrator Menu  
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added
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
		|	NARESH01  | NARESH_ACC01 |NARESH GRP  |MEDLIMIT12| MEMSR46000 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139      |	777777  | QET     |	*ALL  | 0556540      | 765466702232 | 00     | 091118    | 00054421925  |10     |7  |00   |100   |12  |AL4392748|10|3|765224577832|