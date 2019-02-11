#Author: rajvardhan@optum.com
Feature: Create Plan in RxClaim

  Scenario Outline: Create new Plan using RxClaim System
    Given I am on RxClaim PlanAdministrator Menu
    When I want to create plan "<PlanCode>","<FromDate>","<Description>"
    Then I validate plan code "<PlanCode>"

    Examples: 
      | PlanCode | FromDate | Description |
      | Plancod2 |   010101 | TestPlan    |
