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
 
 Scenario Outline: Create a new member in RxClaim with existing CAG
 Given I am on RxClaim PlanAdministrator Menu 
 When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
 Then Validate Member "<MemberID>" added

 Examples: 
 |CarrierID| AccountID  | GroupID    | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
 |SN3292C| SN3292A    |	SN3292G    | SN3292M    | AUTOMEM    | AUTOMEM   | 11161990 | 010101    | 123139   |

 # In order to reject the claim, provided invalid Product ID
 Scenario Outline: Submit a claim in RxClaim
  Given I am on RxClaim PlanAdministrator Menu 
  When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
  Then Validate Claim Status is "R"
  And Capture the Claim Number and Status and write in text file
  
  Examples:
  | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |
  |	777777  | QET     |	*ALL  | APHARM      |244135725928 | 00     | 010218   | SN3292M |1234500090|30      |30  | 00  |100   |
  
 Scenario Outline: To add messages to the Reject claim.
 Given I am on RxClaim PlanAdministrator Menu
 When I select Option "STRSQL" to navigate to "Enter SQL Statements"
 When I add messages to Reject claim "<Rel>","<FileName>","<Lib>","<maxMsgCount>","<minMsgCount>"
 
 Examples:
 |Rel|FileName|Lib|maxMsgCount|minMsgCount|		 
 |8403|RCRCMP|TCL|100|10|
 
 
 
  
  