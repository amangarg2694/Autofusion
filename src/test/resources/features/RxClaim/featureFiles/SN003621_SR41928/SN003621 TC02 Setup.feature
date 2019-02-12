#Author: swathi_palla@optum.com
#Pre-Requisite : User must have valid credentials to login to application.
@Regression
Feature: Create Carrier,Account,Group and Member.

  Scenario Outline: Create a new CAG in RxClaim 
 Given I am on RxClaim PlanAdministrator Menu 
 When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
 Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
 
 Examples:
 
 | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 | ABORTEST | ABOR TEST|0000000000|123  |LISLE|IL   |11111|010116        |123139        |*DEFAULT   |*DEFAULT      |ABORTEST|ABOR TEST|ABORTEST  |ABOR TEST|010100     |123139     |ABORTEST| 

  
  Scenario Outline: Create a member using the above CAG.
 Given I am on RxClaim PlanAdministrator Menu 
 When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
 Then Validate Member "<MemberID>" added
 And Capture the MemberID and write in text file

    Examples: 
 | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
 |	ABORTEST| ABORTEST     |	ABORTEST    | SR41928MEM    | TEST    | TEST   | 01011990| 010108    | 123139   |