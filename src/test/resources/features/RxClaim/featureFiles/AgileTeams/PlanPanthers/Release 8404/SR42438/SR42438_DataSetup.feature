Feature: Setup Plan with GPI List
As a RxClaim User I want to Setup All the Below data for SR 42438.
- Plan with GPI List
- Plan with NDC List
   
   Scenario Outline: Create a Plan with NDC and GPI List
   
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
   	When I Setup Plan with GPI List "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    Then Validate GPI List is "<GPIList>"  
    
   Examples:
   |PlanCode  |FromDate|ThruDate|Description              |PriceSchedule|PatientPaySchedule|GPIList|GPISeq| GPIFromDate | GPIThruDate| 
   |AUTNDCGPIL|010110  |123139  |SR42438 AUTO Plan With GPI LST|EVUAREG      |EVUAREG           |GPILST |100   |	010118  	  |123139      |
   
   
   Scenario Outline: Create a new Plan with NDC List in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
   	And I add Plan With NDC List "<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>"
    Then Validate NDC List is "<NDCList>"
    
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|NDCList|NDCSeq| NDCFromDate | NDCThruDate  | 
   |AUTNDCGPIL|010110|123139|AUTO PLAN FOR NDC GPI LST|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
     
    
   
        