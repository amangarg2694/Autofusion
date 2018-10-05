Feature: Part D Approved total DFTI not equal to submitted DFTI when OON differential is applied
As a RxClaim User I want to check claim is paid and validate the DFTI

  Scenario Outline: Verify the logic is updated for Additional Patient Pay Schedule Basis ‘C’ in DMR processing
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "2" to navigate to "RxClaim Patient Pay Maintenance"
   	And I select Option "2" to navigate to "Patient Pay Table"
   	Then creating patient pay table with "<PATname>","<DueFlag>","<Code>","<BrandAmt>","<BrandCopay>","<GenericAmt>","<GenericCopay>"
   	And I press "F12" Key
   	And I select Option "1" to navigate to "Patient Pay Schedule"
   	Then additional patient pay is added to the patient pay schedule with "<PATschedule>","<Sequence>","<PATname>"
   	And I press "F12" Key
   	When submitting DMR claim with "<RxNbr>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DispQty>","<DS>","<PSC>","<Due>","<UCW>","<Cost>","<Inc>"
   	And Validating the price information screen
 Examples:
 |PATname|DueFlag|Code|BrandAmt|BrandCopay|GenericAmt|GenericCopay|PATschedule|Sequence| MemberID   | First Name | Last Name |RxNbr|ProductID|DispQty|DS|PSC|Due|UCW|Cost|Inc|
 |41720PAT|N|L|40|CT30DS|40|CT30DS|SR41720P12|1| SR41720A5 |  AUTOMEM    | AUTOMEM   |900019961000|49281040015|1|1|0|200|200|200|45|