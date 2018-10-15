Feature: Screen Validation for Load Prescriber State Taxonomy Codes Screen
  As a RxClaim User validating the screen functionality of Load Prescriber State Taxonomy Codes Screen
  
##TC92 - TC96,TC98
Scenario Outline: 5.1.1. Add “Load Prescriber State Taxonomy Codes” menu item to RxClaim Batch Transaction Loads Menu
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
  	And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		Then validating the Load Prescriber State Taxonomy Codes screen with "<FileName>","<Library>"
		
Examples:
|FileName|Library|
|TestingQET|USRPRIYARV|

Scenario Outline: Screen Validation of 
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
  	And I select Option "1" to navigate to "Batch Extract Process Menu"
		Then validating the Prescriber State Taxonomy Codes Extract screen with "<FileName>","<Library>"
Examples:
|FileName|Library|
|TestingQET|USRPRIYARV|