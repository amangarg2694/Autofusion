Feature: Carelink login

  As a carelink appsuer 
  I want to browse the Carelink 
  to check if can valid user can login

  


  Scenario: Login to welcomepge
    Given I navigate to carelink website 
    When i enter the username as "p1509"
    And i enter the password as "p02062018!"
    Then the Carelink welcome Page should be displayed

