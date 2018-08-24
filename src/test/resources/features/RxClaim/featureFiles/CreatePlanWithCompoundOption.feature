Feature: Create a Plan with Compound Option
As a RxClaim User I want to create Plan with Compound Option
    
             
    Scenario Outline: Create a Plan with Compound Option in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Plan with Compound Option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan is set with Compound Option
   
   Examples:
   |PlanCode  |FromDate|Description|ThruDate|PriceSchedule|PatientPaySchedule|
   |Sep1015   |010110  |AUTO PLAN  |123139  |EVUAREG      |EVUAREG           |
