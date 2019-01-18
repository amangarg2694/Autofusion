#Author:rajvardhan@optum.com
Feature: Submit a claim
As a RxClaim User I want to submit a claim
    
   @SXCD1          
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R"

    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 060116   | VSR419233	| 00777310402|	30     | 30 | 00  |100   |

        
   @BOOK1          
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R"

    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 060116   | VSR419233	| 00777310402|	30     | 30 | 00  |100   |
        