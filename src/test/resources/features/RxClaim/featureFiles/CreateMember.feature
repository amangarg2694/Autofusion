Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added
    
    Examples:

		| CarrierID 	| AccountID   	| GroupID     		| MemberID   		| FirstName  	| LastName  | DOB      | FromDate  | ThruDate |
		|	SID3340C1  	| SID3340C1A01 	|	SID3340C1A01G01 | test| LEE    			| RAYMOND   | 01011950 | 010118    | 123118   |
		    

