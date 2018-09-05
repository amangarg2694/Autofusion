Feature: Held/Suspend Payment Functionality – Phase 1
   
             
   Scenario Outline: Prior setup 

    Given I am on RxClaim PlanAdministrator Menu
    When I select Option "9" to navigate to "RxClaim Batch Process Menu"
    And I select Option "1" to navigate to "RxClaim Claims Payment Menu"
    And I select Option "1" to navigate to "RxClaim Payment Processing Menu"
    And I select Option "1" to navigate to "Calender"
    And I press "F6" Key
    And I enter "<Calender>" , "<CalenderDescription>" , "<Type>"
    And I press "F3" Key
    And I select Option "2" to navigate to "Holiday Calender"
    And I press "F6" Key
    And I enter "<HolidayCalender>","<HoliCalenderDescription>"
    And I press "F3" Key
    And I select Option "3" to navigate to "Cycle"
    And I press "F6" Key
    And I enter "<Cycle>", "<CycleDescription>", "<Calender>" , "<CalenderDesrcription>", "<CycleGenarateFrom>", "<CycleGenarateThru>"
    And I press "F3" Key
    And I select Option "4" to navigate to "Process"
    And I press "F6" Key
    And I enter "<Process>","<ProcessDescription>","<ProcessType>","<Cycle>","<ProcessThruDate>"
    And I press "F3" Key
    And I select Option "7" to navigate to "Payer"
    And I press "F6" Key
    And I send "<Payer>","<payerName>","<PayerAddrss>","<PayerCity>","<PayerState>","<PayerZip>"
    And I press "F3" Key
    And I select Option "5" to navigate to "Method of Payment"
    And I press "F6" Key
    And I enter MOP "<MethodOfPayment>","<MOPdescription>", "<Payer>"
    And I press "F3" Key
    And I select Option "8" to navigate to "Financial Institution"
    And I press "F6" Key
    And I enter "<RoutingNbr>","<FINAME>","<FICODE>","<FIADDRESS>","<FICITY>","<FISTATE>","<FIZIP>","<FIPHONE>","<FIACCOUNT>","<FIACCNAME>","<FIOWNERTYPE>","<Payer>","<FIACCTYPE>","<SIGNATUREAUTHORITY>","<FIFORMTYPE>","<FIFORMTYPEDESCRIP>","<FIFIRSTCHECKNUMBER>","<FILASTCHECKNUMBER>"
    And I press "F3" Key
    And I select Option "7" to navigate to "Payer"
   
    And I send to the "<Payer>", "<PayerProfileType>", "<PayerClientNagativeDue>","<Process>","<MethodOfPayment>","<FIACCOUNT>","<FIFORMTYPE>","<Effdate>","<MaxPaymentAmt>"
    And I select Option "7" to navigate to "Payer"
    
    And I enter "<Payer>", "<CarrierID>", "<AccountID>", "<GroupID>", "<PayerClientNagativeDue>","<Process>","<MethodOfPayment>","<FIACCOUNT>","<FIFORMTYPE>","<Effdate>","<MaxPaymentAmt>"
    
   
    
    Examples:
    | CarrierID | AccountID   | GroupID  | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date |Calender |CalenderDescription|Type|HolidayCalender|HoliCalenderDescription|Cycle     |CycleDescription|CycleGenarateFrom|CycleGenarateThru|Process     |ProcessDescription |ProcessType|ProcessThruDate|Payer      |payerName     |MethodOfPayment     |MOPdescription|PayerAddrss|PayerCity    |PayerState|PayerZip  |RoutingNbr |FINAME      |FICODE   |FIADDRESS|FICITY|FISTATE|FIZIP|FIPHONE|FIACCOUNT|FIACCNAME|FIOWNERTYPE |FIACCTYPE|SIGNATUREAUTHORITY|FIFORMTYPE    |FIFORMTYPEDESCRIP    |FIFIRSTCHECKNUMBER|FILASTCHECKNUMBER|PayerProfileType|PayerClientNagativeDue|Effdate|FIFORMTYPE|MaxPaymentAmt|
		|S41403S1| S41403S1    |	S41403S1| SR41666M33| AUTOMEM    | AUTOMEM   | 1225f1987 | 010101    | 123139    |CALOP5  |prakash338         |w   |HOLIOP5       |PrakashHoli2           |CYCLEOP5 |neshna          |073018           |010139						|PROCOP5   |	testprocess      |	PP       | 010138 	       |PAYEROP5  |payerprakash  |MOPOP5             |mopprakash    |   xxxy    |NZ           |AB            |1234       |ROUTOP5   |FIOP5  |001      |XYZ      |NZ    |AB     |12345|123    |FIOP5  |FIPRAKASH|2           |S        |PRAKASH            | FORMOP5     |FORMOP5						 |1									|10               |M						   |A                     |010118 |P 				 |100          |
    