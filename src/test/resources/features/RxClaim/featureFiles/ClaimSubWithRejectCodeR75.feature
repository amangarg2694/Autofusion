Feature: Submit a claim with Reject code R 75
As a RxClaim User I want to submit a Reject claim
   
   Scenario Outline: Setup a Plan edit 10 for NDC List and Submit the claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I Setup a Plan with Prior Auth NDC "<PlanCode>","<NDCList>","<NDCFromDate>","<NDCStatus>"
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with Retail MO Pharmacy "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>"
    Then Validate Claim Status is "R"
    Then Validate Claim Reject Code is "75"
    Then Validate Claim Message is "Drug Requires Prior Authorization"  
    
    Examples:
     | PlanCode   | NDCList| NDCFromDate | NDCStatus  | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate |FillDate2|FillDate3| MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID | UCW |
	   | AUTONDCLST | PANL1	 |	010118  	 | P					| 777777  | QET     |	*ALL  | 0556540     | 765488397420 | 00     | 010118   |011118|012118| AUTOMEMBER06 | 00071015523|10      |10  |1   |1000  |01 |1821039694 |1000 |
    
        