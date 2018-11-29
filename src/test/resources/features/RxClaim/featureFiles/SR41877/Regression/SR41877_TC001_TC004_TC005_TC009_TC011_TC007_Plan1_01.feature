@Regression
Feature: Create New Plan with NDC List for TC001
 As a RxClaim User I want to create Plan with NDC List 
      
   #update PlanCode,NDCList           
Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I create the NDC list with "<NDCList>", "<NDCDecs>"
    And I setup a plan With NDC list "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>" 
    And I Setup plan "<PlanCode>" with Compounds multiple ingredient option "<CMIPlan>"
     
     
     # Update new Plancode, Plan Description, NDCList, NDCDesc 
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description          |PriceSchedule|PatientPaySchedule|NDCList|NDCDecs|NDCSeq| NDCFromDate | NDCThruDate  | CMIPlan | 
    |Plnregr32|010110  |123139   |Plnregr32 NDCGPILST |EVUAREG      |EVUAREG           |RDCL42 |RDCL42 |10    |	010118  	  |123139        | L       |
    

Scenario Outline: Verify Compound claim is rejected with reason code 70 when Plan edit 9=Compounds set to 'N'and Set Compound Drig Status to R in NDC & GPI level(SN003374_SR41877_TC001_Req_8.1)
    
     Given I am on RxClaim PlanAdministrator Menu 
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status "<Status1>","<Status2>","<PFromDate>","<PThruDate>" 
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"  
     
    # Update PlanCode, NDCList as per above,Carrier ID, CarrierName,AccountID, AccountName, Group Id, GroupName, MEMBERId,MemberFirst and last name, PANumeer and filldate 
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage |
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M51 |RS41877M41 |RS41877M41 |01011988 |010101     |123139     |SR41877P35|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered | 
     
Scenario Outline: Verify Compound claim is accepted for NDC Drug Status R when Member PA compound set to L(SN003374_SR41877_TC004_Req_8.1) #Use data from TC001 and Update the data for MemberId, MemberPA ID, 
    
     Given I am on RxClaim PlanAdministrator Menu    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
          #Take above data for Plancode, NDCList, CAG.  New: Member Id, PA Number, Filldate
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate |PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M52 |RS41877M42 |RS41877M42 |01011988 |010101     |123139      |SR41877P36|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100	|100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          | 
 
     

Scenario Outline: Verify Compound claim is paid for NDC Drug Status R when Member PA compound set to N for Plan CMI is L(SN003374_SR41877_TC005_Req_8.1)
    
       
     Given I am on RxClaim PlanAdministrator Menu     
     And I check the drug status in the plan "<PlanCode>"       
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"  
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
          #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number, Fill date
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate |PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M58 |RS41877M48 |RS41877M48 |01011988 |010101     |123139      |SR41877P43|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100  |100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |N      |P           |f          | 


     
Scenario Outline: Verify Compound claim is accepted for NDC Drug Status R when Member PA compound set to Y for Plan CMI T(SN003374_SR41877_TC009_Req_8.1) #Use data from TC001 and Update the data for MemberId, MemberPA ID,Filldate 
    
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient NDC option "<CMIPlan>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number,Fill Date
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M54 |RS41877M44 |RS41877M44 |01011988 |010101     |123139     |SR41877P38|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100	|100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          |T      | 
 
 
 Scenario Outline: Verify Compound claim is accepted for NDC Drug Status R when Member PA compound set to Y for Plan CMI Y(SN003374_SR41877_TC011_Req_8.1) #Use data from TC001 and Update the data for MemberId, MemberPA ID,Filldate 
    
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient NDC option "<CMIPlan>"    
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the Claim status "<ClaimStatus>","<DrugStatus>","<RejectCode>","<RejectMessage>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number,Fill Date
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|RejectCode|RejectMessage             |MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M55 |RS41877M45 |RS41877M45 |01011988 |010101     |123139     |SR41877P39|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100	|100  |01          |1             |45        |00               |02          |2             |46        |01               |R          |R         |70        |Prod/Service Not Covered  |Y      |P           |f          |Y      | 
  
     
Scenario Outline: Verify Compound claim is accepted for NDC Drug Status R when Member PA compound set to N and Y for Plan CMI is N (SN003374_SR41877_TC007_Req_8.1) #Update Member ID and PAnumber
    
       
     Given I am on RxClaim PlanAdministrator Menu
     And I update plan "<PlanCode>" with Compounds multiple ingredient NDC option "<CMIPlan>"
     And I check the NDC drug status in the plan "<PlanCode>"         
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I create MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a Multi Ingredient compound claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     		Then I validate the status for the claim "<ClaimStatus>","<DrugStatus>"
     And I set MemberPrioAuth "<MemberID>","<CarrierID>","<AccountID>","<GroupID>" to allow compound "<MemComp>" and I will add drugs "<ID1>","<ID2>" at member PA level
     And I submit a Multi Ingredient compound claim two with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>","<compQualID_1>","<ID1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>","<compQualID_2>","<ID2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
     
     Then I validate the Claim status "<ClaimStatus2>","<DrugStatus2>"
     
     #Take above data for Plancode, NDCList, CAG. New: Member Id, PA Number, Filldate
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |ID1          |ID2           |PFromDate|PThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName |LastName    |DOB      |MemFromDate|MemThruDate|PANumber  |Type|NDCGPIList     |From  |Thru   |Agent|Reason|IgnoreDrugStatus| BIN     | ProcCtrl | Group | PharmacyID  | RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW |compQualID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compQuantity_2|compCost_2|compBasisOfCost_2|ClaimStatus|DrugStatus|MemComp|ClaimStatus2|DrugStatus2|CMIPlan|
     |Plnregr32|RDCL42   | R       | F       |88512606010  |88512705010   |010101   |123139   | SR4187C14 | SR4187C14   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |S41877A13  |S41877A13   | S41877G13 |S41877G13  |010101     |123139     | RS41877M56 |RS41877M46|RS41877M46  |01011988 |010101     |123139     |SR41877P41|3   |00000000000000 |010101|123139 |O    |AC    |N               | 777777  | ASHE     |*      | APHARM      | 165488397000  | 00     | 112818   | 00000000000|30      |30  |0    | 100	 |100  |01          |1             |45        |00               |02          |2             |46        |01              |P          |F         |Y      |P           |f          |N      | 
         
              