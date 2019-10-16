Feature: Submit a claim
  As a RxClaim User I want to submit a claim

  Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"

    Examples: 
      | BIN    | ProcCtrl | Group | PharmacyID | RxNo         | Refill | FillDate | MemberID   | ProductID   | DspQty | DS | PSC | Cost |
      | 777777 | CCHA     | *ALL  | APHARM     | 765765367432 |     00 |   060119 | SN001396M1 | 00777310402 |     30 | 30 |  00 |  100 |
