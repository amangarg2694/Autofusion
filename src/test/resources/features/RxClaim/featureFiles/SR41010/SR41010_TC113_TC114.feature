
Feature: Rejection Code for State Medicaid Program 
  As a RxClaim User I want to check claim is paid and message code

  Scenario Outline: Verify New Reject code 889 and return the new approved message code 45 for Batch claims
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "SR41010A01" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCode>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<PlanFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<Description>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		And I enter "N" in field "PharmacyNetwork" on "PlanDetailScreen"
		And I enter "N" in field "MemberEligibility" on "PlanDetailScreen"
		And I enter "N" in field "Accumulator" on "PlanDetailScreen"
		And I press "Enter" Key
		And I enter "Y" in field "ConfirmPrompt" on "ActivePlanPharmacyNetworks"
		And I press "F7" Key
		And I enter "6" in field "Selection" on "PlanOptionsScreen"
		And I press "Enter" Key
		And I enter "4" in field "Selection" on "PlanPrescriberNetworks"
		And I press "Enter" Key
		And I enter "Y" in field "Confirm" on "PlanPrescriberNetworks"
		And I press "F6" Key
		And I enter "<NetworkID>" in field "NetworkID" on "ActiveEligiblePrescriberNetwork"
		And I press "Enter" Key
		And I enter "1" in field "Selection" on "ActiveEligiblePrescriberNetwork"
		And I press "Enter" Key
		And I press "Enter" Key
		And I enter "N" in field "Status" on "PlanPrescriberNetworkDetail"
		And I press "Enter" Key
		And I enter "Y" in field "Confirm" on "PlanPrescriberNetworkDetail"
		And I press "Tab" Key
		And I enter "7" in field "Selection" on "PlanPrescriberNetworks"
		And I press "Enter" Key
		And I press "F12" Key
		#Network Override
		When I enter details in Prescriber Network Override screen with "<Medicaid Network>","<CCR>"
		And I press "F12" Key
		And I press "F3" Key
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
    When I submit batch claim with "<Batch>","<BatchDesc>","<BIN>","<PCN>","<Group>","<PharmacyQual>","<Pharmacy>","<RxNo>","<Refill>","<MemberID>","<ProdQual>","<ProductID>","<DspQty>","<DS>","<PresQual>","<PrescriberID>","<Cost>"
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
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | Cost | From Date | Thru Date | PlanFromDt | NetworkID | PresQual | PrescriberID | Medicaid Network | CCR | CCRCode | RxNo1 | Batch | BatchDesc | PharmacyQual | ProdQual |
      | SR410107D | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41010A1 | Account     | SR410107D | Group     |      010101 |      123139 | SR410107E  |SR41010 Prescriber Plan | SR41010_7D | AUTOMEM    | AUTOMEM   | 12251987 | 265510 | 265510 | *    | APHARM | 100019961003 | 00     | 55289030814 |5      |5  |100   | 010101 | 123139 | 010110 | KSID01 | 08 | AU00000001 | Y | Y | 55 | 100019961004 | 41010A2 | Testing | 07 | 03 |
       