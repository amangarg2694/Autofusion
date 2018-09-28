
Feature: Pricing exception code 
  As a RxClaim User I want to check Pricing exception code 

  Scenario Outline: Verify the Pricing exception code when the Exception code of N is selected and the network ID is not populated and the COB indicator is 1 for a Med D claim
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "EVUASHE" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCOB1>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<ContractFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<DescriptionCOB1>" in field "Description" on "CopyPlanScreen"
		And I press "Enter" Key
		And I press "F7" Key
		And I enter "2" in field "Selection" on "PlanOptionsScreen"
		And I press "Enter" Key
		And I press "F15" Key
		And I enter "1" in field "Option" on "COBOptionsScreen"
		And I press "Enter" Key
		And I enter "2" in field "Selection" on "ActiveCOBProcessTypeScreen"
		And I press "Enter" Key
		And I enter "Y" in field "ProcessCOB" on "ActiveCOBProcessTypeScreen"
		And I enter "01" in field "COBPricingType" on "ActiveCOBProcessTypeScreen"
		And I press "Enter" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F12" Key
		When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCOB1>"
		And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "Y" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "F4" Key
    And I enter "X" in field "FtypeOption" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "12001200" in field "ID" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "14" to navigate to "Medicare Part D Processing"
    And I select Option "16" to navigate to "Active Contract PBP Table"
    And I press "F6" Key
    When I create Contract PBP with "<CarrierID>","<Contract>","<PBP>","<FormularyID>","<Benefit_Year>","<SubmitterID>"
    And I select Option "1" to navigate to "Active Part D Master Profile"
    And I press "F6" Key
    When I create Part D profile with "<CarrierID>","<From Date>","<Thru Date>","<Contract>","<PBP>","<Benefit_Year>","<PlanCOB1>"
    And I press "F3" Key
    And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
    And I select Option "7" to navigate to "RxClaim Provider Maintenance" 
    And I select Option "2" to navigate to "Pharmacy Network" 
    When I create a Pharmacy Network with "<Network>","<Name>","<CarrierID>"
    And I select Option "1" to navigate to "Pharmacy" 
    When I create Pharmacy with "<Pharmacy>","<Pharmacy Name>","<CarrierID>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    And I select Option "4" to navigate to "RxClaim Plan Maintenance" 
    And I select Option "1" to navigate to "Active Plan by Plan Code" 
    And I enter "<PlanCOB1>" in field "PlanCode" on "ActivePlanbyPlanCodeScreen" 
    And I press "Enter" Key
    And I enter "2" in field "Selection" on "ActivePlanbyPlanCodeScreen" 
    And I press "Enter" Key
    And I enter "N" in field "PharmacyNetwork" on "PlanDetailScreen"
    And I enter "Y" in field "Accumulator" on "PlanDetailScreen"
    And I press "F7" Key
    And I enter "29" in field "Selection" on "PlanOptionsScreen"
		And I press "Enter" Key
		And I enter "1" in field "Selection" on "AccumulatorScreen"
		And I press "Enter" Key
		And I press "F6" Key
		And I enter "<From Date>" in field "FromDate" on "DeductibleDetailPage"
		And I enter "<Thru Date>" in field "ThruDate" on "DeductibleDetailPage"
		And I enter "C" in field "Level" on "DeductibleDetailPage"
		And I enter "EVUASHE" in field "DedSchedule" on "DeductibleDetailPage"
		And I press "Enter" Key
		And I press "F8" Key
		And I press "F12" Key
		And I press "F12" Key
		And I enter "6" in field "Selection" on "AccumulatorScreen"
		And I press "Enter" Key
		And I press "F6" Key
		And I enter "<From Date>" in field "FromDate" on "PlanTroopSchedule"
		And I enter "<Thru Date>" in field "ThruDate" on "PlanTroopSchedule" 
		And I enter "C" in field "Level" on "PlanTroopSchedule"
		And I enter "AAMEACCD2" in field "Code" on "PlanTroopSchedule"
		And I enter "ABLICINST" in field "TroopSched" on "PlanTroopSchedule"
		And I press "Enter" Key
		And I press "F8" Key
		And I press "F12" Key
		And I press "F12" Key
		And I press "F12" Key
		And I press "F12" Key
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "PlanDetailScreen"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I enter "<MemberID>" in field "MemberID" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I enter "2" in field "Selection" on "ActiveEligibleMemberbyIDScreen"
    And I press "Enter" Key
    And I press "F8" Key
    And I enter "10" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    And I enter "3" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    When I create active supplemental ID by type with "<From Date>","<Thru Date>","<SupplementalID>"
    And I enter "17" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key
    And I enter "4" in field "Selection" on "MemberDetailListScreen"
    And I press "Enter" Key 
    When I create active medicare part D with "<From Date>","<Thru Date>","<Contract>","<PBP>"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
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
    When I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I enter "<MemberID>" in field "MemberIDSearch" on "MemberDetailScreen"
		And I press "Enter" Key
		And I enter "5" in field "Selection" on "MemberDetailScreen"
		And I press "Enter" Key
		And I press "F10" Key
		And I enter "5" in field "Option" on "MemberDetailScreen"
		And I press "Enter" Key
		And I press "F7" Key
		And I enter "8" in field "Selectionfield" on "TransactionDetailList"
		And I press "Enter" Key
		Then Validate whether Extract status is blank in Claim Transaction Additional screen
		And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "20" to navigate to "RxClaim Medicare Part D Batch Processing"
    ##And I enter "edtlibl" in field "SelectMenu" on "MenuSelection"
    ##And I press "Enter" Key
    ##And I enter "1000" in field "SeqNum" on "DBUScreen"
    ##And I enter "TCL8402EXT" in field "Library" on "DBUScreen"
    ##And I press "Enter" Key
    ##And I press "F3" Key
    And I select Option "3" to navigate to "Prescription Drug Event (PDE) File"
    Then submit the PDE File job with "<PDEFromDt>","<PDEThruDt>","<CarrierID>","<CarrierID>","<AccountID>","<AccountID>","<GroupID>","<GroupID>","<Library>","<DDPSCodeList>","<SubmitterID>","<PEC>"
    And I press "F3" Key
    And I press "F3" Key
    
    When I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I enter "<MemberID>" in field "MemberIDSearch" on "MemberDetailScreen"
		And I press "Enter" Key
		And I enter "5" in field "Selection" on "MemberDetailScreen"
		And I press "Enter" Key
		And I press "F10" Key
		And I press "Tab" Key
		And I enter "5" in field "Option" on "MemberDetailScreen"
		And I press "Enter" Key
		And I press "F7" Key
		And I enter "13" in field "Selectionfield" on "TransactionDetailList"
		And I press "Enter" Key
		And I press "F9" Key
		And I enter "5" in field "Option" on "MedicarePartDMDDFiles"
		And I press "Enter" Key
		Then Validate the Pricing Exception Code with "<ExpectedPEC>"
		
    Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupName | GroupFromDt | GroupThruDt | PlanCOB1 | DescriptionCOB1 | MemberID   | First Name | Last Name | DOB      | BIN    | PCN     | Group | Pharmacy |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | From Date | Thru Date | Contract | PBP | FormularyID | Benefit_Year | SubmitterID | Network | Name | Pharmacy Name | SupplementalID | PDEFromDt |  PDEThruDt | Library | DDPSCodeList | PEC | ExpectedPEC | 
      | SR4178719 | Carrier     |       712 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR41787W7 | Group     |      010101 |      123139 | SR41787CF2  |COB1 NonMed Plan | SR41787_A6 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | AKAN | *    | OPHARM | 200019941016 | 00     | 7042018   | 00071015523|2      |2  |0   |100   | 010101 | 123139 | A1945 | 100 | 10009 | 2018 | 20001 | APharm | SR41787 | Pharmtest | 10001000 | 070318 | 070418 | USRPRIYA | AGR     | N | O |
       
      
    
    
    
    
    
    