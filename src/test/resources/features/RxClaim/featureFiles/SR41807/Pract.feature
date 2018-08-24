Feature: Class field changes in "Productivity Reporting" screen
As a RxClaim User I want to check whether new changes working correctly for the field Class in "Productivity Reporting" screen

Scenario Outline: User should able to validate Class field should not display any error message as mandatory - SN003483_SR41807_TC001_Req_5.1.2.1 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "12" to navigate to "RxInterACT Main Menu"
And I select Option "5" to navigate to "Management"

Then I Validate the Job is completed with "<Juser>","<Jname>"
And I Validate the Class codes "<ClassField>" displays in Spool file Report "<Report>" for Carrier "<CarrierFrom>","<CarrierThru>"
And I Validate the Class codes "<ClassField1>" in file "<Library>","<FileName>" 

Examples:
| TransactionFromDate | TransactionThruDate | CarrierFrom | CarrierThru | ClassField | ClassField1 |SortCriteria |SummaryDetail |FileName   | Library | Juser | Jname      | Report |         
| 010101              | 123117              | BHUCAR      | VAH         | *BLANK     | NA1         |1            |D             |SR41807F10 | USRSAKK | SAKK  | CLRAPRDEXT | PRODUCTIVITY DETAIL REPORT |



