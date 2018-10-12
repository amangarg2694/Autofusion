Feature: COMM: Update Comm engine program CMDTAC21 to keep Job SERVICER001 in ACTIVE
As a RxClaim User I want to check whether Job SERVICER001 in ACTIVE 

Scenario Outline: User should able to validate the Job SERVICER001 in ACTIVE and running
Given I am on RxClaim PlanAdministrator Menu
When I enter the command "<Command>" in command line
And I press "Enter" Key

Then I Validate the job "<Job>" in 'Work with Subsystem Jobs' screen as ACTIVE status "<Status>"


Examples:
| Command 					  | Job        | Status |
| WRKSBSJOB RXCOM8403 | SERVICER001| ACTIVE |


Scenario Outline: User should able to see Job SERVICER001 in ACTIVE after deleting the workobj SERIVCEIN 
Given I am on Work with Subsystem Jobs screen
When I enter the command "<Command1>" in command line
And I press "Enter" Key
And I delete the work object "<Workobj>"
And I enter the command "<Command>" in command line
And I press "Enter" Key
And I press "Enter" Key
And I enter the command "<Command>" in command line
And I press "Enter" Key

Then I Validate the job "<Job>" in 'Work with Subsystem Jobs' screen as ACTIVE status "<Status>"
And Exit the screen


Examples:
| Command 					  | Job        | Status |Command1     |Workobj  |
| WRKSBSJOB RXCOM8403 | SERVICER001| ACTIVE |WRKOBJ SRVIN |SRVIN    |