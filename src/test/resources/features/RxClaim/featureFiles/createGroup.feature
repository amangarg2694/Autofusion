Feature: Create New Group
As a RxClaim User I want to create a New Group
    
             
   Scenario Outline: Create a new Group in RxClaim 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Group with "<CarrierID>","<AccountID>","<GroupID>","<GroupName>","<FromDate>","<ThruDate>","<PlanCode>"
    Then Validate Group created with "<GroupID>"
   
   Examples:
    | CarrierID |AccountID   | GroupID  |GroupName  |FromDate |ThruDate |PlanCode| 
    | TESTAOTC9 |TESTAOTA10 | TESTAOTG8|Test Group |010101   |123139   |AUTOEGWP| 
    
     