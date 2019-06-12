Feature: Check new menu option for drug status priority schedule
  As a RxClaim User I wnat to create a new drug status priority schedule

  Scenario Outline: Create a new drug status priority schedule in Rxclaims
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "7" to navigate to "RxClaim Prior Authorization"
    And I select Option "8" to navigate to "Multiple PA Processing"
    And I select Option "1" to navigate to "Drug Status Priority Schedule"
    And I press "F6" Key
    And I enter "<Schedule>" in field "Schedule" on "AddDrugStatusPriorityScheduleScreen"
    And I enter "<Description>" in field "Description" on "AddDrugStatusPriorityScheduleScreen"
    And I press "Enter" Key
    #And I enter value "<Test>"
   # And I setup drug status priority schedule with "<Schedule>","<Priority","<Drugstatus>","<Qualifier>","<OverrideList>"
    And I setup drug status priority schedule "<Schedule>","<Priority","<Drugstatus>","<Qualifier>","<OverrideList>"
 
  Examples: 
      | Schedule | Description | Priority | DrugStatus | Qualifier | OverrideList |
      | TESTSRI  | Test 1      |      010 | F          | L         | AGR1         |
      | TESTSRI1 | Test 2      |      010 |          8 | L         | AGR1         |
