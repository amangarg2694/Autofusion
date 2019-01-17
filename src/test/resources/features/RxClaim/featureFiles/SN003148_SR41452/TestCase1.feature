Feature: SN002941_SR40694:Part D: PAS OutReach - Web Service - Return NPI when Searching By Member
    
	Scenario Outline: SN003148_SR41452_TS001_Verify that additional field is present in “Drug Utilization Review with DUR/PPS Data” report

    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "9" to navigate to "BatchProcessMenu"
    And I select Option "2" to navigate to "Reports Menu"
    And I select Option "6" to navigate to "Utilization Review Reports Menu"
    And I select Option "11" to navigate to "Drug Utilization Review with DUR PPS Data"
    And I enter value in "<DateFrom>", "<DateThru>", "<CarrierFrom>", "<CarrierThru>" to submit batch
		Then I verify fields CLAIM STATUS,DDI-DTMS INTERACTING GPI,DDI-DTMS Response
		
   Examples: 
      | DateFrom	| DateThru	|	CarrierFrom	|	CarrierThru	|
			| 010118		|	123118		|	VMCAR29			|	VMCAR29			|
		 #| 010118		|	123118		|	SN003280		|	SN003280		|[8403-Test data]
		 #| 010118		|	123118		|	SR41452			|	SR41452			|[8402-Test Data]
    	