#Author : garg_aman@optum.com

@DE330245
Feature: Defect-DE330245
  
  @Reprocessing
  @Test
  Scenario Outline: Title of your scenario
    Given I am on RxClaim PlanAdministrator Menu
    And submit a medicaid subrogation claim "<MemberID>","<PayeeOverride>","<SubbrogationFlag>","<MedigapID>","<MedicaidIndicator>","<MedicaidIDNumber>","<MedicaidAgencyNumber>","<MedicaidPaidAmt>"
    And Submit reprocessing from member screen "<MemberID>","<ReprocessReasonCode>","<ReprocessNote>"
    And submit reprocessing for this member and for this claim "<MemberID>","<ReprocessClaimFlag>","<CostQualifier>"
    Then Claim reprocessed

  Examples:
  |MemberID|PayeeOverride|SubbrogationFlag|MedigapID|MedicaidIndicator|MedicaidIDNumber|MedicaidAgencyNumber|MedicaidPaidAmt|ReprocessReasonCode|ReprocessNote|ReprocessClaimFlag|CostQualifier|
  |REPROPRJ|SRI_PHARM |Y|TEST|TEST123|TEST123|SRIRAM|10|
  |REPROPRJ|SRI_PHARM |N|TEST|TEST123|TEST123|SRIRAM|10|
    
    
  