Feature: SN002941_SR40694:Part D: PAS OutReach - Web Service - Return NPI when Searching By Member
 
 
    Scenario Outline: Submit a claim in RxClaim
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim for rejected soft with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I Validate Claim Status, Response with RxClaimID
    And I navigate back to RxClaim PlanAdministrator Menu
   
  	#ID 00536329710 
    #ID 00056016975  C 
    #Plan Override RAD_DTMS01
    #Member  MVM41452
    #M41452A 
		#M41452B 
		#M41452M1
		
     Examples:
    | BIN     | ProcCtrl| Group		| PharmacyID  | RxNo         | Refill | FillDate | MemberID   | ProductID  	|	DspQty | DS | PSC | Cost |
		|	170996  | QET     |	SR41452 | APHARM      | 765488367011 | 00     | 080118   | MVM41452		| 00056016975 |	20     | 02	| 00  |	100  |
    
	
		
          	