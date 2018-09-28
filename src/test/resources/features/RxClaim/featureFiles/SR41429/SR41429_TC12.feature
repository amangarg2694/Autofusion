Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check data and user changes for MPA 


Scenario Outline: Changed Date and User should be updated to the latest date on RCMTE001 screen
  	Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    Then Capture the date and user present on MPA screen with "<MemberID>"
   	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	When I login with different credential with "<UserID>","<Password>"
  	When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    Then Validating the date and user modified on MPA screen with "<MemberID>","<TierOverride>"
    
 Examples:
 | MemberID | TierOverride | UserID | Password |
 | SR41429M | 00 | VANM | Welcome007 |
 
 
 
 Scenario Outline: Changed Date and User should be updated to the latest date on RCMTE001 screen
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F12" Key
  	When I check for the date and user on MPA screen with "<MemberID>"
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	And I press "F3" Key
  	When I login with different credential with "<UserID>","<Password>"
  	When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
  	Then I Validate the date and user modified on MPA screen with "<MemberID>","<TOFlag>","<Data>"
    
    
 Examples:
 | MemberID | TOFlag | Data | UserID | Password |
 | SR41429_02 | E | 06 | VANM | Welcome007 |