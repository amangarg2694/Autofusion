Feature: Price Table by description
  As a RxClaim User I want to compare price schedule related screen options & functionality in 8.4.02 and 8.4.01

Scenario Outline: Verify and compare the 'RCPSC002' screen options & functionality in 8.4.02 and 8.4.01 environments.  
  
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "5" to navigate to "RxClaim Price Maintenance"
	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
	And I select Option "1" to navigate to "Price Schedule"
	Then Navigating to price schedule criteria screen with "<Environment>"
	And I press "F3" Key
	And I press "F3" Key
  And I press "F3" Key
  And I press "F3" Key
  Then Navigating to price schedule criteria screen with "<Regression>"
  
	Examples:
	
	| Environment | Regression |
	| 8402 | 8401 |