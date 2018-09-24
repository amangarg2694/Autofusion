@SR41710
Feature: Validate MPA NDC for PA Type 1
    
     @TC59        
   Scenario Outline: TC059-Validate the MPA NDC without DST, No PRC List  attached on PA (PA Type 1)
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber  |Type|NDCGPIList|From  |Thru  |Agent|Reason|IgnoreDrugStatus|Attach DST|DST Table|Drug Status |Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg   |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M059   |MemberFN1|MemebrLN1|1011990 |010191  |123139 |9866666660 |1   |AUTO41710 |010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 417100  | 41710   |	*    | APHARM      | 00   |    | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
                  
   Scenario Outline: TC060-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , No Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M060   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*    | APHARM      | 00    |01  | 091518   | 10122082004|4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
  
  @TC61 
   Scenario Outline: TC061-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , No Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M061    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
 
 Scenario Outline: TC062-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , No Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M062    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |1    |AUTO41710 |010191|123139|O     |AA     |N                |98666666558 |1    |AUTO41710 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 98666666558     |                  |K                   |                      |                  |
 
   
   Scenario Outline: TC063-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M063    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
   
   
   Scenario Outline: TC064-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , Exact Match  between PRC List and Claim  (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M064    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
  
  
  Scenario Outline: TC065-Validate the MPA NDC List  without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , Exact Match  between PRC List and Claim  (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M065    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |1    |AUTO41710 |010191|123139|O     |AA     |N                |98666666558 |1    |AUTO41710 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
 
  Scenario Outline: TC066-Validate the MPA NDC with DST, Patient Residence Code not defined in DST,No  Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M066    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST005          |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       | |K                   |                    | |
    
    
    Scenario Outline: TC067-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M067    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST006         |K           |No           | |           | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660         |MSC=N and PRC=BALNK |F                   |                    | |
    
    
    Scenario Outline: TC068-Validate the MPA NDC with DST, Patient Residence Code defined in DST,No Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M068   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
   
    Scenario Outline: TC069-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M069   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST001|K           |No            |           |            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |AUTODST001     DST MSC N PRC 01|F                   |                      |                  |
    
    
    Scenario Outline: TC070-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M070   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes           |AUTOPRC001 |X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |                  |K                   |                      |                  |
    
    
    Scenario Outline: TC071-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M071   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   |10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC072-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M072   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |              |       |Drug Requires Prior Authorization  |8                   |                   |                       |
    
   
    Scenario Outline: TC073-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M073   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC074-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M074   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
   
    Scenario Outline: TC075-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M075   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC076-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M076   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                    |                   |
    
    
    Scenario Outline: TC077-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M077   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC078-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim. (PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M078   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|1            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |              |       |Drug Requires Prior Authorization  |8                   |                    |                |
    
    @TC
    Scenario Outline: TC079-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M079   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC080-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M080   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |03  | 091518   |10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |  |K                   |                   |                   |
   
   Scenario Outline: TC081-Validate the MPA NDC List  with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M081    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |1    |AUTO41710 |010191|123139|O     |AA     |N                |98666666558 |1    |AUTO41710 |O     |AA     |N                |Yes        |AUTODST003         |K           |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |03  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |                  |K                   |                      |                  |
 
   @TC
    Scenario Outline: TC082-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M082   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|X           | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |AUTODST001     DST MSC N PRC 01  |F                   |                   |                   |
    
    @TC
    Scenario Outline: TC083-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M083   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC84
    Scenario Outline: TC084-Validate the MPA NDC List  with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table|DrugStatus1 |DrugStatus2|Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M084    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |1    |AUTO41710 |010191|123139|O     |AA     |N                |98666666558 |1    |AUTO41710 |O     |AA     |N                |Yes        |AUTODST001         |K    |a          |Yes           |AUTOPRC001 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |R                |70                   |AA              | 98666666558     |Non-Formulary Drug, Contact Prescriber                  |N                   |                      |                  |
  
    @TC
    Scenario Outline: TC085-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M085   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|X            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
     
     @TC
    Scenario Outline: TC086-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M086   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |1   |AUTO41710|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|I            | 417100  | 41710   |	*     | APHARM    | 00   |01  | 091518   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660      |AUTODST001     DST MSC N PRC 01 |F                   |                      |                   |
    
    @TC87 
     Scenario Outline: TC087-Validate the MPA NDC List  with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type 1)
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
   |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M087    |MemberFN1|MemebrLN1|1011990 |010191  |123139 |09866666660 |1    |AUTO41710 |010191|123139|O     |AA     |N                |98666666558 |1    |AUTO41710 |O     |AA     |N                |Yes        |AUTODST001         |K           |Yes           |AUTOPRC002 |1           | 417100  | 41710   |	*     | APHARM      | 00   |01  | 091518   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |AUTODST001     DST MSC N PRC 01                  |F                   |                      |                  |
 