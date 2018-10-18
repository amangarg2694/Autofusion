Feature: Screen Validation for Contingent Therapy Schedule
  As a RxClaim User I want to check fields for Contingent Therapy Schedule Screen
  
@TC01
Scenario Outline: Verify new fields are added to the ADD mode of the contingent therapy schedule Met
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
	And I press "F6" Key
	Then validate new field values under Schedule Met with "<MessageCode>","<MessageType>"
	
	
Examples:
| MessageCode | MessageType |
| 1234        | A           |

@TC02
Scenario Outline: Verify new fields are added to the ADD mode of the contingent therapy schedule UnMet
	Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
	And I press "F6" Key
	Then verify new field values under Schedule UnMet with "<MessageCode>","<MessageType>"


Examples:
| MessageCode | MessageType |
| 1234        | A           |


@TC03
Scenario Outline: Verify new fields message code and message type are included on the UPDATE screen of the contingent therapy schedule  under the schedule MET category
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
  Then verify new field values in edit mode under Schedule Met with "<MessageCode>","<MessageType>","<ScheduleCode>"
	
	Examples:
| MessageCode | MessageType |ScheduleCode|
| 1234        | A           |  SN002713  |
	
@TC04
Scenario Outline: Verify new fields message code and message type are included on the UPDATE screen of the contingent therapy schedule  under the schedule UnMET category
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
  Then verify new field values in edit mode under Schedule UnMet with "<MessageCode>","<MessageType>","<ScheduleCode>"
	
	Examples:
| MessageCode | MessageType |ScheduleCode|
| 1234        | A           |  SN002713  |	

@TC05
 Scenario Outline: Verify new fields are added to the DISPLAY mode of the contingent therapy schedule under the schedule MET category
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
  Then verify new field values in display mode under Schedule Met with "<MessageCode>","<MessageType>","<ScheduleCode>"
	
	Examples:
| MessageCode | MessageType |ScheduleCode|
| 1234        | A           |  SN002713  |	

@TC06
 Scenario Outline: Verify new fields are added to the DISPLAY mode of the contingent therapy schedule under the schedule UNMET category
  Given I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
	And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
  Then verify new field values in display mode under Schedule UnMet with "<MessageCode>","<MessageType>","<ScheduleCode>"
	
	Examples:
| MessageCode | MessageType |ScheduleCode|
| 1234        | A           |  SN002713  |	
	
	
	

