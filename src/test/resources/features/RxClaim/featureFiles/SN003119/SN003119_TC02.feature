Feature: BPE additions
Best Price Engine program will update the RxClaim trial claim webservice to include three more data elements in it’s 
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
	|181805044317000 |       |

	
	
Scenario Outline: Verify Discount Indicator is Blank

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
	|181805044317000 |        |


Scenario Outline: Verify Plan is Blank

	Given I am on RxClaim PlanAdministrator Menu 
	When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
	And I select Option "6" to navigate to "Claims by Pharmacy"
	And I press "F8" Key
	And I enter "<ClaimID>" in field "ClaimID" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	And I enter "5" in field "Opt1" on "ClaimsbyRxClaimNumberScreen"
	And I press "Enter" Key
	Then Validate "<Plan>" in field "Plan" is displayed on "ClaimTransactionDetailScreen"
	
	
	
Examples:
	|ClaimID         |Plan   |
	|181805044317000 |       |

	
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
	|181805044317000 |        |