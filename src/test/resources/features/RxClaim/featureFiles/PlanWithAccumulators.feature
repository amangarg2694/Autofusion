Feature: Create Plan with Accumulator
As a RxClaim User I want to create Plan with Pricing
    
             
    Scenario Outline: Create a Plan with Accumulators 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with Accumulators with "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>","<Deductible Accum Level>","<Deductible Schedule>","<OOP Max Accum Level>","<OOP Max Schedule>","<Benefit Max Accum Level>","<Benefit Max Schedule>"
    Then Validate Accumulators are set to Y
    
   Examples:
   |PlanCode  |FromDate|Description |ThruDate   |PriceSchedule|PatientPaySchedule|Deductible Accum Level | Deductible Schedule | OOP Max Accum Level | OOP Max Schedule | Benefit Max Accum Level |Benefit Max Schedule| 
   |EVU30976P1|010101  |EVU30976P1  |123139     |EVUAREG      |EVUAREG           | C                     | EVU38288            |  C                  | EVU38288         | C                       | EVU38288           |      