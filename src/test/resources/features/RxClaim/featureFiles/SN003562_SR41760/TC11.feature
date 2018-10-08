Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003331_SR41449_TC011_Verify Add Member Eligibility (PME) record when Update flag set to N for both Prior Auth & PA Carrier List
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query in command line for program RCPLN711
		And I enter "<PlanCode>", "<FromDate>" on Plan Details Screen
		And I verify PriorAuth , PACarrierList in RCPME711 screen
		#And I enter "<PriorAuth>" and check PACarrierList in RCPME711 screen
		And I enter run mode "<RunMode>", value at "<Position20>", "<Position21>", "<Position354>", PACarrierList "<PACarrierList>" at Position355 on RCPME712 screen
		And I verify error message in Display Responses window
	  And I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  And I navigate to "<PlanCode>" Plan Details Page
		And I verify Prior Aut "<PriorAuth>" & PA Carrier LIst "<PACarrierList>" flag value in Member Eligibility Details Page in Plan ie RCPME001I screen
		Then I go Back to "RxClaim Plan Administrator Menu"
		
		# CALL PGM(RCPME711) PARM('') 
		# SN003562A, TESTLFT99, TESTLFT98, TESTLFT97  
		# Carrier: TESTVMCAR
		
    Examples: 
      | PlanCode  | FromDate | RunMode  |	PriorAuth	|	Position20	|	Position21	|	Position354	| PACarrierList	|
      | SN003562A | 010118	 | A				|	G					|	N						|	L						|	N						|	SN003356A			|
      #| SN003562A | 010118	 | A				|	G					|	Y						|	L						|	Y						|	TESTVMCAR			|
  