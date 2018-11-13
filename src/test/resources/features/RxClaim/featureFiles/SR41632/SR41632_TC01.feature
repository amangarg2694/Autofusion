Feature: Verify  the  external transaction program is attached to Transaction Control Detail page
  As a RxClaim User I want to check external transaction program

  Scenario Outline: Verify  the  external transaction program is attached to Transaction Control Detail page
    Given I am on RxClaim PlanAdministrator Menu
    When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
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
    And I enter "N" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "8" to navigate to "Profile"
    And I select Option "2" to navigate to "Transaction Control"
    And I press "F6" Key
    And I enter "<BIN>" in field "BIN" on "AddTransactionControlScreen"
    And I enter "<PCN>" in field "PCN" on "AddTransactionControlScreen"
    And I enter "<Group>" in field "GroupID" on "AddTransactionControlScreen"
    And I enter "<From Date>" in field "FromDate" on "AddTransactionControlScreen"
    And I enter "<Thru Date>" in field "ThruDate" on "AddTransactionControlScreen"
    And I press "Enter" Key
    And I enter "<CarrierID>" in field "CarrierID" on "TransactionControlDetailScreen"
    And I enter "<AccountID>" in field "AccountID" on "TransactionControlDetailScreen"
    And I enter "<GroupID>" in field "GroupID" on "TransactionControlDetailScreen"
    And I press "PageDown" Key
    And I press "PageDown" Key
    And I enter "<External Transaction Program>" in field "External Transaction Program" on "TransactionControlDetailScreen"
    And I press "Enter" Key
    When I select Option "5" to display "TransactionControlDetailScreen"
    And I press "Enter" Key
    And I press "PageDown" Key
    And I press "PageDown" Key
    Then Validate "<External Transaction Program>" on "TransactionControlDetailScreen"

    Examples: 
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID   | GroupName | GroupFromDt | GroupThruDt | PlanCode | MemberID   | First Name | Last Name | DOB      | From Date | Thru Date | External Transaction Program | BIN    | PCN     | Group |
      | SR41632CX | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41632A1 | Account     | SR41632GH | Group     |      010101 |      123139 | EVUASHE  | SR41632_B4 | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 | RCXTR008                     | 777777 | SR41635 | *     |
