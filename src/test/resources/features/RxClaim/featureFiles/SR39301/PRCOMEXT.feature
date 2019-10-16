Feature: Verify that the PRCOMEXT does not go into a MSGW condition 
 As a RxClaim User I want to verify that the PRCOMEXT does not go into a MSGW condition
 
 Scenario Outline: Verify that the PRCOMEXT does not go into a MSGW condition when the LK-GIS-ACTIVE = ‘N’OR ‘Y’
 Given I am on RxClaim PlanAdministrator Menu
 When I submit job using command "<cmd1>" with "<jobname>"
 Then  I wait until the job "<jobname>","<user>" moves to "OUTQ"
 And  I verify the file "<file>","<lib>"
 
 Examples:
 |cmd1                                                                           |jobname|file  |lib     |user|	  
 |CALL PGM(CLPRCOMEXT) PARM('1160101' '1160407' 'Test_n' 'USRMADHU' 'N' ' ' ' ')|Test_n |Test_n|usrmadhu|YMAD|
 |CALL PGM(CLPRCOMEXT) PARM('1160101' '1160407' 'Test_y' 'USRMADHU' 'N' ' ' ' ')|Test_y |Test_y|usrmadhu|YMAD|
 
 Scenario Outline: Verify that the PRCOMEXT does not go into a MSGW condition when the LK-GIS-ACTIVE = ‘Y’
  
  Given I am on RxClaim PlanAdministrator Menu
  When  I select Option "8" to navigate to "RxClaim Profile Maintenance"
  And   I select Option "33" to navigate to "Product Load Pre-Processing Profile"
  And   I select Option "7" to navigate to "Product CAG Override Manual Changes Report"
  And   I enter "<fromdate>","<todate>","<filename>","<lib>" in Product CAG Override Manual Changes Report screen
  And I press "F6" Key
  And 	I enter "Y" to continue
  Then  I wait until the job "<jobname>","<user>" moves to "OUTQ"
  And 	 I verify the file "<filename>","<lib>"
  
  Examples:
  |fromdate|todate|filename |lib     |jobname |user|
  |010118	 |080818|procomext|usrmadhu|PRCOMEXT|YMAD|	
  
  
  
  
  
  
  