Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003331_SR41449_TC010_Verify Error message displayed on Display Responses screen when PLAN does not consist any PME record.
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query in command line for program RCPLN711
		And I enter "<PlanCode>", "<FromDate>" on Plan Details Screen
		And I press "Enter" Key
		And I enter run mode "<RunMode>" on RCPME712 screen
		And I verify error message in Display Responses window
	  Then I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  # CALL PGM(RCPME711) PARM('') 
		# SN003562A  , TESTLFT98, TESTLFT97  
		# Take PLAN which does not consist any PME record.
		
    Examples: 
      | PlanCode  | FromDate | RunMode  | Flag	|	DynamicPA	|
      | TESTLFT99 | 010118	 | D				|	Y			|	Y					|
     
