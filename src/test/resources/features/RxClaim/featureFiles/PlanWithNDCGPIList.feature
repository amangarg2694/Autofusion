Feature: Setup Plan with NDC and GPI List
As a RxClaim User I want to Setup Plan with NDC and GPI List
   
   Scenario Outline: Setup a Plan with NDC and GPI List
    Given I am on RxClaim PlanAdministrator Menu 
    When I Setup Plan with NDC List "<PlanCode>","<NDCList>","<NDCSeq>","<NDCFromDate>","<NDCThruDate>"
    Then Validate NDC List is "<NDCList>"
    Given I am on RxClaim PlanAdministrator Menu 
    When I Setup Plan with GPI List "<PlanCode>","<GPIList>","<GPISeq>","<GPIFromDate>","<GPIThruDate>"
    Then Validate GPI List is "<GPIList>"  
    
    Examples:
     | PlanCode   | NDCList|NDCSeq| NDCFromDate | NDCThruDate  |GPIList|GPISeq| GPIFromDate | GPIThruDate|  
	   | AUTNDCGPIL | PANL1	 |20   |	010118  	  |123139        | GPILST|100   |	010118  	  |123139|
    
        