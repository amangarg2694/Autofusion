Feature: Create New Plan
As a RxClaim User I wnat to create a New Plan

Scenario Outline: Create a new plan in RxClaim
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I press "F6" Key
And I enter "<PlanCode>" in field "PlanCode" on "AddPlanScreen"
And I enter "<From Date>" in field "FromDate" on "AddPlanScreen"
And I enter "<Description>" in field "Description" on "AddPlanScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "AddPlanScreen"
And I enter "Y" in field "MemberEligibility" on "PlanDetailScreen"
And I enter "Y" in field "Pricing" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"

Examples:

|PlanCode	|From Date	|Description	|
|VMPLN29 	|010118			|Test Plan		|

#|PlanCode|From Date|Description|
#|TESTLFTA19|010101|Test Plan|

