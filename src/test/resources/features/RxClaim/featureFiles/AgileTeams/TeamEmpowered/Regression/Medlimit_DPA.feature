Feature: DPA Scenarios

@TC13     
   Scenario Outline: TC013: Given a claim rejects for Medlimit with reject codes 88 and 922 when DPA is added and set to override DUR (DPP flag = Y) then the claim should not return reject codes for Medlimit
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
   	And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<DPA Number>" on DRD screen 
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID    | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369   |TESTP02369     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |36909220001|P                |                   |                                     |Hard Reject            |MEDLIMIT         | |                         
 
 @TC14     
   Scenario Outline: TC014: Given a claim rejects for Medlimit with reject codes 88 and 922 when a DPA is added and set to override Medlimit (DPU flag = Y) then the claim should not return reject codes for Medlimit
   Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<DPA Number>" on DRD screen 
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369   |TESTP02369     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30    |7   |00   |200 |0  |200 |   |36909220002|P                |                   |                                     |Hard Reject            |MEDLIMIT         | |                         
 
 @TC15     
   Scenario Outline: TC015: Given a claim rejects for Medlimit with reject codes 88 and 922 when a DPA is added and set to override Medlimit (DPU flag = O with higher Medlimit value than the rejected claim) then the claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<DPA Number>" on DRD screen 
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |36909220003|P                |                   |                                     |Hard Reject            |MEDLIMIT         | |