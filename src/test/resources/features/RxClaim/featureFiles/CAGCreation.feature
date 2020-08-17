Feature: Create New Carrier/Account/Group 
As a RxClaim User I want to create a New CAG
                 
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID  |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
    | AMANPB001 | Test Carrier1|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB001 | Test Account | AMANPB001 | Test Group | 010199 | 123129    | AMANPB001 |
    | AMANPB002 | Test Carrier2|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB002 | Test Account | AMANPB002 | Test Group | 010199 | 123129    | AMANPB002 |
    | AMANPB003 | Test Carrier3|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB003 | Test Account | AMANPB003 | Test Group | 010199 | 123129    | AMANPB003 |
    | AMANPB004 | Test Carrier4|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB004 | Test Account | AMANPB004 | Test Group | 010199 | 123129    | AMANPB004 |
    | AMANPB005 | Test Carrier5|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB005 | Test Account | AMANPB005 | Test Group | 010199 | 123129    | AMANPB005 |
    | AMANPB006 | Test Carrier6|712        |MAIL ADD  |TEST|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT     |AMANPB006 | Test Account | AMANPB006 | Test Group | 010199 | 123129    | AMANPB006 |
    