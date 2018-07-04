Feature:  Verify External Transaction Program does not generate External Transaction Numbers for every claim when BPG External Txn Program is missing in the BPG
  As a RxClaim User I want to check External Transaction Number does not generate for missing BPG External Txn Program

  Scenario Outline: Verify External Transaction Program does not generate External Transaction Numbers for every claim when BPG External Txn Program is missing in the BPG
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "8" to navigate to "Profile"
    And I select Option "2" to navigate to "Transaction Control"
    And I press "F6" Key
    And I enter "<BIN>" in field "BIN" on "AddTransactionControlScreen"
    And I enter "<ProcCtrl>" in field "PCN" on "AddTransactionControlScreen"
    And I enter "<Group>" in field "GroupID" on "AddTransactionControlScreen"
    And I enter "<From Date>" in field "FromDate" on "AddTransactionControlScreen"
    And I enter "<Thru Date>" in field "ThruDate" on "AddTransactionControlScreen"
    And I press "Enter" Key
    And I enter "<CarrierID>" in field "CarrierID" on "TransactionControlDetailScreen"
    And I enter "<AccountID>" in field "AccountID" on "TransactionControlDetailScreen"
    And I enter "<GroupID>" in field "GroupID" on "TransactionControlDetailScreen"
    And I press "Enter" Key
    When I select Option "5" to display "TransactionControlDetailScreen"
    And I press "Enter" Key
		And I press "PageDown" Key
    And I press "PageDown" Key
    Then Verify whether External Transaction Program field is blank
    And I press "F3" Key
    And I press "F3" Key
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
    When I submit a manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key
    Then Validate "No detail record exists." message should displayed on "TransactionDetailList"
    Examples: 
    
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | CarrierID | AccountID | GroupID | First Name | Last Name | DOB      | From Date | Thru Date | 
		|	333332  | SR41634 |	*  | APHARM      | 700019921001 | 00     | 6252018   | SR41632_MP4 | 00071015523|2      |2  |0   |100   | SR41632CZ | SR41632A1 | SR41632GG | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 |

    