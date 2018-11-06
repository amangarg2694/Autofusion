@Release_8403
Feature: Class field changes in "Productivity Reporting" screen
As a RxClaim User I want to check whether new changes working correctly for the field Class in "Productivity Reporting" screen

Scenario Outline: User should able to validate Class field should not display any error message as mandatory - SN003483_SR41807_TC001_Req_5.1.2.1 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "12" to navigate to "RxInterACT Main Menu"
And I select Option "5" to navigate to "Management"
And I select Option "3" to navigate to "Report Management"
And I select Option "2" to navigate to "Productivity Reporting"
And I enter "<TransactionFromDate>" in field "TransactionFromDate" on "ProductivityReportingScreen"
And I enter "<TransactionThruDate>" in field "TransactionThruDate" on "ProductivityReportingScreen"
And I enter "<CarrierFrom>" in field "CarrierFrom" on "ProductivityReportingScreen"
And I enter "<CarrierThru>" in field "CarrierThru" on "ProductivityReportingScreen"
And I press "Enter" Key 

Then I Validate error message "<ErrorMessage>" is not displaying for Class field


Examples:
| TransactionFromDate | TransactionThruDate | CarrierFrom | CarrierThru | FileName | Library |NewScreen              |ErrorMessage|
| 010101              | 123117              | BHUCAR      | VAH         | SR41404  | USRSAKK |File Conversion Request|Intervention Class not found |


Scenario Outline: User should able to Validate class field when invalid value entered in class code  - SN003483_SR41807_TC004_Req_5.1.2.2
Given I am on Productivity Reporting
And I enter invalid value "<InvalidValue>" in Class field
And I press "Enter" Key 

Then I Validate message "<ErrorMessage2>" should display for invalid value "<InvalidValue>" 


Examples:
| InvalidValue | ErrorMessage2 |
| WE           | Intervention Class not found.|


Scenario: User should able to Verify cursor postions on Transaction From Date Field while running productivity report  - SN003483_SR41807_TC005_Req_5.1.2.3
Given I am on Report Management Screen
And I select Option "2" to navigate to "Productivity Reporting"
And I press "F4" Key

Then I Validate the cursor position on TransactionFromDate Field


Scenario Outline: User should able to Verify cursor postions on Sort Criteria Field after entering From Date, Thru Date, Carrier and on Press enter - SN003483_SR41807_TC005_Req_5.1.2.3
Given I am on Report Management Screen
And I select Option "2" to navigate to "Productivity Reporting"
And I enter "<TransactionFromDate>" in field "TransactionFromDate" on "ProductivityReportingScreen"
And I enter "<TransactionThruDate>" in field "TransactionThruDate" on "ProductivityReportingScreen"
And I enter "<CarrierFrom>" in field "CarrierFrom" on "ProductivityReportingScreen"
And I enter "<CarrierThru>" in field "CarrierThru" on "ProductivityReportingScreen"
And I press "Enter" Key 
And I press "F4" Key

Then I Validate the cursor position on Sort Criteria Field

Examples:
| TransactionFromDate | TransactionThruDate | CarrierFrom | CarrierThru |
| 010101              | 123117              | BHUCAR      | VAH         |
