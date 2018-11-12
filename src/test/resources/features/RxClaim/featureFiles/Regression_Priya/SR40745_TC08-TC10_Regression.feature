Feature: Create a MSC override file load to the product master file
  As a RxClaim User validating Extract Product batch and loading products respective to GPI

## TC08 till TC10
Scenario Outline: To verify if batch is submitted successfully when all fields are entered and verify all the fields are populated when sql command is run with data in the needed fields
Given I am on RxClaim PlanAdministrator Menu
When I select Option "8" to navigate to "RxClaim Profile Maintenance"
 And I select Option "33" to navigate to "Product Load Pre-Processing Profile"
 And I select Option "9" to navigate to "Extract Product"
Then Validating the fields when Extract product job has completed successfully with "<GPI>","<File>","<Library>"

Examples:
|GPI|File|Library|
|TEST|FILE02|USRPRIYA|