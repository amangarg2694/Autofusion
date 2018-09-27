#Author: Venkateshwarlu M

Feature: Process Brand Drugs As Tier 1 for Members
	SN003280_SR41405_TC035_Req 7.3: Verify the Conversion of RCPCPOP file for newly added Pat Res Code field 
    
Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu
    And I navigate to Development Control File Input screen
	  #And I press "F3" Key
	  #And I press "F3" Key
	  #And I enter "97" in field "SelectMenu" on "MenuSelection"
	  #And I press "Enter" Key
	  #And I enter "9" in field "SelectMenu" on "Development Control File Input"
	  And I search with SR number "<SRNumber>" and verify SR related conversion files
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
|SRNumber|ProdLibrary|StagingLibrary|ProdVal 									 |StagVal									  |EnvFile	 |Stgfile 	|Duplicatedata |Duplicateidentifiers|StgDuplicatedata|StgDuplicateidentifiers|Stgfileobj|CVFileobj  |CVlib 			|File 	|Journal	|Journalreceiver|Stagingarea|FName	|CtrlID	|FileData	|Data		|  
|SR41405 |USRPRPF20  |USRPRSF20     |Library USRPRPF20 created.|Library USRPRSF20 created.|TCL8401FIL|CLMV25FIL |*YES					 |*YES 								|*NO 					   |*NO 									 |CLMV25OBJ |CV41010PNR |BLCLM8402F |RCPNRP |USRPRJ08 |USRPRJNR08 		|41010ST13  |SR41010|PNR		|RCPNR* 	|RCPNRP	|
  