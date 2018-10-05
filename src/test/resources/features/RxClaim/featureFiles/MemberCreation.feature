Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
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
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
   
   
    Examples:
    | CarrierID | AccountID   | GroupID     | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date |
		|	ACLAIMC1  | AUTOCLAIMA1 |	AUTOCLAIMG1 | AUTOMEM0025 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139  |
    
    
    