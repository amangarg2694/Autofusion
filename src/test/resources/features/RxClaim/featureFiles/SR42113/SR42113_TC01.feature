@Regression
Feature: Submit a claim
As a RxClaim User I want to submit a claim in 8.4.02
    
            
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
    And I select Option "1" to navigate to "Price Schedule"
    And verify the price schedule with "<ScheduleOption>"
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    Then Validate Claim Status with "<sts>"
    
     
   
    Examples:
    |ScheduleOption| BIN     | ProcCtrl  | Group | PharmacyID|RxNo          | Refill | fillDate | MemberID    | ProductID  | DspQty | DS | PSC | Cost |sts|Fee|UCW|
		#|$0_R2         |	777777  | CCHA      |	*ALL  | 1718634  | 900000000003 | 00     | 08292018 | SN002906MM1 | 51927441300|30      |30  |00   |100   |test|10|100|
    #|TB_AUTO       |	123456  | SN374718|SN374719GRP | 1718634   | 777778787223 | 00     | 08292018 | SN374718MM1 | 51927441300|30      |30  |00   |100   |test|10|110|
    |RAHPS01      |	123456  | SN374718|SN374719GRP | 1718634   | 555567897223 | 00     | 08262018 | SN374718M92 | 51927441300|30      |30  |00   |100   |test|10|110|
    #SN374718MM2