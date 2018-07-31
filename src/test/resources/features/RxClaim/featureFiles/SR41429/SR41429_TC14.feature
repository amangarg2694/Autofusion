Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check error message is populated correctly when Tier Override flag is blank for MPA 

  Scenario Outline: Error message is displayed on MTE screen if Tier  Override I/E flag is blank
  	Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    Then Validating the error message with "<MemberID>"
  	
   Examples:
   
      | MemberID |
      | SR41429M |
       
      