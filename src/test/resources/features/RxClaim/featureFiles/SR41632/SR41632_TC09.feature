Feature:  Verify that the External Transaction Numbers are showing up correctly on the standard claim extract v80
  As a RxClaim User I want to check External Transaction Number displayed on standard claim extract

  Scenario Outline: Verify that the External Transaction Numbers are showing up correctly on the standard claim extract v80
    Given I am on RxClaim PlanAdministrator Menu
    When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
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
    When I submit a manual claim with "<BIN>","<PCN>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
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
    And I press "F12" Key
    And I press "F12" Key
    When I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "8" to navigate to "Claims by Member ID"
    And I enter "<MemberID>" in field "MemberID" on "ClaimsbyMemberIdScreen"
    And I enter "<CarrierID>" in field "CarrierID" on "ClaimsbyMemberIdScreen"
    And I enter "<AccountID>" in field "AccountID" on "ClaimsbyMemberIdScreen"
    And I press "Enter" Key
    And I enter "5" in field "Selection" on "ClaimsbyMemberIdScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key 
    Then Validate the External Transaction Number present on TransactionDetailList Screen against Standard Claim Extract with "<CarrierID>","<AccountID>","<GroupID>","<FileName>","<Library>","<Query>"
     
     Examples: 
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID   | GroupName | GroupFromDt | GroupThruDt | PlanCode | MemberID   | First Name | Last Name | DOB      | From Date | Thru Date | BIN    | PCN     | Group | PharmacyID  |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | FileName | Library | Query      | External Transaction Program |
      | SR41632QC | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41632Q7 | Account     | SR41632ZC | Group     |      010101 |      123139 | EVUASHE  | SR41632_AZ20 | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 | 777777 | QZ41632 | *     | APHARM      | 900919921016 | 00    | 6252018 | 00777310402 |2      |2  |0   |100   | Fil12 | USRPRIYA | runqry *n usrpriya/Fil12 | RCXTR008            |
    