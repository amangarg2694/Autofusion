Feature:  Verify  the  format of the External Transaction Number for Batch claim type
  As a RxClaim User I want to check External Transaction Number for Batch claim type

  Scenario Outline: Verify  the  format of the External Transaction Number for Batch claim type
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key
    And I enter "<Carrier>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<Account>" in field "AccountID" on "AddMemberScreen"
    And I enter "<Groupid>" in field "GroupID" on "AddMemberScreen"
    ## Member ID should be "SR41632_PM1" instead of PM1 user can replace any alphabets or digits or alphanumeric value
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<Start Date>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<End Date>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "N" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I select Option "1" to navigate to "Submit Extract Job"
    And I enter "<FillDate>" in field "ExtractDate" on "SubmitExtractJobScreen"
    And I enter "N" in field "ClearDailyFiles" on "SubmitExtractJobScreen"
    And I press "F6" Key
    And I enter "Y" in field "Confirm" on "SubmitExtractJobScreen"
    And I select Option "ws" to navigate to "Work With Submitted Jobs"
    Then Validate the Standard Extract Job status 
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "3" to navigate to "RxClaim Claims Payment Menu"
    And I select Option "3" to navigate to "RxClaim Media Generation Programs"
    And I select Option "9" to navigate to "NCPDP D.0 Batch Output Format"
    And I enter "<FileName>" in field "FileName" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Library>" in field "Library" on "NCPDPBatchOutputFormatScreen"
    And I enter "<FromDate>" in field "FromDate" on "NCPDPBatchOutputFormatScreen"
    And I enter "<ThruDate>" in field "ThruDate" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Carrier>" in field "FromCarrier" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Carrier>" in field "ThruCarrier" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Account>" in field "FromAccount" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Account>" in field "ThruAccount" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Groupid>" in field "FromGroup" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Groupid>" in field "ThruGroup" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Sender>" in field "Sender" on "NCPDPBatchOutputFormatScreen"
    And I enter "<Receiver>" in field "Receiver" on "NCPDPBatchOutputFormatScreen"
    And I enter "A" in field "FinancialAmtUsed" on "NCPDPBatchOutputFormatScreen"
    And I press "F6" Key
    When I select Option "edtlibl" to navigate to "Edit Library List"
    And I enter "DBU10" in field "Library" on "DBUScreen"
    And I press "Enter" Key
    And I press "F3" Key
    And I enter "DBU" in field "SelectMenu" on "MenuSelection"
    And I press "F4" Key
    And I enter "<FileName>" in field "FileName" on "DBUScreen"
    And I enter "<Library>" in field "LibraryName" on "DBUScreen"
    And I press "Enter" Key
    And I press "F21" key
    And I enter "CHG" in field "Control" on "DBUScreen"
    And I press "Enter" Key
    And I enter "W+170" in field "Control" on "DBUScreen"
    And I press "Enter" Key
    And I press "F19" key
    And I press "PageDown" Key
    ## Increment the first value of Digit field by 1 in DBUScreen.properties file under OR everytime user running this script
    And I enter "5" in field "Digit" on "DBUScreen"
    And I press "Enter" Key
    And I press "Enter" Key
    And I press "F3" Key
    And I enter "1" in field "Confirm" on "DBUScreen"
    And I press "Enter" Key
    And I press "F3" Key
    When I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "4" to navigate to "Batch Transaction Processing"
    And I select Option "4" to navigate to "Batch Standard V12 & V12E Claim Load"
    And I enter "<FileName>" in field "FileName" on "BatchStandardV12V12EClaimLoadScreen"
    And I enter "<Library>" in field "Library" on "BatchStandardV12V12EClaimLoadScreen"
    And I press "F6" Key
    And I select Option "ws" to navigate to "Work With Submitted Jobs"
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "8" to navigate to "Claims by Member ID"
    And I enter "<MemberID>" in field "MemberID" on "ClaimsbyMemberIdScreen"
    And I enter "<Carrier>" in field "CarrierID" on "ClaimsbyMemberIdScreen"
    And I enter "<Account>" in field "AccountID" on "ClaimsbyMemberIdScreen"
    And I press "Enter" Key
    And I enter "5" in field "BatchSelection" on "ClaimsbyMemberIdScreen"
    And I press "Enter" Key
    And I press "F7" Key
    And I enter "14" in field "Selectionfield" on "TransactionDetailList"
    And I press "Enter" Key
    Then Validate External Transaction format on ExternalTransactionScreen
     Examples: 
      | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | FileName | Library | FromDate | ThruDate | Carrier | Account | Groupid | Sender | Receiver | First Name | Last Name | DOB      | Start Date | End Date  |  
		|	777777  | SR41634     |	*  | APHARM      | 900019921003 | 00     | 6252018   | SR41632_PA5 | 00071015523|2      |2  |0   |100   | SR41632S7 | USRPRIYA | 010118 | 123118 | SR41632CZ | SR41632A1 | SR41632GG | OPTUM | PRIYA | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 |