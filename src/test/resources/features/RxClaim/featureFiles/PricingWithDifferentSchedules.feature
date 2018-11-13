Feature: Pricing with Different Schedules
As a RxClaim User I want to create Plan with Pricing
    
             
    Scenario Outline: Create a Plan with Pricing Setup in RxClaim    
    Given I am on RxClaim PlanAdministrator Menu
    When I setup Drug Cost Comparison Schedule with "<CC Schedule>","<CC Description>","<CC Sequence>","<CC Source>","<CC Code>","<CC Rate Percent>"
    And I setup Drug Cost Schedule with "<Cost Schedule>","<Cost Description>","<Cost Sequence>","<Product Selection Code>","<Cost Comparison Schedule>","<Cost Comparison Type>"
    And I setup Patient Pay Schedule with "<Patient Pay Schedule>","<Patient Pay Desc>","<Patient Pay Sequence>","<PPC PatientPayTable>" 
    And I setup Patient Pay Table with "<PatientPayTable>","<PatientPayTable Desc>","<Negative Due>","<PatientPay Comparison Code>","<Brand Amount>","<Brand Calc Basis>","<Generic Amount>","<Generic Calc Basis>"
   	And I setup Price Schedule with "<Price Schedule>","<Price Schedule Desc>","<Price Schedule Sequence>","<Price Schedule Criteria Table>"
    And I setup Price Table with "<Price Table>","<Price Table Desc>","<Price Table From>","<Price Table Thru>","<Price Table Schedule>","<Price Table Fee>","<Price Table Tax>","<Price Table Comparison Code>","<Calc Code>"
   	
   		Examples: 
    | CC Schedule | CC Description | CC Sequence | CC Source   |CC Code | CC Rate Percent | Cost Schedule | Cost Description | Cost Sequence | Product Selection Code|Cost Comparison Schedule | Cost Comparison Type | Patient Pay Schedule | Patient Pay Desc |Patient Pay Sequence|PPC PatientPayTable| PatientPayTable |PatientPayTable Desc | Negative Due |PatientPay Comparison Code | Brand Amount | Brand Calc Basis | Generic Amount |Generic Calc Basis | Price Schedule |Price Schedule Desc|Price Schedule Sequence|Price Schedule Criteria Table| Price Table|Price Table Desc  |Price Table From|Price Table Thru|Price Table Schedule |Price Table Fee|Price Table Tax| Price Table Comparison Code| Calc Code| 
    | RUP3845     | Test           | 2           | MEDISPAN    | AWP    | 85              | DPATCCP13     | Test             | 1             | X, , , , , , , , , ,  | DPATCPP13               | 02                   | DPATCCP13            | Test             | 1                  |DPATCCP13          | DPATCCP13       |Test                 | Y            |B                          | 20.00        |                  | 10.00          |                   | DPATCCP13      | Test PS           | 3                     | DPATCPP13                   | DPATRUP13  | Test Price Table | 010101         | 123139         |DPATCCP13            | 5.00          |5.00           | 0                          | 4        |
    
    
  