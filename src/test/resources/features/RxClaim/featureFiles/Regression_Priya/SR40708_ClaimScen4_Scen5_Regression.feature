Feature: 8.1.2. Run claims 
  As a RxClaim User validating the claim is rejected when Plans Prescriber data base not able to verify active state license with prescriptive authority for Prescriber ID Submitted
  

Scenario Outline: Validating the claim is rejected when Plans Prescriber data base not able to verify active state license with prescriptive authority for Prescriber ID Submitted
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
  And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
  And I select Option "1" to navigate to "Transaction"
  Then Validating the claim is rejected with "<MemberID>","<RxNo>","<FillDate>"
	
Examples:
|MemberID|RxNo|FillDate|
|SR40708|200010001005|09122018|

Scenario Outline: Validating the claim is paid when that the Pharmacy submitted Clar Code 52 so the claim pays
	And I press "F12" Key
  Then Validating the claim is paid with "<RxNo>"
	
Examples:
|RxNo|
|200010001006|