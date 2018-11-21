Feature: Screen Validation for Prescriber State Taxonomy Code Screen - Change & Display in Plan Screen
  As a RxClaim User validating the screen functionality of Prescriber State Taxonomy field in plan screen
  
  ## Modify the plan code for both the scenarios and use the same plan code test data
  
##TC57 - TC62
Scenario Outline: Add Prescriber State Taxonomy Code flag to Plan Detail Page 2 of 2 screen (RCPLN009) - CHANGE & DISPLAY
		Given I am on RxClaim PlanAdministrator Menu
  	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  	And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "EVUASHE" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCode>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<PlanFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<Description>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		Then validating the prescriber state taxonomy field with "<TaxonomyCode>","<PlanCode>"
		
Examples:
|PlanCode|PlanFromDt|Description|TaxonomyCode|
|SR40708E|010101|Testing|Y|

##TC63 - R4.1.8 & R4.1.9
Scenario Outline: Add Prescriber State Taxonomy Code flag to Claim Transaction 4.1.8.3. Claim Transaction Additional Info Plan Information screen (RCSN002972_SR40708_L001) Prscbr ST Txmy Field 
		And I press "F12" Key
		And I press "F3" Key
		And I press "F3" Key
  	Then validating the plan prescriber validation screen with "<PlanCode>","<FromDate>","<ThruDate>","<PrescriberIDType>","<ClaimOrig>","<CMFCCR>"
		
Examples:
|PlanCode|FromDate|ThruDate|PrescriberIDType|ClaimOrig|CMFCCR|
|SR40708E|010101|123139|BLC|*|N|