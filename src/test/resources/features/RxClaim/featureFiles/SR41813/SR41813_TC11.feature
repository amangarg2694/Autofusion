Feature: Medicaid Subrogation Profile 
  As a RxClaim User I want to check claim is getting rejected and notes not stamped

## Using CAG,subrogation profile data from TC10

  Scenario Outline: Verify if claim is getting Rejected with R75.Notes related to override R75 should not be stamped.Override flag as 'N'
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "5" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I press "F7" Key
		And I enter "29" in field "Selection" on "PlanOptionsScreen"
  	And I press "Enter" Key
  	And I enter "6" in field "Selection" on "AccumulatorScreen"
  	And I press "Enter" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F12" Key
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
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | SubrogationFlag | Fee | UCW | Type | PANum | Payee | Name | ProfileID | PDescription | SDWD | MCSDWD | Code |
      | 41813AB | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | COMMERCIAL  | SR41813A1 | Account     | 41813AB | Group     |      010101 |      123139 | SR41813A6  |SR41813 Plan | 41813AB | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | * | SN002215 | APHARM | 310019952000 | 00     | 00310075139 |1      |1  |0   |10   | 010101 | 123139 | Y | 10 | 10 | 1 | 17621929891 | 41813AB | Test | 41813AB | Testing | 9999 | 9999 | N |
       