Feature: SN003367_SR41687: Compound in PAS-Phase3
  
  Scenario Outline: SN003367_SR41687_TC001.To check if the GPI12 record is inserted when only a GPI 14 record is present on the inout file for the medispan batch load
		
		Given I am on RxClaim PlanAdministrator Menu
		When I press "F3" Key 
		And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "2" to navigate to "RxClaim Product Files Loads Menu"
		And I select Option "1" to navigate to "RxClaim Medi-Span File Loads"
		And I select Option "3" to navigate to "Medi-Span MDDBV25 Product/Cost Update"
		And I enter value for file in "Medi-Span MDDBV25 Product/Cost Update"
		And I press "F6" Key
		Then I verify job status & verify the files
		
		
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
