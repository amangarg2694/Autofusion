@SR41710 @Regression
Feature: Validate MPA NDC for PA Type G
    
             
   Scenario Outline: TC030-Validate the MPA GPI without DST, No PRC List  attached on PA (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber  |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M030   |MemberFN1|MemebrLN1|1011990 |010191  |123139 |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 417100  | 41710   |	*    | APHARM      | 00   |    | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
                  
   Scenario Outline: TC031-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , No Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M031   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*    | APHARM      | 00    |01  | 091518   | 10122082004|4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
   
   Scenario Outline: TC032-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , No Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M032    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
 
 Scenario Outline: TC033-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , No Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<MSC1>","<OTC1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<MSC2>","<OTC2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
    And I set Drug status "<Drug Status>" on PA "<PANumber2>" for member "<MemberID>"
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M033    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |G    |*|*|07000070002530 |010191|123139|O     |AA     |N                |98666666558 |G    |*|*|07000070002530 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 98666666558     |                  |K                   |                      |                  |
 
   
   Scenario Outline: TC034-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M034    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
   
   
   Scenario Outline: TC035-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , Exact Match  between PRC List and Claim  (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M035    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
  
  Scenario Outline: TC036-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , Exact Match  between PRC List and Claim  (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<MSC1>","<OTC1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<MSC2>","<OTC2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
    And I set Drug status "<Drug Status>" on PA "<PANumber2>" for member "<MemberID>"
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M036    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |G    |*|*|07000070002530 |010191|123139|O     |AA     |N                |98666666558 |G    |*|*|07000070002530 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
   
  Scenario Outline: TC037-Validate the MPA GPI with DST, Patient Residence Code not defined in DST,No  Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M037    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST005          |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
    
    
    Scenario Outline: TC038-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M038    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST006         |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660         |MSC=N and PRC=BALNK |F                   |                    | |
    
    
    Scenario Outline: TC039-Validate the MPA GPI with DST, Patient Residence Code defined in DST,No Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M039   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
   
    Scenario Outline: TC040-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg              |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M040   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST001|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |AUTODST001     DST MSC N PRC 01|F                   |                      |                  |
    
    
    Scenario Outline: TC041-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M041   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes           |AUTOPRC001 |X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
    
    Scenario Outline: TC042-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M042   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   |10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC043-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M043   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |              |       |Drug Requires Prior Authorization  |8                   |                   |                       |
    
   
    Scenario Outline: TC044-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M044   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC045-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M045   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
   
    Scenario Outline: TC046-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M046   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC047-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M047   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC048-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M048   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC049-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim. (PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M049   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |              |       |Drug Requires Prior Authorization  |8                   |                    |                |
    
    @TC
    Scenario Outline: TC050-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M050   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC051-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M051   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                   |                   |
   
   
  Scenario Outline: TC052-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<MSC1>","<OTC1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<MSC2>","<OTC2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
    And I set Drug status "<Drug Status>" on PA "<PANumber2>" for member "<MemberID>"
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M052    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |G    |*|*|07000070002530 |010191|123139|O     |AA     |N                |98666666558 |G    |*|*|07000070002530 |O     |AA     |N                |Yes        |AUTODST003         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
   @TC
    Scenario Outline: TC053-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M053   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|X           | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |AUTODST001     DST MSC N PRC 01  |F                   |                   |                   |
    
    @TC
    Scenario Outline: TC054-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M054   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    Scenario Outline: TC055-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<MSC1>","<OTC1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<DrugStatus1>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<MSC2>","<OTC2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
    And I set Drug status "<DrugStatus2>" on PA "<PANumber2>" for member "<MemberID>"
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|DrugStatus1|DrugStatus2 |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M055    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |G    |*|*|07000070002530 |010191|123139|O     |AA     |N                |98666666558 |G    |*|*|07000070002530 |O     |AA     |N                |Yes        |AUTODST001         |K |a           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |70                   |AA              | 98666666558     |Non-Formulary Drug, Contact Prescriber                  |N                   |                      |                  |
  
     @TC
    Scenario Outline: TC056-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M056   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
     
     @TC
    Scenario Outline: TC057-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I attach DST Table "<DST Table>" on PA "<PANumber>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber>" for member "<MemberID>"
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>" 
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M057   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |G   |*|*|07000070002530|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660      |AUTODST001     DST MSC N PRC 01 |F                   |                      |                   |
     
      Scenario Outline: TC058-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type G)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<MSC1>","<OTC1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<MSC2>","<OTC2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
    And I set Drug status "<Drug Status>" on PA "<PANumber2>" for member "<MemberID>"
    And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<PRC>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    And I press "F7" Key
    Then Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
    And Validate PA Type is "<Expected PA Type>"
    And Validate PA Number is "<Expected PANumber>"   
    And Validate Drug Status is "<Expected Drug Status>"
    And Validate Claim Note Type is "<Expected ClaimNoteType>" and Claim Note is "<Expected ClaimNote>"
    Examples:
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M058    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |G    |*|*|07000070002530 |010191|123139|O     |AA     |N                |98666666558 |G    |*|*|07000070002530 |O     |AA     |N                |Yes        |AUTODST001         |K           |Yes           |AUTOPRC002 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |AUTODST001     DST MSC N PRC 01                  |F                   |                      |                  |
 