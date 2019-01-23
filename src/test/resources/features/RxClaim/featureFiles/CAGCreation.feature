Feature: Create New Carrier/Account/Group
As a RxClaim User I want to create a New CAG
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:

    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
  # | SR42037   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR42037   |Test Account | SR42037  |Test Group |010101     |123139     |SN003292P1| 
		| AUTOC3691 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |AUTO3690A |Test Account | AUTO3690G|Test Group |010101     |123139     |PLN3024M1| 
   #| TESTOO13  | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |TESTAO13  |Test Account| TESTGO13  |Test Group |010101     |123139     |AUTOEGWP| 
    | VersiC14  | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT   

