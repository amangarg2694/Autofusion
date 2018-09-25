Feature: Create New Plan with NDC List for TC001
 As a RxClaim User I want to create Plan with NDC List 
      
              
Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I add plan With NDC list "<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>" 
    And I Setup plan "<PlanCode>" with Compounds multiple ingredient option "<CMIPlan>"  
      
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description          |PriceSchedule|PatientPaySchedule|NDCList   |NDCSeq| NDCFromDate | NDCThruDate  | CMIPlan | 
    |Planpass08|010110  |123139   |Planpass08 NDCGPILST |EVUAREG      |EVUAREG           |NDCL01	  |10    |	010118  	 |123139        | L       |
    

Scenario Outline: Verify Compound claim is rejected with reason code 70 when Plan edit 9=Compounds set to 'N'and Set Compound Drig Status to R in NDC & GPI level(SN003374_SR41877_TC001_Req_8.1)
    
     Given I am on RxClaim PlanAdministrator Menu 
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status "<Status1>","<Status2>","<PFromDate>","<PThruDate>" 
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"  
     
     
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID  |FirstName |LastName  |DOB      |MemFromDate|MemThruDate|PANumber |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage |
     |Planpass08|NDCL01   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR41877C3 | SR41877C3   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A3  |SR41877A3   | SR41877G3 |SR41877G3  |010101     |123139     | SR41877M4 |SR41877M4 |SR41877M4 |01011988 |010101     |123139     |SR41877P1|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 090618   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered | 
     
     