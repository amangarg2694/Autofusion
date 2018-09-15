#Author: Venkateshwarlu M

Feature: Process Brand Drugs as Tier 1 for Members
  
Scenario Outline: Verify plan setup
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I search Member by MemberID "<MemberID>"
		And I verify Override Plan with Plan "<Plan>"
		And I provide family type and ID details "<MemberID>"
		And I press "F16" Key 
		
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<PlanCode>"
		And I verify Compounds in Plan details page
		And I press "F7" Key 
		And I select Compounds options and Multiple Ingredient Compound option in Plan Option
		And I verify Option Levels for Claim Product Status and Claim Multi-Source Code
  	And I verify Non Part D Covered "<NonPartDCovered>"
  	And I press "F12" Key 
		And I press "F12" Key
		
 #drug: 00378-8130-45 [for PSC=M]
 #MemberID: Sn003280M1
 #CarrierID: SN003280
 
    Examples: 
      | MemberID		| Plan			|
      | SN003280M1	| SN003280	|	 

