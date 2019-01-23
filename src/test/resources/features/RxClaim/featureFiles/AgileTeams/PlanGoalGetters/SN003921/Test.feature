#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: CT Scenarios
    Given I am on RxClaim PlanAdministrator Menu
    And I create plan with pricing "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I create NDCGPI OR Edit List with "<List1>"
    #Then I verify the <status> in step

    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|List1|
      |SN3291P1  |010101  |123139  |ECLPLN01 Plan   |EVUAREG      |EVUAREG           |List2|
      
