Feature: Submit a claim
As a RxClaim User I want to submit a claim
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R"
    
    
   
   
    Examples:
    | BIN     | ProcCtrl  | Group | PharmacyID|RxNo          | Refill | FillDate | MemberID  | ProductID  | DspQty | DS | PSC | Cost |
		|	333333  | SN002456  |	*ALL  | APHARM    | 974016776011 | 00     | 07022018   | TEXEMEM01 | 00777310402|30      |30  |00   |100   |
    |	333333  | SN002456  |	*ALL  | APHARM    | 974016776012 | 00     | 07022018   | TEXEMEM02 | 00777310402|30      |30  |00   |100   |
        