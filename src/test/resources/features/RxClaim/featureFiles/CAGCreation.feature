Feature: Create New Carrier/Account/Group
As a RxClaim User I want to create a New CAG
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd    |City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID     |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
    | EVU41931R | Test Carrier|0000000    |TEST ADDRESS  |WA |WA    |98801|010101        |123139        |*DEFAULT   |*DEFAULT      |EVU41931A1|Test Account |  EVU41931G1 |Test Group |010101     |123139     |MGRPLAN1| 
    
   