Feature: Create a MSC override file load to the product master file
  As a RxClaim User validating few screens and functionality related to product MSC

## Take data for OldFile from SR40745_TC11-TC19.feature file (column name : NewFile).Change the Dates,File and Library

## TC20 till TC30
Scenario Outline: To verify if “Q” “Automated Product MSC Update” after submitting the MSC update batch succesfully and if File Create Date,Change Date,UserId is displayed after submitting the MSC update batch.Verify if  older msc is displayed in Product Change Audit Detail Page and product note is displayed for the updated MSC
Given I am on RxClaim PlanAdministrator Menu
When I select Option "8" to navigate to "RxClaim Profile Maintenance"
And I select Option "33" to navigate to "Product Load Pre-Processing Profile"
And I select Option "10" to navigate to "Product MSC Update Audit History Report"
Then Validating product notes,older msc,updated msc and Q Automated Product MSC Update message after submitting the batch with "<FromDate>","<ThruDate>","<File>","<Library>","<OldFile>"

Examples:
|FromDate|ThruDate|File|Library|OldFile|
|010118|100218|Auto2|USRPRIYA|EVU5|