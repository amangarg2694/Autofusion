Feature: Setup Plan with NDC and GPI List for F278714
  As a RxClaim User I want to Setup Plan with NDC and GPI List

  Scenario Outline: Setup a Plan with NDC and GPI List
    Given I am on RxClaim PlanAdministrator Menu
    When I Setup Plan with Super NDC List "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>"
    And  I am on RxClaim PlanAdministrator Menu
    And  I Setup plan with Super GPI List "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    Then Validate GPI List is "<GPIList>"
    And Validate NDC List is "<NDCList>"

    Examples: 
      | PlanCode | NDCList  | NDCSeq | NDCFromDate | NDCThruDate | GPIList   | GPISeq | GPIFromDate | GPIThruDate |
      | GPITEST1 | SR34398N |     20 |      010118 |      123139 | SN001396S |    020 |      010118 |      123139 |
