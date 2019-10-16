@Regression
Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Transaction Detail File Screen


Scenario Outline: User should able to Validate Contract field. - SN003129_SR42094_TC034_Req 5.1.1.3  SN003129_SR42094_TC035_Req 5.1.1.3 SN003129_SR42094_TC036_Req 5.1.1.3 SN003129_SR42094_TC037_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"

Then I validate the Contract field "<Contract>" with for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<Filename>","<Library>"
And I validate the length of Contract field "<Contract2>" in FIR Transaction Detail File screen

#Enter existing Contract and Library
Examples:
| FIRFdate | FIRTdate|Filename   |Library|Contract|Contract2|
| 010101   |123139   |S42094F01  |USRSAKK| A9912  |A99125|


Scenario Outline: User should able to Validate Contract/PBP List field in FIR Transaction Detail File Screen. -  SN003129_SR42094_TC041_Req 5.1.1.3  SN003129_SR42094_TC042_Req 5.1.1.3   SN003129_SR42094_TC043_Req 5.1.1.3    SN003129_SR42094_TC044_Req 5.1.1.3 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"


Then I validate the Contract/PBP List field "<ConPBPList>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<ConPBPListsts>""<Filename>","<Library>"
And I validate the Contract/PBP List field "<ConPBPList2>" length in FIR Transaction Detail File Screen


#Enter Existing Library,ConPBPList 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|ConPBPList   |ConPBPListsts|ConPBPList2|
| 010101   |123139   |S42094F01  |USRSAKK| A39795P1    |I            |A39795P1234|


Scenario Outline: User should able to Validate Contract/PBP List status field in FIR Transaction Detail File Screen. -  SN003129_SR42094_TC045_Req 5.1.1.3 SN003129_SR42094_TC046_Req 5.1.1.3  SN003129_SR42094_TC047_Req 5.1.1.3 SN003129_SR42094_TC048_Req 5.1.1.3  
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"


Then I validate the Contract/PBP List Status field "<ConPBPListsts>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<ConPBPList>""<Filename>","<Library>"
And I validate the Contract/PBP List status field "<ConPBPListsts2>" length in FIR Transaction Detail File Screen


#Enter Existing Library,ConPBPList 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|ConPBPList   |ConPBPListsts|ConPBPListsts2|
| 010101   |123139   |S42094F01  |USRSAKK| A39795P1    |E            |IE            |


Scenario Outline: User should able to Validate the validations in FIR Transaction Detail File screen -    #TC050 To TC057
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "3" to navigate to "FIR Transaction Detail File"

Then I validate the error message when C/A/G range is entered and Contract, PBP and Contract/PBP List  is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when CAG list is entered and Contract, PBP and Contract/PBP List  is also entered with in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract is entered and Enter C/A/G range and C/A/G List and Contract/PBP List is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when PBP is entered but Contract is not entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<PBP>","<Filename>","<Library>"
And I navigate to PlanAdminMenuScreen

#Enter existing Carrier,Contract,PBP,Contract PBP list,Library
Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|Contract|PBP|ConPBPList|ConPBPListsts|AccountFrom|AccountThru|GroupFrom|GroupThru|CarrierList|AccountList|GroupList |CAGListsts|Screen                              |
| 010101   |123139   |TESTVMCAR  |TESTVMCAR  |S42094F01 |USRSAKK|A9912   |912|SR42094L1 |I             |TESTVMACC  |TESTVMACC  |TESTVMSR |TESTVMSR|SR42094CL1| SR42094AL1 |SR42094GL1|I         |FIR Rejected Transaction Detail File|
