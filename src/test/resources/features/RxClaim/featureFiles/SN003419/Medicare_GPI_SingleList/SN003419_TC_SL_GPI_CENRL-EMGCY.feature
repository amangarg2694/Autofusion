#Author: rajvardhan@optum.com
Feature: Current Enrollee: Plan Check Negative Formulary Q, Product Negative Formulary Change N and PA TB X
  As a RxClaim User I want to submit a TB claims

  @TC01
  Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year and Submit a Main TB claims in RxClaim for Current Year
    #GPI - CENRL-EMGCY
    #Scenario Outline: Submit a Precondition TB claims in RxClaim for Previous Year
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate PA Member "<MemberID>" added
    When I create PA Number "<PANumber>","<Type>","<PAOTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And Update Member PA Override and GPI Details "<PAOverrideTB>","<QualQuantity>","<MinQuantity>","<MaxQuantity>","<QualDailyDose>","<MinDailyDose>","<MaxDailyDose>","<PTDQuantityType>","<PTDQuantityDays>","<PTDQuantityMax>","<PTDDaysSupplyType>","<PTDDaysSupplyMin>","<PTDDaysSupplyMax>","<PTD4thQtrDSType>","<PTD4thQtrDSDays>","<PTD4thQtrDSMax>","<QtyDSComp>"
    And Update Plan Drug Status and Turnoff GPI Options "<PlanCode>"
    When I submit a claim with residence "<BIN1>","<ProcCtrl1>","<Group1>","<PharmacyID1>","<RxNo1>","<Refill1>","<FillDate1>","<MemberID1>","<ProductID1>","<DspQty1>","<DS1>","<PSC1>","<Cost1>", "<Residence1>"
    Then Validate Claim Status is "P"
    #Scenario Outline: Submit a Main TB claims in RxClaim for Current Year
    And I am on RxClaim PlanAdministrator Menu
    And Update Plan Drug Status and Turnon GPI Options "<PlanCodeCY>","<CheckNegFormChangeonProductCY>","<QualQuantityCY>","<MinQuantityCY>","<MaxQuantityCY>","<QualDailyDoseCY>","<MinDailyDoseCY>","<MaxDailyDoseCY>","<PTDQuantityTypeCY>","<PTDQuantityDaysCY>","<PTDQuantityMaxCY>","<PTDDaysSupplyTypeCY>","<PTDDaysSupplyMinCY>","<PTDDaysSupplyMaxCY>","<PTD4thQtrDSTypeCY>","<PTD4thQtrDSDaysCY>","<PTD4thQtrDSMaxCY>","<QtyDSCompCY>","<NegativeFormularyChangeCY>","<MinMaxQuantityCY>","<MinMaxDailyDoseCY>","<QuantityDaySupplyPTDCY>"
    When I submit a claim with residence "<BIN2>","<ProcCtrl2>","<Group2>","<PharmacyID2>","<RxNo2>","<Refill2>","<FillDate2>","<MemberID2>","<ProductID2>","<DspQty2>","<DS2>","<PSC2>","<Cost2>", "<Residence2>"
    Then Validate Claim Status is "<ClaimStatus>"
    #And Validate Claim Reject Code "76 569"
    And Validate PA Number and TB fields "<PANumberCY>","<TBOverrideCY>","<TBPriorDrugStsCY>","<TBRejectReason1CY>","<TBRejectReason2CY>","<TBRejectReason3CY>","<TBPlanEditCY>","<TBPassPreQualifCheckCY>"

    Examples: 
      | CarrierID | AccountID | GroupID  | MemberID | FirstName | LastName | DOB      | FromDate | ThruDate | PANumber | Type | PAOTC | NDCGPIList     | From  | Thru  | Agent | Reason | IgnoreDrugStatus | PAOverrideTB | QualQuantity | MinQuantity | MaxQuantity | QualDailyDose | MinDailyDose | MaxDailyDose | PTDQuantityType | PTDQuantityDays | PTDQuantityMax | PTDDaysSupplyType | PTDDaysSupplyMin | PTDDaysSupplyMax | PTD4thQtrDSType | PTD4thQtrDSDays | PTD4thQtrDSMax | QtyDSComp | PlanCode | BIN1   | ProcCtrl1 | Group1 | PharmacyID1 | RxNo1        | Refill1 | FillDate1 | MemberID1 | ProductID1  | DspQty1 | DS1 | PSC1 | Cost1 | Residence1 | PlanCodeCY | CheckNegFormChangeonProductCY | ProductIDCY | QualQuantityCY | MinQuantityCY | MaxQuantityCY | QualDailyDoseCY | MinDailyDoseCY | MaxDailyDoseCY | PTDQuantityTypeCY | PTDQuantityDaysCY | PTDQuantityMaxCY | PTDDaysSupplyTypeCY | PTDDaysSupplyMinCY | PTDDaysSupplyMaxCY | PTD4thQtrDSTypeCY | PTD4thQtrDSDaysCY | PTD4thQtrDSMaxCY | QtyDSCompCY | NegativeFormularyChangeCY | MinMaxQuantityCY | MinMaxDailyDoseCY | QuantityDaySupplyPTDCY | BIN2   | ProcCtrl2 | Group2 | PharmacyID2 | RxNo2        | Refill2 | FillDate2 | MemberID2 | ProductID2  | DspQty2 | DS2 | PSC2 | Cost2 | Residence2 | PANumberCY | TBOverrideCY | TBPriorDrugStsCY | TBRejectReason1CY | TBRejectReason2CY | TBRejectReason3CY | TBPlanEditCY | TBPassPreQualifCheckCY | ClaimStatus |
      #Max DD
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Q                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | R           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Q                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Q                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Q                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Y                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | R           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Y                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Y                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | Y                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | N                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | R           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | N                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | Y                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | N                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | N                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
      | NID25     | NID25     | BN341902 |          | AUTOMEM   | AUTOMEM  | 12251987 |    10101 |   123139 | 12345678 | G    | *     | 45550060000120 | 10118 | 13018 | O     | AA     | N                | X            |              |             |             | S             |              |            3 |                 |                 |                |                   |                  |                  |                 |                 |                |           | BN341902 | 939393 | *         | *      | APHARM      | 765488397612 |      00 |    122217 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 | BN341902   | N                             |             |                |               |               | S               |                |              6 |                   |                   |                  |                     |                    |                    |                   |                   |                  |             | Y                         | N                | N                 | N                      | 939393 | *         | *      | APHARM      | 765488397612 |      00 |     10118 |           | 50242012101 |     180 |  45 |    0 |   100 |         01 |   12345678 | KSIDTB       |                  | CENRL             | EMGCY             | QTYLT             |              |                        | P           |
