Feature: POS Rebate Deductions
As a RxClaim User I want to check claim is paid and POS rebate are deducted properly 

  Scenario Outline: To check if the POS rebate is adjusted from all the DFT components while calculating the patient pay when patient pay is based on multiple rules for a single ingredient 
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
   	And I select Option "4" to navigate to "Active Drug Cost Comparison Schedule"
   	Then modifying the sequence for drug cost schedule with "<PharmDrugSchedule>","<PharmCode>","<Rate>"
   	And I press "F12" Key
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
   	And I select Option "4" to navigate to "Active Drug Cost Comparison Schedule"
   	Then modifying the sequence for drug cost schedule with "<DrugSchedule>","<Code>","<Rate>"
   	And I press "F12" Key
   	When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>"
		Then Validate Claim Status is "P"
		And I press "F15" Key
		And I press "PageDown" Key
		And I press "PageDown" Key
   	
   	
   		Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW | PlanFromDt | PharmPriceSched | ClientPriceSched | ApplyTo | List | Level | DedSched | OOPSched | From Date | Thru Date | IndCost | PatPayTable | BrandAmt | BrandPercent | GenericAmt | CalcBasis | DrugSchedule | Code | PharmDrugSchedule | PharmCode | Rate |
      | SR4141603 | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR4141603 | Group   |  010101     |      123139 | SR41416_P6 | SR41416_05 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | CCHA | *ALL    | APHARM | 000019915000 | 00     | 8132018   | 00085051701 |30      |30  |0   | 80 | 120 | 010101 | SN003350C | SN003350 | 7 | SN003350 | G | SN003350 | CZINFAMILY  | 010101 | 123139 | 863.84 | SN003350P1 | 10 | 20 | 10 | 02 | SN003350 | U&C | SN003350C | U&C | 100 |
   	