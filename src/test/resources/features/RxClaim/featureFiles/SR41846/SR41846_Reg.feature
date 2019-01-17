@Regression
Feature: Verify that the message 'CLT Claim Tier Already Exists' is not displayed when a new MIC tier is added
 As a RxClaim User I want to Verify that the message 'CLT Claim Tier Already Exists' is not displayed when a new MIC tier is added
  
  #change MemberID
  
  Scenario Outline: Verify that MIC claim process with drug status not overriden when Primary ROA is not found
    Given  I am on RxClaim PlanAdministrator Menu
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
    And I enter Override plan "<Plan>" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    And Validate "Member Added." message should displayed on "AddMemberScreen"
    And I am on RxClaim PlanAdministrator Menu 
    And I submitt a compound claim withh "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<com>"
    And I validate the MIC claim process with drug status not overriden when Primary ROA is not found
    
    
    Examples: 
   |CarrierID |AccountID    |GroupID   |MemberID		 | First Name      | Last Name     | DOB      | From Date | Thru Date   |Plan		|BIN     | ProcCtrl | Group | PharmacyID  |RxNo         |RxNo1			   | Refill| FillDate |ProductID  | DspQty | DS   | PSC   | Cost |com|
   |naresh01  |NARESH_ACC01 |NARESH GRP|MEMK2_SR41845 |   MEM_SR41846    | MEM_SR41846  | 12251987	| 010101    | 123139      |NAR_TEST1|777777  |ASHE      |*      |APHARM   |141122365114 |141123375114  |00     |071918  |00000000000|10      |2     |0      | 100  | 2 |
   