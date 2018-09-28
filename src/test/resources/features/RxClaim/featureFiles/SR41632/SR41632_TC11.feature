Feature:  Verify  the  external Transaction Number for XTR Transaction Type for Rejected Claims
  As a RxClaim User I want to check XTR Transaction Type for rejected claims

  Scenario Outline: Verify  the  external Transaction Number for XTR Transaction Type=5 for Rejected Claims
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key
    And I enter "<Carrier>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<Account>" in field "AccountID" on "AddMemberScreen"
    And I enter "<Groupid>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<Start Date>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<End Date>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "N" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>"," ","<Cost>"
    Then Validate Claim Status is "R"
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key
    Then Validate External Transaction format on ExternalTransactionScreen
    
     Examples: 
      | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | Cost | Carrier | Account | Groupid | First Name | Last Name | DOB      | Start Date | End Date  |  
		|	777777  | SR41634     |	*  | APHARM      | 900019931102 | 00     | 6252018   | SR41632_PR3 | 00071015523|2      |2  | 100   | SR41632CZ | SR41632A1 | SR41632GG | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 |
    