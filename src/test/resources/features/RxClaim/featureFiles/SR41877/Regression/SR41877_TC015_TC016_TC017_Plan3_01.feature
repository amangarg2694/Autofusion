@Regression
Feature: Create New Plan with GPI List for Compound claim is accepted when Member PA compound set to Y
 As a RxClaim User I want to create Plan with GPI List 
      
              
Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option MIC "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I create the GPI list with "<GPIList>", "<GPIDecs>"
    And I Setup plan with GPI list "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    And I Setup plan "<PlanCode>" with GPI Compounds multiple ingredient option "<CMIPlan>"  
    
     # Update new Plancode, Plan Description, GPIList, GPIDesc  
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description       |PriceSchedule|PatientPaySchedule|GPIList|GPIDecs |GPISeq| GPIFromDate | GPIThruDate  | CMIPlan | 
    |PlanRtg13 |010110 |123139   |PlanRtg13 GPILST |EVUAREG      |EVUAREG           |RPIJ02 |RPIJ02  |20    |	010118  	  |123139        | L       |
    

Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to Y for Qty limt range(SN003374_SR41877_TC015_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" GPI list "<GPIList>" with status "<Status1>" ,"<Status2>","<PFromDate>","<PThruDate>","<Qtymin>","<Qtymax>"
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
  
   # Update PlanCode,GPIList as per above,Carrier ID, CarrierName,AccountID, AccountName, Group Id, GroupName, MEMBERId,MemberFirst and last name, PANumeer and filldate      
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| Qtymin |Qtymax |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |PlanRtg13|RPIJ02   | F       | F       |00002197590  |00002322730   |010101   |123139   | 5      |10     | RW41877C7 | RW41877C7   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A7  |SR41877A7   | SR41877G7 |SR41877G7  |010101     |123139     | SF41877M18 |SF41877M18 |SF41877M18  |01011988 |010101     |123139     |SR41877P15|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |20             |45        |00               |02         |30             |46        |01               |R          |F         |76        |Plan Limitations Exceeded |Y      |P           |f          | 
     

Scenario Outline: Verify Compound claim is accepted when Member PA compound set to Y for DS limt range(SN003374_SR41877_TC017_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu     
     And I update the product ID`s "<GPINo1>", "<GPINo2>" to the Plan "<PlanCode>" GPI list "<GPIList>" with "<DSmin>","<DSmax>" 
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
      #Take above data for Plancode,GPIList, CAG. New: Member Id, PA Number,Fill Date
     Examples: 
     |PlanCode  |GPIList  | GPINo1          |GPINo2         |ID1         | ID2        |PFromDate|PThruDate| DSmin  |DSmax  |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |PlanRtg13|RPIJ02   | 61354015100110  |23100030002020 |00002197590 |00002322730 |010101   |123139   | 5      |10     | RW41877C7 | RW41877C7   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A7  |SR41877A7   | SR41877G7 |SR41877G7  |010101     |123139     | SF41877M19 |RR41877M19 |RR41877M19  |01011988 |010101     |123139     |SR41877P16|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |20             |45        |00               |02         |30             |46        |01               |R          |F         |76        |Plan Limitations Exceeded |Y      |P           |f          | 
     
 
 Scenario Outline: Verify Compound claim is accepted when Member PA compound set to Y for Age limt range(SN003374_SR41877_TC016_Req_8.1) #Update MemberId, PAnumber
    
       
     Given I am on RxClaim PlanAdministrator Menu      
     And I update the product ID`s "<GPINo1>", "<GPINo2>" to the Plan "<PlanCode>" GPI list "<GPIList>" with age limits "<Agemin>","<Agemax>"
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for Claim "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     #Take above data for Plancode,GPIList, CAG. New: Member Id, PA Number,Fill Date 
     Examples: 
     |PlanCode  |GPIList  | GPINo1          |GPINo2         |ID1         | ID2        |PFromDate|PThruDate| Agemin  |Agemax  |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage              |MemComp|ClaimStatus2|DrugStatus2|
     |PlanRtg13|RPIJ02   | 61354015100110  |23100030002020 |00002197590 |00002322730 |010101   |123139   | 5       |10      | RW41877C7 | RW41877C7   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A7  |SR41877A7   | SR41877G7 |SR41877G7  |010101     |123139     | SF41877M21 |SF41877M21 |SF41877M21  |01011991 |010101     |123139     |SR41877P17|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |20            |45        |00               |02         |30             |46        |01               |R          |F         |76        |Plan Limitations Exceeded  |Y      |P           |f          | 
     