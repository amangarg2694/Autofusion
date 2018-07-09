Feature: Edit Member
As a RxClaim User I want to edit a existing Member
    
             
   Scenario Outline: Edit a existing Member details and submit a claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I edit a member with "<MemberID>","<From Date>","<Thru Date>"
    Then Verify "Record Changed." message should displayed on "MemberDetailScreen"
    
    
    
       
       
    Examples:
    | MemberID |  From Date | Thru Date |            
		| EXEMEM01 |  010117    | 123117    |	
    | EXEMEM02 |  020117    | 123117    |   
    
