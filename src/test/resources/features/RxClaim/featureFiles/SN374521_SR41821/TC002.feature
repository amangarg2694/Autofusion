Feature: FIX IT: Update Batch Claim Load Override Submission Days
 
Scenario Outline: SN374521_SR41821_TC002_Call program RX12215C1
    Given I am on RxClaim PlanAdministrator Menu
    When  I press "F10" Key
    And I enter command to call program RX12215C1
    And I go to display job screen
    And I verify call log for program RX12215C1
    Then I verify "<Object>", "<Library>" in work with Object screen
    		
		# CALL   PGM(RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')
		# obj name - RX12215C1
		# First Library - TIR8402OBJ
	
    Examples: 
      | Object 		| Library			|
			| RX12215C1	|	TIR8402OBJ	|
    	
Scenario Outline: SN374521_SR41821_TC002_Call program RX12215C1 with library
  	Given I am on RxClaim PlanAdministrator Menu
    When  I press "F10" Key
    And I enter command to call program RX12215C1 with library
    And I go to display job screen
    And I verify call log for program RX12215C1 with library
    Then I verify "<Object>", "<Library>" in work with Object screen
        
    # CALL   PGM(IRIPRDOBJ/RX12215C1) PARM('20180604' '20180604' '0000001' '0009999' 'RX12215PF2' 'CUSTLIB' 'RX12215PFR' 'CUSTLIB' '19970101' 'N' 'INPQ')
  	# Second Library -IRIPRDOBJ
   	# obj name - RX12215C1
   	
    Examples: 
      | Object 		| Library		|
			| RX12215C1	|	IRIPRDOBJ	|