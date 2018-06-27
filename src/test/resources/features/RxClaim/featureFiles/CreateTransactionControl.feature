Feature: Create New Transaction Control Table
As a RxClaim User I want to create a New TCT By B/P/G
         
    Scenario Outline: Add a Transaction Control by B/P/G in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "8" to navigate to "Profile"
    And I select Option "2" to navigate to "Transaction Control"
    And I press "F6" Key 
    And I enter "<BIN>" in field "BIN" on "AddTransactionControlScreen"
    And I enter "<PCN>" in field "PCN" on "AddTransactionControlScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddTransactionControlScreen"
    And I enter "<From Date>" in field "FromDate" on "AddTransactionControlScreen"
    And I enter "<Thru Date>" in field "ThruDate" on "AddTransactionControlScreen"
    And I press "Enter" Key
    And I enter "<CarrierID>" in field "CarrierID" on "TransactionControlDetailScreen"
    And I enter "<AccountID>" in field "AccountID" on "TransactionControlDetailScreen"
    And I enter "<GroupID>" in field "GroupID" on "TransactionControlDetailScreen" 
    And I press "Enter" Key  
    Then Validate record added with details "<BIN>" , "<PCN>" ,"<CarrierID>" ,"<AccountID>","<GroupID>"
  
    
    Examples:
    | BIN    | PCN    | CarrierID | AccountID   | GroupID     | From Date | Thru Date | 
		|	666666 | 000133 | ACLAIMC1  | AUTOCLAIMA1 | AUTOCLAIMG1 | 010101    | 123139    |
		
    
        
    
