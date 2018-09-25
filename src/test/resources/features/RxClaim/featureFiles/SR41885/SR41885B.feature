Feature: Plan Edits w/Msgs; Prescriber Network and Refill Limits not setting indicator
  
  Scenario Outline: SN001206_SR41885_TC005.To check if a message is present on the "Refill/Fill Limits Page 1 of 3" screen ,the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits.
  									SN001206_SR41885_TC006.To check if a message is present on the "Refill/Fill Limits Page 2 of 3" screen ,the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits.
  									SN001206_SR41885_TC007.To check if a message is present on the "Add Additional Refill/Fill Limits Dtl Page 2 of 2 " screen ,the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits.
  									SN001206_SR41885_TC008.To check if a message is present on the "Fills Price Override Detail " screen ,the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits.
  									SN001206_SR41885_TC009.To check if a new menu option F8 "Additional"  is availaible on the  "Refill/Fill Limits Page 1 of 3" on the plan edits with messages section
  									SN001206_SR41885_TC010.To check if a new menu option F7 "Price override"  is availaible on the  "Refill/Fill Limits Page 1 of 3" on the plan edits with messages section
  									
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter plan code & select "Refill Limts"
		And I press "F7" Key
		And I verify the message is on Refill Limits
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		And I press "F7" Key
		And I select Refill Limits & enter the message code
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		And I press "F7" Key
		And I go to Plan Options menu & select Refill limts
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		And I press "F7" Key
		And I verify the message is present on the "Fills Price Override Detail"
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		And I press "F8" Key
		And I press "F7" Key
		And I verify if a new menu option F8 "Additional" is availaible on the  "Refill/Fill Limits Page 1 of 3"
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		And I press "F8" Key
		And I press "F7" Key
		And I verify if a new menu option F7 "Price override" is availaible on the Refill/Fill Limits Page 1 of 3
		And I verify the message indicator on the "Plan edits with message" screen must be turned ON for Refill limits
		
  Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
