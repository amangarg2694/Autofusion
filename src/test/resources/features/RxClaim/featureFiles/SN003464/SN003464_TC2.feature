Feature: Part D: Update EOB header file to capture e-delivery flag
As a RxClaim User I want to validate Communication Preferred Method’ and read only field ‘Communication Digital Address’ for screen RCMBR104
    
             
   Scenario Outline:verify member Member E-mail Address screen(RCMBR104) 
    Given I am on RxClaim PlanAdministrator Menu 
    And I press "F3" Key
    When I select Option "CCT700" to navigate to "RxClaim Operations Menu" 
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu "
    And I select Option "8" to navigate to "Loads to Member Files"
   # And I enter command "<InputfileCmd>" to Work with Database File with "<FileName>","<libraryname>"
    And I select Option "19" to navigate to "Load Member Print Preference" 
    Then loading the job with "<FileName>","<libraryname>"
      
    
   Examples:
    |InputfileCmd	| FileName |   libraryname|
    |	ywrkf       | SN003464 |   Naresh     |
    
   # Scenario Outline:verify member Member E-mail Address screen(RCMBR104)
   # And I press "F3" Key
    #And I press "F3" Key
    #And I press "F3" Key
    #And I press "F3" Key
    #When I select Option "CCT600" to navigate to "RxClaim Operations Menu" 
    #And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance" 
    #And I select Option "2" to navigate to "Active/Eligible Member by ID" 
    #Then validating email id updated with "<Member>"
    #And I select Option "CCT700" to navigate to "RxClaim Operations Menu" 
    #And I enter query "<DBU_Query>"
    
    
      
    
    #Examples:
   # | Member       |  DBU_Query						|
   # | Naresh_mem001|  DBU NARESH/SN003464	|
    
    
    
   