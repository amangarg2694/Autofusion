Feature: NCPDP External Code List (ECL) Change for Medicaid – Reject Code 831


    Scenario Outline: Reject Remap with NDC
   
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
		|	170996  | *ALL    |	*ALL  | APHARM      | 689224434167 | 01     |090618    | SR41011M2    | 00591319301 |30       |30  |0   |10   |SR41011|
		
		Scenario Outline: Reject Remap with GPI 
   
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
		|	170996  | *ALL    |	*ALL  | APHARM      | 681234231267 | 01     |090618    | SR41011M2    | 00003052620 |30       |30  |0   |10   |SR41011|
		
		
		Scenario Outline: Reject Remap with NDC Speciality
		Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<3ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submissionSixSpecialityOral with NDC
    
    Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 689234831267 | 01     |090618    | SR41011M2    | 502012400** |30       |30  |0   |10   |SR41011|
		
		
				
		Scenario Outline: Reject Remap with GPI Speciality
		Given I am on RxClaim PlanAdministrator Menu
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I send "<Plan>","<BIN>","<3ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>" for reject remap claim submissionSixSpecialityOral with GPI
    
    Examples:
      
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |Plan    |
		|	170996  | *ALL    |	*ALL  | APHARM      | 689234231269 | 01     |090618    | SR41011M2    | 59676060012 |30       |30  |0   |10   |SR41011|
		