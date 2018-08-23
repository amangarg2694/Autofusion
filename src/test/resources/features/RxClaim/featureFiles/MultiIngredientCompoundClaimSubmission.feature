Feature: Submit a compound claim with multi ingredient
As a RxClaim User I want to submit a compound claim with multi ingredient
    
             
   Scenario Outline: Submit a compound claim with multi ingredient in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PreQual>","<PreID>","<UCW>","<compQualID_1>","<compProductID_1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<compProductID_2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
    Then Validate Claim Status is "P"
    
   
    Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | PreQual| PreID       | UCW |compQualID_1|compProductID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compProductID_2|compQuantity_2|compCost_2|compBasisOfCost_2|
    | 777777  | QET     |*ALL   | 2400101     | 165488397412  | 00     | 060116   | AUTOMEMBER03 | 68084009711|10      |10  |1    |1000  |01      |1821039694   |1000 |01          |38779008913    |1             |45        |00               |02          |08884430100    |2             |46        |01               |
    
        