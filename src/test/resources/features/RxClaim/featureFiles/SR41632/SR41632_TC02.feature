Feature:  Verify  the  external transaction number appears in the required format YYYYJJJTNNNNNC
  As a RxClaim User I want to check transaction number appeared in YYYYJJJTNNNNNC format

  Scenario Outline: Verify  the  external transaction number appears in the required format YYYYJJJTNNNNNC
    Given I am on RxClaim PlanAdministrator Menu
		When I submit a manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key
    Then Validate External Transaction format on ExternalTransactionScreen
    
    
    
     Examples: 
      | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |
		|	777777  | SR41634     |	*  | APHARM      | 200019921997 | 00     | 6252018   | SR41632_B3 | 00071015523|2      |2  |0   |100   |
    