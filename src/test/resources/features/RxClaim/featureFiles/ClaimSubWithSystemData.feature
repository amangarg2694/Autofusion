#Author: rajvardhan@optum.com
Feature: Submit the claim with existing System Plan Data
  
    Scenario Outline: Submit the claim with existing Plan Code
    	Given I am on RxClaim PlanAdministrator Menu 
    	When I get the plan codes file
    	When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    	Then Validate Claim Status is "<ClaimStatus>"

    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |ClaimStatus|
		|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 060116   | MEM6212144	| 00777310402|	30     | 30 | 00  |100   |P					 |

