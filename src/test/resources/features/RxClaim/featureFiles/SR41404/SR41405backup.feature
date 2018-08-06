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
|NoField  |
|No Value|

Scenario Outline: Validating Eligibility Load Tracking Extract screen
Given I am on RxClaim Utility Programs
When I select Option "65" to navigate to "Eligibility Load Tracking Extract"
Then Validate the Eligibility Load Tracking Extract screen


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
