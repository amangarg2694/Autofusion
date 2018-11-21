Feature: Conversion program for State Medicaid Program 

  As a RxClaim User I want to check whether field are blank for Medicaid Network and Clarification Code Recognition 

  Scenario Outline:  Verify the Conversion of RCDGOP file for newly added fields Medicaid Network and Clarification Code Recognition flag 
  
  Given I am on RxClaim PlanAdministrator Menu
  And I press "F3" Key
  And I press "F3" Key
  And I enter "97" in field "SelectMenu" on "MenuSelection"
  And I press "Enter" Key
  When creating a library with "<ProdLibrary>"
  Then Validate "<ProdVal>" message should displayed on "PharmacyNetworkOverride"
  When creating a library with "<StagingLibrary>"
  Then Validate "<StagVal>" message should displayed on "PharmacyNetworkOverride"
  Then Copy the data from "<EnvFile>" to library "<ProdLibrary>" with "<Duplicatedata>","<Duplicateidentifiers>","<FileData>","<Data>"
  Then Copy the data from "<Stgfile>" to library "<StagingLibrary>" with "<StgDuplicatedata>","<StgDuplicateidentifiers>","<FileData>","<Data>"
  And Copy the programs with "<Stgfileobj>","<StagingLibrary>","<FName>","<CtrlID>"
  Then Copy the CV files to library with "<CVFileobj>","<CVlib>","<StagingLibrary>","<StgDuplicatedata>","<StgDuplicateidentifiers>"
  When Create journal receiver and journal in production library with "<File>","<ProdLibrary>","<Journal>","<Journalreceiver>","<Stagingarea>","<StagingLibrary>","<FName>","<CtrlID>"
  Then Validate the medicaid network and Clarification code recognition flag are blank with "<File>","<StagingLibrary>"
  
 Examples:
| ProdLibrary | StagingLibrary| ProdVal 									| StagVal 									| EnvFile 	| Stgfile 	| Duplicatedata | Duplicateidentifiers| StgDuplicatedata| StgDuplicateidentifiers | Stgfileobj| CVFileobj | CVlib 		| File 	| Journal 	| Journalreceiver | Stagingarea |FName|CtrlID|FileData|Data| 
| USRPRPF31  	| USRPRSF31  		| Library USRPRPF31 created.| Library USRPRSF31 created.| TCL8402FIL| CLMV25FIL | *YES 					| *YES 								| *NO 						| *NO 										| CLMV25OBJ | CV41710DGO| BLCLM8403F| RCDGOP| USRPRJ17 	| USRPRJNR17			| 41710ST09  	|SR41710|DGO| RCDGO* |RCDGOP|
  