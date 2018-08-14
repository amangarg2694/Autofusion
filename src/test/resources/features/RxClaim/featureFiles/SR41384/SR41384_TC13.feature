Feature: SR41384: WO: Plan Code Conversion Request
    
    Scenario Outline: SR40892_TC13_ Verifying if Plan Code "S" and Durg Sts " G" &  Multi source ind " M" then Tier Value "D" should be populated at 247 position in BCBSAZ Paid Claim File. 
    Given I am on RxClaim PlanAdministrator Menu 
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I select Active Plan in "Active Plan by Plan Code" to check the Plan Status as S & Drug status as G
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "2" to navigate to "RxClaim Product Information Maintenance"
    And I select Option "1" to navigate to "Active Products by Name"
    And I select Active Product to set Multi source ind as M
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>"
    And Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I enter values for "Submit Extract Job"
    And I submit the job & verify the records
    And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "10" to navigate to "Select Client"
    And I select Option "3" to navigate to "IRX Client Specific Menu"
    And I select Option "29" to navigate to "Blue Cross Blue Shield of Arizona Custom Menu"
    And I select Option "3" to navigate to "BCBSAZ Paid Claims File 2"
    And I enter values "<DateFrom>","<DateThru>","<CarrierFrom>","<CarrierThru>","<AccFrom>","<AccThru>","<GrpFrom>","<GrpThru>","<Filename>","<Libname>"
    Then I verify the "Tier Value "D" should be populated at 247 position in BCBSAZ Paid Claim File2
    

     Examples:
    | BIN     | ProcCtrl | Group  | PharmacyID  |	RxNo         | Refill | FillDate | MemberID  | ProductID | DspQty | DS  | PSC | Cost |Fee|DateFrom|DateThru|CarrierFrom|CarrierThru|AccFrom  |AccThru  |GrpFrom  |GrpThru  |Filename |Libname   |
		|	777777  | AKAN     |	*     | APHARM      | 923141233245 | 00     | 081418   |SR41320_M2 |59676031000| 10     |	10  | 00  |100   |10 |010118  |123118  | SR41320C1	| SR41320C1	|SR41320A1|SR41320A1|SR41320G1|SR41320G1|SR41384F2|USRSANDEEP|
