@NonMedDValidation_ExceptionCode_N
Feature: Pricing exception code 
  As a RxClaim User I want to check Pricing exception code 

  @Precondition
  
   Scenario Outline: Modify the existing plan,CAG creation and claim submission when COB is 1 and not 1
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
		When I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "EVUASHE" in field "PlanCode" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "3" in field "Selection" on "ActivePlanbyPlanCodeScreen"
		And I press "Enter" Key
		And I enter "<PlanCOB2>" in field "PlanCode" on "CopyPlanScreen"
		And I enter "<ContractFromDt>" in field "PlanFromDate" on "CopyPlanScreen"
		And I enter "<DescriptionCOB2>" in field "Description" on "CopyPlanScreen"
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
		And I enter "02" in field "COBPricingType" on "ActiveCOBProcessTypeScreen"
		And I press "Enter" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F12" Key
		When I create CarrierAccountGroup with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCOB1>"
    And I press "F12" Key
    And I press "F6" Key
    And I enter "<GroupID2>" in field "Group" on "GroupScreen"
    And I press "Enter" Key
    And I enter "<GroupName>" in field "GroupName" on "GroupScreen"
    And I enter "<GroupFromDt>" in field "GroupFromDate" on "GroupScreen"
    And I enter "<GroupThruDt>" in field "GroupThruDate" on "GroupScreen"
    And I enter "<PlanCOB2>" in field "PlanCode" on "GroupScreen"
    And I press "Enter" Key
    And I enter "Y" in field "Confirm" on "GroupScreen"
    And I press "F12" Key
    And I press "F8" Key
    And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		When I select Option "cct600" to navigate to "RxClaim Plan Administrator Menu"
		And I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
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
    And I enter "<ContractFromDt>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<ContractThruDt>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "N" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F6" Key
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID2>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID2>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<ContractFromDt>" in field "FromDate" on "MemberDetailScreen"
    And I enter "<ContractThruDt>" in field "ThruDate" on "MemberDetailScreen"
    And I enter "N" in field "FamilyFlag" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    Then Validate "Member Added." message should displayed on "AddMemberScreen"
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<PCN>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F12" Key
    And I press "F12" Key
    When I submit a manual claim with "<BIN>","<PCN>","<Group>","<PharmacyID>","<RxNo1>","<Refill>","<FillDate>","<MemberID2>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "cct700" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    And I select Option "1" to navigate to "Submit Extract Job"
    And I enter "<FillDate>" in field "ExtractDate" on "SubmitExtractJobScreen"
    And I enter "N" in field "ClearDailyFiles" on "SubmitExtractJobScreen"
    And I press "F6" Key
    And I enter "Y" in field "Confirm" on "SubmitExtractJobScreen"
    And I select Option "ws" to navigate to "Work With Submitted Jobs"
    Then Validate the Standard Extract Job status
   
  Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupID2  | GroupName | GroupFromDt | GroupThruDt | PlanCOB1 | PlanCOB2 | DescriptionCOB1 | DescriptionCOB2 | MemberID   | MemberID2 | First Name | Last Name | DOB      | BIN    | PCN     | Group | PharmacyID  |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | RxNo1 |
      | SR41787C8 | Carrier     | 9999999999 | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR41787G12 | SR41787G13 | Group     |      010101 |      123139 | 41787CP9  | 41787C10 | COB1 NonMed Plan | COB2 NonMed Plan | SR41787_M7 | SR41787_M8 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | AKAN | *     | APHARM      | 200019921007 | 00     | 7172018   | 00071015523|2      |2  |0   |100   | 200019921008 |
       
      
  @PDE_Job
  
   Scenario Outline: Triggering the PDE when the Exception code of N is selected and the network ID is  populated and the COB indicator is 1 and not 1 for a non-Med D claim  
    And I press "F3" Key
    And I press "F3" Key
    When I select Option "cct600" to navigate to "RxClaim Plan Administrator Menu"
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
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I enter "<MemberID2>" in field "MemberIDSearch" on "MemberDetailScreen"
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
    When I select Option "cct700" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "20" to navigate to "RxClaim Medicare Part D Batch Processing"
    And I select Option "3" to navigate to "Prescription Drug Event (PDE) File"
    Then submit the PDE File job with "<PDEFromDt>","<PDEThruDt>","<CarrierID>","<CarrierID>","<AccountID>","<AccountID>","<GroupID>","<GroupID2>","<Library>","<DDPSCodeList>","<SubmitterID>","<PEC>"
    And I press "F3" Key
    And I press "F3" Key
   Examples:
   
      | CarrierID | CarrierName | Processor | MailingAdd | City      | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName | GroupID  | GroupID2  | GroupName | GroupFromDt | GroupThruDt | PlanCOB1 | PlanCOB2 | DescriptionCOB1 | DescriptionCOB2 | MemberID   | MemberID2 | First Name | Last Name | DOB      | BIN    | PCN     | Group | PharmacyID  |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost | RxNo1 | PDEFromDt | PDEThruDt | Library | DDPSCodeList | SubmitterID | PEC |
      | SR41787C8 | Carrier     |        712  | MAIL ADD   | Hyderabad | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | SR41787A1 | Account     | SR41787G12 | SR41787G13 | Group     |      010101 |      123139 | 41787CP9  | 41787C10 | COB1 NonMed Plan | COB2 NonMed Plan | SR41787_M7 | SR41787_M8 | AUTOMEM    | AUTOMEM   | 12251987 | 777777 | AKAN | *     | APHARM      | 200019921007 | 00     | 7172018   | 00071015523|2      |2  |0   |100   | 200019921008 | 071618 | 071718 | USRPRIYA | AGR     | S41787 | N |
       
  @Validation
   
  Scenario Outline: Verify the Pricing exception code when the Exception code of N is selected and the network ID is populated and the COB indicator is 1 and not 1 for a non-Med D claim
    When I select Option "cct600" to navigate to "RxClaim Plan Administrator Menu"
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
		Then Validate "No detail record exists." message should displayed on "TransactionDetailList"
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I press "F3" Key
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I enter "<MemberID2>" in field "MemberIDSearch" on "MemberDetailScreen"
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
		Then Validate "No detail record exists." message should displayed on "TransactionDetailList"
  Examples:
  
      | MemberID   | MemberID2 |
      | SR41787_M7 | SR41787_M8 |
       