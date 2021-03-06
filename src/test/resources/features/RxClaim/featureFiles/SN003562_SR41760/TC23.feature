Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003562_SR41760 _TC023_RCPME_Change_YACG_blank: Verify Change Member Eligibility (PME) record when Update flag set Y.
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query in command line for program RCPLN711
		And I enter "<PlanCode>", "<FromDate>" on Plan Details Screen
		And I enter "<PriorAuth>" and check PACarrierList in RCPME711 screen
		And I enter run mode "<RunMode>", value at "<Position20>", "<Position21>", "<Position354>", PACarrierList "          " at Position355 on RCPME712 screen
		And I verify error message in Display Responses window
	  And I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  And I navigate to "<PlanCode>" Plan Details Page
		And I verify Prior Aut "<PriorAuth>" & PA Carrier LIst "<PACarrierList>" flag value in Member Eligibility Details Page in Plan ie RCPME001I screen
		Then I go Back to "RxClaim Plan Administrator Menu"
		
		# Note: Delete the PA carrier list manually in Claim and reuse.
		# CALL PGM(RCPME711) PARM('') 
		# SN003562A, TESTLFT99, TESTLFT98, TESTLFT97, TESTVM87
		# Carrier: SN1629LST1
		
    Examples: 
      | PlanCode  	| FromDate | RunMode  |	PriorAuth	|	Position20	|	Position21	|	Position354	| PACarrierList	|
      | SN003562A1	| 010118	 | C				|	L					|	Y						|	A						|	Y						|	SN1629LST1		|
  		| SN003562A1	| 010118	 | C				|	L					|	Y						|	C						|	Y						|	SN1629LST1		|
      | SN003562A1	| 010118	 | C				|	L					|	Y						|	G						|	Y						|	SN1629LST1		|

    	