#Author: garg_aman@optum.com	

@tag
Feature: Drug status validation on MNO/MGO profile for membebr PA.
  I want to use this template for my feature file

  @tag1
  Scenario: Drug status validation on MNO/MGO and MPP profile when reason code profile is attached
    Given I am on RxClaim PlanAdministrator Menu
    And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I create a new reason code profile with Drug status "<CarrierID>","<AccountID>","<GroupID>","<reasoncode>","<Initial_PA_drug_status>","<type>"
    And I create a new member "<CarrierID>","<GroupID>","<AccountID>","<MemberID>","<LastName>","<FirstName>","<Sex>","<DOB>","<fromdate>","<thrudate>"
    And I add a new Dynamic PA "<CarrierID>","<Sbm_PA2>","<description>","<type>","<reasoncode>","<agentcode>","<PA_NDC_list>","<PA_GPI_list>","<productId>", "<fromdate>", "<thrudate>"
    And I pay claim using Dynamic PA "<rxnumber>","<memberID>","<productID>","<dspQ>","<DS>","<cmpnd>","<Sbm_PA2>","<cost>","<fee>"
    Then I validate drug status on claim
    And I check MNO/MGO and MPP profile
  
  @TC001
  Scenario Outline: Verfy drug status on MNO/MGO profile equivalent to reason code profile when reason code profile attached to CAG
    Given I validate Drug status on reason code profile
    When I validate drug status on claim
    Then I check MNO/MGO and MPP profile

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
