@SR41710
Feature: Validate MPA NDC for PA Type 2
    
             
   Scenario Outline: TC088-Validate the MPA GPI without DST, No PRC List  attached on PA (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber  |Type|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M088   |MemberFN1|MemebrLN1|1011990 |010191  |123139 |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 417100  | 41710   |	*    | APHARM      | 00   |    | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
                  
   Scenario Outline: TC089-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , No Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M089   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*    | APHARM      | 00    |01  | 091518   | 10122082004|4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
   
   Scenario Outline: TC090-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , No Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M090    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
 
 @TC91
 Scenario Outline: TC091-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , No Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710N091    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |2    |AUTO41710G |010191|123139|O     |AA     |N                |98666666558 |2    |AUTO41710G |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 98666666558     |                  |K                   |                      |                  |
 
   
   Scenario Outline: TC092-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M092    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
   
   
   Scenario Outline: TC093-Validate the MPA GPI without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , Exact Match  between PRC List and Claim  (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M093    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
  
  Scenario Outline:TC94-Validate the MPA GPI List  without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , Exact Match  between PRC List and Claim  (PA Type 2)
  Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M094    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |2    |AUTO41710G |010191|123139|O     |AA     |N                |98666666558 |2    |AUTO41710G |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
  
  Scenario Outline: TC095-Validate the MPA GPI with DST, Patient Residence Code not defined in DST,No  Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                 |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M095    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST005          |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
    
    
    Scenario Outline: TC096-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M096    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST006         |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660         |MSC=N and PRC=BALNK |F                   |                    | |
    
    
    Scenario Outline: TC097-Validate the MPA GPI with DST, Patient Residence Code defined in DST,No Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M097   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
   @TC98
    Scenario Outline: TC098-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg              |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710N098   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST001|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |AUTODST001     DST MSC N PRC 01|F                   |                      |                  |
    
    
    Scenario Outline: TC099-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M099   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes           |AUTOPRC001 |X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
    
    Scenario Outline: TC100-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M100   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   |10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC101-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M101   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |              |       |Drug Requires Prior Authorization  |8                   |                   |                       |
    
   
    Scenario Outline: TC102-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M102   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC103-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M103   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
   
    Scenario Outline: TC104-Validate the MPA GPI with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M104   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC105-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M105   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC106-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M106   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC107-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim. (PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M107   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |              |       |Drug Requires Prior Authorization  |8                   |                    |                |
    
    @TC
    Scenario Outline: TC108-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M108   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC109-Validate the MPA GPI with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M109   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                   |                   |
   
   
   Scenario Outline: TC110-Validate the MPA GPI List  with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
   When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M110    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |2    |AUTO41710G |010191|123139|O     |AA     |N                |98666666558 |2    |AUTO41710G |O     |AA     |N                |Yes        |AUTODST003         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
   @TC
    Scenario Outline: TC111-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M111   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|X           | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |AUTODST001     DST MSC N PRC 01  |F                   |                   |                   |
    
    @TC
    Scenario Outline: TC112-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M112   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    Scenario Outline: TC113-Validate the MPA GPI List  with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<DrugStatus1>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|DrugStatus1|DrugStatus2 |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M113    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |2    |AUTO41710G |010191|123139|O     |AA     |N                |98666666558 |2    |AUTO41710G |O     |AA     |N                |Yes        |AUTODST001         |K |a           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |70                   |AA              | 98666666558     |Non-Formulary Drug, Contact Prescriber                  |N                   |                      |                  |
   
     @TC
    Scenario Outline: TC114-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M114   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
     
     @TC
    Scenario Outline: TC115-Validate the MPA GPI with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber>","<Type>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber   |Type|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table |Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg                  |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M115   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |2   |AUTO41710G|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660      |AUTODST001     DST MSC N PRC 01 |F                   |                      |                   |
     
     Scenario Outline: TC116-Validate the MPA GPI List  with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 2)
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with PA "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
    And I create PA Number "<PANumber1>","<Type1>","<NDCGPIList1>","<From>","<Thru>","<Agent1>","<Reason1>","<IgnoreDrugStatus1>"
    And I attach DST Table "<DST Table>" on PA "<PANumber1>" for member "<MemberID>" if Attach DST Flag is "<Attach DST>"
    And I set Drug status "<Drug Status>" on PA "<PANumber1>" for member "<MemberID>"    
    And I attach PRC List "<PRC List>" and Qual "<PRCList Qual>" on PA "<PANumber1>" for member "<MemberID>" if Attach PRC List Flag is "<Attach PRCList>"    
    And I create PA Number "<PANumber2>","<Type2>","<NDCGPIList2>","<From>","<Thru>","<Agent2>","<Reason2>","<IgnoreDrugStatus2>"    
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M116    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |2    |AUTO41710G |010191|123139|O     |AA     |N                |98666666558 |2    |AUTO41710G |O     |AA     |N                |Yes        |AUTODST001         |K           |Yes           |AUTOPRC002 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |AUTODST001     DST MSC N PRC 01                  |F                   |                      |                  |
 