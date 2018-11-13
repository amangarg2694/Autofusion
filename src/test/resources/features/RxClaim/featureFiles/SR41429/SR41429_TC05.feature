Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check plan tier in formulary screen for MPA 

  Scenario Outline: Flag is blank and override will be used for MPA
  	Given I am on RxClaim PlanAdministrator Menu
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
    Then I create MPA for member with "<PANum>","<MSC>","<NDCID>","<Rsn>","<Tier>"
		And I press "F12" Key
		When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<UCW>"
		Then Validate Claim Status is "P" 
		And I press "F7" Key
		And I enter "21" in field "Selectionfield" on "TransactionDetailList" 
		And I press "Enter" Key
		Then I validate the tier code in formulary screen 
		
		Examples:
   
      | CarrierID | AccountID | GroupID   | MemberID   | First Name | Last Name | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | DOB | From Date | Thru Date | UCW | PANum | MSC | NDCID | Rsn | Tier |
      | SR4142902 | SR41787A1 | SR4142902 | SR41429_M1 | AUTOMEM    | AUTOMEM   | 777777 | CCHA | *ALL    | WALMARTIL | 100010000007 | 00     | 7202018  | 00363012020 | 30 | 30 | 0 | 100 | 12251987 | 010101 | 123139 | 100 | 10000000000 | Y | 66100020000105 | F | 01 |
      
       
       