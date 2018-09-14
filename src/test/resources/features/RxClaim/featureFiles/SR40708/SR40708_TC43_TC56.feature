Feature: Screen Validation for Prescriber State Taxonomy Code Screen - Display
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy Code Screen - Display
  
##TC43 - TC56
Scenario: Create new Prescriber State Taxonomy Code Detail screen - Display
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "7" to navigate to "RxClaim Provider Maintenance"
  And I select Option "29" to navigate to "Active Prescriber State Taxonomy Codes"
	Then validating display functionality in Add Prescriber State Taxonomy Codes screen
