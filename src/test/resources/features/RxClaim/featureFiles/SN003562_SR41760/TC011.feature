Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003331_SR41449_TC009_Verify Delete member Eligibility (PME) record
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query in command line for program RCPLN711
		And I enter "<PlanCode>", "<FromDate>" on Plan Details Screen
		And I enter "<PriorAuth>" and check PACarrierList in RCPME711 screen
		And I update run mode to ADD "<RunMode>","<FlagN>","<FlagL>", PACarrierList "<PACarrierList>" on RCPME712 screen
		And I verify error message in Display Responses window
	  And I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  And I navigate to "<PlanCode>" Plan Details Page
		Then verify Prior Aut "<PriorAuth>" & PA Carrier LIst "<PACarrierList>" flag value in Member Eligibility Detail Page in Plan ie RCPME001I screen
		# CALL PGM(RCPME711) PARM('') 
		# SN003562A, TESTLFT99, TESTLFT98, TESTLFT97  
		   
    Examples: 
      | PlanCode  | FromDate | RunMode  |	PriorAuth	| PACarrierList	| FlagY	|	FlagN	|	FlagL	|
      | SN003562A | 010118	 | A				|	G					|	SN003562A			|	Y			|	N			|	L			|
     
