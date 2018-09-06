Feature: Part D: B vs D Coverage Determination for Inhalation DME Supply Drugs
As a RxClaim User I want to check whether MPA batch load working correctly for differnt versions

Scenario Outline: Validate the Drug Status Table for MPA Batch load for v8.3 Type 1(PA Type N)
Given I am on RxClaim PlanAdministrator Menu
And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
And I create MemberPA "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
And I Create Mbr Prior Auth Export File in Load Format with "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<EfileName>","<Library>","<EFormat>"
And Job should complete successfully with user "<Juser>" and job name "<Jname1>"



Examples:
    | CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode | MemberID  |FirstName |LastName  |DOB      |MemFromDate|MemThruDate|PANumber |Type|NDCGPIList  |From  |Thru   |Agent|Reason|IgnoreDrugStatus|EfileName|Library|Eformat|Juser|Jname1    |
    | SR41710AC1 | SR41710AC1  |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41710AA1 |SR41710AA1  | SR41710AG1|SR41710AG1 |010101     |123139     |SR41710C1| SR41710AM1|SR41710AM1|SR41710AM1|01011988 |010101     |123139     |SR41710P1|N   |55289030814 |010101|123139 |O    |AA    |N               | TESTO15 |USRSAKK|83     |SAKK |CLRCMPA01 |
   