Feature: FIX IT: BATCH: Omnicom POS Rebates - Quarterly Reporting
  
  Scenario Outline: SN374533_SR41835_TC001:Adjudicate the claim with rebate amount setup and prescriber submitted is NPI/SN374533_SR41835_TC002:Run the batch POS Rebate Claims Extract 
		Given I am on RxClaim PlanAdministrator Menu
		#	When I press "F3" Key 
		And I select Option "CCT700" to navigate to "RxClaim Operations Menu"
    And I select Option "2" to navigate to "RxClaim Batch Transaction Loads Menu"
    And I select Option "11" to navigate to "Create Export Files"
		And I select Option "13" to navigate to "POS Rebate Export/Extract Files "
		And I select Option "2" to navigate to "POS Rebate Claims Extract"
		And I enter values "<DateFrom>","<DateThru>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<Netpaidonly>","<Paid>","<Rejected>","<Reversed>","<Captured>","<FileName>","<Library>"
		And I press "F6" Key
		And I verify job status & spooled file to generate the records
		And I press "F3" Key
		Then I verify the records in the file 
		
     Examples:
    | BIN     | ProcCtrl   |	Group      | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |DateFrom|DateThru|CarrierFrom|CarrierThru|AccountFrom|AccountThru|GroupFrom|GroupThru|Netpaidonly|Paid|Rejected|Reversed|Captured|FileName |Library |
	#	|	777777  | SN000869PC |	SN000869G1 | 1476969     | 765431378222 | 00     | 081618   | SN000869MEM3 | 37000051106 |30      |30  |00   |100   |010101  |123139	|SN000869C  |SN000869C  |SN000869A  |SN000869A	|SN000869G|SN000869G| N					| Y  | N			| N			 |   N		|SN000869 |ANILALIB|
		|	777777  | SN000869PC |	SN000869G1 | 1476969     | 765431378222 | 00     | 081618   | SN000869MEM3 | 37000051106 |30      |30  |00   |100   |010118  |123118	|SN000869C  |SN000869C  |SN000869A  |SN000869A	|SN000869G|SN000869G| N					| Y  | N			| N			 |   N		|SN000869 |ANILALIB|
     
			
		
		
		
		
		
		
  
