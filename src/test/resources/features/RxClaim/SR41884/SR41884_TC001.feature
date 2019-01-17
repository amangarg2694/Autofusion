Feature: User wants to enter a claim with product doesnot have a unit cost assosiated with it


Scenario Outline: Verify that the product with no unit cost is setup in the system

 Given I am on RxClaim PlanAdministrator Menu
 When I select Option "2" to navigate to "RxClaim Product Information Maintenance"
 And  I select Option "1" to navigate to "Active Products by Name"
 And I press "F6" Key
 And I enter "<ProductID>","<Pty>" in Add/Edit Product Screen
 And I enter "<mfg>","<name>","<Label Name>","<Strength>","<Multi-Source>","<Size>","<UOM>" in Product Detail screen
 And I enter "<source>","<type>","<From Date>","<Thru Date>","   " on Product Cost Detail screen
 
 
 
 Examples:
 |ProductID  |Pty|mfg  |name       |Label Name |Strength|Multi-Source|Size|UOM|source  |type|From Date|Thru Date|Unit Cost|	
 |00000041444|NDC|00002|RUSHAUTO001|RUSHAUTO001|25      |N           |100 |EA |MEDISPAN|AWP |010101   |123139   |  BLANK  |

Scenario Outline: Compound claim submitted with F6 option should be rejected with 85 with active product
 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
And I select Option "1" to navigate to "Transaction"
And I press "F6" Key
And I enter "<BIN>","<Proc_Ctrl>","<Grp>","<Pharmacy>","<Rx_Nbr>","<Member_ID>" on Add Transaction screen
And I enter "<Rf>","<ProdID>","<Disp_Qty>","<DS>","<PSC>","<Cmpnd>","<Cost>","<Due>","<Prdt1>","<Prdt2>","<Prdt3>" on Transaction Submission and compound submission screen
Then I validate claim rejected with rejected code "<Rej>","<Msg>"


Examples:
|BIN  |Proc_Ctrl|Grp|Pharmacy|Rx_Nbr      |Member_ID|Rf|ProdID     |Disp_Qty|DS|PSC|Cmpnd|Cost|Due|Rej|Msg                                 |Prdt1       |Prdt2     |Prdt3      |	
|777777|ASHE     |*  |APHARM  |444456456334|1953M1   |00|00000000000|10      |10|0  |2    |20  |20 |85 |PRICING ERROR-Costs are unavailable|00591571501|00777310402|00000041444|  
|777777|ASHE     |*  |APHARM  |444456456334|1953M1   |00|00000000000|10      |10|0  |2    |20  |20 |85 |PRICING ERROR-Costs are unavailable|00591571501|00777310402|00000000000|                                       
|777777|ASHE     |*  |APHARM  |444456456334|1953M1   |00|00000000000|10      |10|0  |2    |20  |20 |85 |PRICING ERROR-Costs are unavailable|00591571501|00777310402|             |
|777777|ASHE     |*  |APHARM  |444456456334|1953M1   |00|00000000000|10      |10|0  |2    |20  |20 |85 |PRICING ERROR-Costs are unavailable|00000041444|00000000000|           |  

      
Scenario Outline: Submit a claim in RxClaim
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
And I select Option "1" to navigate to "Transaction"
And I press "F6" Key
And I enter "<BIN>","<Proc_Ctrl>","<Grp>","<Pharmacy>","<Rx_Nbr>","<Member_ID>" on Add Transaction screen
And I enter "<Rf>","<ProdID>","<Disp_Qty>","<DS>","<PSC>","<Cmpnd>","<Cost>","<Due>" on Transaction Submission screen



Examples:
|BIN  |Proc_Ctrl |Grp|Pharmacy|Rx_Nbr      |Member_ID|Rf|ProdID     |Disp_Qty|DS|PSC|Cmpnd|Cost|Due|                               	
|777777|ASHE     |*  |APHARM  |444456456114|1953M1   |00|00000041444|10      |10|0  |0    |20  |20 |
    













