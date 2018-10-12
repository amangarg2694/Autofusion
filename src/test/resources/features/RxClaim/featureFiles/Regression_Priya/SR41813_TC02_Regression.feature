Feature: Medicaid Subrogation Profile 
  As a RxClaim User I want to check claim is getting paid and notes stamped

  Scenario Outline: Verify if claim is getting Paid and Notes related to override R75 should  be stamped
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "SR41813A3" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCode>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<ContractFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<Description>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		And I enter "Y" in field "Accumulator" on "PlanDetailScreen"
		And I press "Enter" Key
  	And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
  	And I press "F7" Key
  	And I enter "29" in field "Selection" on "PlanOptionsScreen"
  	And I press "Enter" Key
  	And I enter "6" in field "Selection" on "AccumulatorScreen"
  	And I press "Enter" Key
  	And I enter "4" in field "Option" on "PlanTroopSchedule"
  	And I press "Enter" Key
  	And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
  	And I press "F12" Key
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
    And I enter "<PlanCode>" in field "Plancode" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "1" in field "Selection" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "001" in field "Person" on "MemberDetailScreen"
    And I enter "1" in field "Rel" on "MemberDetailScreen"
    And I enter "F" in field "Sex" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    Then I create payee override claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<MemberID>","<Payee>","<Code>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>","<Type>","<PANum>"
		And I press "F7" Key
		And I enter "8" in field "Selectionfield" on "TransactionDetailList"
		And I press "Enter" Key
		And I press "F12" Key
		And I press "F12" Key
		And I press "F14" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F12" Key
		And I press "F12" Key
		
		Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | SubrogationFlag | Fee | UCW | Type | PANum | Payee | Name | ProfileID | PDescription | SDWD | MCSDWD | Code |
      | SR41813B9 | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | COMMERCIAL  | SR41813B9 | Account     | SR41813B9 | Group    |  010101 | 123139 | SR41813YD | SR41813 Plan | SR41813YB | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | * | SN002215 | APHARM | 310019946001 | 00     | 00071015523 |1      |1  |0   |10   | 010101 | 123139 | Y | 10 | 10 | 1 | 17621929891 | SR41813I | Test | SR41813I | Testing | 9999 | 9999 | Y |
       