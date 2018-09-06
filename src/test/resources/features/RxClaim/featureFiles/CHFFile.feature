Feature: Validate CHF File
As a RxClaim User I want to validate CHF File
    
             
   Scenario Outline: Create a new CAG in RxClaim 
   
    When I submit CHF job
    Then Validate Actual CHF File "<ActualFileName>" with expected file "<ExpectedFileName>" 
   
   Examples:
   | ActualFileName | ExpectedFileName |
   |UHCCOMM20180903_RXCHF70CL.txt | Expected CHF Data.csv |
