Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confiramtion
    
             
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    When I edit member details with "<MemberID>","<Address2>"
    Then Verify "Address2" field data on "MemberDetailScreen"
    
    
     Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| EXEMEM02 |  010117    | 123117    |Test    | 	
    
    
