Feature: Verify the member details are updated even without confirmation
As a RxClaim User I want to edit a existing Member without confirmation

  
   #I want to edit a existing Member using F24 key on CCT600 screen 
   @TC01         
   Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    When I edit member details with "<MemberID>" and "<Address2>"
    #Then Verify "Address2" field data on "MemberDetailScreen"
    #Then Verify the "<Address2>" field data in MemberDetailScreen ( Covered in above)

    
    Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| SRMEMVM01  |  010117    | 123118    |Test5  | 	
    

    
   #I want to edit a existing Member using F24 key on CCTL00 screens 
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
		| SRMEMVM01 |  010117    | 123118    |Test6   | 	CCTL00   |
		
		
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
		| SRMEMVM01 |  010117  | 123118    |Test7   |
		
		#I want to edit a existing Member using F24 key on CCTA00 screen
		
		@TC04
		Scenario Outline: Edit a existing Member details without confiramtion
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F12" Key 
    And I select Option "CCTA00" to navigate to "RxClaim Client Customer Service"
    And I press "Enter" Key 
    When I edit member details with "<MemberID>","<Address2>"
    #Then validate user navigated to Main menu
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu" 
               
           
       
    Examples:
    | MemberID |  From Date | Thru Date |Address2|           
		| SRMEMVM01 |  010117    | 123118    |Test5 | 
		
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
		| SRMEMVM01 |  010117    | 123118    |Test6| 	
		
		