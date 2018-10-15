Feature: Plan Edits w/Msgs; Prescriber Network and Refill Limits not setting indicator
  
  Scenario Outline: SN001206_SR41885_TC001: To check if a message is present on the plan prescriber network screen ,the message indicator on the "Plan edits with message" screen must be turned ON for prescriber network.
  									SN001206_SR41885_TC002.To check if a message is present on the "Active Plan Prescriber Network Grace Periods" screen ,the message indicator on the "Plan edits with message" screen must be turned ON for prescriber network.
  									SN001206_SR41885_TC003.To check if a message is present on the "Prescriber network override" screen ,the message indicator on the "Plan edits with message" screen must be turned ON for prescriber network.
  									
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter the "<plancode>" in Active Plan by Plan Code
		And I verify the message is on prescriber network
		And I press "F7" Key
		And I select the prescriber network
		And I verify the message is on prescriber network
		And I press "F7" Key
		And I select the prescriber network & override the network 
		And I verify the message is on prescriber network
    Examples: 
      | plancode |
      | SR41885B1|    
    
   
      