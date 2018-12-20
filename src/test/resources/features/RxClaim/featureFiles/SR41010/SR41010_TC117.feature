
Feature: Rejection Code for State Medicaid Program 
  As a RxClaim User I want to check claim rejection code,claim paid and message code

  Scenario Outline: Verify New Reject code 890 return the new approved message code 46 for Batch claims
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "SN0031470A" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCode>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<PlanFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<Description>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		And I press "F7" Key
		And I enter "4" in field "Selection" on "PlanOptionsScreen"
		And I press "Enter" Key
	  And I press "F18" Key
	  And I enter "Y" in field "Medicaid Network" on "PharmacyNetworkOverride"
	  And I enter "Y" in field "CCR" on "PharmacyNetworkOverride"
	  And I press "Enter" Key
	  And I press "F12" Key
	  And I press "F3" Key
	  And I press "F3" Key
	  And I press "F3" Key
	  And I press "F12" Key
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
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "F4" Key
    And I enter "X" in field "FtypeOption" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "12001200" in field "ID" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit batch claim with "<Batch>","<BatchDesc>","<BIN>","<PCN>","<Group>","<PharmacyQual>","<Pharmacy>","<RxNo>","<Refill>","<MemberID>","<ProdQual>","<ProductID>","<DspQty>","<DS>","<Cost>"
    Then Validate Claim Status is "R"
    And I press "F12" Key
    And I enter "<RxNo1>" in field "RxNbr" on "BatchClaimScreen"
    And I enter "<CCRCode>" in field "SbmCCR" on "BatchClaimScreen"
    And I press "F6" Key
    And I press "F7" Key
    Then Validate Claim Status is "P"
    And I press "F7" Key
    And I enter "6" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key
    And I press "F9" Key
    And I press "F12" Key
    And I press "F18" Key
	Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | PlanFromDt | Batch | BatchDesc | PharmacyQual | ProdQual | RxNo1 | CCRCode |
      | SR410101 | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41010A1 | Account     | SR410101 | Group     |      010101 |      123139 | SR410101  |SR41010 PrescriberPlan | SR41010_1 | AUTOMEM    | AUTOMEM   | 12251987 | 265510 | 265510 | *    | APHARM | 100019964000 | 00     | 12032018   | 00247064407 |5      |5  |0   |100   | 010101 | 123139 | 010110 | 41010F1 | Testing | 07 | 03 | 100019964001 | 56 |
       