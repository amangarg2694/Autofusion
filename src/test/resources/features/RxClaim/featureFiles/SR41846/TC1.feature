Feature: Verify RCCLT002 Error Message Caused by SN002490 Deployment
 As a RxClaim User I want to Verify RCCLT002 Error Message Caused by SN002490 Deployment
 
 Scenario Outline: Verify that the message 'CLT Claim Tier Already Exists' is not displayed when a new MIC tier is added
  
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "13" to navigate to "Preferred Product Management"
  And I select Option "2" to navigate to "Preferred Product Schedule"
  And I add a new Schedule "<Sch1>","<desc>"
  And I select edit option "2" on a schedule "<Sch1>"
  And I add a new Preferred Product Schedule MIC Claim Level Tier "<cms>","<msc>","<MICtier>"
  Then I validate error message "CLT Claim Tier Already Exists" when a new MIC tier is displayed
  
 Examples:
 |Sch1   |desc    |cms|msc|MICtier|
  |SR4184|Autotest|C  |N  |1       |
 
Scenario Outline: Verify that the message 'Duplicate MIC Claim Level record not allowed' is displayed when a exsisting MIC tier is added
  
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "13" to navigate to "Preferred Product Management"
  And I select Option "2" to navigate to "Preferred Product Schedule"
  And I select edit option "2" on a schedule "<Sch1>"
  And I add a new Preferred Product Schedule MIC Claim Level Tier "<cms>","<msc>","<MICtier>"
  Then I validate error message "Duplicate MIC Claim Level record not allowed" when a new MIC tier is displayed
  
Examples:
  |Sch1   |cms|msc|MICtier|
  |SR4184|C  |N  |1       |
  
   Scenario Outline: Verify that the message 'Secondary ROA Code already exists' is displayed on RCRO2001 screen
  
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "31" to navigate to "Multi-Ingredient Compound ROA"
  And I select Option "2" to navigate to "MIC Medically Accepted ROA Schedule"
  And I select option "7" on a "<Sch>" in Active MIC Medically Accepted ROA Sched Seq screen
  And I select optionN "7" on existing sequence in Active Secondary ROAs in MIC Medically Accepted ROA Schd Seq screen
  Then I validate error message "Secondary ROA Code already exists" when a same Secondary ROA code is added
  
  Examples: 
  |Sch|
  |SR41846|
  
   Scenario Outline: Verify that the message 'Medispan already mapped to category ROA' is displayed on RCCR2002 screen
  
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "31" to navigate to "Multi-Ingredient Compound ROA"
  And I select Option "1" to navigate to "MIC Medically Accepted ROA Schedule"
  And I select option "7" on a "<code>" in Active Multi-Ingredient Compound Category ROA screen
  Then I validate error message "Medispan already mapped to category ROA" when already exisitng ROA code  is added
  
  Examples: 
  |code|
  |ABC|
  
  Scenario Outline: Verify that the exsisting RCCLT record is edited & deleted 
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "13" to navigate to "Preferred Product Management"
  And I select Option "2" to navigate to "Preferred Product Schedule"
  And I select edit option "2" on a schedule "<Sch>"
  And I validate edit option "2" for existing record
  Then I validate delete option "4" for existing record
  
  Examples: 
  |Sch|
  |SR4148_ED|
  
   Scenario Outline: Verify that cursor on the RCCLT001 screen should move to all positioner fields and the record selection field when user uses Tab key 
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "13" to navigate to "Preferred Product Management"
  And I select Option "2" to navigate to "Preferred Product Schedule"
  And I select edit option "2" on a schedule "<Sch>"
  Then I validate the cursor position using Tab key
  
  Examples: 
  |Sch|
  |SR4184_TAB|
  
  Scenario Outline: Verify that message 'Record exists with same CMS DCSC and MSC values' is returned when user attempts to add new RCCLT record with a CMS DCSC value  and MSC value 
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "13" to navigate to "Preferred Product Management"
  And I select Option "2" to navigate to "Preferred Product Schedule"
  And I select edit option "2" on a schedule "<Sch>"
  And I validate error message "Record exists with same CMS DCSC and MSC values" when user attempts to add new RCCLT record with a CMS DCSC value  and MSC value
  
  
  Examples: 
  |Sch|
  |SR4184|
  
  
   Scenario Outline: Verify that records with a partial match and exact match should be identified for Secondary ROA Code on RCRO2001 &RCRO2001I screens
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "31" to navigate to "Multi-Ingredient Compound ROA"
  And I select Option "2" to navigate to "MIC Medically Accepted ROA Schedule"
  And I select option "7" on a "<Sch>" in Active MIC Medically Accepted ROA Sched Seq screen
  And I select optionN "7" on existing sequence in Active Secondary ROAs in MIC Medically Accepted ROA Schd Seq screen
  And I validate that records with a partial match and exact match should be identified for Secondary ROA Code 
  
  
  Examples: 
  |Sch|
  |SR414PART|
  

Scenario Outline: Verify the help text for CMI Claim Product Status value ‘B’ 
  Given: I am on RxClaim PlanAdministrator Menu
  When I select Option "4" to navigate to "RxClaim Plan Maintenance"
  And I select Option "1" to navigate to "Active Plan by Plan Code"
  And I enter plan "<plancode>" in plan search field to enter into Plan Detail  Page screen
  And I press "F7" Key 
  And I navigate to compounds using option "9" in Plan Options screen
  And I select option "2" to navigate to Multiple Ingredient Compound detail screen
  Then I validate the help text for CMI Claim Product Status value B field value
  
  
  Examples: 
  |plancode|
  |AUTODEMO|
  
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
   |CarrierID |AccountID|GroupID  |MemberID		 | First Name      | Last Name     | DOB      | From Date | Thru Date   |Plan		|BIN     | ProcCtrl | Group | PharmacyID  |RxNo         |RxNo1			   | Refill| FillDate |ProductID  | DspQty | DS   | PSC   | Cost |com|
   |SN3353_R  |SN3353_G |SN3353_GG|MEM7_SR41846 |   MEM_SR41846    | MEM_SR41846  | 12251987	| 010101    | 123139      |SR41846_2|777777  |ASHE      |*      |APHARM   |144444465114 |144334465114  |00     |071918  |00000000000|10      |2     |0      | 100  | 2 |
   
  
                                  
 
  
  