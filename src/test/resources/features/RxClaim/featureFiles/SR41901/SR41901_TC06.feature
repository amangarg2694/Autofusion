Feature: DED/OOP when both are met within the same claim
As a RxClaim User I want to check claim is paid and Ded OOP amount populated correctly in Accumulator schedules screen

  Scenario Outline: Family Members have several claims in their claim history and they have not met their Deductible or OOP Max yet AND within the Plan, the Accumulator Sequencing on OOP is set to “3- Ded, then OOP, write OOP”
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
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I enter "1" in field "FamilyType" on "MemberDetailScreen"
    And I enter "<ID>" in field "ID" on "MemberDetailScreen"
    And I enter "3" in field "Type" on "MemberDetailScreen"
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
   	When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo1>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<Due>","<UCW>"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo2>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<Due>","<UCW>"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo3>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<Due>","<UCW>"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		Then adding the adjustment details in the member screen with "<MemberID>","<Date>","<ReasonCode>","<AmtType>","<Type>","<Amount>","<TypeA>"
		And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo4>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<Due>","<UCW>"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo5>","<Refill>","<FillDate>","<MemberID>","<ProductID>","100","<DS>","<PSC>","1010","1","1010","1011"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
		When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo6>","<Refill>","<FillDate>","<MemberID>","<ProductID>","100","<DS>","<PSC>","1010","1","1010","1011"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo7>","<Refill>","<FillDate>","<MemberID>","<ProductID>","10","<DS>","<PSC>","200","1","200","211"
		And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo8>","<Refill>","<FillDate>","<MemberID>","49848002830","1000","<DS>","<PSC>","999999.99","1","60","999999.99"
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
   	And Capturing claim number family member writing it to text file with "<MemberID>"
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
   	Then Validating the calculations for individual and family from accumulator and communication log screen with "<Schedule>","<MemberID>"
		
      Examples:
    | CarrierID |ContractFromDt|ContractThruDt|AccountID |GroupID   |PlanCode| Schedule | ScheduleDesc | Basis | StepNo | DedCompCode | OOPCompCode | Ind | Family | MaxInd | MaxFamily | BrandCopay | GenericCopay | PercentBasis | PlanFromDt | Description | StartDate | EndDate | OOP | BMX |MemberID | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | UCW | ID | Fee | Due | FillDate | Plan |ReasonCode|AmtType|Type|Amount|TypeA|RxNo1|RxNo2|RxNo3|RxNo4|Date|RxNo5|RxNo6|RxNo7|RxNo8|
    | SR41901M |010101        |123139        |SR41901A| SR41901M  |SR41901M| SR41901M|Testing|3|1|5|6|2700|5400|999999.99|999999.99|100|100|02|010101|SR41901 Plan|010118|123118|3|1|41901A4| AUTOMEM    | AUTOMEM   | 12251987	| 777777 | CZIN2018 | * | 2604418 | 410019991030 | 00     | 00071015523 |1     |1  |0   |10  |11| SR41901G |1|10|8202018| *MEMBER |MED|T|F|100|G|410019991031|410019991032|410019991033|410019991034|82018|410019991035|410019991036|410019991037|410019991038|
		