
Feature: SN003284
  I want to use this template for my feature file
    
  Scenario Outline: Validating the plan
	   Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<Plan>"
		And I press "F19" Key
		And I press "F7" Key
		And I validate ANDA "<ANDA>" value on Plan
		And I press "F12" Key
		And I press "F12" Key
		And I press "F12" Key
		And I verify Compounds in Plan detail page
		And I press "F7" Key
		And I enter Option 9 in "PlanOptionsScreen"
		
	 And I verify details on Multiple Ingredient Compound Detail Page 1 of 3 screen
	 And I press "F12" Key
	 And I press "F12" Key
		And I enter 10 NDC List on "PlanOptionsScreen"

		And I take "7" on NDC List on Active Plan NDC List Screen
		And I validate NDC_ID "<NDC1>", "<NDC2>", "<NDC3>" with status
		
	
 Examples:
 |Plan		 | NDC1         | NDC2          | ANDA	|
 |3284PLAN | 00781150710	|60346097114    | L			|
 


Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit MIC claims with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<Qual>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>", "<Cmpnd>"
    #Then Validate Claim Status is "R"
    And I press "F14" Key
    And I select option 5 Compound in Transaction Submission Detail List screen 
    And I add Compound Submission Details for first NDC with "<Qualifier1>", "<NDC1>","<Quantity1>", "<Cost1>", "<BasicCost1>" 
    And I add Compound Submission Details for Second NDC with "<Qualifier2>", "<NDC2>","<Quantity2>", "<Cost2>", "<BasicCost2>"
    And I press "F12" Key
    And I press "F12" Key
    And I submit claim
  
    And I Validate RxClaim ID
    And I Validate Claim Status
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
    And I verify TrOOP/Drug Spend Accumulation Phase Details
      
   
   Examples:
    | BIN     | ProcCtrl| Group   | PharmacyID  |RxNo          | Refill | FillDate | MemberID          | Qual  | ProductID  | DspQty | DS | PSC | Cost |Cmpnd|Qualifier1 | NDC1				| Quantity1 | Cost1 | BasicCost1| Qualifier2 	| NDC2 				| Quantity2 | Cost2 | BasicCost2	|
		|	777777  | QET    |	*ALL    | APHARM      | 765000117432 | 00     | 060118   | SN003284          | 00    | 00000000000| 30     | 30 | 00  | 100  |2    |03				 | 00781150710| 30 				| 30 		| 01 				| 03 					| 60346097114 | 10 				| 10 		| 01 					|
    
        
  Scenario Outline: Validating the plan
	   Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<Plan>"
		And I verify Compounds in Plan detail page
		And I press "F7" Key
		And I enter Option 9 in "PlanOptionsScreen"
		
	 And I verify details on Multiple Ingredient Compound Detail Page 1 of 3 screen
	 And I press "F12" Key
	 And I press "F12" Key
		And I enter 10 NDC List on "PlanOptionsScreen"

		And I take "7" on NDC List on Active Plan NDC List Screen
		And I validate NDC_ID "<NDC1>", "<NDC2>", "<NDC3>" with status
		
	 
   
 Examples:
 |Plan		 | NDC1         | NDC2          | 
 |3284PLAN | 00781150710	|60346097114  | 
 
      