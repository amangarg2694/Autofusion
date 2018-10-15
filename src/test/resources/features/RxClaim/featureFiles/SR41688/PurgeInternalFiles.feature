Feature: Validating Purge accum log files
As a RxClaim User I want to check whether Purge logic is working correctly for Purge accum log files in "Purge accum log files" screen

Scenario Outline: Purge logic for UHG internal log files - SN003417_SR41688_TC010_Req_4.1.2.6
 Given I am on RxClaim PlanAdministrator Menu 
 When I create record for internal files"<Library>","<FileName>"
 And I create record for internal files"<Library>","<FileName1>"
 And I create record for internal files"<Library>","<FileName2>"
 And I navigate to Purge accum log files screen
 And Enter Purge value "<X_Coordinate>","<Purge>","<ActiveMonth>"

Then I Validate the Job is completed "<JobUser>","<JobName>"
And I Validate activeMonths,Purge,Files "<ActiveMonth>","<Purge>","<FileName>","<FileName1>","<FileName2>" displays in Spool file

Examples:
| Library  |FileName|FileName1|FileName2|X_Coordinate| Purge | ActiveMonth| JobUser| JobName  |
|TXD8403FIL|UHGINPP |UHGIAIP  |UHGIAOP  |    9       |   Y   |      44    |   MGUP | PGMRJOBDS|
|TXD8403FIL|HCSCINPP|HCSCIAIP |HCSCIAOP |    15      |   Y   |      44    |   MGUP | PGMRJOBDS|
