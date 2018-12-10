#Author: your.email@your.domain.com

#@tag
Feature: FIX-IT: Member Adjustment Load with Medical Data File Closing Issue

 #@Regression
  Scenario Outline: SN003417_SR42278_TC01: Verify member is loaded with medical data, file status does not return Error Code41(File Open)
    Given I am on RxClaim PlanAdministrator Menu
    When I create physical file with "<cmdCreatePhyFile>", "<FileName>", "<Library>"
    #And I verify  "<FileName>", "<Library>"
    And I work with file "<FileName>", "<Library>" with command "<cmdWorkWithFile>"
    #And I add record with 
      
    Given I am on RxClaim PlanAdministrator Menu 
    When I press "F3" Key
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "8" to navigate to "Loads to Member Files"
		And I select Option "3" to navigate to "Member Adjustment Load with Medical Data"
		And I submit Member Adjustment Load with Medical Data with "<FileName>", "<Library>"
		Then I work with single record display
		
		Given I am on RxClaim PlanAdministrator Menu 
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "2" to navigate to "Member"
	  Then I edit member details "<MemberID>"
		And I press "F8" Key
		And I enter "13" in field "Selection" on "MemberDetailListScreen"
		And I select option "1" for Member Accumulation Adjustments in Adjustment screen
		Then I validate Manual Adjustment details page 
		
		Then I Submit Standard Extract Job "<ExtractDate>"
		And I verify submitted Standard Extract Job status "<wsQuery>", "<ExtractJobName>"
		And I press "F3" Key
		And I press "F3" Key
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"

    Examples: 
      |cmdCreatePhyFile |FileName |Library  |cmdWorkWithFile |
      |CRTPF            |JZ34171  |JZELTEST |YWRKF					 |
      
