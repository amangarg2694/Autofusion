Feature: Submit a claim
As a RxClaim User I want to submit a claim
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R"
    
    
   
   
    Examples:
<<<<<<< HEAD
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765488367432 | 00     | 060116   | MEMTEST345 | 00777310402|	30     | 30 | 00  |100   |
=======
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765488367432 | 00     | 060116   | AUTOMEMBER01 | 00777310402|30      |30  |00   |100   |
>>>>>>> 452505b4e81e2e3b104f2336618d4cb3ce34fa0f
    
        