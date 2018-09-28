Feature: Claim With PA Rejecting With GPI DS Limit
As a RxClaim User I want to check whether claim gets rejected when days supply goes beyond 120 limits 
    
Scenario Outline: To verify if a claim is passed when the period type is 'B' on the GPI/NDC list and the days supply  total starting from the PTD from date is less than or equal to the NDC/GPI DS specified

		Given I am on RxClaim PlanAdministrator Menu 
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "2" to navigate to "RxClaim Product List"
		Then I edit the plan NDC and GPI list with "<NDCList>","<MaxLimit>"
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
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
		And I press "F12" Key
		Then I edit MPA with "<MemberID>","<NDCGNum>","<From Date>","<Thru Date>","<Rsn>","<PAMaxLimit>","<Row>","<Col>"
		When claim is submitted with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Type>","<PAMaxLimit>"
		And I press "F12" Key
		Then Validating claim info in member screen with "<MemberID>"

Examples:
|PlanCode|From Date|Description|NDCList|GPIList|GPIName|ProductName|MaxLimit|GPIGNum|NDCGNum|PriceSchedule|Schedule|TroopSchedule|Thru Date| CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  |GroupFromDt|GroupThruDt| Contract | PBP | FormularyID | Benefit_Year | SubmitterID | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | ProductID  | DspQty | DS | PSC | Cost |Type|PAMaxLimit| MemberID    | First Name  | Last Name  | DOB      |Rsn|Row|Col|
|SR41427B7|010101|Test Plan|SR16|SR16|PROZAC|PROZAC|30 |01234567891021|58160040000110|SN003070|SN003070PP|RAD-TROOP|123139|SR41427B7|Test Carrier|712        |MAIL ADD|City|IL|78654|010101|123139| *DEFAULT | *DEFAULT | SR41427B7 |Test Account|SR41427B7|Test Group|010101|123139| B1008 | 100 | 10009 | 2018 | 20001 |	777777  | CCHA     |	*ALL  | APHARM      | 765488362004 | 00     | 00777310402|30      |30  |00   |100   |1|90| SR41427B9 | AUTOMEM    | AUTOMEM   | 12251987	|AQ|12|60|