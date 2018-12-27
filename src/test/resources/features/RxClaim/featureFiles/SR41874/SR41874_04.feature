@Regression
Feature: Duplicate message coming from plan edit
  
  Scenario Outline: SN003414_SR41874_TC004:Verify if the Duplicate message is coming for the Reject Claim once or twice in 8.4.03
		Given I am on RxClaim PlanAdministrator Menu
		When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And I enter "<Plan>" name in the Active Plan by Plan Code Menu
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I press "F3" Key
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		And I will submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>"
		And I press "F7" Key
		Then I press "F10" Key
		
	
    Examples: 
      
 |  Plan    | BIN    | ProcCtrl | Group     | PharmacyID |	RxNo       | Refill| FillDate | MemberID   | ProductID  | DspQty | DS| PSC | Cost |Due |UCW |
 |SN3414PL02|	003414 | 0129292  |	SN3414GRP | APHARM     | 222284222244| 00    | 012017   |SN3414MBR005| 00378251278| 30     | 30| 00  |100   |100 |100 |

