Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Rejected Transaction Detail Report File screen

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
 

Scenario Outline: User should able to Validate Contract field. - SN003129_SR42094_TC005_Req 5.1.1.3  SN003129_SR42094_TC006_Req 5.1.1.3 SN003129_SR42094_TC007_Req 5.1.1.3 SN003129_SR42094_TC008_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"

Then I validate the Contract field "<Contract>" with for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<Filename>","<Library>"
And I validate the length of Contract field "<Contract2>"


Examples:
| FIRFdate | FIRTdate|Filename   |Library|Contract|Contract2|
| 010101   |123139   |S42094F01  |USRSAKK| A9912  |A99125|

Scenario Outline: User should able to Validate PBP field. -  SN003129_SR42094_TC009_Req 5.1.1.3  SN003129_SR42094_TC010_Req 5.1.1.3  SN003129_SR42094_TC011_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"

Then I validate the PBP field "<PBP>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<Contract>","<Filename>","<Library>"
And I validate the PBP field "<PBP2>" length 

#Enter Existing Library,Contract,PBP 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|Contract|PBP|PBP2|
| 010101   |123139   |S42094F01  |USRSAKK| A0001  |A01|A012|


Scenario Outline: User should able to Validate Contract/PBP List field. -  SN003129_SR42094_TC012_Req 5.1.1.3  SN003129_SR42094_TC013_Req 5.1.1.3   SN003129_SR42094_TC014_Req 5.1.1.3    SN003129_SR42094_TC015_Req 5.1.1.3 
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"


Then I validate the Contract/PBP List field "<ConPBPList>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<ConPBPListsts>""<Filename>","<Library>"
And I validate the Contract/PBP List field "<ConPBPList2>" length


#Enter Existing Library,ConPBPList 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|ConPBPList   |ConPBPListsts|ConPBPList2|
| 010101   |123139   |S42094F01  |USRSAKK| A39795P1    |I            |A39795P1234|



Scenario Outline: User should able to Validate Contract/PBP List status field. -  SN003129_SR42094_TC016_Req 5.1.1.3 SN003129_SR42094_TC017_Req 5.1.1.3  SN003129_SR42094_TC018_Req 5.1.1.3 SN003129_SR42094_TC019_Req 5.1.1.3  
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"


Then I validate the Contract/PBP List Status field "<ConPBPListsts>" for type, help text, function key Ffour with "<FIRFdate>","<FIRTdate>","<ConPBPList>""<Filename>","<Library>"
And I validate the Contract/PBP List status field "<ConPBPListsts2>" length


#Enter Existing Library,ConPBPList 
Examples:
| FIRFdate | FIRTdate|Filename   |Library|ConPBPList   |ConPBPListsts|ConPBPListsts2|
| 010101   |123139   |S42094F01  |USRSAKK| A39795P1    |I            |IE            |


Scenario Outline: User should able to Validate default values -  SN003129_SR42094_TC020_Req 5.1.1.3   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"

Then I validate the default values in the screen "<Screen>"

#Enter existing Carrier,Library
Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|Screen|
| 010101   |123139   |SR41010AA  |SR41010A1  |S42094F01 |USRSAKK|FIR Rejected Transaction Detail File| 


Scenario Outline: User should able to Validate the validations -  TC021 to TC029   
Given I am on RxClaim PlanAdministrator Menu
When I select Option "CCT700" to navigate to "RxClaim Reports Menu" 
And I select Option "5" to navigate to "RxInterACT Main Menu"
And I select Option "12" to navigate to "Medicare Part D Reports"
And I select Option "2" to navigate to "FIR Transaction Reports"
And I select Option "1" to navigate to "FIR Rejected Transaction Detail File"

Then I validate the error message when C/A/G range is entered and Contract, PBP and Contract/PBP List  is also entered with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when CAG list is entered and Contract, PBP and Contract/PBP List  is also entered with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract is entered and Enter C/A/G range and C/A/G List and Contract/PBP List is also entered with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when PBP is entered but Contract is not entered with "<FIRFdate>","<FIRTdate>","<PBP>","<Filename>","<Library>"
And I validate the error message when Contract and PBP are entered and C/A/G is also entered with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<Contract>","<PBP>","<Filename>","<Library>"
And I validate the error message when Contract and PBP are entered and CAG List is also entered with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<PBP>","<Filename>","<Library>"
And I validate the error mesage when Contract and PBP are entered and Contract/PBP List is also entered with "<FIRFdate>","<FIRTdate>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and C/A/G is also entered with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and CAG List is also entered with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and Contract is also enetered with "<FIRFdate>","<FIRTdate>","<Contract>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>" 
And I validate the error message when Contract/PBP List is entered and PBP is also enetered with "<FIRFdate>","<FIRTdate>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when File Name is missing with "<FIRFdate>","<FIRTdate>","<Contract>","<Library>"
And I validate the error message when Library is missing with "<FIRFdate>","<FIRTdate>","<Contract>","<Filename>"
And I validate the error message when File Name and Library is missing with "<FIRFdate>","<FIRTdate>","<Contract>"
And I validate the Sort By field 


#Enter existing Carrier,Contract,PBP,Contract PBP list,Library
Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|Contract|PBP|ConPBPList|ConPBPListsts|AccountFrom|AccountThru|GroupFrom|GroupThru|CarrierList|AccountList|GroupList |CAGListsts|Screen                              |
| 010101   |123139   |TESTVMCAR  |TESTVMCAR  |S42094F01 |USRSAKK|A9912   |912|SR42094L1 |I             |TESTVMACC  |TESTVMACC  |TESTVMSR |TESTVMSR|SR42094CL1| SR42094AL1 |SR42094GL1|I         |FIR Rejected Transaction Detail File|



