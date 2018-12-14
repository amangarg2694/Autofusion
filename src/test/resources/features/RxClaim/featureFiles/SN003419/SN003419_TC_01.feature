#Author: rajvardhan@optum.com
Feature: Current Enrollee: Plan Check Negative Formulary ‘Q’, Product Negative Formulary Change ‘N’ and PA TB ‘X’
As a RxClaim User I want to submit a TB claims
    
             
   Scenario Outline: Submit a TB claims in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with Retail MO Pharmacy "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>"
    Then Validate Claim Status is "P" 
   
    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID     | UCW |
	  | 939393  | *       |	*     | APHARM      | 765488397611 | 00     | 123017   | BN341901     | 50242012101|120     |30  |0    |100   |01      |1821039694 |100  |