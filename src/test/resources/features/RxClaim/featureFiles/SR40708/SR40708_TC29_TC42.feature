Feature: Screen Validation for Prescriber State Taxonomy Code Screen - Change
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy Code Screen - Change
  
##TC29 - TC42
Scenario Outline: Create new Prescriber State Taxonomy Code Detail screen - CHANGE
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "7" to navigate to "RxClaim Provider Maintenance"
  And I select Option "29" to navigate to "Active Prescriber State Taxonomy Codes"
	Then changing the record in Add Prescriber State Taxonomy Codes screen with "<State>","<TaxonomyCode>","<GPIList>","<Qualifier>","<CCR>"

Examples:
|State|TaxonomyCode|GPIList|Qualifier|CCR|
|AB|101YA0400X|WAW|I|N|