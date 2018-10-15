Feature: Screen Validation for Contingent Therapy Schedule
  As a RxClaim User I want to check fields for Contingent Therapy Schedule Screen
  

Scenario Outline: Verify new fields are added to the ADD mode of the contingent therapy schedule Met
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "1" to navigate to "Active Plan by Plan Code"
	And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen" 
  And I press "Enter" Key
  And I enter "<Option1>" in field "PlanCodeOption" on "ActivePlanbyPlanCodeScreen"
  And I press "Enter" Key 
	And I press "F7" Key
	And I enter "<Option2>" in field "Enteryouroption" on "PlanOptions"
  And I press "Enter" Key
  #Schedule MET messages if ST custom messaging is present at the plan NDC level in Schedule MET condition
  And verify Schedule MET messages with "<seq>","<NDCList>","<NDClistoption>","<NDCplanOption>","<NDCmsgOption>"
  And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
  And verify field values in display mode under Schedule UnMet with "<MessageCode>","<MessageType>","<ScheduleCode>"
  And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
  And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
  And I select Option "1" to navigate to "RxClaim 8.4.02 QA"
  And I submit a claim transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
  Then validate the claim status is "R"
  
	
	
Examples:
|PlanCode| MessageCode | MessageType |Option1|Option2|seq|NDCList|NDClistoption|NDCplanOption|NDCmsgOption|ScheduleCode| BIN     | ProcCtrl  | Group | PharmacyID|   RxNo       | Refill | MemberID  | ProductID  | DspQty | DS | PSC | Cost |         
|SN002713| 1234        |    A        |    2  |   10  | 10|  SUKA |     7       |   5         |     5      |  SN002713  |777777   | CCHA      |	*ALL | APHARM    | 974016776011 | 10     | SN002713M | 00247064407|    10  |10  |  00 |100   |

