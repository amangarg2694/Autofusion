Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confiramtion
    
             
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F12" Key 
    And I select Option "CCTU00" to navigate to "RxClaim Client Customer Service"
    And I press "Enter" Key 
    When I modify member details with "<MemberID>","<Address2>"
    Then validate user navigated to Main menu 
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu" 
   
   
   
    
    
       
       
    Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| TC3MEM01 |  010117    | 123117    |Test    | 	
    
    
