Feature: Verify Load Extracts
 As a RxClaim User I want to Verify Load extract to verify the details of Schedule
 
  Scenario Outline: Verify Extract of Contingent Therapy Schedule
  Given  I am on RxClaim PlanAdministrator Menu 
  When I am on RxClaim Operations Menu
 	And  I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
 	And   I select Option "11" to navigate to "Create Export Files"
 	And   I select Option "18" to navigate to "Contingent Therapy Schedule Batch Export"
 	And  I create Contingent Therapy Schedule Batch Export file with "<sch1>","<sch2>","<file>","<lib>"
  Then Validate the Contingent Therapy Schedule Batch Export file export file with "<lib>","<file>","<level>","<wildcard>"
  
  Examples:
  |sch1          |sch2         |file             |lib      |level|wildcard|
  |SN003071SCH01|SN003071SCH01|SR41397_D2      |usrmadhu |N    |0|
  
  
  Scenario Outline: Verify Load of Contingent Therapy Schedule
  
  Given I am on OptumRx RxClaim/RxServer Main Menu
 	When I select Option "21" to navigate to "RxClaim Operations Menu"
 	And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
 	And I select Option "27" to navigate to "Contingent Therapy Schedule Batch Load"
 	And I create Contingent Therapy Schedule Batch load  with "<file>","<lib>"
 	Then Validate the Contingent Therapy Schedule is created with "<sch>","<seq>"
  
  Examples:
  |file             |lib      |sch  |seq|
  |SR41397_Dl      |usrmadhu  |MADHU071SCH02    |10|