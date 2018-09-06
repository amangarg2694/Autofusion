Feature: Medicaid Subrogation Profile 
  As a RxClaim User I want to check claim is getting paid and notes stamped

  Scenario Outline: Verify if claim is getting Paid and Notes related to override R75 should be stamped
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key
    ## CAG details from TC04
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<PL1From Date>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<PL1Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I press "Tab" Key
    And I press "F4" Key
    ## PartD Plan - copy the test data used in TC01 and NonPartD Plan(PlanCode) copy the data from TC02
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
    And I press "F12" Key
    And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I press "F8" Key
    And I enter "2" in field "Selection" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    Then I enter Part D plan with "<From Date>","<Thru Date>","<PlanCode>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		Then Validate the Plan details with "<PlanCode>","<PlanCode1>"
		And I press "F12" Key
		Then I create payee override claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<MemberID>","<Payee>","<Code>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>","<Type>","<PANum>"
		And I press "F7" Key
		And I enter "8" in field "Selectionfield" on "TransactionDetailList"
		And I press "Enter" Key
		And I press "F12" Key
		And I press "F12" Key
		And I press "F14" Key
		
		
		Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | Fee | UCW | Type | PANum | Payee | Name | ProfileID | PDescription | SDWD | MCSDWD | Code | SubrogationFlag | PL1From Date | PL1Thru Date | PlanCode1 |
      | SR41813AA | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | COMMERCIAL  | SR41813A1 | Account     | SR41813AA | Group    | 010101 | 123139 | SR41813YC |SR41813 Plan | SR41813XA | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | * | SN002215 | APHARM | 310019947000 | 00     | 00310075139 |1      |1  |0   |10   | 010118 | 123118 | 10 | 10 | 1 | 17621929891 | A41813 | Test | A41813 | Testing | 9999 | 9999 | Y | Y | 010117 | 123117 | SR41813B3 |
       