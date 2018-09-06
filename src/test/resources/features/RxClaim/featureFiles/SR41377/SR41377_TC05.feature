Feature: Daily Claims Extract w/Repeating Mgs Data
As a RxClaim User I want to check whether pmc code limited to 5 fields
    
             
Scenario Outline: Verify PMC codes are limit to 5 fields (J, K, blank, and M & N) and do not exceed this count

    Given I am on RxClaim PlanAdministrator Menu
		When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
		And I press "F7" Key
		Then Capture the claim number
		And I press "F3" Key
		And I press "F3" Key
		And I press "F12" Key
		And I press "F12" Key
		When I select Option "cct700" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I select Option "1" to navigate to "Submit Extract Job"
    And I enter "<ExtractDate>" in field "ExtractDate" on "SubmitExtractJobScreen"
    And I enter "N" in field "ClearDailyFiles" on "SubmitExtractJobScreen"
    And I press "F6" Key
    And I enter "Y" in field "Confirm" on "SubmitExtractJobScreen"
    And I select Option "ws" to navigate to "Work With Submitted Jobs"
    Then Validate the Standard Extract Job status 
    And I press "F12" Key
		And I press "F12" Key
    And I press "F3" Key
		Then updating the pmc code with "<Code1>","<Code2>","   ","<Code4>","<Code5>","<Code6>","   ","   ","<Codelength>","<Library>","<Filename>"
		When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		And I select Option "6" to navigate to "Claims by Pharmacy"
		Then Validating the message details and approval codes
		And I press "F12" Key
		When triggering the extract with "<FromDate>","<ThruDate>","<CarrierID>","<AccountID>","<GroupID>","<File1>","<File2>","<File3>","<File4>","<File5>","<LibraryName>"
		Then Validating the spool file
		And I press "F12" Key
		Then Validating the output file with "<File1>","<LibraryName>"
		
		 Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | Code1 | Code2 | Code3 | Code4 | Code5 | Code6 | Code7 | Code8 | Codelength | Library | Filename | FromDate | ThruDate | CarrierID | AccountID | GroupID | File1 | File2 | File3 | File4 | File5 | LibraryName | ExtractDate |
		|	888888  | HANDA1     |	HANDA1  | APHARM      | 100030002000 | 00     | 120717   | AB012726M01 | 53303003041 |1      |1  |00   |10  | 001 | 002 | 002 | 004 | 003 | 005 | 002 | 002 | 8 | TCL8402FIL | RCPMCP | 080118 | 083018 | 2726CAR | 2726AC01 | 2726GROUP03 | FILE400 | FILE401 | FILE402 |FILE403 | FILE404 | USRPRIYA | 080718 |
    