Feature: Part D: Update EOB header file to capture e-delivery flag
As a RxClaim User I want to validate Communication Preferred Method’ and read only field ‘Communication Digital Address’ for screen RCMBR104
    
             
   Scenario Outline:verify member Member E-mail Address screen(RCMBR104) 
    Given I am on RxClaim PlanAdministrator Menu 
    When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance "
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    Then Validating the Communication Preferred Method and read only field Communication Digital Address in member screen with "<MemberID>"
    
   Examples:
    | MemberID | 
    | NARESH_MEM001 | 
    
   