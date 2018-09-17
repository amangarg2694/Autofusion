Feature: Part D Help Texts
   Scenario Outline: F1 Help Texts
   
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I search the help text with Plan "<Plan>"
    And I am on RxClaim PlanAdministrator Menu 
    And I send "<PMUid>", "<Plan>"to search help text
    #Then Help Texts displayed
    
    
      Examples:
    | Plan     |PMUid     |
		|	PLNSN3036|AUTO893   |