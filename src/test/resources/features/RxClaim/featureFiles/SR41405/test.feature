Feature: SN003280_SR41405_TS001_Req 7.3: verify when  Claim is submitted with PA MSC Override =N and Pat pay MSC override is not Y
Scenario Outline: Verify Member Prior Authorization setup
		Given I am on RxClaim PlanAdministrator Menu
		#When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		#And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I provide family type and ID details "<MemberID>"
		And I press "F16" Key 
		And I add Member Prior Authorization "<Number>", "<PAType>", "<OTC>", "<PAMSC>", "<NDC_GPI_List_ID>", "<FromDate>", "<ThruDate>", "<Agt>", "<Rsn>", "<IgnoreDrgSts>" 
		And I edit Member Prior Authorization list
		And I press "F7" Key 
		And I press "F10" Key 
		And I add Member NDC Prior Authorization Price "<PSC>", "<MEM_NDC_PA_MSC>", "<Status>", "<MSC_Override>"
		And I navigate back to RxClaim Plan Administrator Menu 
		 #public static String Member_NDC_PA_MSC_Override=null;
		 #Drug: 00378-8130-45 [for PSC=M]
		 #MemberID: SN003280M1, TESTVMMEM6[8402] 
		 #CarrierID: SN003280
 		#	Reporter.addStepLog("Member is created");
 Examples: 
   |MemberID	|Number	 |PAType|OTC	|PAMSC|NDC_GPI_List_ID|FromDate|ThruDate|Agt	|	Rsn	|IgnoreDrgSts|PSC	|MEM_NDC_PA_MSC|Status|MSC_Override	|
   |MEM4140502|57338983|N		  |*		|M		|97407938493		|010111	 |123139	|a		|	AA	|N					 |A		|A	 			 		 |A			|N						|
      
  Scenario Outline: Verify Pricing setup in Plan	
  	And I select Option "4" to navigate to "Plan"
  	And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I verify Plan "<Plan>" in Active Plan by Plan Code screen
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
    #Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I Validate Claim Status
    And I Validate RxClaim ID  
    And I press "F7" Key
    And I validate Generic Indicator
    And I press "F15" Key
    And I press "PageDown" Key 
    And I verify Schedule price, Schedule Patient Pay and its sequences
   
   Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 090918   | MEM4140502	| 00378813045|	30     | 30 | 0	  |100   |
   #MSC types
   #00002850101-N-
	 #00003161112-O-8
	 #00005423720-Y-1
		#00069098301-M-7
        	 #Drug: 00378-8130-45 [for PSC=M]
		 #MemberID: SN003280M1, TESTVMMEM6[8402] 
		 #CarrierID: SN003280
 		 #Reporter.addStepLog("Member is created");