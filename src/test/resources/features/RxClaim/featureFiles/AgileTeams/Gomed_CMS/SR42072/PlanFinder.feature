Feature: Create New Plan Finder Output file for year 2019 with Publication Date Pricing flag as No 
 
 Scenario Outline: Verify if new Plan finder job ouput file got generated for year 2019 with Publication Date Pricing flag as No
    
       
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "cct700" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		And I select Option "20" to navigate to "RxClaim Medicare Part D Batch Processing"
		And I select Option "2" to navigate to "RxClaim Plan Finder" 
		And I select Option "1" to navigate to "Plan Finder File Generation"
		And I submit the details in the screen Plan Finder File Generation with "<CarrierID1>","<AccountID1>","<GroupID1>","<PlanYear>","<Version>","<Library>", "<PublicationDatePricing>"
    Then I validate  job is successful with "<juser>", "<jname>", "<Library>"
    And I Verify if new Plan finder job ouput file got generated for given year with Publication Date Pricing flag enabled with "<Library>"
     
  
     
     Examples: 
     |CarrierID1  |AccountID1  | GroupID1 | PlanYear |Version|Library   |PublicationDatePricing|juser|jname|
     |MAC					|MAC   			 |SN002678B |	2019		|2016		 |SPARAVALIB|	N                    |SAPA|RCPD1040|
  
 