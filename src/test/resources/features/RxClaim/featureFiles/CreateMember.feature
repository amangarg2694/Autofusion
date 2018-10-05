Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added
    
    Examples:
    | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	ACLAIMC1  | AUTOCLAIMA1 |	AUTOCLAIMG1 | RUPMEM0005 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139   |
    
   
