Feature: Verify the F1 information on Submitted Claim Information screen RTCD004D
As a RxClaim user I want to verify the F1 information on Submitted Claim Information 


Scenario: Verify the F1 information on Submitted Claim Information screen RTCD004D
Given I am on RxClaim PlanAdministrator Menu
When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
And I select Option "6" to navigate to "Claims by Pharmacy"
And I press "F8" Key
And I select the transaction using option "5"
And I press "F7" Key
And I select option "3"
Then I validate the help file for Basis field in Submitted Claim Information Page  screen

Scenario: Verify the F1 information on Submitted Claim Information screen RCNCP051
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "1" to navigate to "RxClaim 51 Manual Claim Maintenance"
And I select Option "1" to navigate to "Transaction"
And I select Option "1" to select a claim in Transaction Screen
Then I validate the help file for Cost Basis field in Transaction Submission Page screen

Scenario: Verify the F1 information on Submitted Claim Information screen RCNCP051D
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
And I select Option "1" to navigate to "Transaction"
And I select Option "1" to select a claim in Transaction Screen
Then I validate the help file for Cost Basis field in Transaction Submission Page screen

Scenario: Verify the F1 information on Submitted Claim Information screen RCNCP051R
Given I am on RxClaim PlanAdministrator Menu
When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
And I select Option "2" to navigate to "Active/Eligible Member by ID"
And I search for the member "EPER_MEM1" and select suspended claim
And I select Option "1" to select a claim in Transaction Screen
Then I validate the help file for Cost Basis field in Transaction Submission Page screen

Scenario: Verify the F1 information on Submitted Claim Information screen RCNCP056B
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "1" to navigate to "RxClaim 51 Manual Claim Maintenance"
And I select Option "2" to navigate to "Member Reimbursement"	
And I search for claim "EPER-MEM"  to select and submit the Member Reimbursement
Then I validate the help file for Cost Basis field in Member Reimbursement Submission Page screen

Scenario: Verify the F1 information on Submitted Claim Information screen RCNCP056BD
Given I am on RxClaim PlanAdministrator Menu
When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
And I select Option "2" to navigate to "Member Reimbursement"
And I search for claim "EPER-MEM1"  to select and submit the Member Reimbursement from DO claims
Then I validate the help file for Cost Basis field in Transaction Submission Page screen




