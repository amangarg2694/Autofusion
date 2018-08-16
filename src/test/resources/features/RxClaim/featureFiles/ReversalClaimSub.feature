Feature: Submit a Reversal claim
As a RxClaim User I want to submit a claim
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a Reversal claim with Retail MO Pharmacy "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>"
    Then Validate Reversal Claim Status is "X"
       
    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID | UCW |
	  | 777777  | QET     |	*ALL  | 2400101     | 765488397425 | 00     | 060116   | AUTOMEMBER07 | 00777310402|30      |30  |1   |1000  |01 |1821039694 |1000 |
    
        