Feature: POS Rebate Deductions
As a RxClaim User I want to check claim is paid and POS rebate are deducted properly 

  Scenario Outline: To check if partial rebate is applied on the calculated copay when DFT is less than the POS rebate amount and patient pay is with co insurance 
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
   	And I select Option "4" to navigate to "Active Drug Cost Comparison Schedule"
   	Then modifying the sequence for drug cost schedule with "<DrugSchedule>","<Code>","<Rate>"
   	And I press "F12" Key
   	When I select Option "5" to navigate to "RxClaim Price Maintenance"
   	And I select Option "2" to navigate to "RxClaim Patient Pay Maintenance"
   	And I select Option "2" to navigate to "Patient Pay Table"
   	Then I edit the patient pay table with "<PatPayTable>","      ","<BrandPercent>","<GenericAmt>","<CalcBasis>","      ","<CompCode>","  "
   	And I press "F12" Key
   	When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","         "
		Then Validate Claim Status is "P"
		And I press "F15" Key
		Then navigating to adjustment information detail screen to validate the secondary diff
		And I press "F12" Key
		And I press "F12" Key
		And I press "PageDown" Key
		And I press "PageDown" Key
		
		Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | UCW | PlanFromDt | PharmPriceSched | ClientPriceSched | ApplyTo | List | Level | DedSched | OOPSched | From Date | Thru Date | IndCost | PatPayTable | BrandAmt | BrandPercent | GenericAmt | CalcBasis | GenericPercent | CompCode | GenericCalc |  DrugSchedule | Code | Rate |
      | SR4141603 | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR4141603 | Group   |  010101     |      123139 | SR41416_P6 | SR41416_03 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | CCHA | *ALL    | APHARM | 000019908007 | 00     | 8132018   | 00002411730 |30      |30  |0   |30   | 60 | 010101 | SN003350C | SN003350 | 7 | SN003350 | G | SN003350 | CZINFAMILY  | 010101 | 123139 | 320 | SN003350P1 | 10 | 20 | 10 | 02 | 20 | B | 02 |  SN003350 | INGCOST | 100 |
   	