Feature:  Enhance RTS Threshold for DUPRx GPI Override List
As a RxClaim User I want to check claim is getting paid when drug meets GPI RTS threshold

  Scenario Outline: Verify if claim gets paid when ophthalmic drug meets GPI RTS threshold
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
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
		And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<WrtnDate>","<RefillDate>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    And I press "F12" Key
    
    Examples:
   
      | CarrierID| CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName| GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | PlanFromDt | WrtnDate | RefillDate |
      | SN3017CAR| Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SN3017ACC | Account    | SN3017GRP| Group     |      010101 |      123139 | SN003017PL  |SR41436 Plan | SN3017AE1 | AUTOMEM    | AUTOMEM   | 12251987 | 123456 | SN3017PCN | SN3017GROUP | 1718634 | 200019901007 | 00     | 10012017   | 00065053001 |30      |30  |0   |100   | 010101 | 123139 | 010101 | 01012017 | 10232017 |
      | SN3017CAR | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SN3017ACC | Account     | SN3017GRP | Group     |      010101 |      123139 | SN003017PL  |SR41436 Plan | SN3017BA1 | AUTOMEM    | AUTOMEM   | 12251987 | 123456 | SN3017PCN | SN3017GROUP | 1718634 | 200019911000 | 00     | 10012017   | 00054024424 |30      |30  |0   |100   | 010101 | 123139 | 010101 | 01012017 | 10292017 | 
      | SN3017CAR | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SN3017ACC | Account     | SN3017GRP | Group     |      010101 |      123139 | SN003017PL  |SR41436 Plan | SN3017CA1 | AUTOMEM    | AUTOMEM   | 12251987 | 123456 | SN3017PCN | SN3017GROUP | 1718634 | 200019921000 | 00     | 10012017   | 00006054331 |30      |30  |0   |100   | 010101 | 123139 | 010101 | 10012017 | 10282017 |
      | SN3017CAR | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SN3017ACC | Account     | SN3017GRP | Group     |      010101 |      123139 | SN003017PL  |SR41436 Plan | SN3017DA1 | AUTOMEM    | AUTOMEM   | 12251987 | 123456 | SN3017PCN | SN3017GROUP | 1718634 | 200019931000 | 00     | 10012017   | 00054024424 |30      |30  |0   |100   | 010101 | 123139 | 010101 | 01012017 | 10252017 |
      | SN3017CAR | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SN3017ACC | Account     | SN3017GRP | Group     |      010101 |      123139 | SN003017PL  |SR41436 Plan | SN3017EA1 | AUTOMEM    | AUTOMEM   | 12251987 | 123456 | SN3017PCN | SN3017GROUP | 1718634 | 200019941000 | 00     | 10012017   | 55289043228 |30      |30  |0   |100   | 010101 | 123139 | 010101 | 01012017 | 10302017 |  
		