Feature: Price Table by description
  As a RxClaim User I want to compare price related screen options & functionality in 8.4.02 and 8.4.01
	
 
 Scenario Outline: Verify and compare the 'RCPTF042' screen options & functionality using F8 in 8.4.02 and 8.4.01 environments.  
  
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "5" to navigate to "RxClaim Price Maintenance"
	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
  And I select Option "2" to navigate to "Active Price Table"
  Then Verifying the Display functionality on price table screen with "<Environment>"
  And I press "F3" Key
	And I press "F3" Key
  And I press "F3" Key
  And I press "F3" Key
  Then Verifying the Display functionality on price table screen with "<Regression>"
    
Examples:
   
      | Environment | Regression |
      | 8402 | 8401 |