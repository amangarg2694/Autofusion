 Feature: Member with the Override Plan 

   Scenario Outline: Search Rxclaim for Member with the Override Plan 

  Given I am on RxClaim PlanAdministrator Menu  
     And I select Option "2" to navigate to "Active/Eligible Member by ID" 
     And I enter Member id "<MemberId >"
     And I press "Enter" Key
     And I press "5" to navigate to the "Member Detail"  
     And I validate  the data displayed in the  Override plan displayed       
 
 
  # Examples:
 |MemberId|
 