Feature: Part D: MIC update Non Part D Covered flag 1 to not accumulate toward Troop/DS
  SN003284_SR41691_TC004_Req 4.1:Non-Part D Covered = 1 AND Total Covered Ingredient Cost is Lesser than OR Equal to Claims Approved Ingredient Cost
Scenario Outline: Verify plan setup
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<PlanCode>"
		And I verify Compounds in Plan details page
		And I press "F7" Key 
		And I select Compounds options and Multiple Ingredient Compound option in Plan Option
		And I verify Option Levels for Claim Product Status and Claim Multi-Source Code
	  And I verify Non Part D Covered "<NonPartDCovered>"
	  And I press "F12" Key 
		And I press "F12" Key
 		#Scenario Outline: Verify Pricing setup
		And I select Pricing Option in Plan Options screen
		And I select Pharmacy - Reimbursement option
		And I validate Plan Pharmacy Price Schedule "<PriceSchedule>"
		And I press "F12" Key 
		And I press "F12" Key
	 	#Scenario Outline: Verify NDC List setup
		And NDC list option selected in Plan screen
		And I validate Active Plan NDC List
		And I validate NDC_ID "<NDC1>", "<NDC2>", "<NDC3>" with status
	  And I navigate back to Plan Administrator Menu
		#Scenario Outline: Verify Member setup
    And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I verify Plan Override in MemberID "<MemberID>"
    And I press "F8" Key
    And I select option 17 Medicare in Member Detail List Screen
    And I select option 4 Medicare Part D in Medicare screen
    And I verify details in Active Medicare Part D screen
    And I press "F12" Key 
		And I press "F12" Key
		And I select option 10 Member Information in Member Detail List Screen
		And I select Option 3 Supplemental ID in Member Information screen
		And I verify details in Active Supplemental ID by Type screen
		And I navigate back to Plan Administrator Menu
 		#Scenario Outline: Submit a claim in RxClaim
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I submit MIC claims with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<Qual>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>", "<Cmpnd>"
    And I press "F14" Key
    And I select option 5 Compound in Transaction Submission Detail List screen 
	  And I add Compound Submission Details for first NDC	 with "<Qualifier1>", "<NDC1>","<Quantity1>", "<Cost1>", "<BasicCost1>" 
    And I add Compound Submission Details for Second NDC with "<Qualifier2>", "<NDC2>","<Quantity2>", "<Cost2>", "<BasicCost2>" 
    And I add Compound Submission Details for third  NDC with "<Qualifier3>", "<NDC3>","<Quantity3>", "<Cost3>", "<BasicCost3>" 
    And I press "F12" Key
    And I press "F12" Key
    And I submit claim
    And I Validate RxClaim ID
    And I Validate Claim Status
    And I verify Approved amount
    And I press "F7" Key
    And I press "F16" Key
    And I press "F14" Key 
    And I select 5 Compound Detail in Submission Detail	List screen
    And I verify Compound Information Details for Product ID
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F7" Key
    And I select option 13 Medicare Part D
    And I press "F10" Key
    Then I verify TrOOP/Drug Spend Accumulation Phase Details

	 Examples: 
     | PlanCode 	| NonPartDCovered	|	 PriceSchedule | NDC1 		   | NDC2				|	NDC3				| MemberID 	| BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   |	Qual	| ProductID 	|	DspQty | DS | PSC | Cost |	Cmpnd	|	Qualifier1	|	NDC1					|	Quantity1	|	Cost1	|	BasicCost1|	Qualifier2	|	NDC2				|	Quantity2	|	Cost2	|	BasicCost2|Qualifier3	|	NDC3				|	Quantity3	|	Cost3	|	BasicCost3|
		 | PLAN2643T4	| 1								|  PRCSCH2647		 | 00087134541 |51927486300	| 00006073531	| PUJANEW		|	777777  | QET     |	*ALL  | APHARM      | 193409475709 | 00     | 091718   | PUJANEW		|	00		|	0000000000	|	30     | 30 | 0	  | 000  |	2			|	03					|	00087134541		|	30				|	30		|	01				| 03					|	51927486300 |	10				|	10		|	01				|03					|	00006073531 |	30				|	30		|	01				|
		
		# PROD-ID 51927486300, 00087134541, 00006073531
	  # TC1: PLAN2643S3 [NonPartD=0][ID:51927486300, 00087134541]
    # TC2: PLAN2643T2 [NonPartD=0][ID:51927486300, 00087134541, 00006073531]
    # TC3: PLAN2643   [NonPartD=1][ID:51927486300, 00087134541]
    # TC4: PLAN2643T4 [NonPartD=1][ID:51927486300, 00087134541, 00006073531]