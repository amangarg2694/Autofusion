@Regression
Feature: Create New Plan with NDC List for TC001
 As a RxClaim User I want to create Plan with NDC List 
      
              
Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option MIC "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I create the GPI list with "<GPIList>", "<GPIDecs>"
    And I Setup plan with GPI list "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    And I Setup plan "<PlanCode>" with GPI Compounds multiple ingredient option "<CMIPlan>"  
      
     # Update new Plancode, Plan Description, NDCList, NDCDesc 
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description       |PriceSchedule|PatientPaySchedule|GPIList|GPIDecs|GPISeq| GPIFromDate | GPIThruDate  | CMIPlan | 
    |Regpvad12 |010110 |123139   |Regpvad12 GPILST |EVUAREG      |EVUAREG           |GPIC02 |GPIC02 |20    |	010118  	  |123139       | L       |
    

Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to Y(SN003374_SR41877_TC002_Req_8.1)
    
       
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
      # Update PlanCode, NDCList as per above,Carrier ID, CarrierName,AccountID, AccountName, Group Id, GroupName, MEMBERId,MemberFirst and last name, PANumeer and filldate  
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|
     |Regpvad12|GPIC02   | R       | F       |00002197590  |00002322730   |010101   |123139   | SR41P7BC | SR41P7BC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A5  |SR41877A5   | SR41877G5 |SR41877G5  |010101     |123139     | SR1877JM11 |SR1877JM11 |SR1877JM11 |01011988 |010101     |123139     |SR41877P7|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          | 
     



Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to Y for Plan CMI is T(SN003374_SR41877_TC008_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient GPI option "<CMIPlan>"         
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"

        #Take above data for Plancode, NDCList, CAG.  New: Member Id, PA Number, Filldate   
 
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Regpvad12|GPIC02   | R       | F       |00002197590  |00002322730   |010101   |123139   | SR41P7BC | SR41P7BC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A5  |SR41877A5   | SR41877G5 |SR41877G5  |010101     |123139     | SR1877JM12 |SR1877JM12 |SR1877JM12 |01011988 |010101     |123139     |SR41877P9|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          |T      | 
     


Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to Y for Plan CMI is Y(SN003374_SR41877_TC010_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient GPI option "<CMIPlan>"         
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
    #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number, Fill date
     
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Regpvad12|GPIC02   | R       | F       |00002197590  |00002322730   |010101   |123139   | SR41P7BC | SR41P7BC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A5  |SR41877A5   | SR41877G5 |SR41877G5  |010101     |123139     | SR1877JM14 |SR1877JM14 |SR1877JM14 |01011988 |010101     |123139     |SR41877P11|4   |00000000000000 |010101|123139 |O    |AC    |N              | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          |Y      | 
     
   
Scenario Outline: Verify Compound claim is accepted for GPI Drug Status R when Member PA compound set to N and Y for Plan CMI is N(SN003374_SR41877_TC006_Req_8.1) #Update Member ID and PAnumber
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient GPI option "<CMIPlan>"         
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for the claim "<ClaimStatus>","<DrugStatus>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number,Fill Date 
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Regpvad12|GPIC02   | R       | F       |00002197590  |00002322730   |010101   |123139   | SR41P7BC | SR41P7BC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A5  |SR41877A5   | SR41877G5 |SR41877G5  |010101     |123139     | SR1877JM29 |SR1877JM29 |SR1877JM29 |01011988 |010101     |123139     |SR41877P25|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 121818   | 00000000000|30      |30  |0    | 100	 |100 |01          |1             |45        |00               |02          |2             |46        |01               |P          |F         |Y      |P           |f          |N      | 
   
   
     
Scenario Outline: Verify Compound claim is paid for GPI Drug Status R when Member PA compound set to N for Plan CMI is L(SN003374_SR41877_TC003_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient GPI option "<CMIPlan>"
     And I check the GPI drug status in the plan "<PlanCode>"       
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"  
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add GPI drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
    #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number,Fill Date  
     Examples: 
     |PlanCode  |GPIList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Regpvad12|GPIC02   | R       | F       |00002197590  |00002322730   |010101   |123139   | SR41P7BC | SR41P7BC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41877A5  |SR41877A5   | SR41877G5 |SR41877G5  |010101     |123139     | SR1877JM37 |SR1877JM37 |SR1877JM37 |01011988 |010101     |123139     |SR41877P33|4   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 091718   | 00000000000|30      |30  |0    | 100	|100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |N      |P           |f          |L      | 
     
          