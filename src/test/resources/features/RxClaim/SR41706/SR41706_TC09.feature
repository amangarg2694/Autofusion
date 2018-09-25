Feature: Confirm Additional message format for NDC Period-to-Date
As a RxClaim User I want to verify Confirm Additional message format for NDC Period-to-Date
    
      #Before running this script should run the script for Partd Setup and PriorSetup2
     @TC01         
   Scenario Outline: Verify  multiple message codes and messages are not returned on rejected claims for custom messages coming from from a DUR Service
    
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
   |777777|EX400M1|  *  |010191 |123139  |SR41706D9|SR41706S7|EX4176GL9| 2 | 010118   |  123139   | EX400M1  |*       | APHARM      |995555555501  | 00     |09212018| SR41706MR1| 51552102205| 21     |16  |0   |100   | 1    |
   
   @TC02
   Scenario Outline: Verify  multiple message codes and messages are not returned on rejected claims for custom messages coming from from a DUR Service
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the date with "<SysDate>"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
    
    
    Examples:
    |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |GPIList  |Seq|GPIFrmDate|GPIThruDate| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |SysDate|
    |777777|EX400M1|  *  |010191 |123139  |SR41706C9|SR41706S5|EX4176GL9| 2 | 010118   |  123139   | EX400M1  |*       | APHARM      |995555555501  | 00     |09202018| SR41706MB9| 51552102205| 53     |16  |0    |100   | 1    |112418 |
   