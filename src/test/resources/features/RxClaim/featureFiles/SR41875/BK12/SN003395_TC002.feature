Feature: SN003395_SR41875_Rejection Report Detail Screen is Displaying "Scan limit" Message
As a RxClaim User I want to Verify if "F7" is available at bottom of the RCRRP001 screen.
 

  Scenario Outline: Verify if "F7" is available at bottom of the Rejection Report Detail screen
 
   	Given I am on RxClaim PlanAdministrator Menu
   	When I enter the command "modlibs" in command line
     And I press "Enter" Key 
     And I enter the command "CCT600" in command line
		 And I press "Enter" Key
		 #Give Ash to above 4 commands(when to And) if its not required to use modlibs cmd
   	When I select Option "8" to navigate to "RxClaim Profile Maintenance"
		And I select Option "4" to navigate to "Eligibility"
		And I select Option "1" to navigate to "Active Eligibility Profile"
		Then Verify if F seven Sort by Date of File is available at bottom of the Rejection Report Detail screen with "<CarrierID>"
				
 Examples:
   
      | CarrierID |
      | PDPIND | 
