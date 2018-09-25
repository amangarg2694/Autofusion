Feature: Create New Plan with NDC List for Compound claim is accepted when Member PA compound set to Y for CMI Plan M
 As a RxClaim User I want to Validate Compound claim is accepted when Member PA compound set to Y 
      
              
#Scenario Outline: Create a new Plan with NDC List in RxClaim  
      
    #Given I am on RxClaim PlanAdministrator Menu  
    #When I create plan with member eligibility pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    #And I create the NDC list with "<NDCList>", "<NDCDecs>"
    #And I setup a plan With NDC list "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>" 
    #And I Setup plan "<PlanCode>" with Compounds multiple ingredient option "<CMIPlan>" 

      
    #Examples: 
    #|PlanCode   |FromDate|ThruDate |Description       |PriceSchedule|PatientPaySchedule|NDCList|NDCDecs |NDCSeq| NDCFromDate | NDCThruDate  | CMIPlan | 
    #|Planpass16 |010110 |123139    |Planpass16 NDCLST |EVUAREG      |EVUAREG           |NDCL03 |NDCL03  |20    |	010118  	 |123139        | M       |
    

#Scenario Outline: Verify Compound claim is accepted for NDC when Member PA compound set to Y for Drug Status(SN003374_SR41877_TC018_Req_8.1)
    
       
     #Given I am on RxClaim PlanAdministrator Menu
     #And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status "<Status1>","<Status2>","<PFromDate>","<PThruDate>"
     #And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"    
     #And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     #And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     #And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		#Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     #And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     #And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     #Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     #Examples: 
     #|PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     #|Planpass16|NDCL03   | R       | F       |88512606010  |88512705010   |010101   |123139   | S41877C11  | S41877C11   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A11  |S41877A11   | S41877G11 |S41877G11  |010101     |123139     | SR41877M26 |SR41877M26 |SR41877M26  |01011988 |010101     |123139     |SR41877P22|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091118   | 00000000000|30      |30  |0    | 100	|100  |01          |20            |45        |00               |02         |30             |46        |01               |R          |R         |70        |Prod/Service Not Covered   |Y      |P           |f          | 
 
     
Scenario Outline: Verify Compound claim is accepted for NDC with added messages before and after when Member PA compound set to Y for plan CMI M(SN003374_SR41877_TC020_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     #And I update product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status and messages "<Status1>" ,"<Status2>","<PFromDate>","<PThruDate>","<msg1>","<msg2>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for the claim "<ClaimStatus>","<DrugStatus>" and message "<ID1msg>" and "<ID2msg>"should appear
     		
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>" and messages should not appear
     
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| msg1 |msg2  |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|MemComp|ClaimStatus2|DrugStatus2|ID1msg               |ID2msg                                 |
     |Planpass16|NDCL03   | F       | F       |88512606010  |88512705010   |010301   |123139   | SLOI |SLOI2 | S41877C11 | S41877C11   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A11  |S41877A11   | S41877G11 |S41877G11  |010101     |123139     | SR41877M36 |SR41877M36 |SR41877M36  |01011988 |010101     |123139     |SR41877P32|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091418   | 00000000000|30      |30  |0    | 100	 |100  |01          |20             |45        |00               |02         |30             |46        |01               |P          |F         |Y      |P           |f         |Have more proteins!!!|Drink a cup of water every 17.2 seconds| 
     


