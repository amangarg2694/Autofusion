Feature: GPI Contraindications Override List Record Detail
As a RxClaim User I want to ADD GPI Contraindications Override List Record Detail
    
             
   Scenario Outline: GPI Contraindications Override List Record Detail
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "6" to navigate to "RxClaim DUR Maintenance"
    And I select Option "2" to navigate to "RxClaim DUR User Override Maintenance"
    And I select Option "6" to navigate to "GPI Contraindications Override Lists"
    And I press "F6" Key 
    And I add a list with "<List>","<Description>","<DMGenericName>","<MedCond>","<RespCode>","<AgeMin>","<AgeMax>","<MsgCode>"
    
    
              
          
       
    Examples:
    |List     |Description|DMGenericName                |MedCond  |RespCode|AgeMin|AgeMax|MsgCode   |
    |Test902  | Test      | ACETAMINOPHEN W/ CODEINE    |PREGNANCY|    H   |  10  |  70  |.5TRIAZOLM|
