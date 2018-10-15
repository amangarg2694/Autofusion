Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Transaction Detail File Screen


Scenario Outline: User should able to Validate Carrier From/Thru fields. - SN003129_SR42094_TC001_Req 5.1.1.3 SN003129_SR42094_TC002_Req 5.1.1.3 SN003129_SR42094_TC003_Req 5.1.1.3  SN003129_SR42094_TC004_Req 5.1.1.3 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu"
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"

Then I validate the alpha numeric for Carrier from field "<CarrierFrom>" and Carrier thru field "<CarrierThru>" with "<FIRFdate>","<FIRTdate>","<Filename>","<Library>"
And I validate the help text for Carrier from field and Carrier thru field
And I validate the function key Ffour for Carrier from field and Carrier thru field
And I validate the length of CarrierFrom "<CarrierFrom2>" and CarrierThru"<CarrierThru2>" field

Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|CarrierFrom2|CarrierThru2|
| 010101   |123139   |SR41010AA  |SR41010A1  |S42094F01 |USRSAKK|SR12345678 |SR12345678 | 
 