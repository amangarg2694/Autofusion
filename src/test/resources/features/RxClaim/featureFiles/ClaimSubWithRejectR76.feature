Feature: Submit a claim with Reject code R 76
As a RxClaim User I want to submit a Reject claim
   
   Scenario Outline: Setup a Plan edit 15 for Refill Limits
    Given I am on RxClaim PlanAdministrator Menu 
    When I Setup a Plan with Refill Limits "<PlanCode>","<MaximumRefill>","<Period>","<EffectiveDate>"
       
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with Retail MO Pharmacy "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>"
    Then Validate Claim Status is "P"
    When I submit a claim with new fill date "<FillDate2>"
    Then Validate Claim Status is "P"
    When I submit a claim with different fill date "<FillDate3>"
    Then Validate Claim Status is "R"
    Then Validate Claim Reject Code is "76"
      
    Examples:
     | PlanCode   | MaximumRefill| Period | EffectiveDate  | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate |FillDate2|FillDate3| MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID | UCW |
	   | AUTOREFLMT | 02     			 |	A  		| 010118| 777777  | QET     |	*ALL  | 0556540     | 765488397412 | 00     | 010118   |011118|012118| AUTOMEMBER06 | 00777310402|10      |10  |1   |1000  |01 |1821039694 |1000 |
    
        