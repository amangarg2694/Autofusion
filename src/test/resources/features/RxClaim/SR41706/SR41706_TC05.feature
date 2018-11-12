Feature: Confirm Additional message format for NDC Period-to-Date
As a RxClaim User I want to verify Confirm Additional message format for NDC Period-to-Date
    
      #Before running this script should run the script for Partd Setup and PriorSetup2
     @TC01         
   Scenario Outline: Verify quantity and date in new message when claim in history has not fallen off for GPI   
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "8" to navigate to "RxClaim Profile Maintenance"
    And I select Option "2" to navigate to "ActiveTransactionControlbyB/P/G"
    And I press "F6" Key
    And I Add Transaction Control with "<BIN>","<PCN>","<Group>","<FrmDate>","<ThruDate>","<CarrierID>"
    And I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"  
    And I update plan with GPI details "<PlanCode>","<GPIList>","<Seq>","<GPIFrmDate>","<GPIThruDate>"
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage" 

    
    
    
     Examples:
  Examples:
   |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |GPIList  |Seq|GPIFrmDate|GPIThruDate| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |
   |777777|EX300T7|  *  |010191 |123139  |SR41706C5|SR41706S1|EX4176GL5| 2 | 010118   |  123139   | EX300T7  |*       | APHARM      |955555555505  | 00     |09202018| SR41706MB5| 51552102205| 21     |16  |0   |100   | 1    |
   
   @TC02
   Scenario Outline: Verify quantity and date in new message when claim in history has not fallen off for GPI
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the date with "<SysDate>"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
    
    
    Examples:
    |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |GPIList  |Seq|GPIFrmDate|GPIThruDate| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |SysDate|
    |777777|EX300T7|  *  |010191 |123139  |SR41706C5|SR41706S1|EX4176GL5| 2 | 010118   |  123139   | EX300T7  |*       | APHARM      |955555555502  | 00     |09192018| SR41706MB5| 51552102205| 21     |32  |0   |100   | 1    |100518 |
    |777777|EX300T7|  *  |010191 |123139  |SR41706C5|SR41706S1|EX4176GL5| 2 | 010118   |  123139   | EX300T7  |*       | APHARM      |955555555503  | 00     |09192018| SR41706MB5| 51552102205| 10     |11  |0   |100   | 1    |110718 |
    |777777|EX300T7|  *  |010191 |123139  |SR41706C5|SR41706S1|EX4176GL5| 2 | 010118   |  123139   | EX300T7  |*       | APHARM      |955555555504  | 00     |09192018| SR41706MB5| 51552102205| 21     |21  |0   |100   | 1    |111818 |
   
    