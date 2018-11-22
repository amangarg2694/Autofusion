Feature: SN003395_SR41875_Rejection Report Detail Screen is Displaying "Scan limit" Message
As a RxClaim User I want to Verify if detail records will be sorted in descending order first by Date of File then by CAGM in Rejection Report Detail screen.
 

  Scenario Outline: Verify if detail records will be sorted in descending order first by Date of File then by CAGM in Rejection Report Detail screen.
 
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "8" to navigate to "RxClaim Profile Maintenance"
		And I select Option "4" to navigate to "Eligibility"
		And I select Option "1" to navigate to "Active Eligibility Profile"
		Then Verify when 'clicks F7=Sort by Date of File' detail records will be sorted in descending order first by Date of File then by CAGM in Rejection Report Detail screen with "<CarrierID>"
		
		
		
				
 Examples:
   
      | CarrierID |
      | RGCARRIER | 
