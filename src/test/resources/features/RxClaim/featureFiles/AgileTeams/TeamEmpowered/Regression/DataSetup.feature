Feature: Data setup required to run before running Regression suite
As a RxClaim User I want to run the Data Setup feature file
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 		| AUTOC3690 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTO3690A |Test Account | AUTO3690G|Test Group |010101     |123139     |PLN3024M1| 

 		Scenario Outline: Create a new Plan with NDC List in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
   	
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|NDCList|NDCSeq| NDCFromDate | NDCThruDate  | 
   |TESTP3690|010110|123139|AUTO PLAN FOR 3690|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
   