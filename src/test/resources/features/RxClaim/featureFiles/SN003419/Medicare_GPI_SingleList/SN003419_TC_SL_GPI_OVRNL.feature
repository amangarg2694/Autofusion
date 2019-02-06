#Author: rajvardhan@optum.com
Feature: Current Enrollee: Plan Check Negative Formulary Q, Product Negative Formulary Change N and PA TB X
  As a RxClaim User I want to submit a TB claims

  @TC01_CENR_EMGCY
  Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year and Submit a Main TB claims in RxClaim for Current Year
    #Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate PA Member "<MemberID>" added
    When I create PA Number "<PANumber>","<Type>","<PAOTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And Update Member PA Override and GPI Details "<PAOverrideTB>","<QualQuantity>","<MinQuantity>","<MaxQuantity>","<QualDailyDose>","<MinDailyDose>","<MaxDailyDose>","<PTDQuantityType>","<PTDQuantityDays>","<PTDQuantityMax>","<PTDDaysSupplyType>","<PTDDaysSupplyMin>","<PTDDaysSupplyMax>","<PTD4thQtrDSType>","<PTD4thQtrDSDays>","<PTD4thQtrDSMax>","<QtyDSComp>"
    And Update Plan Drug Status and Turnoff GPI Options "<PlanCode>"
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    #Scenario Outline: Submit a Main TB claims in RxClaim for Current Year
    Given I am on RxClaim PlanAdministrator Menu
    And Update Plan Drug Status and Turnon GPI Options "<PlanCodeCY>","<CheckNegFormChangeonProductCY>","<QualQuantityCY>","<MinQuantityCY>","<MaxQuantityCY>","<QualDailyDoseCY>","<MinDailyDoseCY>","<MaxDailyDoseCY>","<PTDQuantityTypeCY>","<PTDQuantityDaysCY>","<PTDQuantityMaxCY>","<PTDDaysSupplyTypeCY>","<PTDDaysSupplyMinCY>","<PTDDaysSupplyMaxCY>","<PTD4thQtrDSTypeCY>","<PTD4thQtrDSDaysCY>","<PTD4thQtrDSMaxCY>","<QtyDSCompCY>","<NegativeFormularyChangeCY>","<MinMaxQuantityCY>","<MinMaxDailyDoseCY>","<QuantityDaySupplyPTDCY>"
    When I submit a claim with "<BINCY>","<ProcCtrlCY>","<GroupCY>","<PharmacyIDCY>","<RxNoCY>","<RefillCY>","<FillDateCY>","<MemberIDCY>","<ProductIDCY>","<DspQtyCY>","<DSCY>","<PSCCY>","<CostCY>"
    Then Validate Claim Status is "<ClaimStatus>"
    #And Validate Claim Reject Code "76 569"
    And Validate PA Number and TB fields "<PANumberCY>","<TBOverrideCY>","<TBPriorDrugStsCY>","<TBRejectReason1CY>","<TBRejectReason2CY>","<TBRejectReason3CY>","<TBPlanEditCY>","<TBPassPreQualifCheckCY>"

    Examples: 
      | CarrierID | AccountID | GroupID    | MemberID | FirstName | LastName | DOB      | FromDate | ThruDate | PANumber | Type | PAOTC | NDCGPIList     | From  | Thru  | Agent | Reason | IgnoreDrugStatus | PAOverrideTB | QualQuantity | MinQuantity | MaxQuantity | QualDailyDose | MinDailyDose | MaxDailyDose | PTDQuantityType | PTDQuantityDays | PTDQuantityMax | PTDDaysSupplyType | PTDDaysSupplyMin | PTDDaysSupplyMax | PTD4thQtrDSType | PTD4thQtrDSDays | PTD4thQtrDSMax | QtyDSComp | PlanCode   | BIN    | ProcCtrl | Group | PharmacyID | RxNo         | Refill | FillDate | MemberID | ProductID   | DspQty | DS | PSC | Cost | PlanCodeCY | CheckNegFormChangeonProductCY | QualQuantityCY | MinQuantityCY | MaxQuantityCY | QualDailyDoseCY | MinDailyDoseCY | MaxDailyDoseCY | PTDQuantityTypeCY | PTDQuantityDaysCY | PTDQuantityMaxCY | PTDDaysSupplyTypeCY | PTDDaysSupplyMinCY | PTDDaysSupplyMaxCY | PTD4thQtrDSTypeCY | PTD4thQtrDSDaysCY | PTD4thQtrDSMaxCY | QtyDSCompCY | NegativeFormularyChangeCY | MinMaxQuantityCY | MinMaxDailyDoseCY | QuantityDaySupplyPTDCY | BINCY  | ProcCtrlCY | GroupCY | PharmacyIDCY | RxNoCY       | RefillCY | FillDateCY | MemberIDCY | ProductIDCY | DspQtyCY | DSCY | PSCCY | CostCY | PANumberCY | TBOverrideCY | TBPriorDrugStsCY | TBRejectReason1CY | TBRejectReason2CY | TBRejectReason3CY | TBPlanEditCY | TBPassPreQualifCheckCY | ClaimStatus |
      # Max DD
      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Q                             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  |                   |                   |                   |              |                        | R           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Q                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Q                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Q                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Y                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  |                   |                   |                   |              |                        | R           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | Y                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | P                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | P                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | N                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  |                   |                   |                   |              |                        | R           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | N                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | N                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
#      | NID25     | NID25     | BNSAOLAP02 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BNSAOLAP02 | 939393 | *        | *     | APHARM     | 765488397612 |     00 |    10118 |          | 50242012101 |    180 | 45 |   0 |  100 | BNSAOLAP02 | N                             |                |               |               |                 |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *          | *       | APHARM       | 765488397612 |       00 |      10518 |            | 50242012101 |      180 |   45 |     0 |    100 |   12345678 | KSIDTB       |                  | OVNRL             | QTYLT             |                   |              |                        | P           |
