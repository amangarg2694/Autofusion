Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Transaction Detail File Screen


Scenario Outline: User should able to Validate PBP field in FIR Transaction Detail File screen. -  SN003129_SR42094_TC038_Req 5.1.1.3  SN003129_SR42094_TC039_Req 5.1.1.3  SN003129_SR42094_TC040_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"

Then I validate the PBP field "<PBP>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<Contract>","<Filename>","<Library>"
And I validate the PBP field "<PBP2>" length 

#Enter Existing Library,Contract,PBP 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|Contract|PBP|PBP2|
| 010101   |123139   |S42094F01  |USRSAKK| A0001  |A01|A012|





