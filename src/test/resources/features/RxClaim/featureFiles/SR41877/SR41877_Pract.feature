Feature: Part D: B vs D Coverage Determination for Inhalation DME Supply Drugs
As a RxClaim User I want to check whether MPA batch load working correctly for differnt versions

Scenario Outline: Validate the Drug Status Table for MPA Batch load for v8.3 Type 1(PA Type N)
Given I am on RxClaim PlanAdministrator Menu
And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>",""




Examples:
    | CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode | 
    | SR41710C9 | SR41710C9  |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT       |SR41710AA9 |SR41710AA9  | SR41710AG9|SR41710AG9 |010101     |123139     |SR41710C1|
   