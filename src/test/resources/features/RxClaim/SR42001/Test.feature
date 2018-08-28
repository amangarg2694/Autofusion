Feature: Accepting Carrier ID 

Scenario Outline: Accepts Carrier ID
Given I am on RxClaim PlanAdministrator Menu
When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
And I select Option "2" to navigate to "Active/Eligible Member by ID"
And I press "F6" Key 
And I enter "<Carrier ID>"

Examples: 
|Carrier ID|
|SN3513|