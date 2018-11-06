Feature: Create a MSC override file load to the product master file
  As a RxClaim User validating few screens and functionality related to product MSC

## Change the File,NewFile and Library data
## File should contain three records to modify the data and verify the fields
## TC11 till TC19
Scenario Outline: To verify Brand/Generic Product Log Report is submitted with valid details & valid file is submitted with batch in Product MSC Batch Update
Given I am on RxClaim PlanAdministrator Menu
When I select Option "8" to navigate to "RxClaim Profile Maintenance"
 And I select Option "33" to navigate to "Product Load Pre-Processing Profile"
 And I select Option "6" to navigate to "Brand/Generic Product Log Report"
When submitting Brand/Generic Product Log Report job and verifying processed status is reflected in spool file when file is submitted with batch in Product MSC Batch Update with "<FromDate>","<ThruDate>","<File>","<Library>","<NewFile>","<Carrier>","<Account>","<Group>"

Examples:
|FromDate|ThruDate|File|Library|NewFile|Carrier|Account|Group|OverrideMSC1|OverrideMSC2|OverrideMSC3|OverrideMSC4|OverrideMSC5|ProcessStatus1|ProcessStatus2|ProcessStatus3|
|010118|100318|File16|USRPRIYA|EVU6|*ALL|*ALL|*ALL|*|M|Y|N|O|03|04|05|