Feature: Verify Medlimit Detail screen for PA Prediction button
Scenario Outline: Verify "F8=PA Prediction" in Claim MEDLIMIT Detail Screen
    
Given I am on RxClaim PlanAdministrator Menu  
When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
And I select Option "6" to navigate to "Claims by Pharmacy"   
And I press "F8" Key
Then I validate "F8=PA Prediction"  for the claim "<RxClaimNo>" in Claim MEDLIMIT Detail Screen

Examples: 
|RxClaimNo|
|182482289442000|

Scenario Outline: Verify Medlimit Detail screen for PA Prediction button
Given I am on RxClaim PlanAdministrator Menu  
When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
And I select Option "6" to navigate to "Claims by Pharmacy"   
And I press "F8" Key
Then I validate "F8=PA Prediction"  for the claim "<RxClaimNo>" in Claim MEDLIMIT Detail Screen
And I press "F8" Key
Then I validate the screen name is "MEDLIMIT PA Prediction Summary"
Examples: 
|RxClaimNo|
|182482289442000|


Scenario Outline: Verify screen fields  in MEDLIMIT PA Prediction Summary Screen
Given I am on RxClaim PlanAdministrator Menu  
When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
And I select Option "6" to navigate to "Claims by Pharmacy"   
And I press "F8" Key
Then I validate "F8=PA Prediction"  for the claim "<RxClaimNo>" in Claim MEDLIMIT Detail Screen
And I press "F8" Key
Then I validate the screen name is "MEDLIMIT PA Prediction Summary"
And I validate the fields "Qty","DS","Prescriber" in MEDLIMIT PA Prediction Summary Screen

Examples: 
|RxClaimNo|
|182482289442000|