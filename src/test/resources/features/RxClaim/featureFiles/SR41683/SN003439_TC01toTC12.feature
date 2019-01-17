#Author: kanugutta_siddanth@optum.com
#Pre-Requisite : Change the ToLibrary name (i.e.TEST417650 ) in the examples before running the script (or) ToLibrary name Replace all with newlibname  
#Note : Don't change the FromLibrary , it should always TEST41683A.
@Regression
Feature: Verify the Total Number of Members for PBPBTP,PBPY2P and PBVCDP files before Table Partitioning 

 Scenario Outline: To Create a Library.
 Given I am on RxClaim PlanAdministrator Menu
 When I Create Library "<Library>", "<LibType>","<LibDesc>"
 
  Examples: 
 |Library|LibType  |LibDesc  |
 |TEST417650|*TEST  |TestDescription    |
 
 Scenario Outline: Copy all the required PBPBTP files for Table Partitioning

	Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
	  
 Examples:
 |FromObject|FromLibrary|ObjectType|ToLibrary |
 |PBPBTP		|TEST41683A |*FILE     |TEST417650|
 |PBPBTR01	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR02	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR03	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR04	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR05	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR06	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR07	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR08	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR09	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR10	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR11	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR12	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR13	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR14	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR15	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR16	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR17	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR18	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR19	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR20	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR21	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR22	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR23	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR24	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR25	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR26	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR27	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR28	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR29	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR30	|TEST41683A |*FILE     |TEST417650|
 |PBPBTR31	|TEST41683A |*FILE     |TEST417650|
 |PBPBTU01	|TEST41683A |*FILE     |TEST417650|
 
 Scenario Outline: Copy all the required PBPY2P files for Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
	
	Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary|
 |PBPY2P    |TEST41683A |*FILE     |TEST417650|
 |PBPY2R01  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R02  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R03  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R04  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R05  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R06  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R07  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R08  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R09  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R10  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R11  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R12  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R13  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R14  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R15  |TEST41683A |*FILE     |TEST417650|
 |PBPY2R16  |TEST41683A |*FILE     |TEST417650|
 |PBPY2U01  |TEST41683A |*FILE     |TEST417650|
 
 
Scenario Outline: Copy all the required PBPY4P files for Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
	
 Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary |
 |PBPY4P    |TEST41683A |*FILE     |TEST417650|
 |PBPY4R01  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R03  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R04  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R05  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R06  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R07  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R08  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R09  |TEST41683A |*FILE     |TEST417650|
 |PBPY4R10  |TEST41683A |*FILE     |TEST417650|
 |PBPY4U01  |TEST41683A |*FILE     |TEST417650|
 
 Scenario Outline: Copy all the required PBVCDP files for Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
	
	Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary|
 |PBVCDP    |TEST41683A |*FILE     |TEST417650|
 |PBVCDR01  |TEST41683A |*FILE     |TEST417650|
 |PBVCDR02  |TEST41683A |*FILE     |TEST417650|
 |PBVCDR03  |TEST41683A |*FILE     |TEST417650|
 |PBVCDR04  |TEST41683A |*FILE     |TEST417650|
 |PBVCDU01  |TEST41683A |*FILE     |TEST417650|
 
 Scenario Outline: Verify the Total Number of Members for PBPBTP,PBPY2,PBPY4P and PBVCDP files before Table Partitioning
 
 Given I am on RxClaim PlanAdministrator Menu
 When I select Option "DSPFD (<NewLibrary>/PBPBTP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I press "Enter" Key
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate PartitionMemberData
 When I select Option "DSPFD (<NewLibrary>/PBPY2P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate PartitionMemberData
 When I select Option "DSPFD (<NewLibrary>/PBPY4P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate PartitionMemberData
 When I select Option "DSPFD (<NewLibrary>/PBVCDP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate PartitionMemberData
    
 Examples: 
 |ExistingLibrary |NewLibrary    |Control|FIND                   |
 |TEST41683A      |TEST417650    |B      |Total number of members|
 
 Scenario Outline: Copy all the required programs for Table Partitioning
  Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
	
 Examples: 
 |FromObject	|FromLibrary|ObjectType|ToLibrary |
 |PPCPBT8101  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCPY28101  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCPY48101  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCVCD8101  |CLMV25PPC  |*PGM      |TEST417650|
 
 Scenario Outline: Verify the Total Number of Members for PBPBTP,PBPY2P,PBPY4P and PBVCDP files after Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
 And I select Option "Edtlibl" to navigate to "Edit Library List"
 And I add "<NewLibrary>" library in lib list 
 And I press "Enter" Key
 When I select Option "CALL PGM(PPCPBT8101) PARM('CLMV25PPC' '<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCPY28101) PARM('CLMV25PPC' '<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCPY48101) PARM('CLMV25PPC' '<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCVCD8101) PARM('CLMV25PPC' '<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 
 #TC01_Existing partitioning for PBPBTP file
 When I select Option "DSPFD (<NewLibrary>/PBPBTP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I press "Enter" Key
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate ExistingPartitionMemberData
 #TC02_Existing partitioning for PBPY2P file
 When I select Option "DSPFD (<NewLibrary>/PBPY2P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate ExistingPartitionMemberData
 #TC03_Existing partitioning for PBPY4P file
 When I select Option "DSPFD (<NewLibrary>/PBPY4P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate ExistingPartitionMemberData
 #TC04_Existing partitioning for PBVCDP file
 When I select Option "DSPFD (<NewLibrary>/PBVCDP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate ExistingPartitionMemberData

 
 Examples: 
 |NewLibrary|Control |FIND                   |
 |TEST417650|B       |Total number of members|
 
 #Copy PPCPBT8403,PPCPY28403,PPCPY48403,PPCVCD8403 to created lib
 Scenario Outline: Copy all the required programs for Table Partitioning
  Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
  
 Examples: 
 |FromObject	|FromLibrary|ObjectType|ToLibrary |
 |PPCPBT8403  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCPY28403  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCPY48403  |CLMV25PPC  |*PGM      |TEST417650|
 |PPCVCD8403  |CLMV25PPC  |*PGM      |TEST417650|
 
 Scenario Outline: Verify the Total Number of Members for PBPBTP,PBPY2P,PBPY4P and PBVCDP files after Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
 And I select Option "Edtlibl" to navigate to "Edit Library List"
 # add your Partion Program Library Eg PART3439 in EXamples 
 And I add "<NewLibrary>" library in lib list 
 And I press "Enter" Key
 When I select Option "CALL PGM(PPCPBT8403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCPY28403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCPY48403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PPCVCD8403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 
  #TC05_After partitioning for PBPBTP file
  
 When I select Option "DSPFD (<NewLibrary>/PBPBTP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I press "Enter" Key
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate AfterPartitionMemberDataforPPCPBT
 And I press "F12" Key 
 
 #TC06_After partitioning for PBPY2P file
 When I select Option "DSPFD (<NewLibrary>/PBPY2P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate AfterPartitionMemberDataforPPCPY2
 And I press "F12" Key
 
 #TC07_After partitioning for PBPY4P file
 When I select Option "DSPFD (<NewLibrary>/PBPY4P)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate AfterPartitionMbrDataforPPCPY4
 And I press "F12" Key
 
 #TC08_After partitioning for PBVCDP file
  When I select Option "DSPFD (<NewLibrary>/PBVCDP)" to navigate to "DisplaySpooledFileScreen"
 And I enter "<Control>" in field "Control" on "DisplaySpooledFileScreen"
 And I enter "<FIND>" in field "FIND" on "DisplaySpooledFileScreen"
 And I press "F16" Key
 Then Validate AfterPartitionMemberDataforPPCVCD
 And I press "F12" Key
 
   
 Examples: 
 |NewLibrary  |Control |FIND                   |
 |TEST417650  |B       |Total number of members|
 
 Scenario Outline: Verify the date range for PBVSRP and PBVCHP files after Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
 And I select Option "Edtlibl" to navigate to "Edit Library List"
 And I add "USRKPRA" library in library list
 And I select Option "Call USRKPRA/PART3439" to navigate to "DisplaySpoolFileScreen"
 #TC09_verifying the Date range of PBT file
 And I enter the command and validate for PBT"<NewLibrary>","<PBTVariable>"
 #TC10_verifying the Date range of PY2 file
 And I enter the command and validate for PYTwoFile"<NewLibrary>","<PY2Variable>"
 #TC11_verifying the Date range of PY4 file
 And I enter the command and validate for PYFour "<NewLibrary>","<PY4Variable>"
 #TC12_verifying the Date range of VCD file
 And I enter the command and validate for VCD"<NewLibrary>","<VCDVariable>"
 
  Examples:
  |NewLibrary		|PBTVariable|PY2Variable|PY4Variable|VCDVariable|
 	|TEST417650   |19       	|19					|11					|21					|
 	
 	
 	
 	
 	
 	
 