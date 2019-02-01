Feature: Validate Medlimit DUR service response 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,DUR Table , BPG 
 
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
  