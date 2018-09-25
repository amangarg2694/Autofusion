Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Transaction Detail File Screen


Scenario Outline: User should able to Validate Carrier From/Thru fields -  SN003129_SR42094_TC030_Req 5.1.1.3 SN003129_SR42094_TC031_Req 5.1.2.3 SN003129_SR42094_TC032_Req 5.1.2.3 SN003129_SR42094_TC033_Req 5.1.2.3    
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"

Then I validate the alpha numeric for Carrier from field "<CarrierFrom>" and Carrier thru field "<CarrierThru>" with "<FIRFdate>","<FIRTdate>","<Filename>","<Library>"
And I validate the help text for Carrier from field and Carrier thru field
And I validate the function key Ffour for Carrier from field and Carrier thru field
And I validate the length of CarrierFrom "<CarrierFrom2>" and CarrierThru"<CarrierThru2>" field

#Enter existing Carrier and Library
Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|CarrierFrom2|CarrierThru2|
| 010101   |123139   |TESTVMCAR  |TESTVMCAR  |S42094F01 |USRSAKK|SR12345678 |SR12345678 | 

Scenario Outline: User should able to Validate Contract field. - SN003129_SR42094_TC034_Req 5.1.1.3  SN003129_SR42094_TC035_Req 5.1.1.3 SN003129_SR42094_TC036_Req 5.1.1.3 SN003129_SR42094_TC037_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"

Then I validate the Contract field "<Contract>" with for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<Filename>","<Library>"
And I validate the length of Contract field "<Contract2>"

#Enter existing Contract and Library
Examples:
| FIRFdate | FIRTdate|Filename   |Library|Contract|Contract2|
| 010101   |123139   |S42094F01  |USRSAKK| A9912  |A99125|


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




