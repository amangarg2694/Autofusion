Feature: Validate Medlimit DUR service response 
    
   #Prerequsiite for all scenarios : Override PlanID , CarrierID , AccountID , GroupID ,DUR Table , BPG 
   
   @TC1     
   Scenario Outline: TC01_Verify the reject code 922 is returned with 88 when claim rejects for Medlimit.
    Given I am on RxClaim PlanAdministrator Menu
    When I attach DUR Table to the Plan "<Override Plan>","<DUR Table>" 
    When I create new Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I submit the claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Due>","<UCW>","<Fee>"
    And I press "F7" Key
    And Validate Claim Status is "<Expected ClaimSts>""<Expected RejectCode>"
    And Validate the Claim Message is "<Expected ClaimMsg>"
 
   Examples:
   |CarrierID |AccountID |GroupID    |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|DUR Table|Override Plan  |PARTDFromDate|PARTDThruDate |Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource| BIN     | ProcCtrl | Group    | PharmacyID  |Refill| FillDate |ProductID   | DspQty | DS | PSC | Cost|Due|UCW |Fee|Expected ClaimSts|Expected RejectCode|Expected ClaimMsg                   |
   |AUTOC3690	|AUTO3690A |AUTO3690G  |          |MemberFN1|MemebrLN1|1011990 |010191  |123139  |AUTOC369 |TESTP3690      |010191       |123139        |A1234   |123|       |            |             |                  |                | 610097  | 9999     |AUTOC3690 | 3400087     | 01   |  011619  |00574704012 |35      |7   |00   |200  |0  |200 |   |R                |88 922             |MED 199.99 exceeded;Ttl MED 300.00MG|                         
   
   