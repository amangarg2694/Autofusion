Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check plan tier in formulary screen for MPA 

  Scenario Outline: Plan tier is used and no override tier for MPA
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "SR41429P" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCode>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<ContractFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<Description>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F12" Key
		When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
		And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
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
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "F4" Key
    And I enter "X" in field "FtypeOption" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "12001200" in field "ID" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F8" Key
    Then I create PA for member with "<PANum>","<MSC>","<NDCID>","<Rsn>","<Tier>","<TierOverride>","<Data>"
		And I press "F12" Key
		When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>"
		Then Validate Claim Status is "P" 
		And I press "F7" Key
		And I enter "21" in field "Selectionfield" on "TransactionDetailList" 
		And I press "Enter" Key
		Then I validate the tier code in formulary screen 
		 
 Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCode | Description | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | UCW | PANum | MSC | NDCID | Rsn | Tier | TierOverride | Data | 
      | SR4142902 | Carrier     |        712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR4142902 | Group     |      010101 |      123139 | SR4178702  | SR41429 Plan | SR41429_02 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | CCHA | *ALL    | WALMARTIL | 100010000001 | 00     | 7192018   | 00363012020 |30      |30  |0   |100   | 010101 | 123139 | 100 | 00000000001 | Y | 66100020000105 | F | 01 | E | 06 |
       
      