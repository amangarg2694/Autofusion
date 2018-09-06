Feature: Create New Plan with NDC and GPI List for TC001
 As a RxClaim User I want to create Plan with NDC List 
      
               
    Scenario Outline: Create a new Plan with NDC GPI List in RxClaim  
      
    Given I am on RxClaim PlanAdministrator Menu  
    When I create plan with member eligibility pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>" 
    And I add plan With NDC list "<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>" 
    And I Setup plan with GPI list "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>" 
    And I Setup plan "<PlanCode>" with Compounds multiple ingredient option "<CMIPlan>"  
      
    Examples: 
    |PlanCode  |FromDate|ThruDate |Description           |PriceSchedule|PatientPaySchedule|NDCList  |NDCSeq| NDCFromDate | NDCThruDate  |GPIList|GPISeq| GPIFromDate | GPIThruDate| CMIPlan | 
    |Planpass07|010110  |123139   |Planpass07 NDCGPI LST |EVUAREG      |EVUAREG           |NDCL01	  |10    |	010118  	 |123139        |GPIL01 |20    |	010118  	  |123139     | L       |
    
    
    
    Scenario Outline: Verify Compound claim is rejected with reason code 70 when Plan edit 9=Compounds set to 'N'and Set Compound Drig Status to R in NDC & GPI level(SN003374_SR41877_TC001_Req_8.1)
    
     Given I am on RxClaim PlanAdministrator Menu 
     And I add product IDs "<ID1>", "<ID2>" to the Plan "<PlanCode>" NDC list "<NDCList>" with status "<Status1>","<Status2>","<PFromDate>","<PThruDate>" 
     And I add product IDs "<ID3>", "<ID4>" to the Plan "<PlanCode>" GPI list "<GPIList>" with status "<Status1>" ,"<Status2>","<PFromDate>","<PThruDate>"   
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
     
     
     
     Examples: 
     |PlanCode  |NDCList  | Status1 | Status2 |GPIList |ID1          |ID2           |ID3           |ID4           |PFromDate|PThruDate|
     |Planpass07|NDCL01   | R       | F       |GPIL01  |88512606010  |88512705010   |00002197590   |00002322730   |010101   |123139   |
     
     