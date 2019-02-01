Feature: Data setup required to run before running Regression suite
As a RxClaim User I want to run the Data Setup feature file
    
 #Commerical CAG            
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 		| AUTOC3690 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTO3690A |Test Account | AUTO3690G|Test Group |010101     |123139     |PLN3024M1| 

#Basic Plan
 		Scenario Outline: Create a new Plan with NDC List in RxClaim    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
   	
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|NDCList|NDCSeq| NDCFromDate | NDCThruDate  | 
   |TESTP3690|010110|123139|AUTO PLAN FOR 3690|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
 
 #Part D setup 
  @PartDSetup
  Scenario Outline: Create a new PartD Setup in RxClaim 
   
   	Given I am on RxClaim PlanAdministrator Menu
   	When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   	#And I Set HIC detials "<HIC>"
   	#And I Set Set Supplemental ID by Type "<SupplementalIDFromDate>","<SupplementalIDThruDate>","<SupplementalIDType>","<SupplementalID>","<Text>"
   	Given I am on RxClaim PlanAdministrator Menu
    When I Set PBP "<CarrierID>","<Contract>","<PBP>","<BenefitYear>","<MedicareType>","<SubmitterID>"
   	#Given I am on RxClaim PlanAdministrator Menu
   	#And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I Set PartD Master Profile Detail "<CarrierID>","<AccountID>","<GroupID>","<PlanCode>","<FromDate>","<MasterProfileFromDate>","<MasterProfileThruDate>","<DrugCoverageStatusSchedule>","<Contract>","<PBP>"
   	Then Validate PartD Master Profile created with details "<CarrierID>" ,"<AccountID>","<GroupID>","<PlanCode>"
    
    Examples:
   |PlanCode  |FromDate|ThruDate|Description|PriceSchedule  |PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|CPPFromDate|CPPThruDate|CPPAccumulationLevel|CPPAccumulationCode|CPPPatientPaySchedule|CPPTrOOPSchedule|Qualifier| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID    |GroupName  |GroupFromDt|GroupThruDt|PlanCode  |PPDetailSchedule|PPDetailDescription|PlanUseQualifier|MemberID    | FirstName  | LastName  | DOB     | FromDate  | ThruDate |HIC      |SupplementalIDFromDate|SupplementalIDThruDate|SupplementalIDType|SupplementalID|Text|Contract|PBP  |BenefitYear|MedicareType|SubmitterID|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule| 
   |AUTOPARTD1|010119  |123119  |EVU30976P1 |EVUAREG        |EVUAREG           |010114       |123114       |C                |                |EVUBKOT      |EVUBKOT       |010114     |123114     |C                   |                   |EVUBKOT              |EVUBKOT         |A        |AUTPARTDC  | AUTPARTDC    |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTPARTDA |AUTPARTDA    | AUTPARTDG  |AUTPARTDG  |010101     |123139     |AUTOPARTD1|EVUBKOT         |TEST               |                |            | EVU30976M2 |EVU30976M2 |12251987 |010101     |123139    |123956781|010114                |123114                |06                |123456781     |    |R0001   |222  |2019       |S           |TEST       |010119       |123119       |       |            |             |                  |                |010119               |123119               |JBLEDCCS1                   |
    
  #Create DPA 
  Scenario Outline: Create DPA 
   
   	Given I am on RxClaim PlanAdministrator Menu   	
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "4" to navigate to "RxClaim Dynamic Prior authorization"
    And I select Option "1" to navigate to "Dynamic Prior authorization"
    And I add Dynamic Prior Authorization "<Carrier>","<Submitted PA MC Code>","<Submitted PA>","<Description>","<Nbr Fills>"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"