Feature: Create a Testdata for SR41669
As a RxClaim User I wnat to create a New Plan

Scenario Outline: Create a Plan with copy of existing Plan and edit as per requirement new plan
Given I am on RxClaim PlanAdministrator Menu
When I Create a plan with "<EXGPLAN>","<CPYPLAN>","<PFrom>","<PDesc>"
And I Create a Troop Schedule with "<EXGTroopSc>","<CPYTroopSc>","<CPYTroopScDesc>", "<TroopAmt1>" using the copy of existing Troop schedule
And I attached New Troop Schedule to the plan with "<CPYPLAN>", "<CPYTroopSc>"
And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    



Examples:
|EXGPLAN   |CPYPLAN    |PFrom |PDesc    |EXGTroopSc | CPYTroopSc | CPYTroopScDesc |TroopAmt1 |CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode|
|EVUASHE-D |Srtt125    |010101|Srtt125  |Naresh     | Srtr125    | Srtr125        |4558.61   |TESTOO13  | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |TESTAO13  |Test Account | TESTGO13  |Test Group |010101     |123139     |Srtt124 |

    