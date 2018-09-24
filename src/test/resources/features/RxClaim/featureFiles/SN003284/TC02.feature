Feature: SN003284
  I want to use this template for my feature file
    
  Scenario Outline: Validating the plan
   Given I am on RxClaim PlanAdministrator Menu
	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan code"
	And I verify plan "<>"
  And yet another action
  Then I validate the outcomes

 
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
