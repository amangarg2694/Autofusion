Feature: Carelink login

  As a carelink appsuer 
  I want to browse the Carelink 
  to check if can valid user can login

  


  Scenario: Login to welcomepge
    Given I navigate to carelink website 
    And i enter the username
    And i enter the password
    Then the Carelink welcome Page should be displayed

