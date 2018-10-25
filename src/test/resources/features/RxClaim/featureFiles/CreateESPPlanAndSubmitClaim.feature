@ESPPlan @ESPClaim
Feature:  Create an ESP Plan and Create a Claim

Scenario Outline:  Create an ESP Plan
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I press "F6" Key
And I enter "<PlanCode>" in field "PlanCode" on "AddPlanScreen"
And I enter "<From Date>" in field "FromDate" on "AddPlanScreen"
And I enter "<Description>" in field "Description" on "AddPlanScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "AddPlanScreen"
And I enter "Y" in field "MemberEligibility" on "PlanDetailScreen"
And I enter "Y" in field "Pricing" on "PlanDetailScreen"
And I enter "Y" in field "GPILists" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
And I press "PageDown" Key
And I enter "Y" in field "DiscountBenefit" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"

Examples:

|PlanCode		|From Date	|Description	    |
|ESPPLAN4 	|010118			|ESP Test Plan		|

Scenario Outline: Add a Plan Discount Benefit 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I press "F7" Key
And I enter "32" in field "Selection" on "PlanOptionsScreen"
And I press "Enter" Key
And I press "F6" Key
And I enter "<FromDate>" in field "FromDate" on "AddPlanDiscountBenefitScreen"
And I enter "<ThruDate>" in field "ThruDate" on "AddPlanDiscountBenefitScreen"
And I enter "<DiscountBenefitTable>" in field "DiscountBenefitTable" on "AddPlanDiscountBenefitScreen"
And I press "Enter" Key
Then Validate "<DiscountBenefitTable>" in field "Table" is displayed on "ActivePlanDiscountBenefitScreen" 


Examples:

|PlanCode		|FromDate|ThruDate|DiscountBenefitTable|
|ESPPLAN4 	|010118  |123139  |EBP03               |


Scenario Outline:  Add Pricing Schedule to Plan 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I press "F7" Key
And I enter "28" in field "Selection" on "PlanOptionsScreen"
And I press "Enter" Key
And I enter "1" in field "Selection" on "PriceOptionPageScreen"
And I press "Enter" Key
And I press "F6" Key
And I enter "<FromDate>" in field "FromDate" on "AddPlanPharmacyPriceScheduleScreen"
And I enter "<ThruDate>" in field "ThruDate" on "AddPlanPharmacyPriceScheduleScreen"
And I enter "<PriceSchedule>" in field "PriceSchedule" on "AddPlanPharmacyPriceScheduleScreen"
And I press "Enter" Key
And I press "F12" Key
And I enter "3" in field "Selection" on "PriceOptionPageScreen"
And I press "Enter" Key
And I press "F6" Key
And I enter "<FromDate>" in field "FromDate" on "AddPlanPharmacyPatientPayScreen"
And I enter "<ThruDate>" in field "ThruDate" on "AddPlanPharmacyPatientPayScreen"
And I enter "<PriceSchedule>" in field "Schedule" on "AddPlanPharmacyPatientPayScreen"
And I press "Enter" Key
And I enter "Y" in field "ConfirmPrompt" on "AddPlanPharmacyPatientPayScreen"
And I press "F12" Key
Then Validate "Y" in field "Reimbursement" is displayed on "PriceOptionPageScreen"  
And  Validate "Y" in field "PatientPay" is displayed on "PriceOptionPageScreen"  


Examples:
|PlanCode		|FromDate|ThruDate|PriceSchedule|
|ESPPLAN4 	|010118  |123139  |EVUAREG      |


Scenario Outline: Add Medication to GPI List 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "4" to navigate to "RxClaim Plan Maintenance"
And I select Option "1" to navigate to "Active Plan by Plan code"
And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen"
And I press "Enter" Key
And I press "F7" Key
And I enter "11" in field "Selection" on "PlanOptionsScreen"
And I press "Enter" Key
And I press "F6" Key
And I press "F6" Key
And I enter "<GPIList>" in field "GPIList" on "AddPlanGPIListScreen"
And I enter "<Description>" in field "Description" on "AddPlanGPIListScreen"
And I enter "Y" in field "RejectionList" on "AddPlanGPIListScreen"
And I press "Enter" Key
And I enter "Y" in field "ConfirmPrompt" on "AddPlanGPIListScreen"
And I enter "1" in field "Selection" on "SelectandAddGPIListScreen"
And I press "Enter" Key
And I enter "<Seq>" in field "Seq" on "PlanGPIListDetailScreen"
And I enter "<FromDate>" in field "FromDate" on "PlanGPIListDetailScreen"
And I enter "<ThruDate>" in field "ThruDate" on "PlanGPIListDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "ConfirmPrompt" on "PlanGPIListDetailScreen"
And I press "F12" Key
And Validate "<GPIList>" in field "GPIList" is displayed on "ActivePlanGPIListScreen" 
And I enter "7" in field "Selection" on "ActivePlanGPIListScreen" 
And I press "Enter" Key
And I press "F6" Key
And I enter "<GPIName>" in field "GPIName" on "SelectAddbyGPINameScreen" 
And I press "Enter" Key
And I enter "1" in field "Selection" on "SelectAddbyGPINameScreen"
And I press "Enter" Key
And I press "Enter" Key
And I enter "R" in field "Sts" on "PlanGPIDetailPageScreen"
And I press "Enter" Key
And I press "F12" Key
And I press "F12" Key
And I press "F12" Key
Then Validate "<GPIList>" in field "GPIList" is displayed on "ActivePlanGPIListScreen" 

Examples:
|PlanCode		|GPIList   |Description|Seq|FromDate|ThruDate|GPIName   |
|ESPPLAN4 	|ESPREJECT4|RejectList |10 |010118  |123139  |SILDENAFIL|


 Scenario Outline: Create a new CAG in RxClaim 
  Given I am on RxClaim PlanAdministrator Menu 
  When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
  Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
 
 Examples:
  | CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID    |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
  | ESPCAR2    | ESPCarrier  |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |ESPACC2   |Test Account | ESPGROUP2  |Test Group |010101     |123139     |ESPPLAN4| 
  


Scenario Outline: Create a new member in RxClaim with existing CAG
Given I am on RxClaim PlanAdministrator Menu 
When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
Then Validate Member "<MemberID>" added

Examples:
| CarrierID 	| AccountID   	| GroupID     		| MemberID   		| FirstName  	| LastName  | DOB      | FromDate  | ThruDate |
|	ESPCAR2     | ESPACC2     	|	ESPGROUP2       | ESPMEMBER03   | TEST    		| ESPMEMBER | 01011950 | 010118    | 123118   |
    
  

Scenario Outline: Create a claim with the ESP Plan that will give a Reject Code = 70 
Given I am on RxClaim PlanAdministrator Menu 
When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
Then Validate Claim Status is "R"

Examples:
| BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID     | ProductID   |	DspQty | DS | PSC | Cost |
|	777777  | QET     |	*ALL  | APHARM      | 765778367433 | 00     | 100118   | ESPMEMBER03	| 00069420030 |	30     | 30 | 00  |100   |

      


