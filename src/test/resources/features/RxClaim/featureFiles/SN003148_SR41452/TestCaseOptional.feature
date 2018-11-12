Feature: SN002941_SR40694:Part D: PAS OutReach - Web Service - Return NPI when Searching By Member
 
  #@tag1
  #Please Do not use this Test case
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
		
		
Scenario Outline: SN003148_SR41452_TS001_Verify that additional field is present in “Drug Utilization Review with DUR/PPS Data” report

    #Given I am on RxClaim PlanAdministrator Menu
    And I select Option "9" to navigate to "BatchProcessMenu"
    And I select Option "2" to navigate to "Reports Menu"
    And I select Option "6" to navigate to "Utilization Review Reports Menu"
    And I select Option "11" to navigate to "Drug Utilization Review with DUR PPS Data"
    And I enter value in "<DateFrom>", "<DateThru>", "<CarrierFrom>", "<CarrierThru>" to submit batch
    And I verify fields CLAIM STATUS,DDI-DTMS INTERACTING GPI,DDI-DTMS Response
    Then I verify RXCLAIM-No, RXCLAIM-STS in Spool file
		
   Examples: 
    | DateFrom	| DateThru	|	CarrierFrom	|	CarrierThru	|	
		| 010118		|	123118		|	SR41452			|	SR41452			|	
		
          	