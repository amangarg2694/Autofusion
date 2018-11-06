Feature: Validating Purge accum log files
As a RxClaim User I want to check whether Purge logic is working correctly for Purge accum log files in "Purge accum log files" screen

 Scenario Outline: Purge logic for CMDWNP file layout - SN003417_SR41688_TC009_Req_4.1.2.6
 Given I am on RxClaim PlanAdministrator Menu 
 When I create record for CMDWNP file member"<Library>","<FileName>","<FileMember>"
 And I navigate to Purge accum log files screen
 And Enter Purge value "<X_Coordinate>","<Purge>","<ActiveMonth>"

 Then I Validate the Job is completed "<JobUser>","<JobName>"
 And I Validate total record Purged for "<Library>","<FileMember>","<FileName>","<Purge>","<ActiveMonth>"

 Examples:
 | Library  |FileName|FileMember|X_Coordinate| Purge | ActiveMonth| JobUser| JobName  |
 |COM8403QUA| CMDWNP |   AETNRT |     6      |  Y    |      21    |   MGUP | PGMRJOBDS|
 |COM8403QUA| CMDWNP |   UHGNRT |     8      |  Y    |      21    |   MGUP | PGMRJOBDS|
 |COM8403QUA| CMDWNP |   ESBNRT |     14     |  Y    |      21    |   MGUP | PGMRJOBDS|

