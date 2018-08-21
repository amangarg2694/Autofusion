Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check error message is populated correctly when Tier Override flag is blank for DPA 

Scenario Outline: Error message is displayed on MTE screen if Tier Override I/E flag is blank
  	Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  	And I select Option "4" to navigate to "RxClaim Dynamic Prior Authorization"
  	And I select Option "1" to navigate to "Dynamic Prior Authorization"
  	Then Validating the error message with "<CarrierID>" for DPA
  	
Examples:
   
      | CarrierID |
      | SR41429A8 |
       