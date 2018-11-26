Feature: Confirm Additional message format for NDC Period-to-Date
As a RxClaim User I want to verify Confirm Additional message format for NDC Period-to-Date
    
     #Before running this script should run the script for Partd Setup and PriorSetup2
    @TC01         
    Scenario Outline: Verify accuracy of quantity and date in new message field, NDC Period to Date using D for Day Value and test when claim in history has fallen off
    
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
   |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |NDCList|Seq|NDCFrmDate|NDCThruDate|PlanDefaultList|SupplementRejectCode| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |
   |777777|SRE10T3|  *  |010191 |123139  |SR41706E5|SR41706E5|EX00T3 | 2 | 010118   |  123139   |      A        |          S         | SRE10T3  |*       | APHARM      |733333333301  | 00     |09202018| SR41706MM5| 55289030814| 21     |18  |00   |100   | 1    |
   
   @TC02
   Scenario Outline: Verify accuracy of quantity and date in new message field, NDC Period to Date using D for Day Value and test when claim in history has fallen off
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the date with "<SysDate>"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"
    
    
    
    Examples:
    |BIN   |PCN    |Group|FrmDate|ThruDate|CarrierID|PlanCode |NDCList|Seq|NDCFrmDate|NDCThruDate|PlanDefaultList|SupplementRejectCode| ProcCtrl | Group  | PharmacyID  |RxNo          | Refill |fillDate| MemberID  | ProductID  | DspQty | DS | PSC | Cost | qual |SysDate|
    |777777|SRE10T3|  *  |010191 |123139  |SR41706E5|SR41706E5|EX00T3 | 2 | 010118   |  123139   |      A        |          S         | SRE10T3  |*       | APHARM      |733333333302  | 00     |09202018| SR41706MM5| 55289030814| 21     |25  |00   |100   | 1   |101518|
    |777777|SRE10T3|  *  |010191 |123139  |SR41706E5|SR41706E5|EX00T3 | 2 | 010118   |  123139   |      A        |          S         | SRE10T3  |*       | APHARM      |733333333303  | 00     |09202018| SR41706MM5| 55289030814| 21     |22  |00   |100   | 1   |110718|
    |777777|SRE10T3|  *  |010191 |123139  |SR41706E5|SR41706E5|EX00T3 | 2 | 010118   |  123139   |      A        |          S         | SRE10T3  |*       | APHARM      |733333333304  | 00     |09202018| SR41706MM5| 55289030814| 21     |22  |00   |100   | 1   |112918|
   
    