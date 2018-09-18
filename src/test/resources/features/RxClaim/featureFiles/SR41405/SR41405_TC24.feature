#Author: Venkateshwarlu M

Feature: SN003280_SR41405_TS001_Req 7.3: verify when  Claim is submitted with PA MSC Override =N and Pat pay MSC override is not Y
      
Scenario Outline: Verify Member Prior Authorization setup
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "1" to navigate to "RxClaim Eligibility/Claim Transaction Maintenance"
		And I select Option "2" to navigate to "Active/Eligible Member by ID"
		And I search Member by MemberID "<MemberID>"
		And I verify Override Plan with Plan "<Plan>"
		And I provide family type and ID details "<MemberID>"
		And I press "F16" Key 
		And I add Member Prior Authorization "<Number>", "<Type>", "<MSC>", "<NDC_GPI_List_ID>", "<FromDate>", "<ThruDate>", "<Agt>", "<IgnoreDrgSts>", "<Rsn>"
		And I edit Member Prior Authorization list
		And I press "F7" Key 
		And I press "F10" Key 
		And I add Member NDC Prior Authorization Price "<PSC>", "<MSC2>", "<Status>", "<MSC_Override>"
			
	 #drug: 00378-8130-45 [for PSC=M]
	 #MemberID: SN003280M1, TESTVMMEM6[8402] 
	 #CarrierID: SN003280
 
    Examples: 
      | MemberID		| Plan			|	Number	|	Type	|	MSC	| NDC_GPI_List_ID |	FromDate	|	ThruDate	|	Agt	|	Rsn	|	IgnoreDrgSts	| PSC	|	MSC2	| Status	|	MSC_Override	|
      | SN003280M1	| SN003280	|	8728783	|	N			| M		|	12108085002020	|	010111		|	123139		|	a		|	AA	|	N							|	A		|	A			|	A				|	N							|
      
 #Scenario Outline: Submit a claim in RxClaim
    #Given I am on RxClaim PlanAdministrator Menu 
    #When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    #And I Validate Claim Status
    #And I Validate RxClaim ID    
   
    #Examples:
    #| BIN     | ProcCtrl| Group | PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  |	DspQty | DS | PSC | Cost |
		#|	777777  | QET     |	*ALL  | APHARM      | 765765367432 | 00     | 060116   | SN003280M1	| 00777310402|	30     | 30 | 00  |100   |
   
    
        