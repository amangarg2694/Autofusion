Feature: Claim Adjudication 
  As a RxClaim User I want to check claim is getting paid for multiple members

Scenario Outline: Verify if claim is getting paid for multiple members
   	Given I am on RxClaim PlanAdministrator Menu
		When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
		And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
		And I select Option "1" to navigate to "Transaction"
		Then I submit the claim for multiple members with "<ModuleName>"

 Examples:
    | ModuleName     |
		|	ClaimSubmission |
       	