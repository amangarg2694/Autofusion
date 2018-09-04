Feature: DED/OOP when both are met within the same claim
As a RxClaim User I want to check claim is paid and Ded OOP amount populated correctly in Accumulator schedules screen

  Scenario Outline: Modify OOP Accumulator Logic to where the applied OOP amount is sent to Send Log when one of the OOP Step limits met during the Deductible was set to do so in the case of where Member has existing claims in Member’s claim history.OOP is set to “2- OOP, if not met, Ded, OOP”
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
   	And I select Option "1" to navigate to "Active Plan by Plan Code"
   	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		Then modifying the value of OOP in accumulator sequencing in plan with "<OOP>"
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
    And I enter "<ID>" in field "ID" on "MemberDetailScreen"
    And I enter "1" in field "Type" on "MemberDetailScreen"
    And I enter "<ContractFromDt>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<ContractThruDt>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "<PlanCode>" in field "OverridePlan" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
		And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<Due>","<UCW>"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo1>","<Refill>","<FillDate>","<MemberID>","31722071390","30","30","<PSC>","158.01","1.5","159.51","102.99"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo2>","<Refill>","<FillDate>","<MemberID>","55111012290","30","30","<PSC>","164.78","1.5","166.28","150.99"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo3>","<Refill>","<FillDate>","<MemberID>","61958100301","60","30","<PSC>","428.23","1.5","429.76","543.99"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		Then adding the adjustment details in the member screen with "<MemberID>","<Date>","<ReasonCode>","<AmtType>","<Type>","<Amount>","<TypeA>"
		And I press "F12" Key
		When adjudicating the claim multiple times with "<MemberID>","<RxNo4>"
		And I press "F7" Key
   	And I enter "1" in field "Selectionfield" on "TransactionDetailList"
   	And I press "Enter" Key
   	And I press "F10" Key
   	And I press "F10" Key
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And Capturing claim number writing it to text file with "<MemberID>"
   	And I press "F12" Key
   	And I enter "cct800" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I enter "13" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I enter "6" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I press "F16" Key
   	Then Validate the accumulator savings account send log file
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F12" Key
   	And I press "F3" Key
   	Then Validate the accumulator information in member screen with "<MemberID>"
   	When I select Option "6" to navigate to "Claims by Pharmacy"
   	Then Validating the deductible and OOP information in claim screen
   	And I press "F12" Key
   	Then Validating the calculations from accumulator and communication log screen with "<Schedule>","<MemberID>"
		
		  Examples:
    | CarrierID |ContractFromDt|ContractThruDt|AccountID |GroupID   |PlanCode| Schedule | ScheduleDesc | Basis | StepNo | DedCompCode | OOPCompCode | Ind | Family | MaxInd | MaxFamily | BrandCopay | GenericCopay | PercentBasis | PlanFromDt | Description | StartDate | EndDate | OOP | BMX |MemberID | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | UCW | ID | Fee | Due | FillDate | Plan |ReasonCode|AmtType|Type|Amount|TypeA|RxNo1|RxNo2|RxNo3|RxNo4|Date|
    | SR41901M |010101        |123139        |SR41901A| SR41901M  |SR41901M| SR41901M|Testing|3|1|5|6|2700|5400|999999.99|999999.99|100|100|02|010101|SR41901 Plan|010118|123118|2|1|SR4190A3| AUTOMEM    | AUTOMEM   | 12251987	| 777777 | CZIN2018 | * | 2604418 | 410019951020 | 00     | 00456142030 |14      |13  |0   |73.25   |74.75| SR4190A3 |1.5|97.49|8172018| *MEMBER |MED|T|F|1300|G|410019951021|410019951022|410019951023|410019951024|81718|
		