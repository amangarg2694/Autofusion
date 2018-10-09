Feature: Error Message Validation for Prescriber State Taxonomy Code Screen - Change & Add
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy Code Screen - Change & Add
  
##Req 4.1.5 - Error message validation - 11 Test cases
Scenario Outline: Create new Prescriber State Taxonomy Code Detail screen - Change & Add
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "7" to navigate to "RxClaim Provider Maintenance"
  And I select Option "29" to navigate to "Active Prescriber State Taxonomy Codes"
	Then validating error message in Prescriber State Taxonomy Codes screen with "<GPIList>","<State>","<TaxonomyCode>","<CCR>","<FromDate>"

Examples:
|GPIList|State|TaxonomyCode|CCR|FromDate|
|&CRTDUPGPI|*|101YA0400X|Y|010118|