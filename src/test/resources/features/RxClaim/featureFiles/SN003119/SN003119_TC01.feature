@SN003119 @BPE @Release_8404
Feature: BPE additions
Best Price Engine program will update the RxClaim trial claim webservice to include three more data elements in it�s 
response.  


Scenario Outline: Verify Network ID field is blank

	Given I am on RxClaim PlanAdministrator Menu 
	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "6" to navigate to "Claims by Pharmacy"
	And I press "F8" Key
	And I enter "<ClaimID>" in field "ClaimID" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I enter "5" in field "Opt1" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "8" in field "Selectionfield" on "TransactionDetailList"
	And I press "Enter" Key
	Then Validate "<Network>" in field "Network" is displayed on "ClaimTransactionAdditionalInfoScreen"
	
Examples:
	|ClaimID         |Network|
	|181724244168000 |       |

	
	
Scenario Outline: Verify Discount Indicator is Y

	Given I am on RxClaim PlanAdministrator Menu 
	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "6" to navigate to "Claims by Pharmacy"
	And I press "F8" Key
	And I enter "<ClaimID>" in field "ClaimID" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I enter "5" in field "Opt1" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "8" in field "Selectionfield" on "TransactionDetailList"
	And I press "Enter" Key
	Then Validate "<Discount>" in field "Discount" is displayed on "ClaimTransactionAdditionalInfoScreen"
	
Examples:
	|ClaimID         |Discount|
	|181724244168000 |Y       |


Scenario Outline: Verify Plan Qualifier is EBP

	Given I am on RxClaim PlanAdministrator Menu 
	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "6" to navigate to "Claims by Pharmacy"
	And I press "F8" Key
	And I enter "<ClaimID>" in field "ClaimID" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I enter "5" in field "Opt1" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And Validate "<Plan>" in field "Plan" is displayed on "ClaimTransactionDetailScreen"
	And I click in field "Plan" on "ClaimTransactionDetailScreen"
	And I press "F4" Key
	Then Validate "<PlanQualifier>" in field "PlanQualifier" is displayed on "PlanDetailScreen"
	
	
Examples:
	|ClaimID         |Plan   |PlanQualifier|
	|181724244168000 |BPE-ESP|EBP          |

	
Scenario Outline: Verify Transition of Care (TOC) Indicator is Blank

	Given I am on RxClaim PlanAdministrator Menu 
	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "6" to navigate to "Claims by Pharmacy"
	And I press "F8" Key
	And I enter "<ClaimID>" in field "ClaimID" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I enter "5" in field "Opt1" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I press "F7" Key
	And I enter "30" in field "Selectionfield" on "TransactionDetailList"
	And I press "Enter" Key
	Then Validate "<TOCClaim>" in field "TOCClaim" is displayed on "ClaimTransactionTOCDetailScreen"
	
Examples:
	|ClaimID         |TOCClaim|
	|181724244168000 |        |
	
	@trialclaim
	Scenario Outline: Submit a Trial Claim 
	 Given I am on RxClaim PlanAdministrator Menu 
	 When I select Option "3" to navigate to "RxClaim Manual Claim Menu"
	 And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
	 And I select Option "8" to navigate to "Trial Transaction"
	 And I enter "<MemberID>" in field "MemberID" on "TrialTransactionScreen"
	 And I press "Enter" Key
	 And I enter "1" in field "Selection" on "TrialTransactionScreen"
	 And I press "Enter" Key
	 And I enter "B1" in field "TransCd" on "TrialTransactionSubmissionPageScreen"
	 And I enter "<RxNo>" in field "RxNo" on "TrialTransactionSubmissionPageScreen"
	 And I press "Enter" Key
	 And I press "F6" Key
	 And I press "Enter" Key
	 And I press "F7" Key
	 And I press "F7" Key
	 And I enter "8" in field "Selectionfield" on "TransactionDetailList"
	 And I press "Enter" Key
	 And Validate "<Network>" in field "Network" is displayed on "ClaimTransactionAdditionalInfoScreen"
	 And Validate "<Discount>" in field "Discount" is displayed on "ClaimTransactionAdditionalInfoScreen"
	 And I press "F12" Key
	 And I enter "30" in field "Selectionfield" on "TransactionDetailList"
	 And I press "Enter" Key
	 Then Validate "<TOCClaim>" in field "TOCClaim" is displayed on "ClaimTransactionTOCDetailScreen"
	 
	 
Examples: 
|RxNo          |MemberID      |Network|Discount|TOCClaim|   
|900019931004  |BPE-ESP MBR 1 |       |Y       |N       |
