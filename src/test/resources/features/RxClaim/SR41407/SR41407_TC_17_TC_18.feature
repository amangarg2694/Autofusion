Feature: Submit a claim
As a RxClaim User I want to submit a claim
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I select Option "6" to navigate to "RxClaim DUR Maintenance"
    And I select Option "2" to navigate to "RxClaim DUR User Override Maintenance"
    And I select Option "6" to navigate to "GPI Contraindications Override Lists"
    And I press "F6" Key 
    And I add a list with "<List>","<Description>","<DMGenericName>","<MedCond>","<RespCode>","<AgeMin>","<AgeMax>","<MsgCode>"
    And I press "F12" Key 
    And I press "F12" Key 
    And I press "F12" Key 
    And I press "F12" Key 
    And I press "F12" Key 
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    
    
   
   
    Examples:
    |List     |Description|DMGenericName                |MedCond  |RespCode|AgeMin|AgeMax|MsgCode   | BIN     | ProcCtrl  | Group | PharmacyID|RxNo          | Refill | fillDate | MemberID  | ProductID  | DspQty | DS | PSC | Cost |
		|Test8007  | Test      | ACETAMINOPHEN W/ CODEINE    |PREGNANCY|    H   |  0  |  0  |.5TRIAZOLM|	333333  | VANI      |	*ALL  | APHARM    | 974016776011 | 00     | 17082018 | EVU41407M01 | 11694097903|10      |10  |00   |500   |
    |Test8008  | Test      | ACETAMINOPHEN W/ CODEINE    |PREGNANCY|    H   |  0  |  0  |.5TRIAZOLM|	333333  | VANI      |	*ALL  | APHARM    | 974016776011 | 00     | 17082018 | EVU41407M01 | 11694097904|10      |10  |00   |500   |
        