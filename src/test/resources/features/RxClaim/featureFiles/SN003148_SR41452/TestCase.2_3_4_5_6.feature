Feature: SN002941_SR40694:Part D: PAS OutReach - Web Service - Return NPI when Searching By Member
 
 
Scenario Outline: SN003148_SR41452_TS001_Verify that additional field is present in “Drug Utilization Review with DUR/PPS Data” report

    Given I am on RxClaim PlanAdministrator Menu
    And I select Option "9" to navigate to "BatchProcessMenu"
    And I select Option "2" to navigate to "Reports Menu"
    And I select Option "6" to navigate to "Utilization Review Reports Menu"
    And I select Option "11" to navigate to "Drug Utilization Review with DUR PPS Data"
    And I enter value in "<DateFrom>", "<DateThru>", "<CarrierFrom>", "<CarrierThru>" to submit batch
    And I verify fields CLAIM STATUS,DDI-DTMS INTERACTING GPI,DDI-DTMS Response
    And I verify RXClaim-Number "<rxclaimnumber>", RXClaim-Status in Spool file
		#Then I go back to PlanAdministrator Menu
			And I press "F3" Key
			And I press "F3" Key
			And I press "F3" Key
			And I press "F3" Key
		
   Examples: 
    | DateFrom	| DateThru	|	CarrierFrom	|	CarrierThru	|	rxclaimnumber		|
		| 010118		|	123118		|	SR41452			|	SR41452			|	182221848402000	|
		| 010118		|	123118		|	SR41452			|	SR41452			|	181842267225000	|
		
          	