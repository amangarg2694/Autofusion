Feature: Copy a Member
As a RxClaim User I want to copy a New Member to the new CAG
    
             
   Scenario Outline: Copy a new member in RxClaim to the new CAG
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberScreen"
    And I press "Enter" Key 
    And I press "F8" Key
    Then I copy a Member with "<MemberID>","<CarrierID>","<AccountID>","<GroupID>","<From Date>","<Thru Date>"
       
    
    
    
   
    Examples:
    | CarrierID | AccountID  | GroupID    | MemberID  | From Date | Thru Date |
		|	SR4097CR1 | SR4097ACC1 |	SR4097GR2 | EXEMEMR07 | 010117    | 123117    |
		|	SR4097CR1 | SR4097ACC1 |	SR4097GR2 | EXEMEMR08 | 020117    | 123117    |
		