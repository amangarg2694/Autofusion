Feature: Create New Carrier/Account/Group
As a RxClaim User I want to create a New CAG
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName   |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
    | TR41354CR | TR41354CR-Test|712        |MAIL ADD  |City|CA   |78654|    010116    |    123139    |*DEFAULT   |*DEFAULT      |TR41354ACC1|Test Account | TR41354GR1|Test Group |010116     |123139     |EVUASHE | 
    
   