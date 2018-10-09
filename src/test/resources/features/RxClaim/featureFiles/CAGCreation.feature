Feature: Create New Carrier/Account/Group
As a RxClaim User I want to create a New CAG
    
             
   Scenario Outline: Create a new CAG in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"  
   
   Examples:
<<<<<<< HEAD
    | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
    | SR42037 | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR42037|Test Account| SR42037  |Test Group |010101     |123139     |SN003292P1| 
=======
    | CarrierID | CarrierName |Processor  |MailingAdd    |City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID     |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
    | EVU41931R | Test Carrier|0000000    |TEST ADDRESS  |WA |WA    |98801|010101        |123139        |*DEFAULT   |*DEFAULT      |EVU41931A1|Test Account |  EVU41931G1 |Test Group |010101     |123139     |MGRPLAN1| 

>>>>>>> 0a5de481a227d2798a432f4ce122818c79374731
    
