#Author: mudethula_venkateshwarlu@optum.com
Feature: Current Enrollee: Plan Check Negative Formulary Q, Product Negative Formulary Change N and PA TB X
As a RxClaim User I want to submit a TB claims
    
   @TC01_01          
   Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate PA Member "<MemberID>" added
    When I create PA Number "<PANumber>","<Type>","<PAOTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And Update Member PA Override and NDC Details "<PAOverrideTB>","<QualQuantity>","<MinQuantity>","<MaxQuantity>","<QualDailyDose>","<MinDailyDose>","<MaxDailyDose>","<PTDQuantityType>","<PTDQuantityDays>","<PTDQuantityMax>","<PTDDaysSupplyType>","<PTDDaysSupplyMin>","<PTDDaysSupplyMax>","<PTD4thQtrDSType>","<PTD4thQtrDSDays>","<PTD4thQtrDSMax>","<QtyDSComp>"
    And Update Plan Drug Status and Turnoff NDC Options "<PlanCode>"
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P" 
    Examples:
    |CarrierID |AccountID  |GroupID   |MemberID  |FirstName  |LastName  |DOB      |FromDate  |ThruDate |PANumber |Type|PAOTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|PAOverrideTB|QualQuantity|MinQuantity|MaxQuantity|QualDailyDose|MinDailyDose|MaxDailyDose|PTDQuantityType|PTDQuantityDays|PTDQuantityMax|PTDDaysSupplyType|PTDDaysSupplyMin|PTDDaysSupplyMax|PTD4thQtrDSType|PTD4thQtrDSDays|PTD4thQtrDSMax|QtyDSComp|PlanCode  |BIN    | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID | ProductID  |DspQty | DS | PSC | Cost |
	  |VMCAR29   |VMACC29    |VMGRP29   |MemberID  |AUTOMEM    |AUTOMEM   |12251987	|010101    |123139   |12345678 |N   |*    |00084071244   |010118|013018|O    |AA    |N               |X           |            |           |           |S            |            |3           |               |               |              |                 |                |                |               |               |              |         |3419AUTO01|939393 | *       |	*     | APHARM      | 765488397612 | 00     | 122217   | MemberID | 00084071244|180    |45  |0    |100   |
	  
	 #|	NID25     | NID25       |	BN341904    | MemberID  | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139   |12345678 |G   |*    |45550060000120|010118|013018|O    |JJ    |N               |X           |            |           |           |S            |            |3           |               |               |              |                 |                |                |               |               |              |         |BN341904|939393  | *       |	*    | APHARM      | 765488397611 | 00     | 123017   | MemberID | 50242012101|120     |30  |0    |100   |
	  																																																																																																																									
	 @TC01_02          
   Scenario Outline: Submit a Main TB claims in RxClaim for Current Year
    Given I am on RxClaim PlanAdministrator Menu
    And Update Plan Drug Status and Turnon NDC Options "<PlanCode>","<CheckNegFormChangeonProduct>","<ProductID>","<QualQuantity>","<MinQuantity>","<MaxQuantity>","<QualDailyDose>","<MinDailyDose>","<MaxDailyDose>","<PTDQuantityType>","<PTDQuantityDays>","<PTDQuantityMax>","<PTDDaysSupplyType>","<PTDDaysSupplyMin>","<PTDDaysSupplyMax>","<PTD4thQtrDSType>","<PTD4thQtrDSDays>","<PTD4thQtrDSMax>","<QtyDSComp>","<NegativeFormularyChange>","<MinMaxQuantity>","<MinMaxDailyDose>","<QuantityDaySupplyPTD>" 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    #And Validate Claim Reject Code "76 569" 
    And Validate PA Number and TB fields "<PANumber>","<TBOverride>","<TBPriorDrugSts>","<TBRejectReason1>","<TBRejectReason2>","<TBRejectReason3>","<TBPlanEdit>","<TBPassPreQualifCheck>" 
    Examples:
    |PlanCode	 |CheckNegFormChangeonProduct|QualQuantity|MinQuantity|MaxQuantity|QualDailyDose|MinDailyDose|MaxDailyDose|PTDQuantityType|PTDQuantityDays|PTDQuantityMax|PTDDaysSupplyType|PTDDaysSupplyMin|PTDDaysSupplyMax|PTD4thQtrDSType|PTD4thQtrDSDays|PTD4thQtrDSMax|QtyDSComp|NegativeFormularyChange|MinMaxQuantity|MinMaxDailyDose|QuantityDaySupplyPTD| BIN    | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID | ProductID  |DspQty | DS | PSC | Cost |PANumber|TBOverride|TBPriorDrugSts|TBRejectReason1|TBRejectReason2|TBRejectReason3|TBPlanEdit|TBPassPreQualifCheck|
	  |3419AUTO01|Q                          |            |           |           |S  			    |            |2           |               |               |		           |                 |                |                |               |               |              |         |Y                      |Y             |Y              |Y                   |939393  | *       |	*    | APHARM      | 765488397613 | 00     | 011618   | MemberID | 00084071244|180    |45  |0    |100   |12345678|KSIDTB    |	             |QTYLT          |CENRL          |               |          |N                   |
	  #50242012101
	  