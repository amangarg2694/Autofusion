
Feature: Title of your feature
  I want to use this template for my feature file
  
Scenario Outline: Verify plan setup
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<PlanCode>"
		And I verify Compounds in Plan details page
		And I press "F7" Key 
		And I select Compounds options and Multiple Ingredient Compound option in Plan Option
		And I verify NDC list for MIC "<NDC_MIC>"
		And I verify Option Levels for Claim Product Status and Claim Multi-Source Code
  	And I verify Non Part D Covered "<NonPartDCovered>"
  	Then I go back to Plan Maintenance Screen
  	
    #public String NDC_MIC=null;
    #VENKATPLN, PLAN8
   Examples: 
      | PlanCode 		| NDC_MIC		|	NonPartDCovered	|	
      | VENKATPLN		| SN002643	|	1								|   
       
 Scenario Outline: Verify Pricing setup
		When I select Pricing Option in Plan Options screen
		And I select Pharmacy - Reimbursement option
		And I validate Plan Pharmacy Price Schedule "<PriceSchedule>"
    Then I go back to Plan Maintenance Screen
    
   Examples: 
      | PriceSchedule | 
      | PRCSCH2647		|    
      
 Scenario Outline: Verify Multi-Ingredient Compound NDC List setup
		When I select Product List option
		And I select Multi-Ingredient Compound NDC List option
		And I verify MIC NDC LIST"<NDC_MIC>"
		And I verify NDC ID
		And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key
    And I press "F12" Key
    
   Examples: 
      | NDC_MIC 	| 
      | SN002643	| 
      
