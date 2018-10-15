Feature: Confirm Additional message format for GPI Period-to-Date
As a RxClaim User I want to verify Confirm Additional message format for GPI Period-to-Date using D for Day Value
    
     #Before running this script should run the script for Partd Setup and PriorSetup2
    @TC01         
    Scenario Outline: Verify accuracy of quantity and date in new message field, GPI Period to Date using D for Day Value and test when claim in history has fallen off
    
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
   |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |GPIList  |Seq|GPIFrmDate|GPIThruDate| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |
   |777777|EX300E4|  *  |010191 |123139  |SR41706E6|SR41706E6|EX4176GL4| 2 | 010118   |  123139   | EX300E4  |*       | APHARM      |789898989801  | 00     |09202018| SR41706MM6| 51552102205| 21     |18  |00   |100   | 1    |
   
   @TC02
   Scenario Outline: Verify accuracy of quantity and date in new message field, GPI Period to Date using D for Day Value and test when claim in history has fallen off
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the date with "<SysDate>"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
    
    
    Examples:
    |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |GPIList  |Seq|GPIFrmDate|GPIThruDate| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |SysDate|
    |777777|EX300E4|  *  |010191 |123139  |SR41706E6|SR41706E6|EX4176GL4| 2 | 010118   |  123139   | EX300E4  |*       | APHARM      |789898989802  | 00     |09192018| SR41706MM6| 51552102205| 21     |16  |00   |100   | 1    |100518 |
    |777777|EX300E4|  *  |010191 |123139  |SR41706E6|SR41706E6|EX4176GL4| 2 | 010118   |  123139   | EX300E4  |*       | APHARM      |789898989803  | 00     |09192018| SR41706MM6| 51552102205| 10     |32  |00   |100   | 1    |110718 |
    |777777|EX300E4|  *  |010191 |123139  |SR41706E6|SR41706E6|EX4176GL4| 2 | 010118   |  123139   | EX300E4  |*       | APHARM      |789898989804  | 00     |09192018| SR41706MM6| 51552102205| 21     |21  |00   |100   | 1    |111818 |
   
    