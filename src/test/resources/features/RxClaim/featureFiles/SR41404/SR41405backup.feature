Feature: Addition of new menu item Eligibility Load Tracking Extract
As a RxClaim User I want to check whether a new menu item Eligibility Load Tracking Extract is added in Utility Program

Scenario Outline: User should able to submit the job in Eligibility Load Tracking Extract Screen
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "7" to navigate to "RxClaim Utility Programs"
And I select Option "65" to navigate to "Eligibility Load Tracking Extract" 
And I enter "<DateFrom>" in field "DateFrom" on "EligibilityLoadTrackingExtractScreen"
And I enter "<DateThru>" in field "DateThru" on "EligibilityLoadTrackingExtractScreen"
And I enter "<CarrierFrom>" in field "CarrierFrom" on "EligibilityLoadTrackingExtractScreen"
And I enter "<CarrierThru>" in field "CarrierThru" on "EligibilityLoadTrackingExtractScreen"
And I enter "<FileName>" in field "FileName" on "EligibilityLoadTrackingExtractScreen"
And I enter "<Library>" in field "Library" on "EligibilityLoadTrackingExtractScreen"
And I press "F6" Key
And I select yes to continue


Then Job should completed with user "<Juser>" and job name "<Jname>"
And I Validate the spool file is generated with "<ReportName>","<CarrierFrom>","<CarrierThru>","<FileName>","<Library>"








Examples:
| DateFrom | DateThru | CarrierFrom | CarrierThru | FileName  | Library |NewScreen              | Juser | Jname    |ReportName            |  
| 010101   | 123117   | BHUCAR      | VAH         | SR414046  | USRSAKK |File Conversion Request| SAKK  | RCELGEXT |Eligibility Reporting |