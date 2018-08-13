Feature: Create New Carrier
As a RxClaim User I want to create a New Carrier
    
             
   Scenario Outline: Create a new Carrier in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Carrier with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>"
    Then Validate Carrier created with details "<CarrierID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType | 
    | TESTA1TC9 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      | 
    
