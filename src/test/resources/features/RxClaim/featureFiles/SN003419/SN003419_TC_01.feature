#Author: rajvardhan@optum.com
Feature: Current Enrollee: Plan Check Negative Formulary ‘Q’, Product Negative Formulary Change ‘N’ and PA TB ‘X’
As a RxClaim User I want to submit a TB claims
    
   @TC01_01          
   Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate PA Member "<MemberID>" added
    When I create PA Number "<PANumber>","<Type>","<PAOTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And Update Plan Drug Status and Turnoff GPI Options "<PlanCode>"
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P" 
   
    Examples:
    | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |PANumber |Type|PAOTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|PlanCode| BIN    | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
	  |	NID25     | NID25       |	BN341904    | AUTOTBM006  | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139   |12345678 |G   |*    |45550060000120|010101|123139|O    |JJ    |N               |BN341904|939393  | *       |	*    | APHARM      | 765488397611 | 00     | 123017   | BN341901   | 50242012101|120     |30  |0    |100   |
	  																																																																																																																									
	 @TC01_02          
   Scenario Outline: Submit a Main TB claims in RxClaim for Current Year
    Given I am on RxClaim PlanAdministrator Menu
    And Update Plan Drug Status and Turnon GPI Options "<PlanCode>","<CheckNegFormChangeonProduct>","<NegativeFormularyChange>","<MinMaxQuantity>","<MinMaxDailyDose>","<QuantityDaySupplyPTD>"
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R" 
    And Validate PA Number and TB fields "<PANumber>","<TBOverride>","<TBPriorDrugSts>","<TBRejectReason1>","<TBRejectReason2>","<TBRejectReason3>","<TBPlanEdit>","<TBPassPreQualifCheck>" 
    Examples:
    |PlanCode|CheckNegFormChangeonProduct|NegativeFormularyChange|MinMaxQuantity|MinMaxDailyDose|QuantityDaySupplyPTD| BIN    | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |PANumber|TBOverride|TBPriorDrugSts|TBRejectReason1|TBRejectReason2|TBRejectReason3|TBPlanEdit|TBPassPreQualifCheck|
	  |BN341904|Q                          |Y                      |Y             |N              |Y                   |939393  | *       |	*     | APHARM      | 765488397611 | 00     | 020118   | AUTOTBM006 | 50242012101|120      |30  |0    |100   |12345678|KSIDTB    |8             |               |               |               |          |Y                   |