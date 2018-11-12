Feature: Plan Audit Report and General Prescriber Report for Prescriber State Taxonomy Codes field
  As a RxClaim User validating the Prescriber State Taxonomy Codes field in plan audit report and general plan report

##Use same plan code for all the scenarios and modify the plan code

##TC69 - TC70

Scenario Outline: 4.2.1. Validating the Prescriber State Taxonomy Codes field in plan audit report and general plan report
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  	And I select Option "1" to navigate to "Active Plan by Plan Code"
		Then generating the plan audit report with "<Plan>"
		
Examples:
|Plan|
|SR40708TE8|


Scenario Outline: 4.2.2. Validating the Prescriber State Taxonomy Codes field in plan audit request and general plan report
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "12" to navigate to "RxClaim Audit Request"
  	And I select Option "1" to navigate to "Plan Audit Request"
		Then generating the plan audit request report with "<Plan>"
		
Examples:
|Plan|
|SR40708TE8|


Scenario Outline: 4.3. Validating the Prescriber State Taxonomy Codes field in Print Plan Report
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "9" to navigate to "RxClaim Batch Process Menu"
  	And I select Option "2" to navigate to "RxClaim Reports Menu"
  	And I select Option "8" to navigate to "Plan and Product Reports Menu"
  	And I select Option "1" to navigate to "Print Plan Details"
		Then generating the Print Plan Report report and validating the prescriber state taxonomy code field with "<Plan>","<Selected>","<Prov/Prod Validation>"
		
Examples:
|Plan|Selected|Prov/Prod Validation|
|SR40708TE8|Y|X|