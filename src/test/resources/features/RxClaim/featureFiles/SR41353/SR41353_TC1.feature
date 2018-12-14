@Regression
Feature: Delete plan with associated Pharmacy Newtwork having pricing turned on and the SN Sequence entered

Scenario Outline: Check to Delete the plan with associated 'Pharmacy Network' having pricing turned on and the 'POR Super Net Seq Nbr' entered 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance" 
And  I select Option "1" to navigate to "Active Plan by Plan Code" 
And I navigate to the plans "<Plan1>" to copy to new plan "<Plan2>"
And I select "Pharmacy Network" option in "<Plan2>"
And I navigate to Network Pricing Detail for All Origin/Reimb screen
And I enter "<qual>","<SN>","<Plan1>"values
And I am on RxClaim PlanAdministrator Menu
Then I navigate to Delete Plan screen "<Plan2>"





Examples:
 |Plan1  |Plan2  |qual|SN  |
|SN103287|328_F1|1   |Test|
|SN103287|328_F2|2   |Test|
|SN103287|328_F3|3   |Test|

Scenario Outline: Check to Delete plan with associated 'Pharmacy Network' having pricing turned on and 'POR Super Net Seq Nbr' not entered 

Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance" 
And  I select Option "1" to navigate to "Active Plan by Plan Code" 
And I navigate to the plans "<Plan1>" to copy to new plan "<Plan2>"
And I select "Pharmacy Network" option in "<Plan2>"
And I navigate to Network Pricing Detail for All Origin/Reimb screen
And I enter the values  "<qual>","<seq>","<Plan1>"values
And I am on RxClaim PlanAdministrator Menu
Then I navigate to Delete Plan screen "<Plan2>"

Examples:
|Plan1   |Plan2  |qual|seq|
|SN103287|328_F4|1   |100|
|SN103287|328_F5|2   |200|
|SN103287|328_F6|3   |300|

Scenario Outline: Check to delete plan with associated Pharmacy Network without pricing turned on.
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance" 
And  I select Option "1" to navigate to "Active Plan by Plan Code" 
And I navigate to the plans "<Plan1>" to copy to new plan "<Plan2>"
And I select "Pharmacy Network" option in "<Plan2>"
And I navigate to Plan Pharmacy Network Origination/Reimbursement
And I am on RxClaim PlanAdministrator Menu
Then I navigate to Delete Plan screen "<Plan2>"

Examples:
|Plan1   |Plan2  |
|SN103287|328_F7|

Scenario Outline: Check to delete plan without an associated 'Pharmacy Network'
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance" 
And  I select Option "1" to navigate to "Active Plan by Plan Code" 
And I navigate to the plans "<Plan1>" to copy to new plan "<Plan2>"
And I select "Pharmacy Network" option  as "N" in "<Plan2>"
And I am on RxClaim PlanAdministrator Menu
Then I navigate to Delete Plan screen "<Plan2>"

Examples:
|Plan1   |Plan2  |
|SN103287|328_F8|