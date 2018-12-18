Feature: Fix Price Override after the specific "#" of fills have been exceeded
				 TC01_Verify the O/R Patient Pay stamped under the client schedule for 3rd fill for  GPI List Quantity Limits Ovrd Criteria (RCPGG003)
  
Scenario Outline: Verify plan in RxClaim
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify NDC, GPI and pricing in plan "<PlanCode>"
		And I press "F7" Key 
   
   Examples: 
      | PlanCode  | From Date	|	Description	|	
      | SR4192359	| 010118		|	Test Plan		|    
      
	      
   Scenario Outline: Verify Pricing setup
    Given I select Pricing list on "Plan Options Screen"
    And I Activate Plan Pharmacy Reimbursement Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Pharm Price Schedule "<PharmPriceSchedule>"
    And I Activate Plan Pharmacy Patient Pay Price Schedule with From Date "<FromDate>", Thru Date "<ThruDate>", Patient Pay Schedule "<PharmPatientPaySchedule>" 
    And I Activate Plan Client Price for Billing with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPriceSchedule>"
    And I Activate Plan Client Patient Pay with From Date "<FromDate>", Thru Date "<ThruDate>", Client Pay Schedule "<ClientPaySchedule>"
    
    Examples: 
      |	FromDate	|	ThruDate	|	PharmPriceSchedule	|	PharmPatientPaySchedule	|	ClientPriceSchedule	|	ClientPaySchedule	|
      |	010118		|	123118		|	*(A)								|	$0											|	*(A)								|	$0								|
      
   Scenario Outline: Verify GPI setup
    Given I select GIP list on "PlanOptionsScreen"
    And I press "F6" Key
    And I add GPI list "<GPIList>"
    And I press "F12" Key 
    And I verify GPI list "<GPIList>" and fill type, days, maximum
    Then I verify Pharmacy patient pay in Plan GPI List GPI Price Detail Page
        
  	#3612FIXIT[8402]
  	#ClientPatientpay=VISHPPS
    Examples: 
      |	GPIList	|
      |	SR41923 |	
    
  Scenario Outline: Verify Member setup
    Given I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I add plan to a "<MemberID>" Member for GPI
 
		# Member  VSR419233
    Examples: 
      |	MemberID	|
      |	VSR419233	|	
    
  Scenario Outline: Submit a claim in RxClaim
    Given I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    When I submit claim for refill with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then I Validate Claim Status
    And I Validate RxClaim ID 
    And I press "F7" Key 
    And I Validate GPI ID
    And I press "F7" Key
    And I select Option "8" Additional Claim Info to navigate to "Claim Transaction Additional Info"
    And I press "F9" Key
    And I validate GPI in Plan list
    Then I press "F12" Key
    Then I press "F12" Key
    And I Validate client Patient Pay in price info screen for GPI
    And I navigate back to Transaction Submission Page
    And I Submit claim second time by changing Refill value
    And I Validate RxClaim ID 
    And I press "F7" Key
    And I Validate GPI ID
    And I press "F7" Key
    And I Validate client Patient Pay in price info screen for GPI
		 And I navigate back to Transaction Submission Page
    And I Submit claim third time by changing Refill value
    And I Validate RxClaim ID 
    And I press "F7" Key
    And I Validate GPI ID
    And I press "F7" Key
    And I Validate client Patient Pay in price info screen for GPI
 		And I navigate back to Transaction Submission Page
    And I Submit claim fourth time by changing Refill value
    And I Validate RxClaim ID 
    And I press "F7" Key
    And I Validate GPI ID
    And I press "F7" Key
    Then I Validate client Patient Pay in price info screen for GPI
    
  # 00536398401[8402]
  # 49452101201
  #Note: Please change the RxNO and MemberID
  #MemberID: VSR419233
   Examples: 
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 948464767432 | 00     | 090518   | VSR419233	| 49452101201|	30     | 30 | 0	  | 100  |
		
		
		
		
		
