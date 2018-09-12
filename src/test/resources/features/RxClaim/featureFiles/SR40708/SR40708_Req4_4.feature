Feature: 4.4. Plan Maintenance Utilities
  As a RxClaim User validating the screen functionality of Create Prescriber State Taxonomy Create Record Detail screen Screen
  

Scenario Outline: Create Prescriber State Taxonomy Create Record Detail screen - Add,Replace process
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "13" to navigate to "RxClaim Utilities"
  When I select Option "1" to navigate to "Plan Maintenance Utility Template"
	Then Validating the add replace function in Prescriber State Taxonomy Maintenance Utility screen with "<Plan>","<ID>"
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F12" Key
Examples:
|Plan|ID|
|SR40708D|AAAAA|

## Help features
@Req4.4
Scenario Outline: Validating the help features in Prescriber State Taxonomy Create Record Detail screen
Given I am on RxClaim PlanAdministrator Menu
When I select Option "13" to navigate to "RxClaim Utilities"
When I select Option "1" to navigate to "Plan Maintenance Utility Template"
Then Validating the help features in Prescriber State Taxonomy Maintenance Utility screen with "<ID>","<ID1>"

Examples:
|ID|ID1|
|AAAAA|AAAAA17232|