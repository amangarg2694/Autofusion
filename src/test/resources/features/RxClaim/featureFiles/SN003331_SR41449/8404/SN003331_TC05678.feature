Feature: A manual claim is submitted with medicaid subrogation
 As a RxClaim User I want to A submit manual claim is with medicaid subrogation to Y in RxClaim
 
Scenario Outline: SN003331_SR41449_TC005_Verify if note is added to batch claim when Medicaid Subrogation = Y and Negative Amount Due = Y
    Given I am on RxClaim PlanAdministrator Menu
    When I press "F3" Key 
    And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "1" to navigate to "Batch Extract Process Menu"
    #Submit standard extract Job
    And I verify by submitting Extract Job "<ExtractDate>" on Batch Extract Process Menu
    And I verify work submitted Jobs "OUTQ" status
    
    # Claims Payments-Batch Output
    And I select Option "21" to navigate to "RxClaim Operations Menu"
    And I select Option "3" to navigate to "RxClaim Claims Payment Menu"
    And I select Option "3" to navigate to "RxClaim Media Generation Programs"
    And I select Option "9" to navigate to "NCPDP D.0 Batch Output Format"
    And I enter "<FileName>","<Library>","<FromDate>","<ThruDate>","<CarrierFrom>","<CarrierThru>","<AccountFrom>","<AccountThru>","<GroupFrom>","<GroupThru>","<PayeeFrom>","<PayeeThru>","<PharmacyFrom>","<PharmacyThru>","<SenderID>","<ReceiverID>","<FinancialAmountsUsed>" on NCPDPDBatchOutputFormat screen
   	And I verify work submitted Batch "OUTQ" status
        
    #Add dbu10 to library list
   	And I verify adding "<DBLibrary>" to library list
   	And I verify dbu "<FileName>", "<Library>" to library list
   
		#Batch Medicaid Subrogation (D0) Load
    And I verify Batch Medicaid Subrogation Load "<FileName>","<Library>","<MedicaidSubrogation>" submitting
    Then I validate "<FileName>" in Submitted Jobs and passed records in spoolfile
     
    
      Examples: 
      |ExtractDate	|FileName |Library 		|FromDate	|ThruDate	|CarrierFrom	|CarrierThru	|AccountFrom	|AccountThru	|GroupFrom	|GroupThru	|PayeeFrom	|PayeeThru	|PharmacyFrom	|PharmacyThru	|SenderID	|ReceiverID	|FinancialAmountsUsed	|DBLibrary	|MedicaidSubrogation	|
      |11012018			|TRY		  |USRVENKAT1	|010118		|123118		|VMCARO29			|VMCARO29			|VMACCO29			|VMACCO29			|SN003331K	|SN003331K	|AUTO3331M3	|AUTO3331M3	|apharm				|apharm				|VENK902	|VENK820		|	A										|dbu10			|Y										|
     #|07022018			|NICK24	  |USRVENKAT1	|062918		|070318		|KDCAR1				|KDCAR1				|KDACC1				|KDACC1				|SN003331k3	|SN003331k3	|SN003331K3	|SN003331K3	|apharm				|apharm				|VENK902	|VENK820		|	A										|dbu10			|Y										|

