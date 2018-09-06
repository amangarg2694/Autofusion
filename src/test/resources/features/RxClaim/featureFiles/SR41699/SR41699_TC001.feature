Feature: Part D: Correct issue with CPP calculation with Generic Cost-Share in Gap
As a RxClaim User I want to check whether CPP calculation with Generic Cost-Share in Gap is working correctly

Scenario Outline: Verify the outcome Gap CPP when Standard is in Gap Phase; Claim is Discount Eligible; EGWP is Not Lesser.
Given I am on RxClaim PlanAdministrator Menu
And I create Member "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
And I submit a Claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<MemberID>","<FillDate>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>"
    



  Examples:
  | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | MemFromDate  | MemThruDate |BIN     | ProcCtrl| Group  | PharmacyID  |RxNo          | Refill | FillDate | ProductID   | DspQty | DS | PSC | Cost     |Due |
	|	SIVAEGWP  | SIVAEGWPACC |	SIVAEGWPGRP | SR41699M8   | SR41699M8  | SR41699M8 | 01011988	| 010110       | 123139      |777777  | AREG    |* 			 |	APHARM     |302222222120  |00      | 082818   | 00378695501 | 120    |60  |0    | 3750     |    |