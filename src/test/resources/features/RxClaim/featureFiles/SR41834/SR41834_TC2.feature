Feature: HIX Update EX8 & EX9 with additional fields per CMS
  
  Scenario Outline: SN374531_SR41834_TC002:Verify the message that will be diplayed when file name is not entered during batch submission.
		Given I am on RxClaim PlanAdministrator Menu 
		When I press "F3" Key 
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "7" to navigate to "RxClaim Utility Programs"
		And I select Option "50" to navigate to "Create Health Insurance Marketplace Extract"
		And I enter fromDate "<FromDate>", thruDate "<ThruDate>", carrierFrom "<Carrierfrom>", carrierThru "<Carrierthru>", fileFormat "<fileFormat>", libraryName "<libraryName>"
		And I press "F6" Key
		Then I verify the message when file name is not entered
		
		
		
		
		
		
		
    Examples: 
      | FromDate | ThruDate | Carrierfrom| Carrierthru 	|	fileFormat	|	libraryName	|
      | 010118	 | 123118 	| SN002456   | SN002456 		|			ST			|		ANMISHA		|
     