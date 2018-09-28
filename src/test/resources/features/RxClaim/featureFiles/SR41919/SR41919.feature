Feature: SN374590_SR41919: FIX IT: Update Batch Claim Load Override Submission Da
  
  Scenario: SN374590_SR41919_TC001_Verify that Call RX12215C1 before changes/SN374590_SR41919_TC002_ Verify that Call RX12215C1 after changes
		Given I am on RxClaim PlanAdministrator Menu
		When I press "F3" Key 
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "3" to navigate to "RxClaim Claims Payment Menu"
		And I select Option "3" to navigate to "RxClaim Media Generation Programs"
		And I select Option "9" to navigate to "NCPDP D.0 Batch Output Format"
		And I enter values for relevant fields in the "NCPDP D.0 Batch Output Format"
		And I press "F6" Key
		And I verify the records by submitting the job
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		And I select Option "4" to navigate to "Batch Transaction Processing"
		And I select Option "3" to navigate to "Batch Medicaid Subrogation (51) Load"
		And I enter values for relevant fields in "Batch Medicaid Subrogation (51) Load"
		And I press "F6" Key
		And I verify the records by submitting the job and display the records
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		And I select Option "4" to navigate to "Batch Transaction Processing"
		And I select Option "2" to navigate to "Batch Standard V11 & V11E Claim Load"
		And I enter values for relevant fields "Batch Standard V11 & V11E Claim Load"
		And I press "F6" Key
		And I verify the records by submitting the job and display records
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		And I select Option "4" to navigate to "Batch Transaction Processing"
		And I select Option "4" to navigate to "Batch Standard V12 & V12E Claim Load"
		And I enter values for relevant fields "Batch Standard V12 & V12E Claim Load"
		And I press "F6" Key
		And I verify the records by submitting job and display records
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
		And I select Option "4" to navigate to "Batch Transaction Processing"
		And I select Option "1" to navigate to "Batch Claims Load Module"
		And I enter values for relevant fields for "Batch Claims Load Module"
		And I press "F6" Key
		And I verify records by submitting job and display records
		
  

		
    