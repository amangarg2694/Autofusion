Feature: Price Table by description
  As a RxClaim User I want to compare price table related screen options & functionality in 8.4.02 and 8.4.01

Scenario Outline: Verify and compare the 'RCPTF041I' screen options & functionality in 8.4.02 and 8.4.01 environments.    
  
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "2" to navigate to "Active/Eligible Member by ID"
	And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberbyIDScreen"
	And I press "Enter" Key
	And I enter "2" in field "Selection" on "ActiveEligibleMemberbyIDScreen"
	And I press "Enter" Key
	And I press "F10" Key
	And I enter "5" in field "Display" on "ActiveEligibleMemberbyIDScreen"
	And I press "Enter" Key
	And I press "F15" Key
	And I press "PageDown" Key
	Then Validating display functionality on RCPTF041I screen options and functionality with "<Environment>","<MemberID>"
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	And I press "F3" Key
	Then Validating display functionality on RCPTF041I screen options and functionality with "<Regression>","<Member>"
	
	Examples:
		
	| MemberID | Environment | Regression | Member |
	| SR41813AA | 8402 | 8401 | TESTING |