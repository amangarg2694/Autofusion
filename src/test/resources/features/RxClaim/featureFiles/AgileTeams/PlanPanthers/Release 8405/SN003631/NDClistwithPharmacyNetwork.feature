

@tag
Feature: Validate which NDC list is picked, when NDC is present in NDC list and attached Pharmacy network and Diagnosis code
 
   @TC1
  Scenario Outline: TC01_Verify Which NDC list is picked, when NDC is present in NDC list, Pharmacy network and Diagnois code are attached. 
    Given I am on RxClaim PlanAdministrator Menu 
    When I create Member with Override Plan "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>","<Override Plan>"
   	And I press "F12" Key
   	And I submit a claim with NDC list "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
   	And I add Diagnosis code details with "<diagnosisCodeQual1>","<diagnosisCode1>"
   	And I submit the claim
   	Then Validate Transaction Claim Detils
 
   Examples:
   |CarrierID |AccountID |GroupID  |MemberID  |FirstName|LastName |DOB     |FromDate|ThruDate|Override Plan  | BIN     | ProcCtrl     | Group | PharmacyID  | RxNo | Refill| FillDate | MemberID| ProductID   | DspQty | DS | PSC | Cost| diagnosisCodeQual1| diagnosisCode1|Expected ClaimSts|Expected RejectCode| 
   |CARDEF	  |ACCDEF   |GRPDEF  |15OK3631M  |MemberFN1|MemebrLN1|1011990 |010191  |123139  |1SN42437P     | 888888  | *       |*      | APHARMTEST1      | 701204397611 | 02   |  012419  | 15OK3631M  |00071015523 |30      |30  |00   |100 |02|W.0041              |P  	             |                 |     
   

