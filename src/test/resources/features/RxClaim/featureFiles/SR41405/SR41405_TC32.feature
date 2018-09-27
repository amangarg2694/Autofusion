#Author: Venkateshwarlu M

Feature: Process Brand Drugs As Tier 1 for Members
	SN003280_SR41405_TC032_Req 7.3: Verify when  Claim is submitted with  Patient Pay MSC on the Product Override Detail screen to “Y” and product has MSC as O
    
Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I search Member by MemberID "<MemberID>"
    And I press "F12" Key
		And I press "F12" Key
		And I add library RXBSYSQA
		 #public static String baseMemberID=null;
    Examples:
    | CarrierID | AccountID    | GroupID      | MemberID   | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	SN003280  | SN003280ACC1 | SN003280GRP1 | M314140544 | AUTOMEM    | AUTOMEM   | 12251987 | 010111    | 123139   |
		
   Scenario Outline: Verify Pricing setup in Plan	
  	And I select Option "4" to navigate to "Plan"
  	And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I verify Plan "<Plan>" in Active Plan by Plan Code screen
		And I press "F7" Key 
		And I select option 28 for pricing
		And I verify Active Plan Pharmacy Price Schedule
		And I verify Active Plan Pharmacy Patient Pay
		And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key 
		#public static String Plan=null;
		#public static String activePriceSchedule=null;
		#public static String activePatientPaySchedule=null;
	  Examples: 
      |Plan 	 | 
      |SN003280|   
      
  Scenario Outline: Add Product Override in Product with existing CAG
    When I select Option "2" to navigate to "RxClaim Product Information Maintenance"
    And I select Option "1" to navigate to "Active Products"
    And I press "F15" Key 
    And I search Product by "<ProductID>"
    And I search for existing Active Product Override "<CarrierID>"
    And I Add Product Override with "<CarrierID>","<AccountID>","<GroupID>"
    And I select Patient Pay MSC "<PatientPay_MSC>" value
    Then I verify added Product Override Details with "<CarrierID>"
    And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key
	  #Note: ProductID=NDC_ID
    Examples:
    | ProductID 	| CarrierID | AccountID| GroupID|PatientPay_MSC| 
    |	99999444422 | SN003280  | *ALL		 | *ALL		|Y				     |
      
  Scenario Outline: Submit a claim in RxClaim
    Given I select Option "3" to navigate to "Manual Claim Menu"
    When I select Option "2" to navigate to "Manual Claim Maintenance"
    #And I add library RXBSYSQA
    And I press "F12" Key 
		And I press "F12" Key
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I Validate RxClaim ID 
    And I Validate Claim Status
    And I press "F7" Key
    And I validate Generic Indicator
    And I press "F15" Key
    And I press "PageDown" Key 
    And I verify pharmacy Schedule price, Schedule Patient Pay and its sequences
    And I verify client Schedule price, Schedule Patient Pay and its sequences
    And I press "F12" Key
    And I press "F7" Key
    And I take 21 Formulary Management Services
    And I verify Tier details
    And I verify Formulary Status
    #: Please provide ProductID which should be same as NDC_GPI_List_ID
   
   Examples:
    |BIN   	|ProcCtrl	|Group	 	|PharmacyID|RxNo        | Refill | FillDate | MemberID   | ProductID   |	DspQty | DS | PSC | Cost |
		|777777	|SN003280	|SN003280	|APHARM    |765009367432| 00     | 092618   | M314140544 | 99999444422 |	30     | 30 | 0	  | 100  | 