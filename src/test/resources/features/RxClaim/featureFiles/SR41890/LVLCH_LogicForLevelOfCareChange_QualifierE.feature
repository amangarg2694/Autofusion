Feature: Part D claims
   Scenario Outline: Create a new member in RxClaim with existing CAG for Medicare Part D 
   
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key 
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen"  
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F8" Key
    And I send values for member medicare setup "<From Date>","<Thru Date>","<SupplyType>","<SupplyID>","<MMDFromDate>","<MMDThruDate>","<Contract>","<SubsidyLevel>","<CopayCat>"
    #Then Member for Part D created
    
    
    
    
    Examples:
    | CarrierID| AccountID   | GroupID    | MemberID     | First Name   | Last Name    | DOB       | From Date | Thru Date   |SupplyType|SupplyID|MMDFromDate|MMDThruDate|Contract|SubsidyLevel|CopayCat|
		|	2CAR3036  | 2ACC3036   |	2GRP3036  | SN3036TEST77 | JOSHY        | MEM          | 01011970	 | 010101    | 123139      |   06     |SN3036  |010118     |123118     |A3036   |000         |0       |
             
   Scenario Outline: Pre Claim Submission Scenario 1

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo           | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 111131321237 | 01     |050118    | SN3036TEST77     | 00093754206 |30       |30  |0   |10   |03|
     
     
    Scenario Outline: Pre Claim Submission Scenario 2

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo         | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      |111131321238 | 01     |060118    | SN3036TEST77  | 00002322730  |30      |30  |0    |10    |01|
     
     
     Scenario Outline: Scenario 1

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 111131321239 | 01     |062918    | SN3036TEST77     | 00093754206 |1       |1   |0    |10    |03 |
		
		Scenario Outline: Scenario 2

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo         | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      |111131321214 | 01     |062918    | SN3036TEST77  | 00002322730 |30      |30  |0    |10    |01 |
		
		