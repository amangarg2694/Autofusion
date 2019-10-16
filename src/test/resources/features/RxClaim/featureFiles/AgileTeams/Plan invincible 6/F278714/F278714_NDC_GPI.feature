Feature: Setup Plan with NDC and GPI List for F278714
  As a RxClaim User I want to Setup Plan with NDC and GPI List

  Scenario Outline: Setup a Plan with NDC and GPI List
    Given I am on RxClaim PlanAdministrator Menu
    When I Setup Plan with NDC List "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>"
    Given I am on RxClaim PlanAdministrator Menu
    When I Setup Plan with GPI List "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    Then Validate GPI List is "<GPIList>"

    Examples: 
      | PlanCode | NDCList | NDCSeq | NDCFromDate | NDCThruDate | GPIList | GPISeq | GPIFromDate | GPIThruDate |
      | GPITEST1 | SN1396  |     10 |      010118 |      123139 | SN2215  |    010 |      010118 |      123139 |
