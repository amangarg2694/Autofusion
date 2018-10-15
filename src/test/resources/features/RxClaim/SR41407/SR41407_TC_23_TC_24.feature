Feature: GPI Contraindications Override List Record Detail
As a RxClaim User I want to ADD GPI Contraindications Override List Record Detail
    
             
   Scenario Outline: GPI Contraindications Override List Record Detail
   Given I am on RxClaim PlanAdministrator Menu 
   And I press "F12" Key 
   When I select Option "21" to navigate to "RxClaim Operations Menu"
   And I select Option "5" to navigate to "RxClaim Reports Menu"
   And I select Option "8" to navigate to "Plan and Product Reports Menu"
   And I select Option "6" to navigate to "DUR Override List Details Report"
   Then validate the report with "<DUROLType>","<DUROList>"
    
    
    
    
   
    
    
   
    
    
    
    
    
              
          
       
    Examples:
    |DURTableName|     
    |Test507  |