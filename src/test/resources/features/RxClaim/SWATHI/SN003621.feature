#Author: swathi_palla@optum.com
#Pre-Requisite : User must have valid credentials to login to application.
Feature: Create Carrier,Account,Group and Member.

  Scenario Outline: Create a new CAG in RxClaim 
 Given I am on RxClaim PlanAdministrator Menu 
 When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
 Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
 
 Examples:
     
 | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 | SN003292C | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SR42037|Test Account| SR42037  |Test Group |010101     |123139     |SN003292P1| 

  
  Scenario Outline: Create a new member in RxClaim with existing CAG
 Given I am on RxClaim PlanAdministrator Menu 
 When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
 Then Validate Member "<MemberID>" added

    Examples: 
 | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
 |	SN003292C| SR42037     |	SR42037    | SR42037M1    | AUTOMEM    | AUTOMEM   | 12251987 | 010101    | 123139   |