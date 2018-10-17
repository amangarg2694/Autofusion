#Author: swathi_palla@optum.com
#Pre-Requisite : User must have valid credentials to login to application.
Feature: Create Carrier,Account,Group and Member.Submit a claim such that it should be Paid and Paid messages are displayed.

 Scenario Outline: To Create a CAG in RxClaim 
 Given I am on RxClaim PlanAdministrator Menu 
 When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
 Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
 
 Examples:
     
 | CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt|PlanCode| 
 | SN3292C | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3292A|Test Account| SN3292G  |Test Group |010101     |123139     |SN003292P1| 
 
 Scenario Outline: Create a member in RxClaim with existing CAG
 Given I am on RxClaim PlanAdministrator Menu 
 When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
 Then Validate Member "<MemberID>" added
 
Examples: 
 |CarrierID| AccountID  | GroupID    | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
 |SN3292C| SN3292A    |	SN3292G    | SN3292M    | AUTOMEM    | AUTOMEM   | 11161990 | 010101    | 123139   |
 
 # Use the same Product ID while submitting claim.
 Scenario Outline: To add messages to Product for Carrier specific.
 Given I am on RxClaim PlanAdministrator Menu
 When I add messages to Product "<ProductID>", "<FromDate>","<ThruDate>", "<Carrier>","<MessageCode>","<Seqno>","<MessageType>"
  
 Examples:
 |ProductID|FromDate|ThruDate|Carrier  |MessageCode|Seqno|MessageType	|
 |11845006171|010118  |123118  |SN3292C|T1333334   |10   |P          	|
 |11845006171|010118  |123018  |SN3292C|SNTCP      |20   |P	        	|
 
 Scenario Outline: Submit a claim in RxClaim with paid status P
  Given I am on RxClaim PlanAdministrator Menu 
  When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
  Then Validate Claim Status is "P"
     
  Examples:
  | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |
  |	777777  | QET     |	*ALL  | APHARM      | 765488362341 | 00     | 010218   | SN3292M | 11845006171|30      |30  |00   |100   |
  
  
 
 

  
  