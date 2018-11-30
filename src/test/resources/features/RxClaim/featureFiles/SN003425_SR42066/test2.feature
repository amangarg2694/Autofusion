#Author: your.email@your.domain.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
		Given I am on RxClaim PlanAdministrator Menu
		When I press "F3" Key
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "20" to navigate to "Medicare Part D"
		And I copy a file and ADD to a new file "<Fromfile>", "<Library>", "<Option>", "<Createfile>"
		And I work with file "<Library>" and update the record  
		And I select Option "13" to navigate to "PDE Resubmission Load"
		Then I submit PDE resubmission load with "<InputFileName>", "<Library>", "<DDPSFilterProcessR>","<SubmitterID>"
		#Then I submit Prescription Drug Event file with "<FromDate>", "<ThruDate>", "<CarrierID>", "<Library>", "<DDPSFilterProcess>", "<SubmitterID>"
		And I verify submitted PDE Job status "<wsQuery>", "<JobRCPD>"
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"

     Examples:
    |Cmpnd|BIN    |ProcCtrl|Group |PharmacyID|RxNo         |Refill |FillDate |MemberID	  |ProductID  |DspQty |DS |PSC |Cost |ExtractDate |wsQuery|ExtractJobName|Extractstatus|FromDate|ThruDate|CarrierID|Library|DDPSFilterProcess|SubmitterID|Compoundcode|JobRCPD 	|Fromfile |Option|Createfile|InputFileName|DDPSFilterProcessR|
	  |0		|777777 |QET     |*ALL  |APHARM    |765765367432 |00     |060118   |SR42066AUTO1|00777310402|30     |30 |00  |100  |112918		  |ws		  |EXTRACTJOB		 |BLANK 			 |010118  |123138	 |SR42066C |ANMISHA|N							   |T42066	   |1				  	|RCPD1070	|SR42066M0|*ADD	 |*YES			|SR42066M0		|N								 |
	 