Feature: Validate Claim Transaction for Plan Edit 17 with Part D member 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,PayeeOverride
   
   @TC1     
   Scenario Outline: TC01_Verify Claim is getting Reject 75 when submitted through Normal  Claim Transaction with  Drug Status Setup is 'P' in Plan Edit
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I submit the claim with "<BIN>","<PCN>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I press "F7" Key
    And Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
 
   Examples:
   |CarrierID |AccountID |GroupID  |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | PCN     | Group | PharmacyID  |Refill| FillDate |ProductID   | DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                       |
   |RAG1212	  |RAG1212   |RAG1212  |SR16M010  |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139        |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  |40185016931 |30      |30  |00   |100  |90 |100 |100|R                |75                 |SURGICAL SUPPLY/MEDICAL D Requires Prior|                         
   
   #Use Member ID same as TC01
   @TC2
   Scenario Outline: TC02_Verify Claim is getting Reject 75 when submitted through Medicaid Subrogation Override Flag as 'N' & Drug Status Setup is 'P' in Plan Edit for 3rd Party Exception Medicare "D" with CAG lists as Blank
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
   	And I press "F12" Key
   	And I submit subrogation transaction with "<BIN>","<PCN>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
 		And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate the Claim Message is "<Expected SubrogationClaimMsg>"     
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | PCN     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |SR16M010    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA3       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| R                          |75                              |SURGICAL SUPPLY/MEDICAL D Requires Prior |f                   |                    | |          
   
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
   	And I submit subrogation transaction with "<BIN>","<PCN>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
 		And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate the Claim Message is "<Expected SubrogationClaimMsg>"     
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | PCN     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |SR16M010    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA5       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| R                          |75                              |SURGICAL SUPPLY/MEDICAL D Requires Prior |f                   |                    | |          
   
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
   	And I submit subrogation transaction with "<BIN>","<PCN>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
 		And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
     And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | PCN     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |SR16M010    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716001     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA6       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| P                          |                              | |f                   |**                    |Subrogation Claim for Price Comparison Reject Code = 75 was overridden by the Subrogation Profile - 3716QA6 |          
   
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
   	And I submit subrogation transaction with "<BIN>","<PCN>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<PayeeOverride>","<SubrogationFlag>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
 		And I press "F7" Key
    Then Validate Claim Status is "<Expected SubrogationClaimSts>""<Expected SubrogationRejectCode>"
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note is "<Expected ClaimNote>"
  
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | PCN     | Group | PharmacyID  |Refill| FillDate | PayeeOverride |SubrogationFlag |ProductID   | DspQty | DS | PSC | Cost|Due|UCW|Fee |Expected SubrogationClaimSts|Expected SubrogationRejectCode  |Expected SubrogationClaimMsg             |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |RAG1212	  |RAG1212     |RAG1212      |SR16M012    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUT3716002     |010191       |123139       |A1234   |123|       |            |             |                  |                | 888888  | *       |*      | APHARM      | 01   |  120518  | 3716QA4       |Y               |40185016931 |30      |30  |00   |100  |90 |100 |100| P                          |                              | |F                   |**                    |Subrogation Claim for Price Comparison Reject Code = 75 was overridden by the Subrogation Profile - 3716QA4|          
   
   
   