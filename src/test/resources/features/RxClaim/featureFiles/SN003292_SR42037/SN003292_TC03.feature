#Author: swathi_palla@optum.com
#Pre-Requisite : User must have valid credentials to login to application.
Feature: Create Carrier,Account,Group and Member.Submit a claim such that it should be Reject and Reject messages are displayed.

  Scenario Outline: Create a new CAG in RxClaim 
 Given I am on RxClaim PlanAdministrator Menu 
 When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
 Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
 
 Examples:
     
 | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 | SN3292C | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3292A|Test Account| SN3292G  |Test Group |010101     |123139     |SN003292P1| 
 
 Scenario Outline: Create a new member in RxClaim with CAG
 Given I am on RxClaim PlanAdministrator Menu 
 When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
 Then Validate Member "<MemberID>" added

 Examples: 
 |CarrierID| AccountID  | GroupID    | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
 |SN3292C| SN3292A    |	SN3292G    | SN3292M    | AUTOMEM    | AUTOMEM   | 11161990 | 010101    | 123139   |
 
 Scenario Outline: To add messages to Product for Carrier specific.
 Given I am on RxClaim PlanAdministrator Menu
 When I add messages to Product "<ProductID>", "<FromDate>","<ThruDate>", "<Carrier>","<MessageCode>","<Seqno>","<MessageType>"
 
 Examples:
 |ProductID|FromDate|ThruDate|Carrier  |MessageCode|Seqno|MessageType	|
 |12345432199|010118  |123118  |SN3292C|T1333334   |10   |R          	|
 |12345432199|010118  |123018  |SN3292C|SNTCP      |20   |R	        	|
 
 Scenario Outline: Submit a claim in RxClaim with status as "R"
  Given I am on RxClaim PlanAdministrator Menu 
  When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
  Then Validate Claim Status is "R"
  
  Examples:
  | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |
  |	777777  | QET     |	*ALL  | APHARM      | 765488367432 | 00     | 010218   | SN3292M | 12345432199|30      |30  |00   |100   |
 
 

  
  