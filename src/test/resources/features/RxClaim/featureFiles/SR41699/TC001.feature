Feature: Part D: Correct issue with CPP calculation with Generic Cost-Share in Gap
As a RxClaim User I want to check whether CPP calculation with Generic Cost-Share in Gap is working correctly

Scenario Outline: Verify the outcome Gap CPP when Standard is in Gap Phase; Claim is Discount Eligible; EGWP is Not Lesser.
Given I am on RxClaim PlanAdministrator Menu
And I create Member "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
And I submit a with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    



  Examples:
  | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | MemFromDate  | MemThruDate |BIN     | ProcCtrl| Group  | PharmacyID   |RxNo          | Refill | FillDate | ProductID   | DspQty | DS | PSC | Cost |
	|	ACLAIMC1  | AUTOCLAIMA1 |	AUTOCLAIMG1 | RUPMEM0003 | AUTOMEM    | AUTOMEM   | 12251987	| 010101       | 123139      |903903  |*        |* 			 |	1482291     |302222222100  |00      |          | 00378695501 |90      |30  |0    | 