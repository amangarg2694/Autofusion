Feature: SR41384: WO: Plan Code Conversion Request
    
             
   Scenario Outline: SR40892_TC01_ Verifying if Plan Code "P" and Durg Sts " G" &  Multi source ind " M" then Tier Value "4" should be populated at 310 position in BCBSAZ Paid Claim File. 
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>"
    And Validate Claim Status is "P"
    And I press "F7" Key
    
    
    
   
   
    Examples:
    | BIN     | ProcCtrl | Group  | PharmacyID  |	RxNo         | Refill | FillDate | MemberID          | ProductID  | DspQty | DS  | PSC | Cost |Fee|
		|	777777  | AKAN     |	*     | APHARM      | 517637765678 | 00     | 041918   |VSRSASFLMMEDICAID1 | 59676031000| 10     |	10 | 00  |100   |10 |
    
        
   
