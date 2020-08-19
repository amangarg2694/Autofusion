#Author: garg_aman@optum.com
#Feature: F339328
@F339328
Feature: Title of your feature
  I want to use this template for my feature file

  @ReasonCodeProfileSetup
  Scenario Outline: I need to setup reason code profile and PA profile 
    Given I am on RxClaim PlanAdministrator Menu
    When Verify that Plan is updated with Pharmacy Price schedule "<PlanCode>","<fromdate>","<patientpaytable>","<thrudate>","<pharmacytable>"
    And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I create a new reason code profile with Drug status "<CarrierID>","<AccountID>","<GroupID>","<reasoncode>","<Initial_PA_drug_status>","<type>" 
    And I create a new PA profile with Drug status "<CarrierID>","<AccountID>","<GroupID>","<Initial_PAP_drug_status>"
    And I create a new member "<CarrierID>","<GroupID>","<AccountID>","<MemberID>","<LastName>","<FirstName>","<Sex>","<DOB>","<fromdate>","<thrudate>"
    And I go to Member screen and add  PA Number "<number>","<type>","<msc>","<otc>","<ndcgpilist>","<from>","<thru>","<agent>","<reason>","<ignoredrugstatus>"
    Then I verify PA record in RCMNOP "<MemberID>"  
   
  Examples:
    
    |plancode|fromdate|patientpaytable|thrudate|pharmacytable|CarrierID|CarrierName|Processor|MailingAdd|City|State|Zip|ContractFromDt|ContractThruDt|ContractEnt|BusinessType|AccountID|AccountName|GroupID|GroupName|GroupFromDt|GroupThruDt|reasoncode|Initial_PA_drug_status|user_modification|type|wildcard|PA_Reasoncode|Initial_PAP_drug_status|MemberID|LastName|FirstName|Sex|DOB|number|type|msc|otc|ndcgpilist|from|thru|agent|reason|ignoredrugstatus|  
    |TESTNDC2	|010100	|SN001396	|123129|	SN001396|	TESNDC2|	Test|	712	|TEST|	TEST|	AK|	72727|	010100|	123129|	*DEFAULT|	*DEFAULT|	TESNDC2|	TEST|	TESTNDC2|	TEST|	010100|	123129|	AA|	f|	N|	N|	N|	AA|	F|	TESTNDC2|	TEST|	test|	M|	01011999|	TESTPA1|	N|	*|	*|	71015523|	010119|	123120|	a|	AA|	N|
  
  