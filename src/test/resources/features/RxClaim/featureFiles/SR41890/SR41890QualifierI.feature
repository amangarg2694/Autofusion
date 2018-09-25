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
    Then Member for Part D created
    
    
    
    
    Examples:
    | CarrierID| AccountID   | GroupID    | MemberID      | First Name   | Last Name    | DOB       | From Date | Thru Date   |SupplyType|SupplyID|MMDFromDate|MMDThruDate|Contract|SubsidyLevel|CopayCat|
		|	CAR3036  | ACC3036     |	GRP3036   | SN3036DEMO88    | JOSHY        | MEM          | 01011970	| 010101    | 123139      |   06     |SN3036  |010118     |123118     |A3036   |000         |0       |
             
   Scenario Outline: Pre Claim Submission Scenario 

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134267 | 01     |040118    | SN3036DEMO88      | 00781202076 |30       |30  |0   |10   |03|
     
     
    Scenario Outline: Scenario 1

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134268 | 01     |040218    | SN3036DEMO88      | 00378395009 |30       |30  |0   |10    |01|
     
     
     Scenario Outline: Scenario 2

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134269 | 01     |050218    | SN3036DEMO88      | 00071015523 |25      |25  |0    |10    |01 |
		
		Scenario Outline: Scenario 3

       Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim for "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "R"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134270 | 01     |052518    | SN3036DEMO88      | 00071015523 |6       |6   |0    |10    |04 |
     
     
    Scenario Outline: Scenario 4

     Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134271 | 01     |053018    | SN3036DEMO88      | 00071015523 |5       |5   |0    |10    |04 |
		
		Scenario Outline: Scenario 5

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134272 | 01     |073018    | SN3036DEMO88      | 00781202076 |30       |30  |0   |10    |03|
		
		
		Scenario Outline: Scenario 6

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty  | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134273 | 01     |073018    | SN3036DEMO88    | 00071015523 |30       |30  |0    |10    |03 |
		
		Scenario Outline: Scenario 7

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim for DUR info "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "R"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty  | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134273 | 01     |081018    | SN3036DEMO88    | 00781202076 |30       |30  |0   |10    |03|
		
		
		Scenario Outline: Scenario 8

    Given I am on RxClaim PlanAdministrator Menu
    When I submit to claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<PRC>"
    Then Validate Claim Status is "P"
    
   
    
    
    
    
      Examples:
    | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID   | DspQty  | DS | PSC | Cost |PRC|
		|	777777  | CCHA    |	*ALL  | APHARM      | 689654134273 | 01     |081118    | SN3036DEMO88    | 00781202076 |30       |30  |0    |10    |01 |