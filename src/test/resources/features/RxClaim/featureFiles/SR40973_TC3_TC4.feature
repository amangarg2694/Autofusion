Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
    Given I am on RxClaim PlanAdministrator Menu  
    When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID1>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key 
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen" 
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I press "F12" Key
    And I select Option "3" to navigate to "RxClaim Manual Claim Menu"
    And I select Option "2" to navigate to "RxClaim D0 Manual Claim Maintenance"
    And I select Option "1" to navigate to "Transaction"
    And I do manual claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<fillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<qual>"
    Then Validate "P" should displayed on "TransactionSubmissionPage"                 
      
       
       
    Examples:
    | CarrierID | AccountID  | GroupID   | MemberID1 | First Name | Last Name | DOB     | From Date | Thru Date| BIN      | ProcCtrl | Group  | PharmacyID   |RxNo          | Refill |fillDate| MemberID | ProductID | DspQty | DS | PSC | Cost | qual |                                                
		|	SR4097CR1 | SR4097ACC1 | SR4097GR1 | EXEMEMR07 | FIRST      | LAST      | 01011990| 010116    | 123116   |	333333  | SN002456|	SN002456| APHARM       |955000555551  | 00     |07022018| EXEMEMR03| LIPITOR   | 10     |10  |00   |100   | 1    | 
    |	SR4097CR1 | SR4097ACC1 | SR4097GR1 | EXEMEMR08 | FIRST      | LAST      | 01011990| 010116    | 123116   |	333333  | SN002456|	SN002456| APHARM       |955000555552  | 00     |07022018| EXEMEMR04| LIPITOR   | 10     |10  |00   |100   | 1    |
    
    