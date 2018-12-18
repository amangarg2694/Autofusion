Feature: Create New Plan with NDC List for TC021
 As a RxClaim User I want to Verify Compound claim is accepted for GPI Drugs  when Member PA compound set to Y 
      
              
Scenario Outline: Create a new Plan with GPI List in RxClaim 
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I create the GPI list with "<GPIList>", "<GPIDecs>"
    And I Setup plan with GPI list "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    And I Setup plan "<PlanCode>" with GPI Compounds multiple ingredient option "<CMIPlan>"  
      
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description       |PriceSchedule|PatientPaySchedule|GPIList|GPIDecs |GPISeq| GPIFromDate | GPIThruDate  | CMIPlan | 
    |Planpss15 |010110 |123139   |Planpss15 GPILST |EVUAREG      |EVUAREG           |GPIM03 |GPIM03  |20    |	010118  	  |123139        | M       |
    

Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to Y for CMI Plan M(SN003374_SR41877_TC021_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" GPI list "<GPIList>" with status "<Status1>" ,"<Status2>","<PFromDate>","<PThruDate>"
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|
     |Planpss15|GPIM03   | R       | F       |00002197590  |00002322730   |010101   |123139   | SX41877C9 | SX41877C9   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A9  |SR41877A9   | SR41877G9 |SR41877G9  |010101     |123139     | SX41877M25 |SX41877M25 |SX41877M25 |01011988 |010101     |123139     |SR41877P21|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 120618   | 00000000000|30      |30  |0    | 100	 |100 |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          | 
     
     