Feature: User wants to enter a claim with product doesnot have a unit cost assosiated with it


Scenario Outline: Compound claim submitted with F18 option should be rejected with 85 with active product
 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
And I select Option "1" to navigate to "Transaction"
And I press "F6" Key
And I enter "<BIN>","<Proc_Ctrl>","<Grp>","<Pharmacy>","<Rx_Nbr>","<Member_ID>" on Add Transaction screen
And I enter "<Rf>","<ProdID>","<Disp_Qty>","<DS>","<PSC>","<Cmpnd>","<Cost>","<Due>","<Prdt1>","<Prdt2>","<Prdt3>" on Transaction Submission and compound submission screen using F18
Then I validate claim rejected with rejected code "<Rej>","<Msg>"


Examples:
 |BIN   |Proc_Ctrl|Grp|Pharmacy|Rx_Nbr      |Member_ID|Rf|ProdID     |Disp_Qty|DS|PSC|Cmpnd|Cost|Due|Rej|Msg                                |Prdt1       |Prdt2     |Prdt3      |	
 |777777|ASHE     |*  |APHARM  |444444446224|1953M1   |00|00000000000|10      |10|0  |2    |20  |20 |85 |PRICING ERROR-Costs are unavailable|00591571501|00777310402|00000041444|  