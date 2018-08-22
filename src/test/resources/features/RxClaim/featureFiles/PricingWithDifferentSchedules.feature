Feature: Pricing with Different Schedules
As a RxClaim User I want to create Plan with Pricing
    
             
    Scenario Outline: Create a Plan with Pricing Setup in RxClaim    
    Given I am on RxClaim PlanAdministrator Menu
    When I setup Drug Cost Comparison Schedule with "<CC Schedule>","<CC Description>","<CC Sequence>","<CC Source>","<CC Code>","<CC Rate Percent>"
    And I setup Drug Cost Schedule with "<Cost Schedule>","<Cost Description>","<Cost Sequence>","<Product Selection Code>","<Cost Comparison Schedule>","<Cost Comparison Type>"
   
   	Examples: 
    | CC Schedule | CC Description | CC Sequence | CC Source   |CC Code | CC Rate Percent | Cost Schedule | Cost Description | Cost Sequence | Product Selection Code|Cost Comparison Schedule | Cost Comparison Type | 
    | RUP3845     | Test           | 2           | MEDISPAN    | AWP    | 85              | DPATCCP13     | Test        | 1        | X, , , , , , , , , ,  | DPATCCP13          | 02              |
    
    
  