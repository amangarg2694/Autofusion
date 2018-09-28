Feature: PART D: Update FIR Transaction and Rejected Transaction files with Contract ID
As a RxClaim User I want to check whether new changes working correctly in FIR Transaction Detail File Screen


Scenario Outline: User should able to Validate the validations -    
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
And I validate the error message when Contract and PBP are entered and C/A/G is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<Contract>","<PBP>","<Filename>","<Library>"
And I validate the error message when Contract and PBP are entered and CAG List is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<Contract>","<PBP>","<Filename>","<Library>"
And I validate the error mesage when Contract and PBP are entered and Contract/PBP List is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<Contract>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and C/A/G is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and CAG List is also entered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<CarrierList>","<AccountList>","<GroupList>","<CAGListsts>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and Contract is also enetered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<Contract>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when Contract/PBP List is entered and PBP is also enetered in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<PBP>","<ConPBPList>","<ConPBPListsts>","<Filename>","<Library>"
And I validate the error message when File Name is missing in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<Contract>","<Library>"
And I validate the error message when Library is missing in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<Contract>","<Filename>"
And I validate the error message when File Name and Library is missing in FIR Transaction Detail File with "<FIRFdate>","<FIRTdate>","<Contract>"


#Enter existing Carrier,Contract,PBP,Contract PBP list,Library
Examples:
| FIRFdate | FIRTdate|CarrierFrom|CarrierThru|Filename  |Library|Contract|PBP|ConPBPList|ConPBPListsts|AccountFrom|AccountThru|GroupFrom|GroupThru|CarrierList|AccountList|GroupList |CAGListsts|Screen                              |
| 010101   |123139   |TESTVMCAR  |TESTVMCAR  |S42094F01 |USRSAKK|A9912   |912|SR42094L1 |I             |TESTVMACC  |TESTVMACC  |TESTVMSR |TESTVMSR|SR42094CL1| SR42094AL1 |SR42094GL1|I         |FIR Rejected Transaction Detail File|
