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
And I enter "N" in field "DrugStatus" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
And I press "PageDown" Key
And I enter "Y" in field "DiscountBenefit" on "PlanDetailScreen"
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
Then Validate "<PlanCode>" message should displayed on "PlanDetailScreen"

Examples:

|PlanCode		|From Date	|Description	    |
|ESPPLAN7 	|010118			|ESP Test Plan		|


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
|ESPPLAN7 	|010118  |123139  |EBP03               |


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
|ESPPLAN7 	|010118  |123139  |EVUAREG      |


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
|ESPPLAN7 	|ESPREJECT7|RejectList |10 |010118  |123139  |SILDENAFIL|


 Scenario Outline: Create a new CAG in RxClaim 
  Given I am on RxClaim PlanAdministrator Menu 
  When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
  Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
 
 Examples:
  | CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID    |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
  | ESPCAR7    | ESPCarrier  |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |ESPACC7   |Test Account | ESPGROUP7  |Test Group |010101     |123139     |ESPPLAN7| 
  


Scenario Outline: Create a new member in RxClaim with existing CAG
Given I am on RxClaim PlanAdministrator Menu 
When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
Then Validate Member "<MemberID>" added

Examples:
| CarrierID 	| AccountID   	| GroupID     		| MemberID   		| FirstName  	| LastName  | DOB      | FromDate  | ThruDate |
|	ESPCAR7     | ESPACC7     	|	ESPGROUP7       | ESPMEMBER07   | TEST    		| ESPMEMBER | 01011950 | 010118    | 123118   |
    
  

Scenario Outline: Create a claim with the ESP Plan that will give a Reject Code = 70 
Given I am on RxClaim PlanAdministrator Menu 
When I submit a first time claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>", "<rxOrigin>"
Then Validate Claim Status is "P"
And Validate Claim Message is "Addl discount applied ind of Rx coverage"

Examples:
| BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID     | ProductID   |	DspQty | DS | PSC | Cost |rxOrigin|
|	777777  | QET     |	*ALL  | 0556540     | 765774389905 | 00     | 100118   | ESPMEMBER07	| 00093534156 |	30     | 30 | 00  |100   |1       |




#Not needed at this time, will keep in for future use
#Scenario Outline: Create a Discount Benefit Table 
#Given I am on RxClaim PlanAdministrator Menu
#When I select Option "4" to navigate to "RxClaim Plan Maintenance"
#And I select Option "25" to navigate to "Active Plan by Plan code"
#And I press "F6" Key
#And I enter "<Table>" in field "Table" on "AddDiscountBenefitTableScreen"
#And I enter "<Description>" in field "Description" on "AddDiscountBenefitTableScreen"
#And I press "Enter" Key
#And I enter "7" in field "Selection" on "DiscountBenefitTableScreen"
#And I press "Enter" Key
#And I press "F6" Key
#And I enter "10" in field "Sequence" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "<DiscountBenefitPlan>" in field "DiscountBenefitPlan" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "<FromDate>" in field "FromDate" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "<MessageCode>" in field "MessageCode" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "B" in field "Rejected" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "Y" in field "Paid" on "AddDiscountBenefitTableSequenceScreen"
#And I enter "Y" in field "LICS" on "AddDiscountBenefitTableSequenceScreen"
#And I press "Enter" Key
#Then Validate "<DiscountBenefitPlan>" in field "DiscountBenefitPlan" is displayed on "DiscountBenefitTableSequencesScreen" 


#Examples:

#|Table|Description             |DiscountBenefitPlan|FromDate|MessageCode|
#|EBP05|EXTENDED BENEFIT NO SPEC|ESPPLAN5           |010118  |EBP02      |
