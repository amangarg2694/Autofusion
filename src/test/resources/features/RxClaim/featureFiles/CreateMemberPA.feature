Feature: Create New Member with PA
As a RxClaim User I want to create a New Member with PA
    
             
   Scenario Outline: Create a new member in RxClaim with PA
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate PA Member "<MemberID>" added
    When I create PA Number "<PANumber>","<Type>","<PAOTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    Then Validate PANumber "<PANumber>" added
    
    Examples:
    | CarrierID | AccountID   | GroupID     | MemberID    | FirstName  | LastName  | DOB      | FromDate  | ThruDate |PANumber|Type|PAOTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
		|	ACLAIMC1  | AUTOCLAIMA1 |	AUTOCLAIMG1 | AUTMEM0005  | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139   |2345678 |G   |*    |65100050101310|010101|123139|e    |AA    |N               |
    
   
