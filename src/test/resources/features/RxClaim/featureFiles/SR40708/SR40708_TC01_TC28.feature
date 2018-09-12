Feature: Screen Validation for Prescriber State Taxonomy Code Screen
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy Code Screen
  
##TC01 - TC03
Scenario Outline: Add Prescriber State Taxonomy Codes menu item to the Provider Maintenance screen
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "7" to navigate to "RxClaim Provider Maintenance"
	Then Validating the "Prescriber State Taxonomy Codes" screen 

Examples:
| Screenname |
| Prescriber State Taxonomy Codes |

##TC04 - TC15
Scenario Outline: Add Prescriber State Taxonomy Codes menu item to the Provider Maintenance screen
	Then Validating the functional keys,exit and previous options in Prescriber State Taxonomy Codes screen 

Examples:
| ThruDate |
| 123118|

##TC16 - TC28
Scenario Outline: Add Prescriber State Taxonomy Codes menu item to the Provider Maintenance screen
	Then adding the record in Add Prescriber State Taxonomy Codes screen with "<FromDate>","<ThruDate>","<State>","<TaxonomyCode>","<GPIList>","<Qualifier>","<CCR>"

Examples:
| FromDate |ThruDate|State|TaxonomyCode|GPIList|Qualifier|CCR|
| 010118|123118|AB|101YA0400X|VYCOMP1|I|N|