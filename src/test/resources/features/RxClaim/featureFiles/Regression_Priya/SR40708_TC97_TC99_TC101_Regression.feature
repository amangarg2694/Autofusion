Feature: Screen Validation for Prescriber State Taxonomy Code Screen
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy Code Screen
  
  ## Get the filename and library from the developer team
  
##TC97,TC99 - TC101
Scenario Outline: Add Prescriber State Taxonomy Codes menu item to the Provider Maintenance screen
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
	Then loading the file in Load Prescriber State Taxonomy Codes screen with "<FileName>","<Library>"
	Then triggering the Prescriber State Taxonomy Codes Extract job with "<FileName>","<Library>"
Examples:
|FileName|Library|
|SR40708|USRPRIYA|