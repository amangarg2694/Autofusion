Feature: Submit a compound claim with single ingredient
As a RxClaim User I want to submit a compound claim 
    
             
   Scenario Outline: Submit a compound claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>","<compQualID>","<compProductID>","<compQuantity>","<compCost>","<compBasisOfCost>"
    Then Validate Claim Status is "P"
    
    
   
    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID     | UCW |compQualID|compProductID|compQuantity|compCost|compBasisOfCost|
	  | 777777  | QET     |	*ALL  | 2400101     | 165488397407  | 00     | 060116   | AUTOMEMBER03 | 68084009711|10      |10  |1    |1000  |01      |1821039694 |1000 |01        |38779008913  |1           |45      |00             |
    
        