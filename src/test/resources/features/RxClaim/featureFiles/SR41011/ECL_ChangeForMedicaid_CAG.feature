@Regression
Feature: NCPDP External Code List (ECL) Change for Medicaid – Reject Code 831 (CAG Level) 

    Scenario Outline: Reject Remap with NDC CAG Level
   
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submission
    And I am on RxClaim PlanAdministrator Menu
    And I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submissionTwo
    
    
    Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 681254534167 | 01     |120718    | SR41011M2    | 00591319301 |30       |30  |0   |10   |SR41011|
		
		
		
		Scenario Outline: Reject Remap with GPI CAG Level
   
    Given I am on RxClaim PlanAdministrator Menu  
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submissionThree with GPI
    And I am on RxClaim PlanAdministrator Menu
    And I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submissionFour with GPI
   
    Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 689134531267 | 01     |120718    | SR41011M2    | 00000111199 |30       |30  |0   |10   |SR41011|
		
		
		
		
		Scenario Outline: Reject Remap with NDC Preferred Formulary CAG Level
   
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap Preferred Formulary NDC claim submission
		And I am on RxClaim PlanAdministrator Menu
		And I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap Preferred Formulary NDC claim submissionTwo
		
		Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 689254254167 | 01     |120718    | SR41011M2    | 11917007001 |30      |30  |0   |10   |SR41011|
		
		Scenario Outline: Reject Remap with GPI Preferred Formulary
   
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap Preferred Formulary GPI claim submission
    And I am on RxClaim PlanAdministrator Menu
    And I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap Preferred Formulary GPI claim submissionTwo
    
    
    Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 689252454167 | 01     |120718    | SR41011M2    | 00005445260 |30       |30  |0   |10   |SR41011|
		