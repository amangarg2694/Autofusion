Feature: Create New Carrier/Account/Group
As a RxClaim User I want to create a New CAG
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
 |CarrierID  | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode  | 
 | 4206CAG1  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG1  |Test Account| 4206CAG1  |Test Group |010101     |123139     |EVUASHE-D | 
 | 4206CAG2  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG2  |Test Account| 4206CAG2  |Test Group |010101     |123139     |PARTD     | 
 | 4206CAG3  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG3  |Test Account| 4206CAG3  |Test Group |010101     |123139     |EVUASHE-D | 
 | 4206CAG4  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG4  |Test Account| 4206CAG4  |Test Group |010101     |123139     |PLNPARTD  | 
 | 4206CAG5  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG5  |Test Account| 4206CAG5  |Test Group |010101     |123139     |EVUASHE-D | 
 | 4206CAG6  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG6  |Test Account| 4206CAG6  |Test Group |010101     |123139     |EVUASHE   | 
 | 4206CAG7  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG7  |Test Account| 4206CAG7  |Test Group |010101     |123139     |EVUASHE   | 
 | 4206CAG8  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG8  |Test Account| 4206CAG8  |Test Group |010101     |123139     |EVUASHE   | 
 | 4206CAG9  | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG9  |Test Account| 4206CAG9  |Test Group |010101     |123139     |EVUASHE   | 
 | 4206CAG9X | Test Carrier|712        |MAIL ADD  |City|NC   |27654|010101        |123139        |*DEFAULT   |*DEFAULT      |4206CAG9X |Test Account| 4206CAG9X |Test Group |010101     |123139     |EVUASHE   | 
  
   
   
   
   
   
   # | TESTOO13  | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |TESTAO13  |Test Account| TESTGO13  |Test Group |010101     |123139     |AUTOEGWP| 
    
