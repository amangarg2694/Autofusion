Feature: add list to dpa

@AddDPAListToPlan
    Scenario Outline: ADD List to DPA
    Given I am on RxClaim PlanAdministrator Menu
    When I add DPA List to Plan "<PlanCode>","<Carrier>","<List>"
    
    Examples:
   |PlanCode   |Carrier   |List      |
   |TESTP01369 |AUTOC3690	|DPA928RJ1 |
   |TESTP02369 |AUTOC3690	|DPA922RJ1 |
   |TESTP03369 |AUTOC3690	|DPA928    |
     