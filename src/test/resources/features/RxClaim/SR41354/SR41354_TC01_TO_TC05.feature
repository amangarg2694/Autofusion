Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confirmation

  
   #I want to edit a existing Member using F24 key on CCT600 screen 
   @TC01         
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    When I edit member details with "<MemberID>","<Address2>"
    Then Verify "Address2" field data on "MemberDetailScreen"
    
    
     Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| EXEMEM02 |  010117    | 123117    |Test    | 	
    
   #I want to edit a existing Member using F24 key on CCTL00 screen 
   @TC02
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
		
		
		#I want to edit a existing Member using F24 key on CCTU00 screen
		@TC03
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
		
		#I want to edit a existing Member using F24 key on CCTA00 screen
		
		@TC04
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
		
		#I want to edit a existing Member using F24 key on SXCA00 screen	
		@TC05
		Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F12" Key 
    And I select Option "SXCA00" to navigate to "RxClaim Client Customer Service"
    And I press "Enter" Key 
    When I update member data with "<MemberID>","<Address2>"
    Then validate user navigated to Main menu
    
       
       
    Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| TC5MEM01 |  010117    | 123117    |Test    | 	
		
		