Feature: Submit a claim with Brand and Generic Drug
As a RxClaim User I want to submit a claim
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with Retail MO Pharmacy "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>"
    Then Validate Claim Status is "P"
    
    
   
    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID | UCW |
	  | 777777  | QET     |	*ALL  | 2400101     | 765488397407 | 00     | 060116   | AUTOMEMBER03 | 68084009711|10      |10  |1   |1000  |01 |1821039694 |1000 |
    
        