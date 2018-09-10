Feature: Set Plan with NDC List
As a RxClaim User I want to set Plan with NDC List

Scenario Outline: Set  with NDC List in RxClaim
 Given I am on RxClaim PlanAdministrator Menu
 When I set NDC List in Plan "<PlanCode>"
 And I set GPI List in Plan "<PlanCode>"
 Then Validate NDC List is set to Y
 
 Examples:
 |PlanCode  |
 |AUTNDCGPIL|