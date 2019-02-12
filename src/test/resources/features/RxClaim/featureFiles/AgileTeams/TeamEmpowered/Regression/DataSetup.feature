Feature: Data setup required to run before running Regression suite
As a RxClaim User I want to run the Data Setup feature file
    
 
#BasicPlan
@BasicPlan
 		Scenario Outline: Create a new Plan with NDC List in RxClaim    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
   	
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|NDCList|NDCSeq| NDCFromDate | NDCThruDate  | 
   |TESTP3690|010110|123139|AUTO PLAN FOR 3690|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
 	 |TESTP02369|010110|123139|AUTO PLAN FOR 3690|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
 
 #Commerical CAG            
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 		| AUTOC3690 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTO3690A |Test Account | AUTO3690G|Test Group |010101     |123139     |TESTP02369| 
 
 #Part D setup 
  @PartDSetup
  Scenario Outline: Create a new PartD Setup in RxClaim 
   
   	Given I am on RxClaim PlanAdministrator Menu
   	When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   	Given I am on RxClaim PlanAdministrator Menu
    When I Set PBP "<CarrierID>","<Contract>","<PBP>","<BenefitYear>","<MedicareType>","<SubmitterID>"
   	And I Set PartD Master Profile Detail "<CarrierID>","<AccountID>","<GroupID>","<PlanCode>","<FromDate>","<MasterProfileFromDate>","<MasterProfileThruDate>","<DrugCoverageStatusSchedule>","<Contract>","<PBP>"
   	Then Validate PartD Master Profile created with details "<CarrierID>" ,"<AccountID>","<GroupID>","<PlanCode>"
    
    Examples:
   |PlanCode  |FromDate|ThruDate| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID    |GroupName  |GroupFromDt|GroupThruDt|PlanCode  |Contract|PBP  |BenefitYear|MedicareType|SubmitterID|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule| 
   |AUTOPARTD1|010119  |123119  |AUTPARTDC  | AUTPARTDC   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTPARTDA |AUTPARTDA    | AUTPARTDG  |AUTPARTDG  |010101     |123139     |AUTOPARTD1|R0001   |222  |2019       |S           |TEST       |010119       |123119       |       |            |             |                  |                |010119               |123119               |JBLEDCCS1                 |
   
   @CreateDPA 
  Scenario Outline: Create DPA 
   
   	Given I am on RxClaim PlanAdministrator Menu   	
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "4" to navigate to "RxClaim Dynamic Prior authorization"
    And I select Option "1" to navigate to "Dynamic Prior authorization"
    And I create Dynamic Prior Authorization "<Carrier>","<Submitted PA MC Code>","<Submitted PA>","<Description>","<Nbr Fills>","<Usage Type>","<Apply MIC>","<Type>","<From Basis>","<Thru Basis>","<Reason Code>","<Agent>","<Utilisation>","<WildCard>","<Write PA>","<Ignore Drug Sts>"
    And I press "F7" Key 
    And I press "PageDown" Key  
    And I set "DURFlag" to "<DUR Flag>"
    And I press "Enter" Key
    And I press "F8" Key 
    And I set "HighDoseFlag" to "<High Dose Flag>"
    And I press "Enter" Key
    And I press "PageDown" Key 
    And I set "OverrideFlag" to "<Override Flag>"
    And I set "MEDLIMITOverride" to "<Medlimit Override>"
    And I set "NTTPerFillDS" to "<NTT Per Fill DS>"
    And I press "Enter" Key
     
    Examples:
   |Submitted PA |Carrier   |Account   | Group    |Submitted PA MC Code |Description    |Nbr Fills|Usage Type |Apply MIC  |Type|From Basis|Thru Basis|Reason Code  |Agent|Utilisation |WildCard|Write PA|Ignore Drug Sts|PA NDC List|PA GPI List   |DUR Flag|High Dose Flag |Override Flag |Medlimit Override |NTT Per Fill DS |
   #|36909280001  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |Y       |Y              |Y             |                  |                |         
   #|36909280002  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |Y              |Y             |                  |                |
   #|36909220001  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |Y       |               |Y             |                  |                |
   #|36909220002  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |               |Y             |                  |                |  
   #|36909220003  |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |AA           |a    |Y           |0       |Y       |N              |           |              |T       |               |O             |500               |                |  
   |DPTEST123    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |Y       |               |Y             |                  |                |
   |DPTEST124    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |Y             |                  |                |
   |DPTEST125    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |                |
   |DPTEST126    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |12              |
   |DPTEST127    |AUTOC3690	|AUTO3690A |AUTO3690G |1                    |DPA Automation |         |1          |N          |G   |D         |D         |OJ           |T    |Y           |0       |Y       |N              |           |              |        |               |O             |500               |                |
     
    @CreateDPAList
    Scenario Outline: Create DPA List   
    Given I am on RxClaim PlanAdministrator Menu
    When I create Dynamic Prior Authorization List "<Carrier>","<List>","<List Name>"
      
   	Examples:
   |Carrier   |List       |List Name     |
   |AUTOC3690	|DPA928RJ1  |DUR Automation|
   |AUTOC3690	|DPA922RJ1  |DUR Automation|
   |AUTOC3690	|DPA928     |DUR Automation|
   
   @CreateDPAProfile
    Scenario Outline: Create DPA Profile
    Given I am on RxClaim PlanAdministrator Menu
    When I create Dynamic Prior Authorization Profile "<Carrier>","<Account>","<Group>","<From Date>","<Thru Date>","<Submitted PA Flag>","<Provider>","<Prescriber>","<Prescription>","<Member>","<Max List Fills>" 
    
    Examples:
   |Carrier   |Account   | Group    |From Date |Thru Date |Submitted PA Flag |Provider |Prescriber |Prescription |Member |Max List Fills|
   |AUTOC3690	|AUTO3690A |AUTO3690G |010101    |123139    |N                 |N        |N          |N            |N      |0             |
   
    
    @AddListToDPA
    Scenario Outline: ADD List to DPA
    Given I am on RxClaim PlanAdministrator Menu
    When I add List to Dynamic Prior Authorization "<Carrier>","<Submitted PA MC Code>","<Submitted PA>","<List>","<From Date>","<Thru Date>" 
    
    Examples:
   |Carrier   |Submitted PA MC Code|Submitted PA|List      |From Date |Thru Date |
   |AUTOC3690	|1                   |36909280001 |DPA928RJ1 |010101    |123139    | 
   |AUTOC3690	|1                   |36909280002 |DPA928RJ1 |010101    |123139    |
   |AUTOC3690	|1                   |36909220001 |DPA922RJ1 |010101    |123139    |
   |AUTOC3690	|1                   |36909220002 |DPA922RJ1 |010101    |123139    |
   |AUTOC3690	|1                   |36909220003 |DPA922RJ1 |010101    |123139    |
   |AUTOC3690	|1                   |DPTEST123   |DPA928    |010101    |123139    |
   |AUTOC3690	|1                   |DPTEST124   |DPA928    |010101    |123139    | 
   |AUTOC3690	|1                   |DPTEST125   |DPA928    |010101    |123139    | 
   |AUTOC3690	|1                   |DPTEST126   |DPA928    |010101    |123139    | 
   |AUTOC3690	|1                   |DPTEST127   |DPA928    |010101    |123139    |     
   
   @AddDPAListToPlan
    Scenario Outline: ADD List to DPA
    Given I am on RxClaim PlanAdministrator Menu
    When I add DPA List to Plan "<PlanCode>","<Carrier>","<List>"
    
    Examples:
   |PlanCode   |Carrier   |List      |
   |TESTP02369 |AUTOC3690	|DPA928RJ1 |
   |TESTP02369 |AUTOC3690	|DPA922RJ1 |
   |TESTP02369 |AUTOC3690	|DPA928    |
         
   