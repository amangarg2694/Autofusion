Feature: A manual claim is submitted with medicaid subrogation
 As a RxClaim User I want to A submit manual claim is with medicaid subrogation to Y in RxClaim
 
 
 Scenario Outline: Check Patient Pay Table Negative Due is Y
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "5" to navigate to "RxClaim Price Maintenance"
    And I select Option "2" to navigate to "RxClaim Patient Pay Maintenance"
    And I select Option "2" to navigate to "Patient Pay Table"
    And I enter "<PlanSearch>" in field "PlanSearch" on "PatientPayTable"
    And I press "Enter" Key
   	And I verify the PatientPayTable exists in "Patient Pay Table Screen"
    And I enter "2" in field "SearchResult" on "PatientPayTable" 
    And I press "Enter" Key
    And I verify the AmountValue "<AmountValue>" in "Patient Pay Table Details"
    And I enter "<NegativeDueValue>" in field "NegativeDueValue" on "PatientPayTable"
    And I press "Enter" Key
    And I press "F3" Key 
	  And I press "F3" Key 
    #And I verify the NegativeDueValue "<NegativeDueValue>" exists in "Patient Pay Table Details"
    #And I go to  RxClaim PlanAdministrator Menu
     
    #Scenario Outline: Check by Submitting Claim with Medicaid Subrogation to Y in RxClaim
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "10" to navigate to "Transaction w/Payee Override"
    And I press "F6" Key 
    And I enter "<BIN>" in field "BIN" on "AddTransactionwithPayeeOverride"
    And I enter "<Proc Ctr>" in field "Proc Ctr" on "AddTransactionwithPayeeOverride"
    And I enter "<Grp>" in field "Grp" on "AddTransactionwithPayeeOverride"
    And I enter "<Pharmacy>" in field "Pharmacy" on "AddTransactionwithPayeeOverride"
    And I enter "<Rx Nbr>" in field "Rx Nbr" on "AddTransactionwithPayeeOverride"
    And I enter "<Rf>" in field "Rf" on "AddTransactionwithPayeeOverride"
    And I enter "<Proc Ctr>" in field "Proc Ctr" on "AddTransactionwithPayeeOverride"
    And I enter "<Member ID>" in field "Member ID"
    And I enter "<Payee Override>" in field "Payee Override" on "AddTransactionwithPayeeOverride"
  	And I enter "<Medicaid Subrogation>" in field "Medicaid Subrogation" on "AddTransactionwithPayeeOverride"
    And I press "Enter" Key
    And I enter "<Prod: ID>" in field "Prod: ID" on "TransactionSubmissionPayeeOverride1of3"
    And I enter "<Disp Qty>" in field "Disp Qty" on "TransactionSubmissionPayeeOverride1of3"
    And I enter "<DS>" in field "DS" on "TransactionSubmissionPayeeOverride1of3"
    And I enter "<Cost>" in field "Cost" on "TransactionSubmissionPayeeOverride1of3"
    And I enter "<PSC>" in field "PSC" on "TransactionSubmissionPayeeOverride1of3"
    And I press "PageDown" Key
    And I enter "<Rx Origin>" in field "Rx Origin" on "TransactionSubmissionPayeeOverride1of3"
    And I press "Enter" Key  
    And I press "PageUp" Key
    And I press "F6" Key 
    And I press "F7" Key 
    
    #Scenario Outline: Check Claim note when Claim Submitted with Medicaid Subrogation to Y in RxClaim 
    And I press "F14" Key
    And I verify the Medicaid Subrogation pricing logic "<Claim Note>" exists in "ClaimNoteTable Details"
    And I verify the Prevented negative amount due "<Claim Note>" exists in "ClaimNoteTable Details"
    And I press "F12" Key
    
    #Scenario Outline: Check by Submitting Claim with Medicaid Subrogation to Y and Verify Pricing
    And I press "F15" Key 
  	And I verify the pricingOutput "<pricingOutput>"
    
   	And Validate "Approved Due Amount" on "Price Information Page 1 of 3"
   	Then I go Back to "RxClaim Plan Administrator Menu"
   	
     
      Examples: 
      |PlanSearch|NegativeDueValue|Table|BIN|Proc Ctr|Grp|Pharmacy|Rx Nbr|Rf|Member ID|Payee Override|Medicaid Subrogation|Prod: ID|Disp Qty|DS|PSC|Cost|Rx Origin|
      |$1.00|Y|SR40760A|777777|KDPCN|KDGRP|apharm|029823447|00|mem842-01|kiranpayee|Y|00247064407|2|3|0|5|5|
      |$1.00|N|SR40760A|777777|KDPCN|KDGRP|apharm|936127432|00|mem842-01|kiranpayee|Y|00247064407|2|3|0|5|5|

