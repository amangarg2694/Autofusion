#Author: your.email@your.domain.com

#@tag
Feature: SN003425_SR42066:PART D: February 2018 Updates to the Drug Data Processing System

 #@Regression
  Scenario Outline: SN003425_SR42066_TC001_Req 4.2:Validate the compound code on PDE 1080 when the PDE  is submitted for a cliam with compound code  0
    Given I am on RxClaim PlanAdministrator Menu 
    When I submit a claim with Cmpnd "<Cmpnd>" and "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    #Then Validate Claim Status is "P"
    Then I Validate Claim Status
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I press "F3" Key
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "1" to navigate to "Batch Extract Process"
		And I select Option "1" to navigate to "Submit Standard Extract Job"
		Then I Submit Standard Extract Job "<ExtractDate>"
		And I verify submitted Standard Extract Job status "<wsQuery>", "<ExtractJobName>"
		And I press "F3" Key
		And I press "F3" Key
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
			
		Given I am on RxClaim PlanAdministrator Menu 
		And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "6" to navigate to "Claim Transaction"
		Then I verify the Extract status "<Extractstatus>" in Claim Transaction Additional Info 
		
		Given I am on RxClaim PlanAdministrator Menu
		When I press "F3" Key
		And I select Option "21" to navigate to "RxClaim Operations Menu"
		And I select Option "2" to navigate to "Batch Transaction Loads"
		And I select Option "20" to navigate to "Medicare Part D"
		And I copy file "<Fromfile>", "<Library>", "<Tofile>", "<Option>", "<Createfile>"
		And I select Option "13" to navigate to "PDE Resubmission Load"
		Then I submit PDE resubmission load with "<InputFileName>", "<Library>", "<DDPSFilterProcess>","<SubmitterID>"
		Then I submit Prescription Drug Event file with "<FromDate>", "<ThruDate>", "<CarrierID>", "<Library>", "<DDPSFilterProcess>", "<SubmitterID>"
		And I verify submitted PDE Job status "<wsQuery>", "<JobRCPD>"
		And I select Option "20" to navigate to "RxClaim Plan Administrator Menu"
		
		Given I am on RxClaim PlanAdministrator Menu  
		And I select Option "1" to navigate to "Eligibility/Claim Transaction"
		And I select Option "6" to navigate to "Claim Transaction"
    #And I select Option "2" to navigate to "Member"
    #And I edit member details "<MemberID>"
    Then I verify Compound code "<Compoundcode>" in Medicare Part D PDE Data Page

    Examples:
    |Cmpnd|BIN    |ProcCtrl|Group |PharmacyID|RxNo         |Refill |FillDate |MemberID	  |ProductID  |DspQty |DS |PSC |Cost |ExtractDate |wsQuery|ExtractJobName|Extractstatus|FromDate|ThruDate|CarrierID|Library|DDPSFilterProcess|SubmitterID|Compoundcode|JobRCPD 	|Fromfile |
	  |0		|777777 |QET     |*ALL  |APHARM    |765765367432 |00     |060118   |SR42066AUTO1|00777310402|30     |30 |00  |100  |112918		  |ws		  |EXTRACTJOB		 |BLANK 			 |010118  |123138	 |SR42066C |ANMISHA|N							   |T42066	   |1				  	|RCPD1080	|SR42066M0|
	 #|1		|777777 |QET     |*ALL  |APHARM    |765765367432 |00     |060118   |SR42066AUTO1|00777310402|30     |30 |00  |100  |112818		  |ws		  |EXTRACTJOB		 |BLANK				 |010118  |123138	 |SR42066C |ANMISHA|N							   |T42066	   |1 			  	|RCPD1080	|
	 #|2		|777777 |QET     |*ALL  |APHARM    |765765367432 |00     |060118   |SR42066AUTO1|00777310402|30     |30 |00  |100  |112818		  |ws		  |EXTRACTJOB		 |BLANK				 |010118  |123138	 |SR42066C |ANMISHA|N							   |T42066	   |2				  	|RCPD1080	|
		
    
    #SR42066MEM0
