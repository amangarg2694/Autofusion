
Feature: Title of your feature
  I want to use this template for my feature file
  
Scenario Outline: Verify plan setup
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<PlanCode>"
		And I verify Compounds in Plan details page
		And I press "F7" Key 
		And I select Multiple Ingredient Compound option in Compound Options
		And I verify NDC list for MIC "<NDC_MIC>"
		And I verify Option Levels for Claim Product Status and Claim Multi-Source Code
  	And I verify Non Part D Covered "<NonPartDCovered>"
  	Then I go back to  Plan Options Screen
  	
    #public String NDC_MIC=null;
    #VENKATPLN, PLAN8
   Examples: 
      | PlanCode 		| NDC_MIC		|	NonPartDCovered	|	
      | VENKATPLN		| SN002643	|	1								|    

Scenario Outline: Verify Pricing setup
		When I select Pricing Option in Plan Options screen
		And I selct Pharmacy - Reimbursement option
		And I validate Plan Pharmacy Price Schedule "<PriceSchedule>"
    
   Examples: 
      | PriceSchedule | 
      | PRCSCH2647		|   
      
 Scenario Outline: Verify Multi-Ingredient Compound NDC List
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan code"
		And I verify plan "<PlanCode>"
		And I verify Compounds in Plan details page
		And I press "F7" Key 
		And I select Multiple Ingredient Compound option in Compound Options
		And I verify NDC list for MIC "<NDC_MIC>"
		And I verify Option Levels for Claim Product Status and Claim Multi-Source Code
  	And I verify Non Part D Covered "<NonPartDCovered>"
  	Then I go back to  Plan Options Screen
  	
    #public String NDC_MIC=null;
   Examples: 
      | PlanCode  | NDC_MIC		|	NonPartDCovered	|	
      | PLAN8			| SN002643	|	1								|  