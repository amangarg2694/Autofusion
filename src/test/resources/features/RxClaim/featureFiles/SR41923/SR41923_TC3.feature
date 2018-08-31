
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
		And I Wait for the sometime
		And I enter "Y" in field "GPILists" on "PlanDetailScreen"
		And I enter "Y" in field "Pricing" on "PlanDetailScreen"
		And I enter "Y" in field "NDCLists" on "PlanDetailScreen"
		And I press "Enter" Key
		And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
		Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"
		Then I Validate "<PlanCode>" is created or not
		And I press "F7" Key 
	   
	   #Note: Please change plan codevenm	
	   # 49452-1012-01
	   # SR#41819
	   # 00536-3984-01
	  
	 Examples: 
      | PlanCode  	| From Date	|	Description	|	
      | VSR4192351	| 010118		|	Test Plan		|
      
      
   Scenario Outline: Verify plan in RxClaim
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify NDC, GPI and pricing in plan "<PlanCode>"
		And I press "F7" Key 
          
   Examples: 
      | PlanCode  	| From Date	|	Description	|	
      | VSR4192351	| 010118		|	Test Plan		|    
      
   Scenario Outline: Verify Pricing setup
    Given I select Pricing list on "Plan Options Screen"
    And I Activate Plan Pharmacy Reimbursement Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Pharm Price Schedule "<PharmPriceSchedule>"
    And I Activate Plan Pharmacy Patient Pay Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Patient Pay Schedule "<PharmPatientPaySchedule>" 
    And I Activate Plan Client Price for Billing with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPriceSchedule>"
    And I Activate Plan Client Patient Pay with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPaySchedule>"
    Then I press "F12" Key 
    Examples: 
      |	FromDate	|	ThruDate	|	PharmPriceSchedule	|	PharmPatientPaySchedule	|	ClientPriceSchedule	|	ClientPaySchedule	|
      |	010118		|	123118		|	*(A)								|	$0											|	*(A)								|	$0								|
      
      
   Scenario Outline: Verify NDC setup
    Given I select NDC list on "PlanOptionsScreen"
    And I press "F6" Key
    And I add NDC list "<NDCList>"
    And I press "F12" Key 
    And I verify NDC list "<NDCList>" and fill type, days, maximum
    Then I navigate Back to "RxClaim Plan Administrator Menu"
    
    #NDC: 88512 6060 10
    Examples: 
      |	NDCList	|
      |	41923 	|	
      
  Scenario Outline: Verify Member setup
    Given I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    When I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I add plan to a "<MemberID>" Member
 
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
    And I press "F7" Key
    And I select Option "8" Additional Claim Info to navigate to "Claim Transaction Additional Info"
    And I press "F9" Key
    And I Validate NDC in Plan List
    Then I press "F12" Key
    Then I press "F12" Key
    And I Validate pharmacy Patient Pay in price info screen for NDC
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I Submit claim second time by changing Refill value
    And I press "F7" Key
    And I press "F7" Key
    And I Validate pharmacy Patient Pay in price info screen for NDC
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I Submit claim third time by changing Refill value
    And I press "F7" Key
    And I press "F7" Key
    And I Validate pharmacy Patient Pay in price info screen for NDC
  
  # 00536398401[8402]
  # 49452101201
  #Note: Please change the RxNO and MemberID
   Examples: 
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  	|	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 202324967432 | 00     | 083018   | VSR419231	| 88512606010 |	30     | 30 | 0	  | 100  |
		
		
		
		
		
