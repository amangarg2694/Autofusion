Feature: To compare the excel sheets
Scenario Outline: Compare Excel sheets

Given I am on RxClaim PlanAdministrator Menu
When the user compares "<ActualFile>" with "<ExpectedFile>"
Then result found

Examples:
|ActualFile|ExpectedFile|
|R1-R42_8404|SR42440-R1_R42_Exp|

