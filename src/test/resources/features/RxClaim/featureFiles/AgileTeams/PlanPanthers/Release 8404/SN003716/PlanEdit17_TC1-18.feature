Feature: Validate Claim Transaction for Plan Edit 17 with Part D member 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,PayeeOverride
   
   @TC1     
   Scenario Outline: TC01_Verify Claim is getting Reject 75 when submitted through Normal  Claim Transaction with  Drug Status Setup is 'P' in Plan Edit
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I press "F7" Key
    And Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
 
   Examples:
   |CarrierID |AccountID |GroupID  |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl     | Group | PharmacyID  |Refill| FillDate |ProductID   | DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                       |
   |RAG1212	  |RAG1212   |RAG1212  |3716M001  |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139        |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  |40185016931 |30      |30  |00   |100  |90 |100 |100|R                |75                 |SURGICAL SUPPLY/MEDICAL D Requires Prior|                         
   
   
   @TC2
   Scenario Outline: TC02_Verify Claim is getting Reject 75 when submitted through Medicaid Subrogation Override Flag as 'N' & Drug Status Setup is 'P' in Plan Edit for 3rd Party Exception Medicare "D" with CAG lists as Blank
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I submit the claim
   	And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate the Claim Message is "<Expected SubrogationClaimMsg>"     
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |3716M002    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA3       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| R                          |75                              |SURGICAL SUPPLY/MEDICAL D Requires Prior |f                   |                    | |          
   
   @TC3
   Scenario Outline: TC03_Verify Claim is Paid and notes are printed when a claim is submitted with*Submitted through Medicaid Subrogation Transaction 
    Submitted through Medicaid Subrogation Transaction 
		Drug Status Setup is 'P' in Plan Edit.
	  Medicaid Subrogation Screen has Override Flag as 'Y' 
		CAG lists are Not blank 
	  Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I submit the claim  	
    And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate the Claim Message is "<Expected SubrogationClaimMsg>"     
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |3716M003    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA5       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| R                          |75                              |SURGICAL SUPPLY/MEDICAL D Requires Prior |f                   |                    | |          
   
   @TC4
   Scenario Outline: TC04_Verify the Claim is getting paid when
	 Submitted through Medicaid Subrogation Transaction
   Drug Status Setup is 'P' 
   Medicaid Subrogation has Override Flag as 'Y' 
   Exclude lists as *Default
	 Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I submit the claim   	
   	And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
     And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |3716M004    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA6       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| P                          |                              | |f                   |**                    |Subrogation Claim for Price Comparison Reject Code = 75 was overridden by the Subrogation Profile - 3716QA6 |          
   
   @TC5
   Scenario Outline: TC05_Verify the Claim is Paid and Notes are printed and check the drug status on the claim when 
    Submitted through Medicaid Subrogation Transaction
	  Drug Status Setup is 'P' in Plan Edit 
		Medicaid Subrogation Screen has Override Flag as 'Y' 
		CAG lists are blank 
		Previous Drug Status is also 'P' 
		Plan default is 'P'
	  Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I submit the claim
   	And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |3716M005    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716002     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA4       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| P                          |                              | |F                   |**                    |Subrogation Claim for Price Comparison Reject Code = 75 was overridden by the Subrogation Profile - 3716QA4|          
   
  @TC6         
   Scenario Outline: TC06_Verify the Claim is getting Paid and is Overriden by Prior Authorization and notes is not getting stamped on the Claim 
	 Submitted through Medicaid Subrogation Transaction 
 	 Drug Status Setup is 'P' in Edit 
 	 Medicaid Subrogation Screen has Override Flag as 'Y' and CAG lists are blank 
	 Member has the Prior Authorization Ignore Flag as 'Y' and Edit Flag is 'Y'
	 Plan Default Drug Sts 'F'
	 Prir Authorization Flag is 'Y'
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I set PA Third Party Exception Ignore Flag as "<ThirdPartyException>" on PA "<PANumber>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"   
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|ThirdPartyException| BIN     | ProcCtrl| Group| PharmacyID  |Refill|FillDate | PayeeOverride |SubrogationFlag | ProductID   | DspQty | DS  | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg  |Expected Drug Status|Expected ClaimNote|
   |RAG1212   |RAG1212     |RAG1212      |3716M006   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716003    |010191       |123139        |A1234   |123|       |            |             |                  |                |1056785679 |N   |*  |*  |11017010355|010191|123139|A    |AA    |Y               |Y                 | 888888  | *  |	*    | APHARM      | 00   | 120518  | 3716QA4       |Y               | 40185016931 |30      |30   |00   |100  |90 |100 |100| P                          |                                |                             |F                     |                  |  
   
   
   @TC12         
   Scenario Outline: TC12_To test the Claim is getting Paid and drug is overridden by TB schedule.
   submitted through Normal Transaction
   Plan Edit Drug Status is 'P' 
   Plan Drug Sts is 'P'
   TB schedule has Drug map N-> G
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"   
    Examples:
   |CarrierID |AccountID   |GroupID    |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl| Group| PharmacyID  |Refill|FillDate | ProductID   | DspQty | DS  | PSC | Cost|Due|UCW|Fee |Expected ClaimSts|Expected RejectCode  |Expected ClaimMsg                        |Expected Drug Status|Expected ClaimNote|
   |1SN3716C  |1SN3716A    |1SN3716G   |3716M012   |MemberFN1|MemebrLN1|1011990 |010118  |123118  |A3716TB1      |010118       |123118        |K3716   |001|       |            |             |                  |                | 888888  | *  |	*    | APHARM      | 00   | 121118  | 00071015523 |10      |10   |00   |100  |90 |100 |100| R               |70                   |Transition max 31 day unless unbreakable |G                   |                  |  
   
   @TC13         
   Scenario Outline: TC013_Claim is Paid from Override schedule with Final drug status as G 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"   
    Examples:
   |CarrierID |AccountID   |GroupID    |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl| Group| PharmacyID  |Refill|FillDate | PayeeOverride |SubrogationFlag | ProductID   | DspQty | DS  | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg  |Expected Drug Status|Expected ClaimNote|
   |1SN3716C  |1SN3716A    |1SN3716G   |3716M013   |MemberFN1|MemebrLN1|1011990 |010118  |123118  |A3716TB1      |010118       |123118        |K3716   |001|       |            |             |                  |                | 888888  | *  |	*    | APHARM      | 00   | 121118  | 3716QA4       |Y               | 00071015523 |10      |10   |00   |100  |90 |100 |100| P                          |                                |                              |G                   |                  |  
   
   
   @TC17         
   Scenario Outline: TC017_Claim is Paid. Claim Drug status & Ingredient Drug status & both claim status are verified
   Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I create a subrogation transaction with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I go to transaction compound detail screen
    And I add compound Detail with "<compQualID_1>","<compProductID_1>","<compQuantity_1>","<compCost_1>","<compBasisOfCost_1>"
    And I add compound Detail with "<compQualID_2>","<compProductID_2>","<compQuantity_2>","<compCost_2>","<compBasisOfCost_2>"
    And I add compound Detail with "<compQualID_3>","<compProductID_3>","<compQuantity_3>","<compCost_3>","<compBasisOfCost_3>"    
    And I press "F12" Key
    And I press "F12" Key
    And I submit the claim
    And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"   
    Examples:
   |CarrierID |AccountID   |GroupID    |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl| Group| PharmacyID  |Refill|FillDate | PayeeOverride |SubrogationFlag | ProductID   | DspQty | DS  | PSC | Cost|Due|UCW|Fee |compQualID_1|compProductID_1|compQuantity_1|compCost_1|compBasisOfCost_1|compQualID_2|compProductID_2|compQuantity_2|compCost_2|compBasisOfCost_2|compQualID_3|compProductID_3|compQuantity_3|compCost_3|compBasisOfCost_3|Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg  |Expected Drug Status|Expected ClaimNote|
   |1SN3716C  |1SN3716A    |1SN3716G   |3716M017   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |A3716MIC1     |010191       |123139        |K3716   |001|       |            |             |                  |                | 888888  | *       |	*    | APHARM      | 00   | 121118  | 3716QA4       |Y               | 00000000000 |10      |10   |00   |100  |90 |100 |100|01          |40185016931    |10            |1         |01               |01          |40337000540    |10            |1         |01               |01          |40337000560    |10            |1         |01               | P                          |                                |                              |G                   |                  |  
   