

Feature: Open the new screen and check all the edits possible on the menu option

## TC01
  Scenario: Check if the new menu option for claim origination code list is availaible
    Given I am on RxClaim PlanAdministrator Menu
    And I select Option "9" to navigate to "RxClaim Batch Process Menu"
    When I select Option "6" to navigate to "Lists"
    And I select Option "94" to navigate to "Claim Origination Code List"
    Then I Validate the new screen " Claim Origination Code List"
    
    
## TC02

  Scenario: Verify that Claim Origination Code List Add screen is added
  Given I am on RxClaim PlanAdministrator Menu
  And I select Option "9" to navigate to "RxClaim Batch Process Menu"
  When I select Option "6" to navigate to "Lists"
  And I select Option "94" to navigate to "Claim Origination Code List"
  And I press "F6" Key
  Then I Validate the Add Screen "Add Claim Origination Code List"
  
  
  
  
    
    