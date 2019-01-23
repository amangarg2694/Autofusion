Feature: ADD POS Rebate List
As a RxClaim User I want to ADD POS Rebate List
    
             
    Scenario Outline: ADD POS Rebate List in ADD and Edit mode
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "1" to navigate to "RxClaim Price Schedule Maintenance"
    And I select Option "19" to navigate to "RxClaim 8.4.02 QA"
    And I press "F6" Key 
    And I enter "<ListName>" in field "List" on "AddPOSRebateList"
    And I enter "<Description>" in field "Desc" on "AddPOSRebateList"
    And I enter "<LineofBusiness>" in field "lob" on "AddPOSRebateList"
    And I enter "<Formulary>" in field "form" on "AddPOSRebateList"
    And I enter "<Specialty>" in field "spec" on "AddPOSRebateList"
    And I enter "<BaseRate>" in field "Brate" on "AddPOSRebateList"
    And I enter "<AdminRate>" in field "AdminRate" on "AddPOSRebateList"
    And I enter "<PriceProtectionRate>" in field "PricePR" on "AddPOSRebateList"
    And I press "Enter" Key 
    Then verify zero value can be entered and saved for POS Rebate List with "<ListName>"              
          
          
       
    Examples:
    
    
    |ListName |Description|LineofBusiness|Formulary|Specialty|BaseRate|AdminRate|PriceProtectionRate|
    |Test803  | testR04   |C             |P        |B        |  000.10|099.99   |010.99             | 
     