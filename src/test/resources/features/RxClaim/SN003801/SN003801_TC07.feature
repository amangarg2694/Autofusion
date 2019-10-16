Feature: 8.1.2. Run claims 
  As a RxClaim User validating the claim is paid when product on claim = product on GPI List with Include for the Prescriber’s state. Taxonomy code matches prescriber’s taxonomy code
  

Scenario Outline: Validating the claim is paid when product on claim = product on GPI List with Include for the Prescriber’s state. Taxonomy code matches prescriber’s taxonomy code
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
  And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
  And I select Option "1" to navigate to "Transaction"
	Then Validating the claim is Rejected with "<MemberID>","<ProductId>","<PresQual>","<PrescID>","<RxNo>","<FillDate>","<SCC>"
	
Examples:
|MemberID|ProductId   |PresQual|PrescID  |RxNo        |FillDate|SCC|
|SN003801M1|53746020305|12     |FR3196940|938790014506|03012018|   |
|SN003801M1|53746020305|12     |FR3196940|938790014506|03012018|52|