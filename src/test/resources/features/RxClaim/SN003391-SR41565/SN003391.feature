Feature: Add logic to CAMS outbound process to check HFB table (ACMP240T)
 
 Scenario Outline: SN003331_SR41449_TC001_Verify if note is added to manual claim when Medicaid Subrogation = Y and Negative Amount Due = Y
    Given I am on RxClaim PlanAdministrator Menu
    When I press "F3" Key 
    And I enter "<Library>" to library list
    And I verify adding "<ACMP_Table>","<carrier>","<account>","<group>" to DBU
    
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "2" to navigate to "RxClaim Patient Pay Maintenance"
    And I select Option "2" to navigate to "Patient Pay Table"
    And I enter "<PlanSearch>" in field "PlanSearch" on "PatientPayTable"
    And I press "Enter" Key
   	And I verify the PatientPayTable exists in "Patient Pay Table Screen"
    And I enter "2" in field "SearchResult" on "PatientPayTable" 
    And I press "Enter" Key
    And I verify the AmountValue in "Patient Pay Table Details"
    And I enter "<NegativeDueValue>" in field "NegativeDueValue" on "PatientPayTable"
    And I press "Enter" Key
    And I press "F3" Key 
	  And I press "F3" Key 
    And I press "PageDown" Key
    And I enter "<Rx Origin>" in field "Rx Origin" on "TransactionSubmissionPayeeOverride1of3"
    And I press "Enter" Key  
    And I press "PageUp" Key
    And I press "F6" Key 
    And I Verify the RxClaim Number "<RxClaim#>"
    And I press "F7" Key 
    
    #Scenario Outline: Check Claim note when Claim Submitted with Medicaid Subrogation to Y in RxClaim 
    And I press "F14" Key
    And I verify the Medicaid Subrogation pricing logic "<Claim Note>" exists in "ClaimNoteTable Details"
    And I verify the Prevented negative amount due "<Claim Note>" exists in "ClaimNoteTable Details"
    And I press "F12" Key
    
 	 Examples: 
      |Library	|ACMP_Table	|carrier	|account	|group	|
      |DBU10		|ACMP240T		|NA2017		|1000			|100		|

