Feature: Part D Approved total DFTI not equal to submitted DFTI when OON differential is applied
As a RxClaim User I want to check claim is paid and validate the DFTI

  Scenario Outline: Verify total submitted cost equals as the total approved cost on Reprcoessing DMR claims when OON differential applied, Vaccine fee applied, Dispensing Fee calculated & Fee not calculated, Submitted DFT > Calculated DFT,Submitted < Calculated DFT
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
   	And I select Option "2" to navigate to "Active/Eligible Member by ID"
   	Then modifying the copay category in member screen with "<MemberID>","<CopayCategory>"
   	And I press "F12" Key
   	And I press "F12" Key
   	When reprocessing the claim through plan screen with "<MemberID>","<FromDate>","<ThruDate>"
   	Then Validating the reprocessing claims through member screen with "<MemberID>"
   	
   	Examples:
   	| MemberID   |CopayCategory|FromDate|ThruDate|	
   	| SR41720A5 |2|010118|123118|