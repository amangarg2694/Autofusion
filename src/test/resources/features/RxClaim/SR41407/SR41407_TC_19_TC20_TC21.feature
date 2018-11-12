Feature: GPI Contraindications Override List Record Detail
As a RxClaim User I want to ADD GPI Contraindications Override List Record Detail
    
             
   Scenario Outline: GPI Contraindications Override List Record Detail
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "6" to navigate to "RxClaim DUR Maintenance"
    And I select Option "2" to navigate to "RxClaim DUR User Override Maintenance"
    And I select Option "6" to navigate to "GPI Contraindications Override Lists"
    And I check GPI Contradictions Override List before performing load with "<List>"
    And I select Option "CCT700" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "24" to navigate to "RxClaim Product Overrides"
    And I select Option "10" to navigate to "Load for GPI Contraindications Override List"
    Then Validate the GPI List with "<List>","<IPfilename>","<LibName>"
    
    
    
   
    
    
    
    
    
              
          
       
    Examples:
    |List     |IPfilename|LibName|
    |Test906  | Test41407|USRSWETHA|