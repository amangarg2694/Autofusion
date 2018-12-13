#Author: swathi_palla@optum.com
#Pre-Requisite : Copy all the required files(VCH & VSR) from the Main library(USRKPRAPAR) and provide it in the Existing Library feild.
 
Feature: Verify the Total Number of Members for PBVSRP and PBVCHP files before Table Partitioning 

Scenario Outline: To Create a Library.
 Given I am on RxClaim PlanAdministrator Menu
 When I Create Library "<Library>", "<LibType>","<LibDesc>"
  
 Examples:
 |Library   |LibType   |LibDesc  					  |
 |LIB1134419|*TEST     |TestDescription     |
 
Scenario Outline: To Copy all the required PBVSRP files for Table Partitioning

	Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
		
	Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary|
 |PBVSRP		|SN003441L |*FILE     |LIB1134419|
 |PBVSRR01	|SN003441L |*FILE     |LIB1134419|
 |PBVSRR02	|SN003441L |*FILE     |LIB1134419|
 |PBVSRU01	|SN003441L |*FILE     |LIB1134419|

Scenario Outline: Copy all the required PBVCHP files for Table Partitioning
 
  Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
		
 Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary|
 |PBVCHP    |SN003441L |*FILE     |LIB1134419|
 |PBVCHR01  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR02  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR03  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR04  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR05  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR06  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR07  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR08  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR09  |SN003441L |*FILE     |LIB1134419|
 |PBVCHR10  |SN003441L |*FILE     |LIB1134419|
 |PBVCHU01  |SN003441L |*FILE     |LIB1134419| 
 
 Scenario Outline: Verify the Total Number of Members for PBVSRP and PBVCHP files before Table Partitioning
 
 Given I am on RxClaim PlanAdministrator Menu
 When I select Option "DSPFD (<NewLibrary>/PBVCHP)" to navigate to "DisplaySpooledFileScreen"
 Then Enter the Find String"<Control>", "<FIND>"
 Then Validate PartitionMemberData
 When I select Option "DSPFD (<NewLibrary>/PBVSRP)" to navigate to "DisplaySpooledFileScreen"
 Then Enter the Find String"<Control>", "<FIND>"
 Then Validate PartitionMemberData
     
 Examples: 
 |NewLibrary|Control|FIND                     |
 |LIB1134419    |B      |Total number of members|

Scenario Outline: Copy all the required Programs for Table Partitioning
 
  Given I am on RxClaim PlanAdministrator Menu
	When I Copy files CRTDUPOBJ"<FromObject>","<FromLibrary>","<ObjectType>","<ToLibrary>"
		
 Examples: 
 |FromObject|FromLibrary|ObjectType|ToLibrary| 
 |PSIFSVCH  |USRKPRAPAR |*PGM      |LIB1134419|
 |PSIFSVSR  |USRKPRAPAR |*PGM      |LIB1134419|
 |PSIVCH8403|CLMV25PSI  |*PGM      |LIB1134419|
 |PSIVSR8403|CLMV25PSI  |*PGM      |LIB1134419|
 
 Scenario Outline: Verify the Total Number of Members for PBVSRP and PBVCHP files after Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
 Then Edit the library List"<EdtLib>"
 When I select Option "CLRPFM <NewLibrary>/PBVSRP" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CLRPFM <NewLibrary>/PBVCHP" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PSIVSR8403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "CALL PGM(PSIVCH8403) PARM('<NewLibrary>')" to navigate to "DisplaySpooledFileScreen"
 When I select Option "DSPFD (<NewLibrary>/PBVCHP)" to navigate to "DisplaySpooledFileScreen"
Then Enter the Find String"<Control>", "<FIND>"
 Then Validate AfterPartitionMemberData
 When I select Option "DSPFD (<NewLibrary>/PBVSRP)" to navigate to "DisplaySpooledFileScreen"
 Then Enter the Find String"<Control>", "<FIND>"
 Then Validate AfterPartitionMemberData
    
 Examples: 
 |NewLibrary|Control |FIND                   |EdtLib|
 |LIB1134419  |B       |Total number of members|LIB1134419|
 
 Scenario Outline: Verify the date range for PBVSRP and PBVCHP files after Table Partitioning
 Given I am on RxClaim PlanAdministrator Menu
 Then Edit the library List"<EdtLib>"
 And I select Option "Call USRKPRA/PART3441" to navigate to "DisplaySpoolFileScreen"
 # Code for verifying the Date range of VCH File
 And I enter the command and validate for VCH"<NewLibrary>","<LoopVariable>"
 # Code for verifying the Date range of VSR file
 And I enter the command and validate for VSR"<NewLibrary>","<LoopVariable>"
  
 Examples:
 |NewLibrary|LoopVariable|EdtLib|
 |LIB1134419   	|6       |USRKPRA|
 
 
 
 

 