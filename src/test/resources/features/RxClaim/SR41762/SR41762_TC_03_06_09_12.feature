Feature: ADD POS Rebate List
As a RxClaim User I want to ADD POS Rebate List
    
            
   Scenario Outline: ADD POS Rebate List in ADD and Edit mode
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I update the plan with "<Plan>","<Flob>","<Fform>","<Fspec>","<Fbrate>","<FAdminRate>","<FPricePR>","<FBrandfg>","<FCrspec>","<FCompre>","<Fltd>"
    Then verify the values are as expected 
              
    
           
    Examples:
    |Plan|Flob|Fform|Fspec|Fbrate|FAdminRate|FPricePR|FBrandfg|FCrspec|FCompre|Fltd|
    |Test|E   |A    | S   |  0   |    0     |   0    |    Y   |   Y   |  Y    |  Y |
    |Test|E   |A    | S   |100.00|101.00    |099.99  |    Y   |   Y   |     Y |  Y |
    |Test|E   |A    | S   |100.10|100.00    |099.99  |    Y   |   Y   |     Y |  Y |             
    |Test|E   |A    | S   |121.00|122.00    |434.00  |    Y   |   Y   |     Y |  Y |