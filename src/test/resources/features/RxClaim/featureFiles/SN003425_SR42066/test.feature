#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Scenario Outline: SN003425_SR42066_TC001_Req 4.2
 Given I am on RxClaim PlanAdministrator Menu
		And I press "F3" Key
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "20" to navigate to "Medicare Part D"
		And I select Option "3" to navigate to "Prescription Drug Event (PDE) File"
		Then I submit Prescription Drug Event file with "<FromDate>", "<ThruDate>", "<CarrierID>", "<Library>", "<DDPSFilterProcess>", "<SubmitterID>"
		And I verify submitted PDE Job status "<wsQuery>", "<JobRCPD>"
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		
  
    Examples:
    |Cmpnd|BIN    |ProcCtrl|Group |PharmacyID|RxNo         |Refill |FillDate |MemberID	  |ProductID  |DspQty |DS |PSC |Cost |ExtractDate |wsQuery|ExtractJobName|Extractstatus|FromDate|ThruDate|CarrierID|Library|DDPSFilterProcess|SubmitterID|Compoundcode|JobRCPD 	|
	  |0		|777777 |QET     |*ALL  |APHARM    |765765367432 |00     |060118   |SR42066AUTO1|00777310402|30     |30 |00  |100  |112918		  |ws		  |EXTRACTJOB		 |BLANK 			 |010118  |123138	 |SR42066C |ANMISHA|N							   |T42066	   |1				  	|RCPD1080	|
	 
