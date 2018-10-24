Feature:  Create an ESP Plan and Create a Claim

Scenario Outline:  Create an ESP Plan
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
And I enter "Y" in field "GPILists" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
And I press "PageDown" Key
And I enter "Y" in field "DiscountBenefit" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"

Examples:

|PlanCode		|From Date	|Description	    |
|ESPPLAN3 	|010118			|ESP Test Plan		|

Scenario Outline: Add a Plan Discount Benefit 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I press "F7" Key
And I enter "32" in field "Selection" on "PlanOptionsScreen"
And I press "Enter" Key
And I press "F6" Key
And I enter "<FromDate>" in field "FromDate" on "AddPlanDiscountBenefitScreen"
And I enter "<ThruDate>" in field "ThruDate" on "AddPlanDiscountBenefitScreen"
And I enter "<DiscountBenefitTable>" in field "DiscountBenefitTable" on "AddPlanDiscountBenefitScreen"
And I press "Enter" Key
Then Validate "<DiscountBenefitTable>" in field "Table" is displayed on "ActivePlanDiscountBenefitScreen" 


Examples:

|PlanCode		|FromDate|ThruDate|DiscountBenefitTable|
|ESPPLAN3 	|010118  |123139  |EBP03               |


Scenario Outline: Add Medication to GPI List 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I press "F7" Key
And I enter "11" in field "Selection" on "PlanOptionsScreen"
And I press "Enter" Key
And I press "F6" Key
And I enter "<GPIList>" in field "GPIList" on "SelectandAddGPIListScreen"
And I press "Enter" Key
And I enter "1" in field "Selection" on "SelectandAddGPIListScreen"
And I press "Enter" Key
And I enter "<Seq>" in field "Seq" on "PlanGPIListDetailScreen"
And I enter "<FromDate>" in field "FromDate" on "PlanGPIListDetailScreen"
And I enter "<ThruDate>" in field "ThruDate" on "PlanGPIListDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "ConfirmPrompt" on "PlanGPIListDetailScreen"
And I press "F12" Key
Then Validate "<GPIList>" in field "GPIList" is displayed on "ActivePlanGPIListScreen" 

Examples:
|PlanCode		|GPIList   |Seq|FromDate|ThruDate|
|ESPPLAN3 	|REJECTLIST|10 |010118  |123139  |
