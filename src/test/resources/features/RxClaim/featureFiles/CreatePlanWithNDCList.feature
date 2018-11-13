Feature: Create New Plan with NDC List
As a RxClaim User I want to create Plan with NDC List
    
             
    Scenario Outline: Create a new Plan with NDC List in RxClaim 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    Then Validate Plan "<PlanCode>"
   	And I add Plan With NDC List "<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>"
    Then Validate NDC List is "<NDCList>"
    
   Examples:
   |PlanCode|FromDate|ThruDate|Description|PriceSchedule|PatientPaySchedule|NDCList|NDCSeq| NDCFromDate | NDCThruDate  | 
   |AUTNDCGPIL|010110|123139|AUTO PLAN FOR NDC GPI LST|EVUAREG|EVUAREG|PANL1	 |20   |	010118  	  |123139        |
