Feature:  AddPAservice

Scenario Outline:AddPAService

Given I am on RxClaim PlanAdministrator Menu
When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
And I select Option "2" to navigate to "Active/Eligible Member by ID"
And I navigate to Active Member Prior Authorization screen for the "<MemberID>","<PAnumber>"
Then I validate values for the fields "<MICPartialMatch>" and "<MICROA>"

Examples:
|MemberID     |MICPartialMatch|MICROA |
|SN003533MEM1 |Y              |       |
|SN003533MEM1 |N              |TOPICAL|

