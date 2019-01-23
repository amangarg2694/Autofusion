Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Rejected Transaction Detail Report File


Scenario Outline: User should able to Validate the file -    
Given I am on RxClaim PlanAdministrator Menu
When I create FIR Transaction with "<BIN>","<Procctrl>","<Group>","<TransacID>","<CardholderID>","<AccYear>","<ContractID>","<PBP>","<TroopJ>","<Drugspendj>"







Examples:
| BIN   | Procctrl|Group|TransacID|CardholderID|AccYear|ContractID|PBP|AccMonth|TroopJ|Drugspendj|
| 777777| ASHE    |*    |AB123    |MEM5024243   |2018  |A9201     |921|12      |20    |100       |








