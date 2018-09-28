Feature: Conversion program for State Medicaid Program 
  As a RxClaim User I want to check whether field are blank for Medicaid Network and Clarification Code Recognition 

  Scenario Outline:  Verify the Conversion of RCPNRP file for newly added fields Medicaid Network and Clarification Code Recognition flag 
  
  Given I am on RxClaim PlanAdministrator Menu
  And I press "F3" Key
  And I press "F3" Key
  And I enter "97" in field "SelectMenu" on "MenuSelection"
  And I press "Enter" Key
  When creating a library with "<ProdLibrary>"
  Then Validate "<ProdVal>" message should displayed on "PharmacyNetworkOverride"
  When creating a library with "<StagingLibrary>"
  Then Validate "<ProdVal>" message should displayed on "PharmacyNetworkOverride"
  Then Copy the data from "<EnvFile>" to library "<ProdLibrary>" with "<Duplicatedata>","<Duplicateidentifiers>"
  Then Copy the data from "<Stgfile>" to library "<StagingLibrary>" with "<StgDuplicatedata>","<StgDuplicateidentifiers>"
  And Copy the programs with "<Stgfileobj>","<StagingLibrary>"
  Then Copy the CV files to library with "<CVFileobj>","<CVlib>","<StagingLibrary>","<StgDuplicatedata>","<StgDuplicateidentifiers>"
  When Create journal receiver and journal in production library with "<File>","<ProdLibrary>","<Journal>","<Journalreceiver>","<Stagingarea>","<StagingLibrary>"
  Then Validate the medicaid network and Clarification code recognition flag are blank with "<File>","<StagingLibrary>"
  
 Examples:
| ProdLibrary | StagingLibrary | ProdVal | StagVal | EnvFile | Stgfile | Duplicatedata | Duplicateidentifiers | StgDuplicatedata | StgDuplicateidentifiers | Stgfileobj | CVFileobj | CVlib | File | Journal | Journalreceiver | Stagingarea | 
| USRPRPF20  | USRPRSF20  | Library USRPRPF20 created. | Library USRPRSF20 created. | TCL8401FIL | CLMV25FIL | *YES | *YES | *NO | *NO | CLMV25OBJ | CV41010PNR | BLCLM8402F | RCPNRP | USRPRJ08 | USRPRJNR08 | 41010ST13  |
  