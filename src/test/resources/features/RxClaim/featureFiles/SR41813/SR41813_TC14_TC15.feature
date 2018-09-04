Feature: Medicaid Subrogation Profile 
  As a RxClaim User I want to check claim is getting paid and rejected

## Using PlanCode1 data from TC08

  Scenario Outline: Verify if claim is getting paid.Notes related to override R75 should be stamped.Override flag as 'Y'.Member and Group has different Non PartD plan attached.
  
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		Then Validate the Plan details with "<PlanCode>","<PlanCode1>"
		And I press "F12" Key
		When I create new subrogation CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<SubrogationFlag>","<PlanCode>"
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
		And I press "Tab" Key
    And I press "F4" Key
    And I enter "<PlanCode1>" in field "Plancode" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "1" in field "Selection" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "F4" Key
    And I enter "X" in field "FtypeOption" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "12001200" in field "ID" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "9" to navigate to "RxClaim Batch Process Menu"
    And I select Option "1" to navigate to "RxClaim Claims Payment Menu"
    And I select Option "1" to navigate to "RxClaim Payment Processing Menu"
    And I select Option "9" to navigate to "Payee Menu"
    And I select Option "1" to navigate to "Payee"
    Then I create Payee with "<Payee>","<Name>","<CarrierID>","<AccountID>","<GroupID>"
    When I select Option "8" to navigate to "RxClaim Profile Maintenance"
		And I select Option "36" to navigate to "Active Medicaid Subrogation Profile"
		Then I create medicaid subrogation profile with "<ProfileID>","<PDescription>","<SDWD>","<MCSDWD>","<Code>","<Payee>"
		And I press "F12" Key
		Then I create payee override claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<MemberID>","<Payee>","<Code>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>","<Type>","<PANum>"
		And I press "F7" Key
		And I enter "8" in field "Selectionfield" on "TransactionDetailList"
		And I press "Enter" Key
		And I press "F12" Key
		And I press "F12" Key
		And I press "F14" Key
		
		Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | SubrogationFlag | Fee | UCW | Type | PANum | Payee | Name | ProfileID | PDescription | SDWD | MCSDWD | Code | PlanCode1 |
      | 41813BC | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | COMMERCIAL  | SR41813A1 | Account     | 41813BC | Group     |      010101 |      123139 | SR41813YC  |SR41813 Plan | 41813BC | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | * | SN002215 | APHARM | 310019955000 | 00     | 00310075139 |1      |1  |0   |10   | 010101 | 123139 | Y | 10 | 10 | 1 | 17621929891 | 41813BC | Test | 41813BC | Testing | 9999 | 9999 | Y | 41813A3 |
      
     Scenario Outline: Verify if claim is getting Rejected with R75.Notes related to override R75 should not be stamped.Override flag as 'N'.Member and Group has different Non PartD plan attached.
   
   		And I press "F3" Key
   		And I press "F3" Key
   		And I press "F12" Key
		  And I press "F12" Key
   		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
			And I select Option "1" to navigate to "Active Plan by Plan Code"
			Then Validate the Plan details with "<PlanCode>","<PlanCode1>"
			And I press "F12" Key
			Then I Validate the Group and Member details with "<GroupID>" and "<MemberID>"
	  	And I press "F12" Key
	  	When I select Option "8" to navigate to "RxClaim Profile Maintenance"
			And I select Option "36" to navigate to "Active Medicaid Subrogation Profile"
	  	Then I create medicaid subrogation profile with "<ProfileID>","<PDescription>","<SDWD>","<MCSDWD>","<Code>","<Payee>"
	  	And I press "F12" Key
	  	Then I create payee claim with "<RxNo>","<Payee>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<MemberID>","<Type>","<PANum>"
	  	And I press "F7" Key
			And I enter "8" in field "Selectionfield" on "TransactionDetailList"
			And I press "Enter" Key
			And I press "F12" Key
			And I press "F12" Key
			And I press "F14" Key
   		
   		
   		
     Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | SubrogationFlag | Fee | UCW | Type | PANum | Payee | Name | ProfileID | PDescription | SDWD | MCSDWD | Code | PlanCode1 |
      | 41813BC | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | COMMERCIAL  | SR41813A1 | Account     | 41813BC | Group     |      010101 |      123139 | SR41813YC  |SR41813 Plan | 41813BC | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | * | SN002215 | APHARM | 310019956000 | 00     | 00310075139 |1      |1  |0   |10   | 010101 | 123139 | Y | 10 | 10 | 1 | 17621929891 | 41813BC | Test | 41813BC | Testing | 9999 | 9999 | N | 41813A3 |
      