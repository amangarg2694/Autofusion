Feature: Part D Approved total DFTI not equal to submitted DFTI when OON differential is applied
As a RxClaim User I want to check claim is paid and validate the DFTI

  Scenario Outline: Verify that the logic for Additional Patient Pay Schedule Basis ‘C’ in DMR processing for Plan type A- OON differential applied, Vaccine fee applied, Dispensing Fee NOT calculated, Submitted DFT < Calculated DFT and Drug Spend Total is correct in TrOOP/Drug Spend Accumulation Phase
   	Given I am on RxClaim PlanAdministrator Menu
   	When submitting DMR claim with "<RxNbr>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DispQty>","<DS>","<PSC>","<Due>","<UCW>","<Cost>","<Inc>"
   	And Validating the price information screen
   	And I press "F3" Key
   	Then Validating the Drug spend total in Accum phase screen
   	
Examples:
| MemberID   | First Name | Last Name |RxNbr|ProductID|DispQty|DS|PSC|Due|UCW|Cost|Inc|
| SR41720A5 |  AUTOMEM    | AUTOMEM   |900019941003|49281040015|1|1|0|85|85|80|5|