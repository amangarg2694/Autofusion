Feature: Class field changes in "Productivity Reporting" screen
As a RxClaim User I want to check whether new changes working correctly for the field Class in "Productivity Reporting" screen

Scenario Outline: User should able to Verify all Records are getting displayed when  all five class codes are blank - SN003483_SR41807_TC003_Req_5.1.2.2 
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
And I enter "<SortCriteria>" in field "SortCriteria" on "ProductivityReportingScreen"
And I enter "<SummaryDetail>" in field "SummaryDetail" on "ProductivityReportingScreen"
And I enter "<FileName>" in field "FileName" on "ProductivityReportingScreen"
And I enter "<Library>" in field "Library" on "ProductivityReportingScreen"
And I press "Enter" Key 
And I press "F6" Key


Then I Validate the Job is completed with "<Juser>","<Jname>"
And I Validate the Class codes "<ClassField>","<ClassField1>" displays in Spool file Report "<Report>" for Carrier "<CarrierFrom>","<CarrierThru>"
And I Validate the Class codes "<ClassField>" in file "<Library>","<FileName>" 

Examples:
| TransactionFromDate | TransactionThruDate | CarrierFrom | CarrierThru | ClassField | ClassField1 |SortCriteria |SummaryDetail |FileName    | Library | Juser  | Jname      | Report |         
| 010117              | 123117              | BHUCAR      | VAH         | *BLANK     |     N5      |1            |D             |SR41404F30  | USRSAKK | MGUP   | CLRAPRDEXT | PRODUCTIVITY DETAIL REPORT |



