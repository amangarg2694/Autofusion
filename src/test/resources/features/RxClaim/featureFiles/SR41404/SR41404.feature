Feature: Addition of new menu item Eligibility Load Tracking Extract
As a RxClaim User I want to check whether anew menu item Eligibility Load Tracking Extract is added in Utility Program

Scenario Outline: Validating new menu item Eligibility Load Tracking Extract in RxClaim Utility Programs
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Operations Menu"
And I select Option "7" to navigate to "RxClaim Utility Programs"
And I press "PageDown" Key 
And I press "PageDown" Key 
And I press "PageDown" Key 
And I press "PageDown" Key 
Then Validate the new menu Eligibility Load Tracking Extract in RxClaim Utility Programs


Examples:
|Field  |
|Value|

Scenario Outline: Validating Eligibility Load Tracking Extract screen
Given I am on RxClaim Utility Programs
When I select Option "65" to navigate to "Eligibility Load Tracking Extract"
Then Validate the Eligibility Load Tracking Extract screen


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the field Form Date  
Given I am on Eligibility Load Tracking Extract screen
When I select help Option "F1" on the field From Date
Then Validate the help message for the field From Date


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the field Thru Date  
Given I am on Eligibility Load Tracking Extract screen
When I select help Option "F1" on the field Thru Date
Then Validate the help message for the field Thru Date


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Carrier From field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Carrier From
Then Validate the help message and length of the field Carrier From


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Carrier Thru field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Carrier Thru
Then Validate the help message and length of the field Carrier Thru


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Carrier List field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Carrier List
Then Validate the help message and length of the field Carrier List


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Carrier Status field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Carrier Status
Then Validate the help message and length of the field Carrier Status
And Carrier status field values


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Account From field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Account From
Then Validate the help message and length of the field Account From


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Account Thru field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Account Thru
Then Validate the help message and length of the field Account Thru


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Account List field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Account List
Then Validate the help message and length of the field Account List


Examples:
|Field  |
|Value|

Scenario Outline: Validating help message and length of the Account Status field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Account Status
Then Validate the help message and length of the field Account Status
And Validate Account status field values


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the Group From field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Group From
Then Validate the help message and length of the field Group From


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the Group Thru field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Group Thru
Then Validate the help message and length of the field Group Thru


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the Group List field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Group List
Then Validate the help message and length of the field Group List


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the Group Status field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Group Status
Then Validate the help message and length of the field Group Status
And Validate Group status field values


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the File Name field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field File Name
Then Validate the help message and length of the field File Name


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating help message and length of the Library field  
Given I am on Eligibility Load Tracking Extract screen
When I navigate to the field Library
Then Validate the help message and length of the field Library

Examples:
|NoField  |
|No Value|

Scenario Outline: Validating the function keys F3 of Eligibility Load Tracking Extract screen   
Given I am on Eligibility Load Tracking Extract screen
When I press "F3" Key
Then User should navigate to RxClaim Utility Programs


Examples:
|NoField  |
|No Value|

Scenario Outline: Validating the function keys F12 of Eligibility Load Tracking Extract screen   
Given I am on RxClaim Utility Programs
When I select Option "65" to navigate to "Eligibility Load Tracking Extract screen"
And I press "F12" Key
Then User should navigate to RxClaim Utility Programs


Examples:
|NoField  |
|No Value|

Scenario Outline: User should able to submit the job in Eligibility Load Tracking Extract Screen with below field values polulated
Given I am on RxClaim Utility Programs
When I select Option "65" to navigate to "Eligibility Load Tracking Extract" 
And I have entered the values "<DateFrom>","<DateThru>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<FileName>","<Library>","<DFCT>","<SPCT>", in the screen EligibilityLoadTrackingExtractScreen

Then Job should completed with user "<Juser>" and job name "<Jname>"
And I Validate the spool file is generated with "<ReportName>","<CarrierFrom>","<CarrierThru>","<FileName>","<Library>"


Examples:
| DateFrom | DateThru | CarrierFrom | CarrierThru | AccountFrom|AccountThru |GroupFrom |GroupThru |FileName  | Library |DFCT| SPCT |NewScreen              | Juser | Jname    |ReportName            |  
| 010101   | 123117   | BHUCAR      | VAH         | BHUVACC    |VAH         | BHUGRP   |SB        |SR414046  | USRSAKK |XLS | PDF  |File Conversion Request| SAKK  | RCELGEXT |Eligibility Reporting |