#Author: Venkateshwarlu M

Feature: SN003280_SR41405_TS001_Req 7.3: verify when  Claim is submitted with PA MSC Override =N and Pat pay MSC override is not Y

Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu 
    When I select Option "2" to navigate to "RxClaim Product Information Maintenance"
    And I select Option "1" to navigate to "Active Products"
    And I press "F15" Key 
    And I search Product by "<ProductID>"
    And I Add Product Override with "<CarrierID>","<AccountID>","<GroupID>"
    Then I select Multi-Source "<Product_MSC>" value
    And I press "F12" Key 
		And I press "F12" Key
		And I press "F12" Key 
		And I press "F12" Key
		
   #Note: ProductID=NDC_ID
    Examples:
    | ProductID 	| CarrierID | AccountID    | GroupID     |Product_MSC	| 
    |	00002850101 | SN003280  | SN003280ACC1 | SN003280GRP1|	Y				  |
    
Scenario Outline: Create a new member in RxClaim with existing CAG
     When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I search Member by MemberID "<MemberID>"
   
   #public static String baseMemberID=null;
    Examples:
    | CarrierID | AccountID    | GroupID      | MemberID   | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	SN003280  | SN003280ACC1 | SN003280GRP1 | MEM4140514 | AUTOMEM    | AUTOMEM   | 12251987 | 010101    | 123139   |
		
Scenario Outline: Verify Member Prior Authorization setup
		Given I provide family type and ID details in MemberID
		And I press "F16" Key 
		And I add Member Prior Authorization "<PANumber>", "<PAType>", "<OTC>", "<PAMSC>", "<NDC_GPI_List_ID>", "<FromDate>", "<ThruDate>", "<Agt>", "<Rsn>", "<IgnoreDrgSts>" 
		And I edit Member Prior Authorization list
		And I press "F7" Key 
		And I press "F10" Key 
		And I add Member NDC Prior Authorization Price "<PSC>", "<MEM_NDC_PA_MSC>", "<Status>", "<MSC_Override>"
		And I navigate back to RxClaim Plan Administrator Menu 
	 #MSC_Override: public static String Member_NDC_PA_MSC_Override=null;
	 #PAMSC: public static String basePA_MSC=null;
	 #NOTE: Please change the PA Number for every Run
	 #00002850101-N-
	 #00003161112-O-8
	 #00005423720-Y-1
	 #00069098301-M-7
 Examples: 
   |PANumber	|PAType|OTC	|PAMSC|NDC_GPI_List_ID|FromDate|ThruDate|Agt	|	Rsn	|IgnoreDrgSts|PSC	|MEM_NDC_PA_MSC|Status|MSC_Override	|
   |40066045  |N		 |*		|N		|00002850101		|010111	 |123139	|a		|	AA	|N					 |A		|A	 			 		 |A			| 						|
   
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
      
  Scenario Outline: Submit a claim in RxClaim
    Given I select Option "3" to navigate to "Manual Claim Menu"
    When I select Option "2" to navigate to "Manual Claim Maintenance"
    And I add library RXBSYSQA
    And I press "F12" Key 
		And I press "F12" Key
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I Validate Claim Status
    And I Validate RxClaim ID  
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
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID	  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 090918   | MEM4140514	| 00002850101 |	30     | 30 | 0	  | 100  | 