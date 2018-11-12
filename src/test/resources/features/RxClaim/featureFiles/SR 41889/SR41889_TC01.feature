Feature: TB Messaging
As a RxClaim User I want to check claim is paid under TB  


   Scenario Outline: To check if claim is paid under TB  
   	Given I am on RxClaim PlanAdministrator Menu
   	When I select Option "4" to navigate to "RxClaim Plan Maintenance"
		And I select Option "1" to navigate to "Active Plan by Plan Code"
		And  I create a new Plan for TB with "<PlanCode>","<PlanFromDt>","<Thru Date>","<PlanType>","<PharmPriceSched>","<ClientPriceSched>","<List>","<Level>","<OOPSched>","<GPIList>", "<GPIFrmDte>"," <GPIThruDte>", "<GPIName>"
		And I press "F12" Key
	  Then Plan with TB setup is created with "<Group>","<MemberID>","<FromDate>","<EndDate>","<SupplyType>","<SupplyID>","<Contract>"
		 
  Examples:
     |PlanCode |PlanFromDt| Thru Date | PlanType| PharmPriceSched| ClientPriceSched|  List| Level| OOPSched|GPIList|  GPIFrmDte|GPIThruDte|GPIName|Group|MemberID|FromDate|EndDate|SupplyType|SupplyID|Contract|
     |2659PLN4|010101      |123139| Part-D|       TB_AUTO|           TB_AUTO|         16PD| C|     16DPNC141|2659PLN4|010201|    123139|  ATENOLOL| GRP52659 |MEM7S2659|010101|123139|06|MEDICARE|S2014|
	 
 Scenario Outline: To check if first claim is rejected with with CMS transmition Message 
		Given I am on RxClaim PlanAdministrator Menu
		When I submit a manual claim with the "<BIN>","<PCN>","<Group>","<Pharmacy>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
		And Validate Claim Status is "R" 
		And I press "F7" key 
		And I press "F10" key 
		And I validate claim Reject Message "ClaimRejMsg" on screen Rejected Claim Response Information
	  
 Examples:
   
      | BIN    | PCN     | Group | Pharmacy |RxNo       | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost |MemberID|ClaimRejMsg|
       | 777777 | CCHA1 | *    | 0556540 | 123456789008 | 00     | 121918   |  00310010110 |270      |90  |0   |100  |MEM7S2659|R|

   Scenario Outline: To check if second claim is submitted with NENRL TB stamping 
     Given I am on RxClaim PlanAdministrator Menu
     When I submit a manual claim with the "<DS>","<memberId>"
		 And Validate Claim Status is "P" 
		 Then  validate  claim status "<ClaimStatus>" as paid  for TB stamp "<RejectReason>" on  Claim Transaction Additional Info Medicare Part D
		 
	Examples:
		
		 | DS |ClaimStatus|RejectReason|memberId|
		 |30  |P|NENRL|MEM7S2659|
		 
			
		 Scenario Outline: To check if third  claim is submitted with OVNRL TB stamping 
     Given I am on RxClaim PlanAdministrator Menu
		 When I submit a manual claim with the "<FillDate>","<MemberId>","<DspQty>","<DS>"
		 And Validate Claim Status is "P" 
		 Then  validate  claim status "<ClaimStatus>" as paid  for TB stamp "<RejectReason>" on  Claim Transaction Additional Info Medicare Part D
		 And I press "F12" Key
	Examples:
		
		| FillDate | DspQty | DS | ClaimStatus|RejectReason|MemberId| 
		| 	01052019   |60      |20  | P|OVNRL|MEM7S2659|
	 
	 
		 Scenario Outline: To check if fourth claim is submitted with NENRL TB stamping again 
     Given I am on RxClaim PlanAdministrator Menu
		 When I submit a manual claim with the "<FillDate>","<MemberId>","<DspQty>","<DS>"
		 And Validate Claim Status is "P" 
		 Then  validate  claim status "<ClaimStatus>" as paid  for TB stamp "<RejectReason>" on  Claim Transaction Additional Info Medicare Part D
		 
	Examples:
		
		| FillDate | DspQty | DS |MemberId|ClaimStatus|RejectReason|
		| 02032019   |15      |5  |MEM7S2659|P|NENRL|
		
		
	@Test	
		 Scenario Outline: To check if fifth claim is submitted with CENRL TB stamping 
     Given I am on RxClaim PlanAdministrator Menu
		 When I submit a manual claim with the "<FillDate>","<MemberId>","<DspQty>","<DS>"
		 And Validate Claim Status is "P" 
		 Then  validate  claim status "<ClaimStatus>" as paid  for TB stamp "<RejectReason>" on  Claim Transaction Additional Info Medicare Part D
		 
	Examples:
		
		| FillDate | DspQty | DS |MemberId|ClaimStatus|RejectReason|
		| 03212019   |15      |5 |MEM7S2659|P|CENRL|
		
		
		
	 