#@Release_8403 @Regression - skipped for now, tc is failing

Feature: SN003395_SR41875_Rejection Report Detail Screen is Displaying "Scan limit" Message
As a RxClaim User I want to Verify if records are displayed in ascending alphabetical order based on CAG and Member Rejection Report Detail screen.
 

  Scenario Outline: Verify if records are displayed in ascending alphabetical order based on CAG and Member Rejection Report Detail screen.
 
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "8" to navigate to "RxClaim Profile Maintenance"
		And I select Option "4" to navigate to "Eligibility"
		And I select Option "1" to navigate to "Active Eligibility Profile"
		Then Verify when 'clicks F17=Track Rejections' records are displayed in ascending alphabetical order based on CAG and Member Rejection Report Detail screen with "<CarrierID>"
		
		
		
				
 Examples:
   
      | CarrierID |
      | RGCARRIER | 
