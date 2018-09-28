Feature: Price Table by description
  As a RxClaim User I want to compare RCPID048 and RCPID049 screen options & functionality in 8.4.02 and 8.4.01

Scenario Outline: Verify and compare the Option 5=Display functionality on 'RCPID048' and 'RCPID049' screen in 8.4.02 and 8.4.01 environments
  
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "2" to navigate to "RxClaim Product Information Maintenance"
	And I select Option "2" to navigate to "GPIs by Name"
	Then Validating the display functionality on RCPID048 and RCPID049 screen with "<Environment>"
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	Then Validating the display functionality on RCPID048 and RCPID049 screen with "<Regression>"
	Examples:
   
      | Environment | Regression |
      | 8402 | 8401 |
	