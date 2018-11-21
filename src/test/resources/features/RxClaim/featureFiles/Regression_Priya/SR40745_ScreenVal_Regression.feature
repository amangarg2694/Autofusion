Feature: Create a MSC override file load to the product master file
  As a RxClaim User validating few screens and functionality related to product MSC
  
## TC01
Scenario: To verify if new field named "Product MSC Batch Update"
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "8" to navigate to "RxClaim Profile Maintenance"
  And I select Option "33" to navigate to "Product Load Pre-Processing Profile"
  Then Validating the option Product MSC Batch Update is available in Product Load Pre-Processing Profile screen

## TC02
Scenario: To verify if new field named "Extract Product"
  And I press "F12" Key
  Then Validating the option Extract Product is available in Product Load Pre-Processing Profile screen
  
## TC03
Scenario: To verify if new field named "Product MSC Update Audit History Report"
  And I press "F12" Key
  Then Validating the option Product MSC Update Audit History Report is available in Product Load Pre-Processing Profile screen
  
## TC04
Scenario Outline: To verify if error message "GPI cannot be blank" is displayed when GPI is  kept blank
And I press "F12" Key
Then Validating the error message when GPI list is left blank with "<File>","<Library>"

Examples:
|File|Library|
|SR40745|USRPRIYA|

## TC05
Scenario Outline: To verify if  message "File Name Required" is displayed when File Name field is  kept blank
And I press "F12" Key
Then Validating the error message when file name is left blank with "<GPI>","<Library>"

Examples:
|GPI|Library|
|AAMEGPI|USRPRIYA|

## TC06 & TC07
Scenario Outline: To verify if  message "Library Name Required" is displayed when File Name field is kept blank and GPI list is displayed when  F4 is pressed on GPI field
And I press "F12" Key
Then Validating the error message when library name is left blank with "<GPI>","<File>"

Examples:
|GPI|File|
|AAMEGPI|SR40745|


