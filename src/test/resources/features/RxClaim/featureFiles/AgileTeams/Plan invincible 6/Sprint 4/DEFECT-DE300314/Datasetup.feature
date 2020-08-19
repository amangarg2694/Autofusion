#Author: garg_aman@optum.com
@PlanInvincible
Feature: DEA Class Prescriber Validation
  I want to use this template for defect DE300314

   @BasicPlan
   Scenario: #Verify a plan is created
     Given I am on RxClaim PlanAdministrator Menu
     When I create a new plan "<plancode>","<fromdate>","<description>"
     Then Validate Plan "<planCode>"
    
      

  #PlanWithPricingEdit
  @PricingPlanEdit
  Scenario: Verify a plan is created with Pricing edit
    Given I am on RxClaim PlanAdministrator Menu
    When Verify that Plan is updated with Pharmacy Price schedule "<plancode>","<fromdate>","<patientpaytable>","<thrudate>","<pharmacytable>"
    Then Validate Plan "<plancode>"
    
    
   
  #PlanWithDEAEdit
  @DEAPlanEdit
  Scenario: Verify a plan is created with DEA edit
    Given I am on RxClaim PlanAdministrator Menu
    When Verify that Plan is updated with DEA class PlanEdit "<plancode>","<code>","<fromdate>","<thrudate>","<flag>","<drugstatus>","<Rxfilldays>","<pbedit>","<pbnetwork>","<pbstatus>","<refill>"
    Then Validate Plan "<plancode>"

  #CAG creation
  Scenario Outline: Create a new CAG in RxClaim
    Given I am on RxClaim PlanAdministrator Menu
    When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    Then Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"

    Examples: 
      | CarrierID | CarrierName   | Processor | MailingAdd | City | State | Zip   | ContractFromDt | ContractThruDt | ContractEnt | BusinessType | AccountID | AccountName  | GroupID   | GroupName  | GroupFromDt | GroupThruDt | PlanCode  |
      | AMANPB001 | Test Carrier1 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB001 | Test Account | AMANPB001 | Test Group |      010199 |      123129 | AMANPB001 |
      | AMANPB002 | Test Carrier2 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB002 | Test Account | AMANPB002 | Test Group |      010199 |      123129 | AMANPB002 |
      | AMANPB003 | Test Carrier3 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB003 | Test Account | AMANPB003 | Test Group |      010199 |      123129 | AMANPB003 |
      | AMANPB004 | Test Carrier4 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB004 | Test Account | AMANPB004 | Test Group |      010199 |      123129 | AMANPB004 |
      | AMANPB005 | Test Carrier5 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB005 | Test Account | AMANPB005 | Test Group |      010199 |      123129 | AMANPB005 |
      | AMANPB006 | Test Carrier6 |       712 | MAIL ADD   | TEST | IL    | 78654 |         010101 |         123139 | *DEFAULT    | *DEFAULT     | AMANPB006 | Test Account | AMANPB006 | Test Group |      010199 |      123129 | AMANPB006 |

  #Member creation
  Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    Then Validate Member "<MemberID>" added

    Examples: 
      | CarrierID | AccountID | GroupID   | MemberID  | FirstName | LastName | DOB      | FromDate | ThruDate |
      | AMANPB001 | AMANPB001 | AMANPB001 | AMANPB001 | TEST1     | AMAN     | 01011999 |   010110 |   123129 |
      | AMANPB002 | AMANPB002 | AMANPB002 | AMANPB002 | TEST2     | AMAN     | 01011998 |   010111 |   123129 |
      | AMANPB003 | AMANPB003 | AMANPB003 | AMANPB003 | TEST3     | AMAN     | 01011997 |   010112 |   123129 |
      | AMANPB004 | AMANPB004 | AMANPB004 | AMANPB004 | TEST4     | AMAN     | 01011996 |   010113 |   123129 |
      | AMANPB005 | AMANPB005 | AMANPB005 | AMANPB005 | TEST5     | AMAN     | 01011999 |   010114 |   123129 |
      | AMANPB006 | AMANPB006 | AMANPB006 | AMANPB006 | TEST6     | AMAN     | 01011999 |   010115 |   123129 |

  #BPG Creation
  Scenario Outline: Add a Transaction Control by B/P/G in RxClaim
    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "8" to navigate to "Profile"
    And I select Option "2" to navigate to "Transaction Control"
    And I press "F6" Key
    And I enter "<BIN>" in field "BIN" on "AddTransactionControlScreen"
    And I enter "<PCN>" in field "PCN" on "AddTransactionControlScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddTransactionControlScreen"
    And I enter "<From Date>" in field "FromDate" on "AddTransactionControlScreen"
    And I enter "<Thru Date>" in field "ThruDate" on "AddTransactionControlScreen"
    And I press "Enter" Key
    And I enter "<CarrierID>" in field "CarrierID" on "TransactionControlDetailScreen"
    And I enter "<AccountID>" in field "AccountID" on "TransactionControlDetailScreen"
    And I enter "<GroupID>" in field "GroupID" on "TransactionControlDetailScreen"
    And I enter "<Filldays>" in field "Rx Written  <  Fill Date Window Days" on "TransactionControlDetailScreen"
    And I press "Enter" Key
    Then Validate record added with details "<BIN>" , "<PCN>" ,"<CarrierID>" ,"<AccountID>","<GroupID>"

    Examples: 
      | BIN    | PCN    | CarrierID | AccountID   | GroupID     | From Date | Thru Date | Filldays |
      | 666666 | 000133 | ACLAIMC1  | AUTOCLAIMA1 | AUTOCLAIMG1 |    010101 |    123139 |      365 |
