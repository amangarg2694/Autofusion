Feature: Setup Plan with GPI List
As a RxClaim User I want to Setup All the Below data for SR 42438.
- Plan with GPI List
- Plan with NDC List
   
   Scenario: Create GPI List
   Given I am on RxClaim PlanAdministrator Menu
   When I create a GPI List with "<GpiListName>","<PlanDefault>","<ActivateAudit>"
   
   @GPI 
   Scenario Outline: Create a Plan with NDC and GPI List
   
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
   	And I Setup Plan with GPI List "<PlanCode>","<GPIList1>","<GPISeq1>","<GPIFromDate>","<GPIThruDate>"
    And I Setup Plan with GPI List "<PlanCode>","<GPIList2>","<GPISeq2>","<GPIFromDate>","<GPIThruDate>"
    And I edit Plan GPI/NDC List "<PlanCode>","<GPIList1>"
    And I press "PageDown" Key
    And I enter "<ProcQualifier>" in field "ProcessingQualifier" on "PlanGPIListDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "ConfirmPrompt" on "PlanGPIListDetailScreen"
		And I edit Plan GPI "<PlanCode>","<GPIList2>","<GPINumber>"
		And I enter "<DaysSupply1>" in field "MaxDaysSupply" on "PlanGPIDetailPageScreen"
		And I press "PageDown" Key
		And I enter "<RejCodeRemapTable>" in field "RejectCodeRemap" on "PlanGPIDetailPageScreen"
		And I press "Enter" Key
		And I add Bypass Contigent Therapy Conditions on "GPIByPassContigentTherapyDetail" with "<Seq>","<DrugStatus>","<DaysSupply2>","<MultiSourceCode M>","<MultiSourceCode N>","<MultiSourceCode O>","<MultiSourceCode Y>","<MultiSourceCode X>","<MultiSourceCode Z>"
		
  Examples:
   |PlanCode  |FromDate|ThruDate|Description                  |PriceSchedule|PatientPaySchedule|GPIFromDate|GPIThruDate|GPIList1|GPISeq1|GPIList2|GPISeq2|GPINumber     |ProcQualifier|DaysSupply1|RejCodeRemapTable|DrugStatus|DaysSupply2|Seq|MultiSourceCode M|MultiSourceCode N|MultiSourceCode O|MultiSourceCode Y|MultiSourceCode X|MultiSourceCode Z |
   |A4243809  |010191  |123139  |SR42438 AutoTest Plan        |EVUAREG      |EVUAREG           |010191     |123139     |RGUD1   |10     |RGUD2   |20     |84200025005920|P            |4          |TEST             |F         |3          |10 |X                |X                |X                |X                |X                |X                 |
    
  
@NDC
   Scenario Outline: Create a new Plan with NDC List in RxClaim    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
   	And I add Plan With NDC List "<NDCList1>","<NDCSeq1>","<NDCFromDate>","<NDCThruDate>"
    And I edit Plan GPI/NDC List "<PlanCode>","<NDCList1>"
    And I press "PageDown" Key
    And I enter "<ProcQualifier>" in field "ProcessingQualifier" on "PlanGPIListDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "ConfirmPrompt" on "PlanGPIListDetailScreen"
		And I edit Plan NDC "<PlanCode>","<NDCList1>","<NDCNumber>"
		And I enter "<DaysSupply1>" in field "MaxDaysSupply" on "PlanGPIDetailPageScreen"
		And I press "PageDown" Key
		And I enter "<RejCodeRemapTable>" in field "RejectCodeRemap" on "PlanGPIDetailPageScreen"
		And I press "Enter" Key
		And I add Bypass Contigent Therapy Conditions on "NDCByPassContigentTherapy" with "<Seq>","<DrugStatus>","<DaysSupply2>","<MultiSourceCode M>","<MultiSourceCode N>","<MultiSourceCode O>","<MultiSourceCode Y>","<MultiSourceCode X>","<MultiSourceCode Z>"
		
  Examples:
   |PlanCode  |FromDate|ThruDate|Description                  |PriceSchedule|PatientPaySchedule|NDCFromDate|NDCThruDate|NDCList1|NDCSeq1|NDCList2|NDCSeq2|NDCNumber     |ProcQualifier|DaysSupply1|RejCodeRemapTable|DrugStatus|DaysSupply2|Seq|MultiSourceCode M|MultiSourceCode N|MultiSourceCode O|MultiSourceCode Y|MultiSourceCode X|MultiSourceCode Z |
   |A4243810  |010191  |123139  |SR42438 AutoPlan NDCList     |EVUAREG      |EVUAREG           |010118     |123139     |NDC1    |10     |RGUD2   |20     |00002036302   |P            |4          |TEST             |F         |3          |10 |X                |X                |X                |X                |X                |X                 |
    
    
   
   
        