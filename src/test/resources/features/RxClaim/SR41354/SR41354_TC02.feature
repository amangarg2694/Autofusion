Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confiramtion
    
             
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F12" Key 
    And I select Option "CCTL00" to navigate to "RxClaim Client Customer Service"
    And I press "Enter" Key 
    When I update member details with "<MemberID>","<Address2>"
    Then validate user navigated to Main menu 
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    
    
    
   
     
    
       
       
    Examples:
    | MemberID |  From Date | Thru Date |Address2| SreenName |          
		| EXEMEM01 |  010117    | 123117    |Test1    | 	CCTL00   |
    
    
