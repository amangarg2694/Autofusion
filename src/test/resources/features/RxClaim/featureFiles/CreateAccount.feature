Feature: Create New Account
As a RxClaim User I want to create a New Account
    
             
   Scenario Outline: Create a new Account in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Account with "<CarrierID>","<AccountID>","<AccountName>"
    Then Validate Account created with "<AccountID>"
   
   Examples:
    | CarrierID | AccountID  | AccountName  | 
    | TESTAOTC9 | TESTA3TA19 | Test Account |
    
     
    
   