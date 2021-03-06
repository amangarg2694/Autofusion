#Author: Venkateshwarlu M

Feature: Process Brand Drugs As Tier 1 for Members
SN003280_SR41405_TC024_Req 7.3: verify when  Claim is submitted with PA MSC Override =N and Pat pay MSC override is not Y        

Scenario Outline: Create a new member in RxClaim with existing CAG
		Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I search Member by MemberID "<MemberID>"
   
    Examples:
    | CarrierID | AccountID    | GroupID     		 | MemberID   | FirstName  | LastName  | DOB      | FromDate  | ThruDate |
		|	SN003280  | SN003280AUTO | SN003280GRPAUTO | M244140523 | AUTOMEM    | AUTOMEM   | 12251987 | 010101    | 123139   |
		
Scenario Outline: Verify Member Prior Authorization setup
		Given I provide family type and ID details in MemberID
		And I press "F16" Key 
		And I add Member Prior Authorization "<PANumber>", "<PAType>", "<OTC>", "<PAMSC>", "<NDC_GPI_List_ID>", "<FromDate>", "<ThruDate>", "<Agt>", "<Rsn>", "<IgnoreDrgSts>" 
		And I edit Member Prior Authorization list
		And I press "F7" Key 
		And I press "F10" Key 
		#And I add Member NDC Prior Authorization Price "<PSC>", "<MEM_NDC_PA_MSC>", "<Status>", "<MSC_Override>"
		And I navigate back to RxClaim Plan Administrator Menu 

	 #NOTE: Please change the PA Number for every Run
	 #00002850101-N-
	 #00003161112-O-8
	 #00005423720-Y-1
	 #00069098301-M-7
	 #00069130501-M
 Examples: 
   |PANumber	|PAType|OTC	|PAMSC|NDC_GPI_List_ID|FromDate|ThruDate|Agt	|	Rsn	|IgnoreDrgSts|PSC	|MEM_NDC_PA_MSC|Status|MSC_Override	|
   |76730947  |N		 |*		|M		|00069130501		|010111	 |123139	|a		|	AA	|N					 |A		|A	 			 		 |A			|*						|
   
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

   Examples: 
      |Plan 	 | 
      |AUTO3280|   
      
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
    #Note: When ever this Formulary Management Services is down, we need to restart the script.
    And I verify Tier details
    And I verify Formulary Status
   
   Examples:
    | BIN     | ProcCtrl | Group   | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | SN003280 |SN003280 | APHARM      | 765765367432 | 00     | 092818   | M244140523 | 00069130501|	30     | 30 | 0	  |100   | 