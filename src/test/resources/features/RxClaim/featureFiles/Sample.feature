Feature: Member with Part D setup
   
             
   Scenario Outline: Create a new member in RxClaim with existing CAG for Medicare Part D 
   
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
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F8" Key
    And I send values for member medicare setup "<From Date>","<Thru Date>","<SupplyType>","<SupplyID>","<MMDFromDate>","<MMDThruDate>","<Contract>","<SubsidyLevel>","<CopayCat>"
    Then Member for Part D created
    
    
    
    
    Examples:
    | CarrierID| AccountID   | GroupID    | MemberID    | First Name | Last Name    | DOB       | From Date | Thru Date   |SupplyType|SupplyID|MMDFromDate|MMDThruDate|Contract|SubsidyLevel|CopayCat|
		|	CAR3036  | ACC3036     |	GRP3036    | MEDCARE2 | JOSHY        | MEM          | 01011970	| 010101    | 123139      |   06    |SN3036  |010118     |123118     |A3036   |000         |0       |