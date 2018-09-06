Feature: Part D: B vs D Coverage Determination for Inhalation DME Supply Drugs
As a RxClaim User I want to check whether MPA batch load working correctly for differnt versions

Scenario Outline: Validate the Drug Status Table for MPA Batch load for v8.3 Type 1(PA Type N)
Given I am on RxClaim PlanAdministrator Menu
And I update the Mbr PA export file"<Efilename>","<Library>" for Drug status table "<Drugtable>"
And I create the MBA batch load with file "<Efilename>","<Library>", "<FileFormat>" 

Then Job should complete successfully with user "<Juser>" and job name "<Jname>"
And I validate the records in spool file report "<ReportName>"
And I validate member "<MemberID>" prior authorisation is updated with Drug Status Table "<Drugtable>"
Examples:
    | Efilename  | Library     |Drugtable  |FileFormat|Juser|Jname    |MemberID|
    | TESTO14    | USRSAKK     |SN003556TB2|8.3       |SAKK |CLPRAUTH |TESTO14|
