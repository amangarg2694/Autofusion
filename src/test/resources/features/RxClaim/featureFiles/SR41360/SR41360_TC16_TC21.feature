Feature: Price Table by description
  As a RxClaim User I want to compare price schedule related screen options & functionality in 8.4.02 and 8.4.01

Scenario Outline: Verify and compare the Option 2=EDIT functionality on 'RCPSC002' screen in 8.4.02 and 8.4.01 environments.   
  
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "5" to navigate to "RxClaim Price Maintenance"
	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
	And I select Option "1" to navigate to "Price Schedule"
	Then editing the fields in Price Schedule criteria screen with "<Environment>","<Data>"
	And I press "F3" Key
	And I press "F3" Key
  And I press "F3" Key
  And I press "F3" Key
	And I press "F3" Key
	Then editing the fields in Price Schedule criteria screen with "<Regression>","<Data>"
	
	Examples:
	
	| Environment | Regression | Data |
	| 8402 | 8401 | 997 |