Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check data and user changes for DPA 


Scenario Outline: :Changed Date and User should be updated to the latest date on RCDTE001 screen
  	Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "4" to navigate to "RxClaim Dynamic Prior Authorization"
    And I select Option "1" to navigate to "Dynamic Prior Authorization"
    Then I capturing the present tier override and formulary status data on DPA screen with "<CarrierID>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    When I login with different credential with "<UserID>","<Password>"
    Then I validate the changed date and user in DPA screen with "<CarrierID>","<TierOverride>","<Formulary Status>","<TOFlag>","<Data>"
    
    
 Examples:
 | CarrierID | TierOverride | UserID | Password | TOFlag | Data | Formulary Status |
 | SR41429A4 | 01 | VANM | Welcome007 | E | 06 | 04 |