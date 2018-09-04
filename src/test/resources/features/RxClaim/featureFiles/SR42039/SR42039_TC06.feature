Feature: Correct DED & OOP amounts to be reported when both Accumulators are met in one claim
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
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
		And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PAT>"
    And Capture the Claim Number and write in text file
    And I press "F7" Key
   	And I enter "1" in field "Selectionfield" on "TransactionDetailList"
   	And I press "Enter" Key
   	And I press "F10" Key
   	And I press "F10" Key
   	And I press "PageDown" Key
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F3" Key
   	And I press "F12" Key
   	And I press "F12" Key
   	And I enter "cct800" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I enter "13" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I enter "6" in field "SelectMenu" on "MenuSelection"
   	And I press "Enter" Key
   	And I press "F16" Key
   	Then Validating the accumulator savings account send log file
   
    
   	 Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| Schedule | ScheduleDesc | Basis | StepNo | DedCompCode | OOPCompCode | Ind | MaxInd | BrandCopay | GenericCopay | PercentBasis | PlanFromDt | Description | StartDate | EndDate | OOP | BMX |MemberID | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost | PAT | ID |  FillDate |
    | WKBJLEA | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |WKBJLEA|Test Account| SR42309C  |Test Group |010101     |123139     |SR42309C| SR42309C|Testing|1|1|1|2|2000|999999.99|100|100|02|010101|SR42309 Plan|010118|123118|3|1|SR42309A1| AUTOMEM    | AUTOMEM   | 12251987	| 777777 | WKBJLEA | WKBJLEA | 8675309 | 510019904000 | 00     | 51927441300 |30      |30  |0   |3000   |50| SR42309A1 |8202018|
   	