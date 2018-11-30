@Regression @Release_8403

Feature: RxInterAct: Update logic on Clinical Products Platform Extract and Targeted Transaction File
# Member ID needs to be updated before running the scripts
  
  Scenario Outline: SN003385_SR41757_TC001:Verify running the Clinical Products Platform Extract where a member has RxInterAct transactions and current system date does fall between the member’s eligibility from and thru dates.
  									SN003385_SR41757_TC002:Verify running the Clinical Products Platform Extract where a member has RxInterAct transactions and current system date does fall between the member’s eligibility from and thru dates.
  									SN003385_SR41757_TC003:Verify running the Clinical Products Platform Extract where a member has RxInterAct transactions and current system date falls outside of either the member’s eligibility from or thru dates.
  									
		Given I am on RxClaim PlanAdministrator Menu
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<planCode>"
    And Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "12" to navigate to "RxInterACT Main Menu"
    And I select Option "5" to navigate to "Management"
    And I select Option "2" to navigate to "Active Application Profile"
    And I enter details to enable in Active Application Profile "<CarrierID>"
    And I select Option "CCT600" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key 
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen" 
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    And Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F3" Key
    And I enter "<MemberID>" in Active/Eligible Member by ID menu
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo1>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo2>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And Validate Claim Status is "P"
     And I press "F7" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo3>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And Validate Claim Status is "P"
     And I press "F7" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo4>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "12" to navigate to "RxInterACT Main Menu"
		And I select Option "5" to navigate to "Management"
		And I select Option "3" to navigate to " Report Management"
		And I select Option "14" to navigate to "Clinical Products Platform Extract"
		And I enter the values in Clinical Products Platform Extract menu with "<CarrierID>"
		And I check the job status in "Clinical Products Platform Extract"
		And I verify the records in the physical file member for Clinical Products Platform Extract
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "12" to navigate to "RxInterACT Main Menu"
		And I select Option "5" to navigate to "Management"
		And I select Option "3" to navigate to " Report Management"
		And I select Option "14" to navigate to "Clinical Products Platform Extract"
		And I enter the values in Clinical Products Platform Extract menu "<CarrierID>"
		And I check the job status in "Clinical Products Platform Extract"
		And I verify the records in the physical file member for Clinical Products Platform Extract
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "12" to navigate to "RxInterACT Main Menu"
		And I select Option "5" to navigate to "Management"
		And I select Option "3" to navigate to " Report Management"
		And I select Option "14" to navigate to "Clinical Products Platform Extract"
		And I enter the values in Clinical Products Platform with "<CarrierID>"
		And I check the job status in "Clinical Products Platform Extract"
		Then I verify the records in the physical file member for Clinical Products Platform Extract
		

		
    Examples: 
    | CarrierID | CarrierName |Processor |MailingAdd  |City|State |Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName   | GroupID  |GroupName   |GroupFromDt|GroupThruDt|planCode  | MemberID | First Name | Last Name | DOB     | From Date |Thru Date|  BIN    | ProcCtrl| Group | PharmacyID  |	RxNo1       |RxNo2        |   RxNo3    |  RxNo4     | Refill | FillDate | MemberID | ProductID  | DspQty | DS | PSC | Cost|
    | SR41757IG | SR41757Test |0000000   |TEST ADDRESS| WA |WA    |98801|010101        |123139        |*DEFAULT   |*DEFAULT      |SR41757IG |SR41757Account| SR41757IG|SR41757Group|010101     |123139     |SR41757P  | SR41757IM| AUTOMEM    | AUTOMEM1  | 01011990| 010118    | 123118  |	777777  | QET     |	*ALL  | APHARM      | 767488367283| 767488367282|767488367281|767488367280|00      | 091918   | SR41757IG| 00777310402| 30     |	30 | 00  |100 |

  