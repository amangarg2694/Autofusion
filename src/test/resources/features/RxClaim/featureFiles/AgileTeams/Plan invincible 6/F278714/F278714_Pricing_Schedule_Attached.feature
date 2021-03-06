Feature: Create Plan with Pricing
As a RxClaim User I want to create Plan with Pricing
    
             
Scenario Outline: Create a Plan with Pricing Setup in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with pricing "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate plan code "<PlanCode>"
    
   Examples:
   |PlanCode  |FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule| 
   |GPITEST1|010101  |123139 |NEW PRICE |SN001396      |SN001396  |
   |GPITEST2|010101  |123139   |NEW PRICE  |SN001396      |SN001396  |