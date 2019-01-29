
Feature: Rejection Code for State Medicaid Program 
  As a RxClaim User I want to check claim rejection code 

  Scenario Outline: Verify  non medicaid Prescriber Negative network will return the Reject code 71
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
		When I enter details in Prescriber Network Override screen with "<Medicaid Network>"
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
    When I submit claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PresQual>","<PrescriberID>"
    Then Validate Claim Status is "R"
    
	Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | PlanFromDt | NetworkID | PresQual | PrescriberID | Medicaid Network |
      | SR410104A | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41010A1 | Account     | SR410104A | Group     |      010101 |      123139 | SR410104C  |SR41010 PrescriberPlan | SR41010_4A | AUTOMEM    | AUTOMEM   | 12251987 | 265510 | 265510 | *    | APHARM | 100019957000 | 00     | 12032018   | 55289030830 |5      |5  |0   |100   | 010101 | 123139 | 010110 | KSID01 | 08 | AU00000001 | N |
       