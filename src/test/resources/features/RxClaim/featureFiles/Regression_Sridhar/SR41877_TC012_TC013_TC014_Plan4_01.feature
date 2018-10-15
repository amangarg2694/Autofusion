Feature: Create New Plan with NDC List for Compound claim is accepted when Member PA compound set to Y
 As a RxClaim User I want to Validate Compound claim is accepted when Member PA compound set to Y for Qty,Age and DS 
      
              
Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option MIC "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I create the NDC list with "<NDCList>", "<NDCDecs>"
    And I setup a plan With NDC list "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>" 
    And I Setup plan "<PlanCode>" with Compounds multiple ingredient option "<CMIPlan>" 

      
    Examples: 
    |PlanCode   |FromDate|ThruDate |Description       |PriceSchedule|PatientPaySchedule|NDCList|NDCDecs |NDCSeq| NDCFromDate | NDCThruDate  | CMIPlan | 
    |Planpass14 |010110 |123139    |Planpass14 NDCLST |EVUAREG      |EVUAREG           |NDCL02 |NDCL02  |20    |	010118  	  |123139        | L       |
    

Scenario Outline: Verify Compound claim is accepted for NDC when Member PA compound set to Y for Qty limit range(SN003374_SR41877_TC012_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status "<Status1>" ,"<Status2>","<PFromDate>","<PThruDate>","<Qtymin>","<Qtymax>"
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| Qtymin |Qtymax |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |Planpass14|NDCL02   | F       | F       |88512606010  |88512705010   |010101   |123139   | 5      |10     | SR41877C8 | SR41877C8   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A8  |SR41877A8   | SR41877G8 |SR41877G8  |010101     |123139     | SR41877M22 |SR41877M22 |SR41877M22  |01011988 |010101     |123139     |SR41877P18|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091018   | 00000000000|30      |30  |0    | 100	|100  |01          |20             |45        |00               |02         |30             |46        |01               |R          |F         |76        |Plan Limitations Exceeded |Y      |P           |f          | 
     

Scenario Outline: Verify Compound claim is accepted when Member PA compound set to Y for DS limt range(SN003374_SR41877_TC013_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu     
     And I update the product ID`s "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with "<DSmin>","<DSmax>" 
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     Examples: 
     |PlanCode  |NDCList  | ID1         | ID2        |PFromDate|PThruDate| DSmin  |DSmax  |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |Planpass14|NDCL02   | 88512606010 |88512705010 |010101   |123139   | 5      |10     | SR41877C8 | SR41877C8   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A8  |SR41877A8   | SR41877G8 |SR41877G8  |010101     |123139     | SR41877M23 |SR41877M23 |SR41877M23  |01011988 |010101     |123139     |SR41877P19|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091018   | 00000000000|30      |30  |0    | 100	 |100  |01          |20             |45        |00               |02         |30             |46        |01               |R          |F         |76        |Plan Limitations Exceeded |Y      |P           |f          | 
     
 
 Scenario Outline: Verify Compound claim is accepted when Member PA compound set to Y for Age limt range(SN003374_SR41877_TC014_Req_8.1) #Update MemberId, PAnumber
    
       
     Given I am on RxClaim PlanAdministrator Menu      
     And I update the product ID`s "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with age limits "<Agemin>","<Agemax>"
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     Examples: 
     |PlanCode  |NDCList  | ID1         | ID2        |PFromDate|PThruDate| Agemin  |Agemax  |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |Planpass14|NDCL02   | 88512606010 |88512705010 |010101   |123139   | 5       |10      | SR41877C8 | SR41877C8   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A8  |SR41877A8   | SR41877G8 |SR41877G8  |010101     |123139     | SR41877M24 |SR41877M24 |SR41877M24  |01011991 |010101     |123139     |SR41877P20|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091018   | 00000000000|30      |30  |0    | 100	 |100  |01          |20            |45        |00               |02         |30            |46        |01               |R          |F         |76        |Plan Limitations Exceeded  |Y      |P           |f          | 
     