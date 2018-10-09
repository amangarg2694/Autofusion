Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added
    
    Examples:
<<<<<<< HEAD
    | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	SR42037  | SR42037 |	SR42037 | SR42037M | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139   |
=======
    | CarrierID | AccountID   | GroupID     | MemberID   | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	ACLAIMC1  | AUTOCLAIMA1 |	AUTOCLAIMG1 | RUPMEM0005 | AUTOMEM    | AUTOMEM   | 12251987 | 010101    | 123139   |
>>>>>>> 0a5de481a227d2798a432f4ce122818c79374731
    
   
