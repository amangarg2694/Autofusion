Feature: Validate Medlimit DUR service response for Reject code 925
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,DUR Table , BPG 
   
   @TC18     
   Scenario Outline: TC018:When a claim exceeds the Per Fill Day Supply limitation for treatment naive members and the Response type is Soft Reject then Verify reject code 88 and 925 should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUROC3   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |15     |8   |00   |200 |0  |200 |   |R                |88 925             |MED 89.99 exceeded;Ttl MED 112.50MG  |Soft Reject            |MEDLIMIT         |Total MED 112.50       PER FILL EXCEEDED MED Limit 89.99 |                         
 
 @TC19     
   Scenario Outline: TC019: When a claim exceeds the Per Fill Day Supply limitation for treatment experienced member then Verify reject code 925 should not be returned on the claim
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","3","3","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUROC3   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |R                |88                |MED 89.99 exceeded;Ttl MED 156.00MG  |Soft Reject            |MEDLIMIT         |Total MED 156.00 MED Limit 89.99  |                         
 
 @TC20     
   Scenario Outline: TC020:When a claim triggers Medlimit and the Response type is Message then Verify reject code 925 should not be returned on the claim
	 Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC4   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |R                |88             |MED 89.99 exceeded;Ttl MED 156.00MG   |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
 
 @TC22 
        
   Scenario Outline: TC022:Given a claim rejects for Medlimit with reject codes 88 and 925 when a PA is added and set to override DUR (MPP flag = Y)then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPP Flag to "Y" on PA "<PANumber>" for member "<MemberID>"    	
    And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA22       |G   |*|*|49109902155220 |010191|123139|T    |OJ    |N               |AUROC3   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |P                |                  |                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
 
 @TC23     
   Scenario Outline: TC023:A claim rejects for Medlimit with reject codes 88 and 925 when a PA is added and set to override Medlimit (MPU flag = Y) then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPU Flag to "Y" on PA "<PANumber>" for member "<MemberID>"     	
    And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    # And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
   
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA23       |G   |*|*|49109902155220 |010191|123139|T    |OJ    |N               |AUROC3   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |P                |                  |                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
 
 @TC24     
   Scenario Outline: TC024: When a PA is added and set to override Medlimit (MPU flag = O with higher Medlimit value than the Hard threshold value) and no NTT Per Fill Day Supply override is setup then Verify claim should reject for Medlimit with reject codes 88 and 925
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "88 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPU Flag to "O" on PA "<PANumber>" for member "<MemberID>"
    And I set MedLimit Override to "<Medlimit Override Value>"    	
    And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>" 
    And Validate PA Number "<PANumber>" on DRD screen 
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|MPU Flag |Medlimit Override Value |DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA24       |G   |*|*|49109902155220 |010191|123139|T    |OJ    |N               |O        |500                      |AUTOC2   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |36     |10   |00   |200 |0  |200 |   |R                |88 925                  |Total MED 216.00MG                     |Hard Reject            |MEDLIMIT         |Total MED 216.00       PER FILL EXCEEDED MED Limit 500.00   |                         
 
 
 
 