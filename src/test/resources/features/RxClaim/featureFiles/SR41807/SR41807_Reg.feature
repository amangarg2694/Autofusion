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
And I enter "<ClassField1>" in field "ClassField1" on "ProductivityReportingScreen"
And I enter "<ClassField2>" in field "ClassField2" on "ProductivityReportingScreen"
And I enter "<ClassField3>" in field "ClassField3" on "ProductivityReportingScreen"
And I enter "<ClassField4>" in field "ClassField4" on "ProductivityReportingScreen"
And I enter "<ClassField5>" in field "ClassField5" on "ProductivityReportingScreen"
And I enter "<SortCriteria>" in field "SortCriteria" on "ProductivityReportingScreen"
And I enter "<SummaryDetail>" in field "SummaryDetail" on "ProductivityReportingScreen"
And I enter "<FileName>" in field "FileName" on "ProductivityReportingScreen"
And I enter "<Library>" in field "Library" on "ProductivityReportingScreen"
And I press "Enter" Key 
And I press "F6" Key


Then I Validate the Job is completed with "<Juser>","<Jname>"
And I Validate the Class codes "<ClassField1>","<ClassField2>""<ClassField3>","<ClassField4>","<ClassField5>" displays in Spool file Report "<Report>" for Carrier "<CarrierFrom>","<CarrierThru>"
And I Validate the Class codes "<ClassField1>","<ClassField2>""<ClassField3>","<ClassField4>","<ClassField5>" in file "<Library>","<FileName>" 

Examples:
| TransactionFromDate | TransactionThruDate | CarrierFrom | CarrierThru | ClassField1 |ClassField2 | ClassField3 |ClassField4 |ClassField5 |SortCriteria |SummaryDetail |FileName   | Library | Juser | Jname      | Report |         
| 010101              | 123117              | BHUCAR      | VAH         | N1          | N2         | N3          | N4         | N5         |1            |D             |SR41404F9  | USRSAKK | SAKK  | CLRAPRDEXT | PRODUCTIVITY DETAIL REPORT |



