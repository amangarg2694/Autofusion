Feature: FIX IT: Update Batch Claim Load Override Submission Days
 
Scenario Outline: SN374521_SR41821_TC002_Call program RX12215C1
    Given I am on RxClaim PlanAdministrator Menu
    When I call program from command line
    And I enter "<Object>","<Library>" names for program RX12215C1
    Then I verify application error in CCT600 screen
		
		# CALL
		# obj name - RX12215C1
		# Library -IRIPRDOBJ
		    
    Examples: 
      | Object 		| Library 	|
			| RX12215C1	|	IRIPRDOBJ	|
    	