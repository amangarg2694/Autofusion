  
Feature: FIX-IT: Member Adjustment Load with Medical Data File Closing Issuetest
	As a RxClaim User I want to create a New Member with existing CAG
  
  Scenario Outline: SN003417_SR42278_TC01: Verify member is loaded with medical data, file status does not return Error Code41(File Open)
    Given I am on RxClaim PlanAdministrator Menu
    And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "2" to navigate to "Member"
	  Then I call member details "<MemberID>"
   	And I press "F7" Key
   	Then I update Plan override "<PlanOverride>"
    Examples:
		|MemberID |PlanOverride|
		|MEMP100	|MCCHPPDSP	|
		|MEMP101	|CHPSHPDSP	|
		|MEMP102	|MCCHPHPDSP	|
	  |MEMP103	|MCCHPSPDSP	|
		|MEMP104	|MCCHPSSP	  |
	  |MEMP105	|MCCHPHSP	  |
	  |MEMP106	|MCCHPSHSP	|
	  |MEMP107	|CHPFULLSP	|
	  |MEMP108	|CHPFULLSP	|
	  |MEMP109	|MCMOLPDSP	|
		|MEMP110	|MCMOLHPDSP	|
	  |MEMP111	|MCMOLSPDSP	|
  	|MEMP112	|MCMOLSSP	  |
	  |MEMP113	|MCMOLHSP	  |
	  |MEMP114	|MCMOLSHSP	|
  	|MEMP115	|MOLFULLSP	|
  	|MEMP116	|MOLFULLSP	|
	|MEMP117		|CCCSHPDSP	|
	|MEMP118		|MCCCCHPDSP	|
	|MEMP119		|MCCCCSPDSP	|
	|MEMP120		|MCCCCSSP 	|
	|MEMP121		|MCCCCHSP	  |
	|MEMP122		|MCCCCSHSP	|
	|MEMP123		|CCCFULLSP	|
	|MEMP124		|MCCCCPD	  |
	|MEMP125		|MCCCCSHPD	|
	|MEMP126		|MCCCCHPD  	|
	|MEMP127		|MCCCCSPD	  |
	|MEMP128		|MCCCCS	    |
	|MEMP129		|MCCCCH	    |
	|MEMP130		|MCCCCSH 	  |
	|MEMP131		|MCCCCFULL	|
	|MEMP132		|MCAMGPDSP	|
	|MEMP133		|AMGSHPDSP	|
	|MEMP134		|MCAMGHPDSP	|
	|MEMP135		|MCAMGSPDSP	|
	|MEMP136		|MCAMGSSP	  |
	|MEMP137		|MCAMGHSP	  |
	|MEMP138		|MCAMGSHSP	|
	|MEMP139		|AMGFULLSP	|
	|MEMP140		|MCAMGPD	  |
	|MEMP141	  |MCAMGSHPD	|
	|MEMP142	  |MCAMGHPD	  |
	|MEMP143	  |MCAMGHPD 	|
	|MEMP144		|MCAMGSPD	  |
	|MEMP145		|MCAMGS 	  |
	|MEMP146		|MCAMGSH	  |
	|MEMP147		|MCAMGFULL	|
	|MEMP148	  |MCUHCPDSP	|
	|MEMP149		|MCUHCPDSP	|
	|MEMP150	  |UHCSHPDSP	|
	|MEMP151		|MCUHCHPDSP	|
	|MEMP152		|MCUHCSPDSP	|
	|MEMP153	  |MCUHCSSP	  |
	|MEMP154	  |MCUHCHSP	  |
	|MEMP155		|MCUHCSHSP	|
	|MEMP156		|UHCFULLSP	|
	|MEMP157		|MCUHCPD	  |
	|MEMP158		|MCUHCSHPD	|
	|MEMP159		|MCUHCHPD	  |
	|MEMP160		|MCUHCSPD	  |
	|MEMP161		|MCUHCS	    |
	|MEMP162		|MCUHCH	    |
	|MEMP163	  |MCUHCSH	  |
	|MEMP164		|MCUHCFULL	|
	|MEMP165	  |MCUHCFIMC	|
		
	