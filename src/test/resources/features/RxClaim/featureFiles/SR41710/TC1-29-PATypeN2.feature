@SR41710 @Regression  
Feature: Validate MPA NDC for PA Type N
    
   @TC @TC1  
   Scenario Outline: TC001-Validate the MPA NDC without DST, No PRC List  attached on PA (PA Type N)
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
   #|AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M001    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 777777  | 41710   |	*    | APHARM      | 00    |    | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |                    |K                   |                      |                  |
   # |AUTO41710 |AUTOASR41710|AUTOGSR41710 |SR41710M001    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 777777  | 41710   |	*    | APHARM      | 00    |    | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |Unit AWP=$33.13813 Eff 01/07/19                  |K                   |                      |                  |
    |SR41710 |SR41710|SR41710 |SR41710M001    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |No            |           |            | 777777  | SR41710   |SR41710   | APHARM      | 00    |    | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       | Unit AWP=$33.13813 Eff 01/07/19                   |K                   |                      |                  |
   
   @TC              
   Scenario Outline: TC002-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , No Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M002    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 777777  | SR41710   |	SR41710   | APHARM      | 00    |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              |9866666660       |Unit AWP=$33.13813 Eff 01/07/19                    |K                   |                    |                  |
   
   @TC @res1
   Scenario Outline: TC003-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , No Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M003    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 777777  | SR41710   |	SR41710    | APHARM      | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
 
 @TC @PA 
 Scenario Outline: TC004-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , No Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M004   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |09866666660 |N    |*|*|10122082004 |010191|123139|O     |AA     |N               |98666666558 |N    |*|*|10122082004 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 777777  | SR41710   |	SR41710     | APHARM      | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 98666666558     |Unit AWP=$33.13813 Eff 01/07/19                |K                   |                      |                  |
 
  @TC5  
   Scenario Outline: TC005-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier X , Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710O005    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |X           | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |R                |  75               |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted |
   
   @TC 
   Scenario Outline: TC006-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier I , Exact Match  between PRC List and Claim  (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M006    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |No        |         |K           |Yes           |AUTOPRC001 |I           | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       |Unit AWP=$33.13813 Eff 01/07/19  |K                   |                    | |
  
 @TC @PA
 Scenario Outline: TC007-Validate the MPA NDC without DST, PRC List attached on PA and Patient Residence Code List Qualifier 1 , Exact Match  between PRC List and Claim  (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M007   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |09866666660 |N    |*|*|10122082004 |010191|123139|O     |AA     |N               |98666666558 |N    |*|*|10122082004 |O     |AA     |N                |No        |         |K           |Yes           |AUTOPRC001 |1           | 777777  |SR41710   |	SR41710     | APHARM      | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |Unit AWP=$30.40179 Eff 09/20/13                  |K                   |                      |                  |
 
  @TC
  Scenario Outline: TC008-Validate the MPA NDC with DST, Patient Residence Code not defined in DST,No  Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M008    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        |AUTODST005          |K           |No           |1 |           | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660       |Unit AWP=$30.40179 Eff 09/20/13 |K                   |                    | |
    
    @TC9
    Scenario Outline: TC009-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M009    |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        |AUTODST006         |K           |No           | |           | 777777  | SR41710  |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                 |AA              |9866666660         |MSC=N and PRC=BALNK |F                   |                    | |
    
    
    Scenario Outline: TC010-Validate the MPA NDC with DST, Patient Residence Code defined in DST,No Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M010   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |No            |           |            | 777777  | SR41710   |	SR41710   | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |Unit AWP=$33.13813 Eff 01/07/19                |K                   |                      |                  |
    
   
    Scenario Outline: TC011-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, No PRC List attached on PA. (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M011   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST001|K           |No            |           |            | 777777  | SR41710   |	SR41710    | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |AUTODST001     DST MSC N PRC 01|F                   |                      |                  |
    
    
    Scenario Outline: TC012-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M012   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes           |AUTOPRC001 |X            | 777777  | SR41710  |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                   |AA              |9866666660       |Unit AWP=$30.40179 Eff 09/20/13                  |K                   |                      |                  |
    
    
    Scenario Outline: TC013-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M013   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC014-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim
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
   |SR41710 |SR41710|SR41710 |SR41710M014   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                 |75                 |              |       |Drug Requires Prior Authorization  |8                   |                   |                       |
    
   
    Scenario Outline: TC015-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M015   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|X            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                       |
    
    
    Scenario Outline: TC016-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.
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
   |SR41710 |SR41710|SR41710 |SR41710M016   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |Unit AWP=$30.40179 Eff 09/20/13  |K                   |                    |                   |
    
  
    Scenario Outline: TC017-Validate the MPA NDC with DST, Patient Residence Code not defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M017   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST005|K           |Yes            |AUTOPRC001|1            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |Unit AWP=$33.13813 Eff 01/07/19|K                   |                    |                   |
    
    
    Scenario Outline: TC018-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M018   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |Unit AWP=$30.40179 Eff 09/20/13  |K                   |                    |                   |
    
    
    Scenario Outline: TC019-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim. (PA Type N
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
   |SR41710 |SR41710|SR41710 |SR41710M019   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC020-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim. (PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M020   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|1            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                 | 75                |              |       |Drug Requires Prior Authorization  |8                   |                    |                |
    
    @TC
    Scenario Outline: TC021-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M021   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|X            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |R                 | 75                |AA              |9866666660       |Drug Requires Prior Authorization  |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
    @TC
    Scenario Outline: TC022-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M022   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes       |AUTODST003|K           |Yes            |AUTOPRC001|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |03  | 012219   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |Unit AWP=$30.40179 Eff 09/20/13  |K                   |                   |                   |
   
   @PA
 Scenario Outline: TC023-Validate the MPA NDC with DST, Patient Residence Code defined in DST, No Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M023   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |09866666660 |N    |*|*|10122082004 |010191|123139|O     |AA     |N               |98666666558 |N    |*|*|10122082004 |O     |AA     |N                |Yes       |AUTODST003         |K           |Yes           |AUTOPRC001 |1           | 777777  | SR41710   |	SR41710     | APHARM      | 00   |03  | 012219   | 10122082004 |4       |4   |00   |100  |P                |                   |AA              | 09866666660     |Unit AWP=$33.13813 Eff 01/07/19                |K                   |                      |                  |
 
 
   @TC
    Scenario Outline: TC024-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and No Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M024   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        | AUTODST001         |K           |Yes            |AUTOPRC001|X           | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660       |AUTODST001     DST MSC N PRC 01  |F                   |                   |                   |
    
    @TC
    Scenario Outline: TC025-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and No Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M025   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC001|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
    
      @PA26
 Scenario Outline: TC026-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and No Exact Match  between PRC List and Claim.(PA Type N)
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
   |CarrierID |AccountID   |GroupID      |MemberID    |FirstName|LastName |DOB     |FromDate|ThruDate|PANumber1  |Type1|MSC1|OTC1|NDCGPIList1 |From  |Thru  |Agent1|Reason1|IgnoreDrugStatus1|PANumber2   |Type2|MSC2|OTC2|NDCGPIList2 |Agent2|Reason2|IgnoreDrugStatus2|Attach DST|DST Table |DrugStatus1 |DrugStatus2|Attach PRCList|PRC List   |PRCList Qual| BIN     | ProcCtrl| Group | PharmacyID  |Refill|PRC | FillDate | ProductID   | DspQty | DS | PSC | Cost|Expected ClaimSts|Expected RejectCode|Expected PA Type|Expected PANumber|Expected ClaimMsg |Expected Drug Status|Expected ClaimNoteType|Expected ClaimNote|
   |SR41710 |SR41710|SR41710 |SR41710M026   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |09866666660 |N    |*|*|10122082004 |010191|123139|O     |AA     |N               |98666666558 |N    |*|*|10122082004 |O     |AA     |N                |Yes       |AUTODST001|K           |a           |Yes           |AUTOPRC001 |1           | 777777  | SR41710   |	SR41710     | APHARM      | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |R                | 70                  |AA              | 98666666558     |Non-Formulary Drug, Contact Prescriber                  |N                   |                      |                  |
 
  
     @TC
    Scenario Outline: TC027-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier X and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M027   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|X            | 777777  | SR41710   |	SR41710    | APHARM    | 00   |01  | 012219   | 10122082004  |4       |4   |00   |100  |R                 |75                 |AA              |9866666660       |Drug Requires Prior Authorization |8                   |PA                    |Prior Authorization Overrides did not apply due to Patient Residence Code submitted                   |
     
     @TC 
    Scenario Outline: TC028-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier I and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M028   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |9866666660 |N   |*|*|10122082004|010191|123139|O    |AA    |N               |Yes        |AUTODST001          |K           |Yes            |AUTOPRC002|I            | 777777  | SR41710   |	SR41710     | APHARM    | 00   |01  | 012219   | 10122082004  |4       |4   |00   |100  |P                 |                 |AA              |9866666660      |AUTODST001     DST MSC N PRC 01 |F                   |                      |                   |
     
           @PA 
 Scenario Outline: TC029-Validate the MPA NDC with DST, Patient Residence Code defined in DST, Exact Match between Drug Status Table and Claim, PRC List attached on PA, Patient Residence Code List Qualifier 1 and Exact Match  between PRC List and Claim.(PA Type N)
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
   |SR41710 |SR41710|SR41710 |SR41710M029   |MemberFN1|MemebrLN1|1011990 |010191  |123139  |09866666660 |N    |*|*|10122082004 |010191|123139|O     |AA     |N               |98666666558 |N    |*|*|10122082004 |O     |AA     |N                |Yes       |AUTODST001         |K           |Yes           |AUTOPRC002 |1           | 777777  | SR41710   |	SR41710     | APHARM      | 00   |01  | 012219   | 10122082004 |4       |4   |00   |100  |P               |                   |AA              | 09866666660     | AUTODST001     DST MSC N PRC 01               |F                   |                      |                  |
 