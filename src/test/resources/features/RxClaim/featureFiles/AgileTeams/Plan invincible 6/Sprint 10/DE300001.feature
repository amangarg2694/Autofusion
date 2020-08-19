#Author: garg_aman@optum.com
@FunctionalTest
Feature: DE300001 - DEFECT: CAID FFS: Issue with the drug status override logic within Loading dose in plan GPI/NDC list
  I want to submit a valid claim which should not have final drug status of '*'
  
   Scenario Outline: Title of your scenario
    Given I am on RxClaim PlanAdministrator Menu
    When I setup Daily Dose on GPI list setup and higher drug daily dose setup on Additional options in Plan "<PlanCode>","<fromdate>","<description>","<thrudate>","<Dailydose1>","<Dailydose2>","<gpilist>","<ProductID>","<DrugsStatus>","<lookback>", "<LDdaysSupply>"
    And I create a CAG "<carrierID>","<carrierName>","<fromdate>","<thrudate>", "<accountID>", "<accountName>", "<groupID>", "<groupName>","<PlanCode>"
    And I create Member with "<carrierID>","<accountID>","<groupID>","<memberID>","<firstname>","<lastname>","<DOB>","<fromdate>","<thrudate>" 
    When I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate drug status on claim
    
    Examples:
     |memberID|firstname|lastname|DOB|PlanCode|fromdate|description|thrudate|Dailydose1|Dailydose2|gpilist|ProductID|DrugStatus|lookback|LDdaysSupply|carrierID|carrierName|accountID|accountName|groupID|groupName|BIN|ProcCtrl|Group|PharmacyID|RxNo|Refill|FillDate|MemberID|DspQty|DS|PSC|Cost|
     |TEST1201|TEST|AMAN|01011999||TEST0010|010100|TEST|123129|0.36|1.0|TESTGPI|63874059010|F|30|30|TEST1201|Test|TEST1201|Test|TEST1201|TEST|777777|CCHA|*ALL|APHARM|1233211232793|00|051320||TEST1201|10|10|0|100|