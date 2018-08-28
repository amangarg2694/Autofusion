
Feature: Title of your feature
  I want to use this template for my feature file

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
		And I enter "Y" in field "NDCList" on "PlanDetailScreen"
		And I enter "Y" in field "GPILists" on "PlanDetailScreen"
		And I enter "Y" in field "Pricing" on "PlanDetailScreen"
		And I press "Enter" Key
		And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
		Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"
		Then I Validate "<PlanCode>" is created or not
		And I press "F7" Key 
	   
	   #Note: Please change plan code
	   # 49452-1012-01
	   # SR#41819
	   # 00536-3984-01

	 Examples: 
      | PlanCode  	| From Date	|	Description	|	
      | VSR4192362	| 010118		|	Test Plan		|
               
   Scenario Outline: Verify Pricing setup
    Given I select Pricing list on "Plan Options Screen"
    And I Activate Plan Pharmacy Reimbursement Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Pharm Price Schedule "<PharmPriceSchedule>"
    And I Activate Plan Pharmacy Patient Pay Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Patient Pay Schedule "<PatientPaySchedule>" 
    And I Activate Plan Client Price for Billing with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPriceSchedule>"
    And I Activate Plan Client Patient Pay with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPaySchedule>"
      
    Examples: 
      |	FromDate	|	ThruDate	|	PharmPriceSchedule	|	PatientPaySchedule	|	ClientPriceSchedule	|	ClientPaySchedule	|
      |	010118		|	123118		|	*(A)								|	$0									|	*(A)								|	$0								|
      
   Scenario Outline: Verify GPI setup
    Given I select GIP list on "PlanOptionsScreen"
    And I press "F6" Key
    And I add GPI list "<GPIList>"
    And I press "F12" Key 
    And I verify GPI list "<GPIList>" and fill type, days, maximum
    And I verify patient pay in Plan GPI List GPI Price Detail Page
    Then I navigate Back to "RxClaim Plan Administrator Menu"
		
    Examples: 
      |	GPIList		|
      |	3612FIXIT	|	
    
  Scenario Outline: Verify Member setup
    Given I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    When I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I add plan to a "<MemberID>" Member
      
		# TESTVMGRP
		# Member  VSR419231
    Examples: 
      |	MemberID	|
      |	VSR419231	|	
    
  Scenario Outline: Submit a claim in RxClaim
    Given I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    When I submit claim for refill with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I Validate RxClaim ID 
    And I press "F7" Key 
    And I Validate GPI ID
    And I press "F7" Key
    And I select Option "8" Additional Claim Info to navigate to "Claim Transaction Additional Info"
    And I press "F9" Key
    And I validate GPI in Plan list
    Then I press "F12" Key
    Then I press "F12" Key
    And I Validate client Patient Pay in price info screen
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
  
  ## 00536398401
  #Note: Please change the RxNO and MemberID
   Examples: 
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 195238967432 | 00     | 082818   | VSR419231	| 00536398401|	30     | 30 | 00  | 100  |
		
		
		
		
		
