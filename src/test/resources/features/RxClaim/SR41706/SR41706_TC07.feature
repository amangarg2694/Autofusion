Feature: Confirm Additional message format for NDC Period-to-Date
As a RxClaim User I want to verify Confirm Additional message format for NDC Period-to-Date
    
     #Before running this script should run the script for Partd Setup and PriorSetup2
    @TC01         
    Scenario Outline: Verify quantity and date in new message when historical claim is still active for NDC Quantity Period to setup
    
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "8" to navigate to "RxClaim Profile Maintenance"
    And I select Option "2" to navigate to "ActiveTransactionControlbyB/P/G"
    And I press "F6" Key
    And I Add Transaction Control with "<BIN>","<PCN>","<Group>","<FrmDate>","<ThruDate>","<CarrierID>"
    And I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"  
    And I update plan with "<PlanCode>","<NDCList>","<Seq>","<NDCFrmDate>","<NDCThruDate>","<PlanDefaultList>","<SupplementRejectCode>"
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
       
    
   
     Examples:
   |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |NDCList |Seq|NDCFrmDate|NDCThruDate|PlanDefaultList|SupplementRejectCode| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |
   |777777|EX300T9|  *  |010191 |123139  |SR41706C7|SR41706S3|EX00T7  | 2 | 010118   |  123139   |      A        |          S         | EX300T9  |*       | APHARM      |774466444601  | 00     |09202018| SR41706MB7| 55289030814| 21     |16  |0   |100   | 1    |
   
   @TC02
   Scenario Outline: Verify quantity and date in new message when historical claim is still active for NDC Quantity Period to setup
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the date with "<SysDate>"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
    
    
    Examples:
    |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |NDCList |Seq|NDCFrmDate|NDCThruDate|PlanDefaultList|SupplementRejectCode| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |SysDate|
    |777777|EX300T9|  *  |010191 |123139  |SR41706C7|SR41706S3|EX00T7  | 2 | 010118   |  123139   |      A        |          S         | EX300T9  |*       | APHARM      |774466444602  | 00     |09202018| SR41706MB7| 55289030814| 21     |32  |0   |100   | 1    |100518 |
    |777777|EX300T9|  *  |010191 |123139  |SR41706C7|SR41706S3|EX00T7  | 2 | 010118   |  123139   |      A        |          S         | EX300T9  |*       | APHARM      |774466444603  | 00     |09202018| SR41706MB7| 55289030814| 21     |11  |0   |100   | 1    |110718 |
    |777777|EX300T9|  *  |010191 |123139  |SR41706C7|SR41706S3|EX00T7  | 2 | 010118   |  123139   |      A        |          S         | EX300T9  |*       | APHARM      |774466444604  | 00     |09202018| SR41706MB7| 55289030814| 21     |21  |0   |100   | 1    |112318 |
    
    