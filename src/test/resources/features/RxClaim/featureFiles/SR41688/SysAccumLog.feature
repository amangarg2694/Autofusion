Feature: Validating Purge accum log files
As a RxClaim User I want to check whether Purge logic is working correctly for Purge accum log files in "Purge accum log files" screen

Scenario Outline: Purge logic for SYSAccum log files - SN003417_SR41688_TC011_Req_4.1.2.6
 Given I am on RxClaim PlanAdministrator Menu 
 When I create record for SysAccumLog files"<Library>","<FileName>"
 And I navigate to Purge accum log files screen
 And Enter Purge value "<X_Coordinate>","<Purge>","<ActiveMonth>"

Then I Validate the Job is completed "<JobUser>","<JobName>"
And I Validate activeMonths,Purge,Files "<FileName>","<Purge>","<ActiveMonth>" displays in Spool file

Examples:
| Library  |FileName|X_Coordinate| Purge | ActiveMonth| JobUser| JobName  |
|TXD8403FIL|CMIAIP  |    20       |   Y   |      20    |   MGUP | PGMRJOBDS|
|TXD8403FIL|CMIAOP  |    21       |   Y   |      20    |   MGUP | PGMRJOBDS|
