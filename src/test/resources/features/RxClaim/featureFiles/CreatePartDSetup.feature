Feature: Create New PartD Setup
As a RxClaim User I want to create Part D Setup
    
             
    Scenario Outline: Create a new PartD Setup in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I add accumulators to plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
   	And I Set Covered Plan Paid Amount in plan "<CPPFromDate>","<CPPThruDate>","<CPPAccumulationLevel>","<CPPAccumulationCode>","<CPPPatientPaySchedule>","<CPPTrOOPSchedule>","<Qualifier>"
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   	Given I am on RxClaim PlanAdministrator Menu
   	When I Set Patient Pay Schedule "<PPDetailSchedule>","<PPDetailDescription>","<PlanUseQualifier>"  
   	Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added
   	And I Set HIC detials "<HIC>"
   	And I Set Set Supplemental ID by Type "<SupplementalIDFromDate>","<SupplementalIDThruDate>","<SupplementalIDType>","<SupplementalID>","<Text>"
   	Given I am on RxClaim PlanAdministrator Menu
   	And I Set PBP "<CarrierID>","<Contract>","<PBP>","<BenefitYear>","<MedicareType>","<SubmitterID>"
   	Given I am on RxClaim PlanAdministrator Menu
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I Set PartD Master Profile Detail "<CarrierID>","<AccountID>","<GroupID>","<PlanCode>","<FromDate>","<MasterProfileFromDate>","<MasterProfileThruDate>","<DrugCoverageStatusSchedule>","<Contract>","<PBP>"
   	Then Validate PartD Master Profile created with details "<CarrierID>" ,"<AccountID>","<GroupID>","<PlanCode>"
    
   
   
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|CPPFromDate|CPPThruDate|CPPAccumulationLevel|CPPAccumulationCode|CPPPatientPaySchedule|CPPTrOOPSchedule|Qualifier| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID    |GroupName  |GroupFromDt|GroupThruDt|PlanCode|PPDetailSchedule|PPDetailDescription|PlanUseQualifier|MemberID    | FirstName  | LastName  | DOB     | FromDate  | ThruDate |HIC|SupplementalIDFromDate|SupplementalIDThruDate|SupplementalIDType|SupplementalID|Text|Contract|PBP|BenefitYear|MedicareType|SubmitterID|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule| 
   |EVU30976P1|010101|123139|EVU30976P1|EVUAREG|EVUAREG|010114|123114|C| |EVUBKOT|EVUBKOT|010114|123114|C||EVUBKOT|EVUBKOT|A|EVU30976C | EVU30976C|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |EVU30976A1|EVU30976A1| EVU30976G1  |EVU30976G1 |010101     |123139     |EVU30976P1|EVUBKOT|TEST||EVU30976M1| EVU30976M2 |EVU30976M2 |12251987|010101|123139|123956781|010114|123114|06|123456781||A9364|121|2014|S||010114|123114| | | | | |010114|123114|EVUBKOT|
