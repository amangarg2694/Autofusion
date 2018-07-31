Feature: Plan maintainance utility updates 
As a RxClaim User I want to update plan maintainance utility
    
             
   Scenario Outline: Update plan maintainance utility
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "4" to navigate to "RxClaim Plan Maintenance" 
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen" 
    And I press "Enter" Key
    And I enter "<Option1>" in field "PlanCodeOption" on "ActivePlanbyPlanCodeScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "<Option2>" in field "Enteryouroption" on "PlanOptions"
    And I press "Enter" Key
    
    And verify DEAClasstwo details with "<SuperNDC>","<SuperGPI>" 
    And I select Option "13" to navigate to "RxClaim Utilities"
    And I select Option "1" to navigate to "Plan Maintenance Utility Template"
    And I create plan template with "<TemplateID>","<PlanCode>","<fromdate>","<DEAclasscode>","<DEAfromdate>","<Action>"
    
    And I modify plan with "<SuperNDCProcess>","<SuperGPIProcess>" ,"<SuperNDCNewValue>","<SuperGPINewValue>","<ActPrc>","<ActExstVal>","<ActNewVal>", "<DrgStsPrc>","<DrgStsExstVal>" ,"<DrgStsNewVal>"                           
    
    And I select Option "4" to navigate to "RxClaim Plan Maintenance" 
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen" 
    And I press "Enter" Key
    And I enter "<Option1>" in field "PlanCodeOption" on "ActivePlanbyPlanCodeScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "<Option2>" in field "Enteryouroption" on "PlanOptions"
    And I press "Enter" Key
    Then validate the plan with "<SuperNDCNewValue>","<SuperGPINewValue>"
    
    
    
    
    
        
    
    
    
    Examples:
    
    |PlanCode   |Option1|Option2|Selection1|SecondRec| TemplateID | fromdate | DEAclasscode | DEAfromdate | Action |SuperNDCProcess|SuperGPIProcess|SuperNDCNewValue|SuperGPINewValue|ActPrc|ActExstVal|ActNewVal|DrgStsPrc|DrgStsExstVal|DrgStsNewVal|              
    |SR41568TWO |   2   |13     |    2     | 5       |   EC06 | 010191   |     2        |  010117     |    R   |   N           |N              |    TEST        |    TESTCASE49   |   C  |     Y    |    Y    |    C    |     F       |    F       |
    
         
      
            
  
       
    
    