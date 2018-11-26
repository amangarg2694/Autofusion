# @Regression @Release_8403 - skipped for now
# Job was not found, test case fails at this point.

Feature: RxInterAct: Update logic on Clinical Products Platform Extract and Targeted Transaction File

 Scenario Outline: SN003385_SR41757_TC004:Verify running the Clinical Products Platform Extract where a member has RxInterAct transactions and current system date falls outside of either the member’s eligibility from and thru dates.
   									 SN003385_SR41757_TC005:Verify running the Targeted Transaction File where a member has RxInterAct transactions and current system date does fall between the member’s eligibility from and thru dates. 
   									 
    Given I am on RxClaim PlanAdministrator Menu
    When I press "F3" Key
    And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "12" to navigate to "RxInterACT Main Menu"
		And I select Option "5" to navigate to "Management"
		And I select Option "3" to navigate to " Report Management"
		And I select Option "7" to navigate to "Targeted Transaction File"
		And I enter the values in Targeted Transaction File menu with "<CarrierID>"
		And I check the job status
		And I verify the records in the physical file member
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "12" to navigate to "RxInterACT Main Menu"
		And I select Option "5" to navigate to "Management"
		And I select Option "3" to navigate to " Report Management"
		And I select Option "7" to navigate to "Targeted Transaction File"
		And I enter the values in Targeted Transaction File using "<CarrierID>"
		And I check the job status
		Then I verify the records in the physical file member
         
           Examples: 
      | CarrierID|
    	| EVUIBM   |
