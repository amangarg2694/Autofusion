
Feature: HIX Update EX8 & EX9 with additional fields per CMS
  
  Scenario Outline: SN374531_SR41834_TC001:Verify if extra file formats are added to File format field in Create Health Insurance Marketplace Extract screen
		Given I am on RxClaim PlanAdministrator Menu 
		When I press "F3" Key 
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "7" to navigate to "RxClaim Utility Programs"
		And I select Option "50" to navigate to "Create Health Insurance Marketplace Extract"
		And I verify if extra file formats are added to file format in "Create Health Insurance Marketplace Extract"
		And I press "F1" in file format field
 		Then I verify the message "Wrk File Format PRCHIMEXT Help"
 		
 		
   
      Examples: 
      |test|
      |tet|	