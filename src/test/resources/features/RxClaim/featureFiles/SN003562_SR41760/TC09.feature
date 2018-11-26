Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003331_SR41449_TC009_Verify Delete member Eligibility (PME) record
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query in command line for program RCPLN711
		And I enter "<PlanCode>", "<FromDate>" on Plan Details Screen
		And I press "Enter" Key
		And I enter run mode "<RunMode>" on RCPME712 screen
		And I verify error message in Display Responses window
	  And I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  And I navigate to "<PlanCode>" Plan Details Page
		Then verify Member Eligibility Detail in Plan detail "<PlanCode>" display mode i.e. RCPME001I screen
		# CALL PGM(RCPME711) PARM('') 
		# SN003562A  , TESTLFT98, TESTLFT97  
		   
    Examples: 
      | PlanCode  | FromDate | RunMode  | Flag	|	DynamicPA	|
      | SN003562A | 010118	 | D				|	Y			|	Y					|
      #| TESTLFT99 | 010118	 | D				|	Y			|	Y					|
     
