@Regression @res1   
Feature: Verify Medlimit Detail screen for PA Prediction button
Scenario Outline: Verify whether for a paid claim that have multiple sequences display the sequence with the highest calculated MED amount
    
    Given I am on RxClaim PlanAdministrator Menu  
    And I submit a claim for medlimit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Qual>","<Prescid>"
    Then Validate Claim Status is "P"
    And  I am on RxClaim PlanAdministrator Menu 
    And I submit a claim for medlimit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo1>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS1>","<PSC1>","<Cost>","<Qual>","<Prescid>"
    Then Validate Claim Status is "P"
    And I press "F7" Key
    And I press "F17" Key
    And I enter option "5" in DUR/PPS Information screen
    And I press "F8" Key
    And I press "F8" Key
    Then I validate the Medlimit PA Prediction Summary screen 
Examples:
    |MemberID   | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate   | ProductID  | DspQty | DS | PSC | Cost      |Qual|Prescid|DS1|PSC1|RxNo1|
	# |MEMSR41696|	777777  | QET     |	*ALL  | 0556540      | 765411779932 | 00     | 091118    | 00054421925  |10     |7  |00   |100   |12  |AL4392748|10|3|765411521772|
		#|MEMSR41696|	777777  | QET     |	*ALL  | 0556540      | 765411779932 | 00     | 091118    | 00054421925  |10     |7  |00   |100   |12  |AL4392748|10|3|765411521772|
		#|MEMSR47510|	777777  | ASHE     |	*ALL  | 2400074      | 765411779932 | 00     | 091118    | 00574704512  |10     |7  |00   |100   |12  |AL4392748|3|3|765411521772|
	#	|SN00353100M5|	777777  | ASHE     |	*ALL  | 2400074      | 765411779932 | 00     | 091118    | 00574704512  |90     |30  |00   |100   |12  |AL4392748|30|3|765411521772|
	  	|SN3796MEM2|	777777  | ASHE     |	*ALL  | 2400074      | 765411779931 | 00     | 091118    | 00406900076  |90     |5 |00   |100   |12  |AL4392748|30|3|765410021772|