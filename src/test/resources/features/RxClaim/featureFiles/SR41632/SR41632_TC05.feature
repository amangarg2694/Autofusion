Feature: Verify  the  external transaction program is attached to Transaction Control Detail page
  As a RxClaim User I want to check external transaction program

  Scenario Outline: Verify  the  external transaction program is attached to Transaction Control Detail page
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
    When I submit a manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And Capture the Claim Number and write in text file
    Then Validate Claim Status is "P"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I select Option "1" to navigate to "Submit Extract Job"
    And I enter "<FillDate>" in field "ExtractDate" on "SubmitExtractJobScreen"
    And I enter "N" in field "ClearDailyFiles" on "SubmitExtractJobScreen"
    And I press "F6" Key
    And I enter "Y" in field "Confirm" on "SubmitExtractJobScreen"
    And I select Option "ws" to navigate to "Work With Submitted Jobs"
    Then Validate the Standard Extract Job status
    And I press "F3" Key
    And I press "F3" Key
    When I trigger the SQL command with "<SQLInfo>"
    And I press "F3" Key
    And I press "Enter" Key
    When I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberbyIDScreen" 
    And I press "Enter" Key
    And I enter "2" in field "Selection" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I press "F10" Key
    And I enter "5" in field "Display" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key 
    Then Validate External Transaction format on ExternalTransactionScreen
     Examples: 
      | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | Carrier | Account | Groupid | First Name | Last Name | DOB      | Start Date | End Date  | SQLInfo |
		|	777777  | SR41634     |	*  | APHARM      | 900019931405 | 00     | 6252018   | SR41632_GA5 | 00071015523|2      |2  | 0 | 100   | SR41632CZ | SR41632A1 | SR41632GG | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 |  | 
     