Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "13" to navigate to "RxClaim Utilities" 
    And I select Option "1" to navigate to "Plan Maintenance Utility Template"
    And I create plan template with "<TemplateID>","<PlanCode>","<fromdate>","<DEAclasscode>","<DEAfromdate>","<Action>"
    
    And I update plan with "<SuperNDCProcess>","<SuperGPIProcess>" ,"<SuperNDCNewValue>","<SuperGPINewValue>","<ActPrc>","<ActExstVal>","<ActNewVal>", "<DrgStsPrc>","<DrgStsExstVal>" ,"<DrgStsNewVal>","<SuperNDCExstValue>","<SuperGPIExstValue>"                              
    
    And I select Option "4" to navigate to "RxClaim Plan Maintenance" 
    And I select Option "1" to navigate to "Active Plan by Plan Code"
    And I enter "<PlanCode>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen" 
    And I press "Enter" Key
    And I enter "<Option1>" in field "PlanCodeOption" on "ActivePlanbyPlanCodeScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "<Option2>" in field "Enteryouroption" on "PlanOptions"
    And I press "Enter" Key
    Then validate the DEAClassTwo with "<SuperNDCNewValue>","<SuperGPINewValue>"
    
    
    
    
    
        
    
    
    
    Examples:
    
    |PlanCode   |Option1|Option2|Selection1| SuperNDC | SuperGPI | TemplateID | fromdate | DEAclasscode | DEAfromdate | Action |SuperNDCProcess|SuperGPIProcess|SuperNDCNewValue|SuperGPINewValue|ActPrc|ActExstVal|ActNewVal|DrgStsPrc|DrgStsExstVal|DrgStsNewVal|SuperNDCExstValue|SuperGPIExstValue|               
    |SR41568DUP |   2   |13     |    2     |  CMOL    |AJG35687  |   EC04 | 010191   |     2        |  010117     |    R   |   C           |C              |    TEST        |    TESTCASE49   |   C  |     Y    |    Y    |    C    |     F       |    F       |    RG41466D2    |  SADK          |
    
            
      
       
       
    
    