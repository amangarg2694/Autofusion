Feature: Validate Medlimit DUR service response 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,DUR Table , BPG 
   
   @TC1     
   Scenario Outline: SR42015_US1463061_TC01: Given a claim rejects for Medlimit when a claim exceeds the defined MEDLIMIT value and the Response Type is Hard Reject then reject code 88 and 922 should be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |40     |10   |00   |100  |0  |100 |   |R                |76 922             |MED 199.99 exceeded;Ttl MED 240.00MG|Hard Reject            |MEDLIMIT         |Total MED 240.00 MED Limit 199.99 |                         
   
   @TC2     
   Scenario Outline: SR42015_US1463061_TC02: Given a claim rejects for Medlimit
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC1 |TESTP36901      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |10      |5   |00   |200  |0  |200 |   |R                |88 924             |MED 89.99 exceeded;Ttl MED 180.00MG  |Soft Reject            |MEDLIMIT         |Total MED 180.00 MED Limit 89.99 |                         
   
   @TC4
   Scenario Outline: SR42015_US1463061_TC04: Given a claim rejects for Medlimit when a claim exceeds the Per Fill Day Supply limitation for treatment naive members THEN  reject code 88 and 925 should be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC2 |TESTP36902      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |200  |0  |200 |   |R                |88 925             |MED 89.99 exceeded;Ttl MED 180.00MG  |Hard Reject            |MEDLIMIT         |Total MED 180.00 MED Limit 89.99 |                         
   
   @TC5
   Scenario Outline: SR42015_US1463061_TC05: Given a claim rejects for Medlimit when a claim exceeds the defined MEDLIMIT valueand the Response Type is Soft Rejectthen reject code 922 should not be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |  |Hard Reject            |MEDLIMIT         | |                         
   
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
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | Prescriber Qual |PrescriberID |DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                     |Expected Dur Response  |Expected Service |Expected Additional Text |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |  |Hard Reject            |MEDLIMIT         | |                         
   
   @TC7
   Scenario Outline: SR42015_US1463061_TC07: Given a claim triggers Medlimit when the Response type is Message then reject code 922 should not be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTO922M |TESTP36903     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |10   |00   |100  |0  |100 |   |R                |88             |  |Hard Reject            |MEDLIMIT         | |                         
   
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC1 |TESTP36901     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |30      |5   |00   |100  |0  |100 |   |R                |88             |  |Hard Reject            |MEDLIMIT         | |                         
   
   @TC9
   Scenario Outline: SR42015_US1463061_TC09: Given a claim triggers Medlimit when a claim exceeds the defined Medlimit value and the Response type is Message then reject code 924 should not be returned on the claim
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
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTO924M |TESTP36904     |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |01               |1790206415   |10      |5   |00   |100  |0  |100 |   |P                |             |  |Hard Reject            |MEDLIMIT         | |                         
   
   