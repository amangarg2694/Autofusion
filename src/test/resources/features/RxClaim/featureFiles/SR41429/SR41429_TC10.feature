Feature: Part D Correct Tier Exception update logic
As a RxClaim User I want to check plan tier in formulary screen for DPA 

  Scenario Outline: Flag is blank and override will be used for DPA
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
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "4" to navigate to "RxClaim Dynamic Prior Authorization"
    And I select Option "1" to navigate to "Dynamic Prior Authorization"
    Then I create DPA for entering the blank plantier details with "<CarrierID>","<PANum>","<Tier>","<Formulary Status>"
    And I modify the dates in the Preferred Product List Product Detail screen with "<From Date>","<Thru Date>","<PlanCode>"
    When I submit a  DPA manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<First Name>","<Last Name>","<ProductID>","<DspQty>","<DS>","<PSC>","<SubmittedPA>","<PANum>"
		Then Validate Claim Status is "P" 
		And I press "F7" Key
		And I enter "21" in field "Selectionfield" on "TransactionDetailList" 
		And I press "Enter" Key
		Then I validate the tier code in formulary screen
    
    Examples:
   
      | CarrierID | AccountID | GroupID  | PlanCode | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | From Date | Thru Date | PANum | SubmittedPA | UsageType | ApplyMIC | Type | Wildcard | Basis | ReasonCode | Utilization | Agent | PA | DrugSts | PAGPIList | Sts | Tier | Formulary Status |
      | T1621 | A1621 | G1621 | TESTDYNAMI  | S41429A | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | CCHA | *ALL    | GACH | 200060000000 | 00     | 7252018   | 00054014225 | 90    | 90 | 0   | 010118 | 123118 | 66785887808 | 1 | 1 | N | 2 | 0 | F | AA | N | a | Y | N | AKUR LIST | A | 01 | 04 |
       
      