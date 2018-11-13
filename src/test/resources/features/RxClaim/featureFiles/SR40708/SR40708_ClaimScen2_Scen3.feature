Feature: 8.1.2. Run claims 
  As a RxClaim User validating the claim is rejected when product is not on Colorado GPI List and product is to be Excluded
  

Scenario Outline: Validating the claim is rejected when product is not on Colorado GPI List and product is to be Excluded
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
  And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
  And I select Option "1" to navigate to "Transaction"
	Then Validating the claim is paid with "<MemberID>","<ProductId>","<PresQual>","<PrescID>","<RxNo>","<FillDate>"
	And I press "F10" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F12" Key
	And I press "F12" Key
Examples:
|MemberID|ProductId|PresQual|PrescID|RxNo|FillDate|
|KELW1428 MBR1|55289034610|01|1518199728|333330000033|09122018|
|KELW1428 MBR1|00024542131|12|BD5969285|333330000034|09122018|