Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check plan tier in formulary screen for MPA 

  Scenario Outline: Flag is include and the tier does not match the plan tier for MPA
  	Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
  	And I select Option "2" to navigate to "Active/Eligible Member by ID"
  	Then I edit details of PA in member screen with "<MemberID>","<Data>"
  	And I press "F12" Key
  	When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>"
		Then Validate Claim Status is "P" 
		And I press "F7" Key
		And I enter "21" in field "Selectionfield" on "TransactionDetailList" 
		And I press "Enter" Key
		Then I validate the tier code in formulary screen
		
		Examples:
   
      | MemberID   | First Name | Last Name | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | Data |
      | SR41429_02 | AUTOMEM    | AUTOMEM   | 777777 | CCHA | *ALL    | WALMARTIL | 100010000005 | 00     | 7202018  | 00363012020 | 30 | 30 | 0 | 100 | 05 |
       