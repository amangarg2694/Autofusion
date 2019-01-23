Feature: Submit a claim
As a RxClaim User I want to submit a claim in 8.4.02
    
             
   Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I press "F12" Key 
    And I press "F12" Key
    And I press "F3" Key
    And I select Option "6" to navigate to "RXCLAIM REGRESSION ENVIRONMENT"
    And I enter modno
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
    And I select Option "1" to navigate to "Price Schedule"
    And verify the price schedule with "<ScheduleOption>"
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
     And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    Then Validate Claim Status with "<sts>"
    
    
   
   
    Examples:
    |ScheduleOption| BIN     | ProcCtrl  | Group      | PharmacyID|RxNo          | Refill | fillDate | MemberID    | ProductID  | DspQty | DS | PSC | Cost |sts|Fee|UCW|
		#|TB_AUTO       |	123456  | SN2906PCN|SN2906GROUP | 8675309   | 223487878722 | 00     | 08292018 | SN002906MM2 | 51927441300|30      |30  |00   |100   |test|10|110|
    #|TB_AUTO       |	123456  | SN374718|SN374719GRP | 1718634   | 555557878722 | 00     | 08302018 | SN374718MM1 | 51927441300|30      |30  |00   |100   |test|10|110|
    #|SUBMIT ING       |	123456  | SN374719|SN374719GRP | 1718634   | 676767787872 | 00     | 08312018 | SN374719MM1 | 51927441300|30      |30  |00   |100   |test|10|110|
    |TB_AUTO          |	123456  | SN374719|SN374719GRP | 1718634   | 777754560072 | 00     | 08302018 | SN374718M92 | 51927441300|30      |30  |00   |100   |test|10|110|