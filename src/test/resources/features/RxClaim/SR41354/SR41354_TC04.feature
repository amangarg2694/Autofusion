Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confiramtion
    
             
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F12" Key 
    And I select Option "CCTA00" to navigate to "RxClaim Client Customer Service"
    And I press "Enter" Key 
    When I edit member details with "<MemberID>","<Address2>"
    Then validate user navigated to Main menu
    
    
   
     
    
       
       
    Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| TC4MEM01 |  010117    | 123117    |Test    | 	
    
    
