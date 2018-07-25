Feature: DBI: Update RCPME & Recompile RCPLN for original project SN003356
 
Scenario Outline: SN003331_SR41449_TC007_Verify Change Plan edit for Member Eligibility when update flag set to N and Member Eligibility set to Y
    Given I am on RxClaim PlanAdministrator Menu
    When I enter query
		And I enter "<PlanCode>" in field "PlanCode" on "PlanDetailScreen"
		And I enter "<FromDate>" in field "FromDate" on "PlanDetailScreen"
		And I press "Enter" Key
		And I enter "<MemberEligibility>" in field "MemberEligibility" on "PlanDetailScreen"
		And I press "Enter" Key
		And I enter "<Flag>", "<DynamicPA>" on RCPLN712 screen
		And I verify error message in Display Responses window
	  And I press "F3" key to navigate back to RxClaim PlanAdministrator Menu
	  And I navigate to "<PlanCode>" Plan Details Page
		Then I verify Change Plan edit for Member Eligibility "<MemberEligibility>" when update flag set to N and Member Eligibility set to Y
		# CALL PGM(RCPLN711) PARM('')
		# SN003562A  , TESTLFT98, TESTLFT97  
		   
    Examples: 
      | PlanCode  | FromDate | MemberEligibility  | Flag	|	DynamicPA	|
      | TESTLFT99 | 010118	 | Y									|	N			|	Y					|
     
