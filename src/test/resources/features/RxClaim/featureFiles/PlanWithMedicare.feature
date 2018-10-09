Feature: Create New Plan with Medicare
As a RxClaim User I want to create Plan with Medicare
    
             
    Scenario Outline: Create a new Plan with Medicare in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
    And I add accumulators to plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
   	And I Set Covered Plan Paid Amount in plan "<CPPFromDate>","<CPPThruDate>","<CPPAccumulationLevel>","<CPPAccumulationCode>","<CPPPatientPaySchedule>","<CPPTrOOPSchedule>","<Qualifier>"
    
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|CPPFromDate|CPPThruDate|CPPAccumulationLevel|CPPAccumulationCode|CPPPatientPaySchedule|CPPTrOOPSchedule|Qualifier| 
   |EVU30976P1|010101|123139|EVU30976P1|EVUAREG|EVUAREG|010114|123114|C| |EVUBKOT|EVUBKOT|010114|123114|C||EVUBKOT|EVUBKOT|A|
