Feature: Validate Medlimit DUR service response 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,DUR Table , BPG 
   
   @TC1     
   Scenario Outline:TC01: Given a claim rejects for Medlimit when a claim exceeds the defined MEDLIMIT value and the Response Type is Hard Reject then reject code 88 and 922 should be returned on the claim
    Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |40     |10   |00   |100  |0  |100 |   |R                |88 922             |MED 199.99 exceeded;Ttl MED 240.00MG|Hard Reject            |MEDLIMIT         |Total MED 240.00       PER FILL EXCEEDED MED Limit 199.99 |                         
   
   @TC2     
   Scenario Outline:TC02: Given a claim rejects for Medlimit
	 when a claim exceeds the defined MEDLIMIT value and the Response Type is Hard Reject and Medlimit Service is setup on Plan Medicare CMS Appeals Rights Notice DUR Service List then reject code 88, 922 and 569 should be returned on the claim
	 Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |20      |5   |00   |200  |0  |200 |   |R                |88 922             |MED 199.99 exceeded;Ttl MED 240.00MG |Hard Reject            |MEDLIMIT         |Total MED 240.00 MED Limit 199.99 |                         
   
   @TC3
   Scenario Outline: SR42015_US1463061_TC03: Given a claim rejects for Medlimit then reject code 88 and 924 should be returned on thewhen a claim exceeds the defined Soft Medlimit value and the Response Type is set to Soft Reject claim
	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC1 |TESTP36901      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |10      |5   |00   |200  |0  |200 |   |R                |88 924             |MED 89.99 exceeded;Ttl MED 120.00MG  |Soft Reject            |MEDLIMIT         |Total MED 120.00 MED Limit 89.99 |                         
   
   @TC4
   Scenario Outline: TC04: Given a claim rejects for Medlimit when a claim exceeds the Per Fill Day Supply limitation for treatment naive members THEN  reject code 88 and 925 should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC2 |TESTP36902      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |200  |0  |200 |   |R                |88 925             |MED 89.99 exceeded;Ttl MED 180.00MG  |Hard Reject            |MEDLIMIT         |Total MED 180.00       PER FILL EXCEEDED MED Limit 89.99 |                         
   
   @TC5
   Scenario Outline: TC05: Given a claim rejects for Medlimit when a claim exceeds the defined MEDLIMIT valueand the Response Type is Soft Rejectthen reject code 922 should not be returned on the claim
	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |Total MED 437.10MG  |Hard Reject            |MEDLIMIT         | |                         
   
   @TC6
   Scenario Outline: SR42015_US1463061_TC06: Given a claim Hard rejects for Medlimit  when a claim does not exceed the defined Hard MEDLIMIT valuethen reject code 922 should not be returned on the claim
	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                  |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |MED 89.99 exceeded;Ttl MED 180.00MG  |Hard Reject            |MEDLIMIT         |Total MED 180.00       PER FILL EXCEEDED MED Limit 89.99 |                         
   
   @TC7
   Scenario Outline:TC07: Given a claim triggers Medlimit when the Response type is Message then reject code 922 should not be returned on the claim
    Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTO922M |TESTP36903     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |MED 89.99 exceeded;Ttl MED 180.00MG  |Hard Reject            |MEDLIMIT         |Total MED 180.00       PER FILL EXCEEDED MED Limit 89.99 |                         
   
   @TC8
   Scenario Outline: SR42015_US1463061_TC08: Given a claim rejects for Medlimit when a claim exceeds the defined Hard Medlimit value and the Response Type is set to Hard Reject then reject code 924 should not be returned on the claim
   Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC1 |TESTP36901     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |5   |00   |100  |0  |100 |   |R                |88             |MED 199.99 exceeded;Ttl MED 360.00MG  |Hard Reject            |MEDLIMIT         |Total MED 360.00 MED Limit 199.99 |                         
   
   @TC9
   Scenario Outline: SR42015_US1463061_TC09: Given a claim triggers Medlimit when a claim exceeds the defined Medlimit value and the Response type is Message then reject code 924 should not be returned on the claim
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTO924M |TESTP36904     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |10      |5   |00   |100  |0  |100 |   |P                |             |  |Message            |MEDLIMIT         |Total MED 120.00 MED Limit 89.99 |                         
   
   
   @TC10
   Scenario Outline: TC010: Given a claim rejects for Medlimit with reject codes 88 and 922 when a PA is added and set to override DUR (MPP flag = Y) then the claim should not return reject codes for Medlimit
	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "88 922"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPP Flag to "Y" on PA "<PANumber>" for member "<MemberID>"    	
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
 		
 		Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList     |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA10       |G   |*  |*  |49109902155220 |010191|123139|O    |AA    |N               |AUTOC369   |TESTP3690    | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |P                |                  |                     |Hard Reject            |MEDLIMIT         |Total MED 257.10 MED Limit 199.99   |                         
 
 @TC11
   Scenario Outline: TC011: Given a claim rejects for Medlimit with reject codes 88 and 922 when a PA is added and set to override Medlimit (MPU flag = Y) then the claim should not return reject codes for Medlimit
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "88 922"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPU Flag to "Y" on PA "<PANumber>" for member "<MemberID>"     	
   	And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
 		
 		Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList     |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA11       |G   |*  |*  |49109902155220 |010191|123139|O    |AA    |N               |AUTOC369   |TESTP3690    | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |P                |                  |                     |Hard Reject            |MEDLIMIT         |Total MED 257.10 MED Limit 199.99   |                         
 
 @TC12
 Scenario Outline: TC012: Given a claim rejects for Medlimit with reject codes 88 and 922 when a PA is added and set to override Medlimit (MPU flag = O with higher Medlimit value than the rejected claim) then the claim should not return reject codes for Medlimit
 	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "88 922"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPU Flag to "O" on PA "<PANumber>" for member "<MemberID>"
    And I set MedLimit Override to "<Medlimit Override Value>"
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
 		
 		Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList     |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Medlimit Override Value |DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA12       |G   |*  |*  |49109902155220 |010191|123139|O    |AA    |N               |500                     |AUTOC369   |TESTP3690    | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |P                |                  |                      |Hard Reject            |MEDLIMIT         |Total MED 257.10 MED Limit 199.99   |                         
 
 @TC13     
   Scenario Outline: TC013: Given a claim rejects for Medlimit with reject codes 88 and 922 when DPA is added and set to override DUR (DPP flag = Y) then the claim should not return reject codes for Medlimit
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>"
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    #When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
   	And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID    | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369   |TESTP02369     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |36909220001|P                |                   |                                     |Hard Reject            |MEDLIMIT         |Total MED 257.10 MED Limit 199.99 |                         
 
 @TC14     
   Scenario Outline: TC014: Given a claim rejects for Medlimit with reject codes 88 and 922 when a DPA is added and set to override Medlimit (DPU flag = Y) then the claim should not return reject codes for Medlimit
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    #When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369   |TESTP02369     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30    |7   |00   |200 |0  |200 |   |36909220002|P                |                   |                                     |Hard Reject            |MEDLIMIT         |Total MED 257.10 MED Limit 199.99 |                         
 
 @TC15     
   Scenario Outline: TC015: Given a claim rejects for Medlimit with reject codes 88 and 922 when a DPA is added and set to override Medlimit (DPU flag = O with higher Medlimit value than the rejected claim) then the claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    #When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |36909220003|P                |                   |                                     |Message            |MEDLIMIT         |Total MED 257.10 MED Limit 500.00 |
   
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
 
 @TC21     
   Scenario Outline: TC021:Given a claim triggers Medlimit when the Response type is Extract then Verify reject code 925 should not be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC5   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |R                |88             |MED 89.99 exceeded;Ttl MED 156.00MG   |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
 
 
 @TC22 
        
   Scenario Outline: TC022:Given a claim rejects for Medlimit with reject codes 88 and 925 when a PA is added and set to override DUR (MPP flag = Y)then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPP Flag to "Y" on PA "<PANumber>" for member "<MemberID>"    	
    And I resubmit the claim 
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
    And I resubmit the claim 
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
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>" 
    And Validate PA Number "<PANumber>" on DRD screen 
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|MPU Flag |Medlimit Override Value |DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA24       |G   |*|*|49109902155220 |010191|123139|T    |OJ    |N               |O        |500                      |AUTOC2   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |36     |10   |00   |200 |0  |200 |   |R                |88 925                  |Total MED 216.00MG                     |Hard Reject            |MEDLIMIT         |Total MED 216.00       PER FILL EXCEEDED MED Limit 500.00   |                         
 
 @TC27     
   Scenario Outline: TC027: Given a claim rejects for Medlimit with reject codes 88, 924 and 925 when a PA is added and set to override Medlimit (MPU flag = O with higher Medlimit value than the Soft threshold value) and NTT Per Fill Day Supply override is setup with higher value than DUR Then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "88 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set MPU Flag to "O" on PA "<PANumber>" for member "<MemberID>"
    And I set MedLimit Override to "<Medlimit Override Value>"
    And I press "F8" Key
    And I press "PageDown" Key
    And I set NTT Per Fill DS to "<NTT Per Fill DS>"   	
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>" 
    And Validate PA Number "<PANumber>" on DRD screen 
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|MPU Flag |Medlimit Override Value |NTT Per Fill DS|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA27       |G   |*|*|49109902155220 |010191|123139|T    |OJ    |N               |O        |500                     |12             |AUTOC2   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |36     |9   |00   |200 |0  |200 |   |P                |                  |                    |Message            |MEDLIMIT         |Total MED 240.00 MED Limit 500.00  |                         
 
 @TC29     
   Scenario Outline: TC029: Given a claim rejects for Medlimit with reject codes 88 and 925 When a DPA is added and set to override DUR (DPP flag = Y) Then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUROC3   |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |DPTEST123 |P                |                   |                                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99 |
   
   @TC30    
   Scenario Outline: TC 030: Given a claim rejects for Medlimit with reject codes 88 and 925 when a DPA is added and set to override Medlimit (DPU flag = Y) then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUROC3   |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |26     |10   |00   |200 |0  |200 |   |DPTEST124 |P                |                   |                                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99 |
   
   @TC31     
   Scenario Outline:TC 031 : Given a claim rejects for Medlimit with reject codes 88 and 925 when a DPA is added and set to override Medlimit (DPU flag = O with higher Medlimit value than the rejected claim) and NO NTT Per Fill Day Supply override is setupthen Verify claim should reject for Medlimit with reject codes 88 and 925
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC2   |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |36     |10   |00   |200 |0  |200 |   |DPTEST125 |R                |88 925                   |Total MED 216.00MG                                     |Hard Reject            |MEDLIMIT         |Total MED 216.00       PER FILL EXCEEDED MED Limit 500.00 |
   
   @TC32     
   Scenario Outline:TC 032 : Given a claim rejects for Medlimit with reject codes 88, 922 and 925 when a DPA is added and set to override Medlimit (DPU flag = O with higher Medlimit value than the Hard threshold) and NTT Per Fill Day Supply override is setup with higher value than DUR then Verify claim should not return reject codes for Medlimit 
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC2   |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |36     |9   |00   |200 |0  |200 |   |DPTEST126 |P                |                   |                                     |Message            |MEDLIMIT         |Total MED 240.00 MED Limit 500.00 |
  
  @TC36     
   Scenario Outline:TC01: TC 036 : Given a claim rejects for Medlimit when a claim exceeds the defined Soft Medlimit value and the Response Type is set to Soft then Verify reject code 88 and 924 should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC7   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |22     |10   |00   |200  |0  |200 |   |R                |88 924             |MED 89.99 exceeded;Ttl MED 132.00MG |Soft Reject            |MEDLIMIT         |Total MED 132.00       PER FILL EXCEEDED MED Limit 89.99|                         
   
   @TC37     
   Scenario Outline:TC01: TC037 : Given a claim rejects for Medlimit when a claim exceeds the defined Hard Medlimit value and the Response Type is set to Hard Reject then Verify reject code  924 should NOT be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC7   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |50     |7   |00   |200  |0  |200 |   |R                |88                  |MED 199.99 exceeded;Ttl MED 428.52MG |Hard Reject            |MEDLIMIT         |Total MED 428.52 MED Limit 199.99|                         
   
   @TC38     
   Scenario Outline:TC 038: Given a claim triggers Medlimit 
-When a claim exceeds the defined Medlimit value
-And the Response type is Message
-Then Verify reject code 924 should NOT be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
     And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC8   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |50     |7   |00   |200  |0  |200 |   |P                |                  |                                      |Message            |MEDLIMIT         |Total MED 685.62 MED Limit 199.99 |                         
   
   @TC39 @MPA     
   Scenario Outline:TC 039 :Given a claim rejects for Medlimit with reject codes 88 and 924
-When a PA is added and set to override DUR (MPP flag = Y) 
-Then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
   	And I set MPP Flag to "Y" on PA "<PANumber>" for member "<MemberID>"    	
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    # And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
   
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA39       |G   |*|*|49109902155220  |010191|123139|T    |OJ    |N               |AUTOC7   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |P                |                  |                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
     
   @TC40 @MPA     
   Scenario Outline:TC 040 :Given a claim rejects for Medlimit with reject codes 88 and 924
-When a PA is added and set to override Medlimit (MPU flag = Y)
-Then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
   	And I set MPU Flag to "Y" on PA "<PANumber>" for member "<MemberID>"     	
   	And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    # And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
   
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA40       |G   |*|*|49109902155220  |010191|123139|T    |OJ    |N               |AUTOC7   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |30     |7   |00   |200 |0  |200 |   |P                |                  |                     |Soft Reject            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
   
   @TC41 @MPA     
   Scenario Outline:TC 041 : Given a claim rejects for Medlimit with reject codes 88 and 924
-When a PA is added and set to override Medlimit (MPU flag = O with higher Medlimit value than the rejected claim)
-Then Verify claim should not return reject codes for Medlimit
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	  And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"        
	  And Validate Claim Status is "R" and reject code "76 925"
	  And I go to Member screen and add  PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
   	And I set MPU Flag to "O" on PA "<PANumber>" for member "<MemberID>"
    And I set MedLimit Override to "<Medlimit Override Value>"    	
    And I resubmit the claim 
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    # And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		And Validate PA Number "<PANumber>" on DRD screen 
   
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Medlimit Override Value |DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |PA41       |G   |*|*|49109902155220  |010191|123139|T    |OJ    |N              |1500                    |AUTOC7   |TESTP36902     | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |50     |7   |00   |200 |0  |200 |   |P                |                  |                     |Message            |MEDLIMIT         |Total MED 156.00       PER FILL EXCEEDED MED Limit 89.99   |                         
   
  @TC42     
   Scenario Outline:TC 042 : Given a claim rejects for Medlimit with reject codes 88 and 924 when a DPA is added and set to override Medlimit (DPU flag = O with higher Medlimit value than the rejected claim)then Verify claim should not return reject codes for Medlimit
   	Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I enter DPA Number on claim transaction "<DPA Number>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate DPA Number "<DPA Number>" 
    And I press "F12" Key
    And I press "F12" Key
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 		
 		
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|DPA Number |Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC7   |TESTP02369      | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00574704012 |01               |1790206415   |50     |7   |00   |200 |0  |200 |   |DPTEST125 |P                |                   |                                     |Message            |MEDLIMIT         |Total MED 428.52 MED Limit 500.00 |
 
 @TC44
   Scenario Outline: TC44: Given Medlimit Service is setup on Plan Medicare CMS Appeals Rights Notice DUR Service List Verify reject codes 88, 922, 925 and 569 should be returned on the claim when a claim Hard rejects for Hard MME edit and claim also exceeds NTT Per Fill DS limit and NTT Per Fill DS Response Type is Soft
	  Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC44  |AUTOPARTD1     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |50     |10  |00   |100  |0  |100 |   |R                |88 922 925 569     |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
   
   @TC45
   Scenario Outline: TC45: Given Medlimit Service is setup on Plan Medicare CMS Appeals Rights Notice DUR Service List when a claim Hard rejects for Hard MME edit and claim also exceeds NTT Per Fill DS limit and NTT Per Fill DS Response Type is Hard and the claim also rejects for Therdosethen Verify reject codes 88, 922, 925, 928 and 569 should be returned on the claim
 		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode     |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC45  |AUTOPARTD1     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |120     |10  |00   |100  |0  |100 |   |R                |88 922 925 928 569     |MED 199.99 exceeded;Ttl MED 720.00MG  |Hard Reject            |MEDLIMIT         |Total MED 720.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC46
   Scenario Outline: TC46: Given Medlimit Service is setup on Plan Medicare CMS Appeals Rights Notice DUR Service List when a claim Soft rejects for Soft MME edit and claim also exceeds NTT Per Fill DS limit and NTT Per Fill DS Response Type is Soft then Verify reject codes 88, 924 , 925 and 569  should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC44  |AUTOPARTD1     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |20     |10  |00   |100  |0  |100 |   |R                | 88 924 925 569      |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC47
   Scenario Outline: TC47: Given Medlimit and THERDOSE Services are setup on Plan Medicare CMS Appeals Rights Notice DUR Service List when a claim Soft rejects for Medlimit and claim also exceeds NTT Per Fill DS limit and the claim also Hard rejects for Therdose then Verify reject codes 88, 924, 925, 928 and 569  should be returned on the claim
    Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC46  |AUTOPARTD1     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |20     |10  |00   |100  |0  |100 |   |R                | 88 924 925 928 569     |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC48
   Scenario Outline: TC48: Given Medlimit and THERDOSE Services are setup on Plan Medicare CMS Appeals Rights Notice DUR Service List when a claim Soft rejects for Medlimit and claim also exceeds NTT Per Fill DS limit and the claim also Soft rejects for Therdose then Verify reject codes 88, 924, 925 and 928   should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC46  |AUTOPARTD2     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |20     |10  |00   |100  |0  |100 |   |R                | 88 924 925 928       |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  
  @TC49
   Scenario Outline: TC49: Given Medlimit is triggered and Medlimit is bypassed due to an Exception (Patient Residence Code, Diagnosis Code, Taxonomy Code or GPI) then Verify claim should paid and reject codes 922, 924, 925 and 928    should not be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I add diagnosis code for auto generated member "<Diagnosis Qual>","<Diagnosis TypeCode>","<Diagnosis Code>","<FromDate>","<ThruDate>"
   	And I set the claim transaction "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I add Diagnosis code details with "<Diagnosis Qual>","<Diagnosis Code>"
    And I press "F6" Key
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
   # And Validate the Claim Message is "<Expected ClaimMsg>"
   # And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|Diagnosis TypeCode|Diagnosis Qual|Diagnosis Code| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC49  |AUTOPARTD2     |010119       |123119        |R0000   |555|       |            |             |                  |                |1                 |01            |E015.2          | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |20     |10  |00   |100  |0  |100 |   |P               |      | || | |                         
  
  @TC50
   Scenario Outline: TC50: Given the GPI on the incoming claim has a max daily dose setup on Plan edit 11 and the claim exceeds the max daily dose when a claim exceeds the MEDLIMIT Per Fill Day Supply limitation for treatment naive members and the Response type is Hard Reject then Verify reject codes 76, 88 and 925   should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC45  |AUTOPARTD3     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |52427044090 |01               |1790206415   |240     |10  |00   |100  |0  |100 |   |R                | 76 88 925       |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC51
   Scenario Outline: TC51:  Given the GPI on the incoming claim has a max daily dose setup on Plan edit 11 and the claim does not exceed the max daily dose when a claim exceeds the MEDLIMIT Per Fill Day Supply limitation for treatment naive members and the Response type is Hard Reject then Verify reject codes  88 and 925   should be returned on the claim but not 76
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC45  |AUTOPARTD3     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |52427044090 |01               |1790206415   |120     |10  |00   |100  |0  |100 |   |R                | 88 925       |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC52
   Scenario Outline: TC52:  Given the GPI on the incoming claim has Period to Date limits setup on Plan edit 11 and the claim exceeds the Period to Date limits when a claim exceeds the MEDLIMIT Per Fill Day Supply limitation for treatment naive members and the Response type is Hard Rejectthen Verify reject codes  76, 88 and 925    should be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC45  |AUTOPARTD3     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |59417010510 |01               |1790206415   |4     |8  |00   |100  |0  |100 |   |R                |  76 88 925       |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC53
   Scenario Outline: TC53: Given the GPI on the incoming claim has Period to Date limits setup on Plan edit 11 and the claim does not exceed the Period to Date limits when a claim exceeds the MEDLIMIT Per Fill Day Supply limitation for treatment naive members and the Response type is Hard Reject then Verify reject codes 88 and 925 should be returned on the claim but not reject code 76
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare for auto generated member "<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"  	
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode   |Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTPARTDC	|AUTPARTDA |AUTPARTDG  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC45  |AUTOPARTD3     |010119       |123119        |R0000   |555|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |59417010510 |01               |1790206415   |3     |8  |00   |100  |0  |100 |   |R                | 88 925       |MED 199.99 exceeded;Ttl MED 300.00MG  |Hard Reject            |MEDLIMIT         |Total MED 300.00       PER FILL EXCEEDED MED Limit 199.99 |                         
  
  @TC54
   Scenario Outline: TC 054: Given Reject Code Remap Table is setup to remap 88 to 76 via Remap DUR Service List for MEDLIMIT 
-When the claim rejects for MEDLIMIT 
-Then Verify reject code 88 should not be returned on the claim
		Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3691	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |40     |10   |00   |100  |0  |100 |   |R                |76 922             |MED 199.99 exceeded;Ttl MED 240.00MG|Hard Reject            |MEDLIMIT         |Total MED 240.00       PER FILL EXCEEDED MED Limit 199.99 |                         
 
 @TC68  
		Scenario Outline: TC068:Claim rejects for THERDOSE when claim/s exceeds the THERDOSE Max Daily Dose then reject code 88 and 928 should be returned on the claim
	    Given I am on RxClaim PlanAdministrator Menu
	    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
	    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
	   	And I submit the claim with prescriber id "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<Prescriber Qual>","<PrescriberID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"    
	    And I press "F7" Key
	    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
	    And Validate the Claim Message is "<Expected ClaimMsg>"
	    And Validate claim DUR/PPS details "<Expected Dur Response>","<Expected Service>","<Expected Additional Text>"  
	 
	   Examples:
	   |CarrierID   |AccountID |GroupID  |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  | BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC |Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                    |Expected Dur Response  |Expected Service |Expected Additional Text |
	   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC928 |TESTP36902    | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  012019  |00000124659 |01               |1790206415   |5     |10   |00   |200 |0  |200 |   |R                |88 928             |MED 89.99 exceeded;Ttl MED 112.50MG  |Hard Reject            |THERDOSE         |Total MED 112.50       PER FILL EXCEEDED MED Limit 89.99 |                         

   