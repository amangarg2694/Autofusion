#Author: akkanapally.sridhar@optum.com
#Stepdefinitionfile:TBEligibleClaims.java
#Reference Person: Arti Soni
## NOTE:#1.If data is not present, then run from @TS1 ( Data setup creation from @TS1 To TC6) from DUREndToEnd_F18Submit.feature
        #2.If data exist in system as per data setup from DUREndToEnd_F18Submit.feature, Then change member Id only for tests - TC01,TC02,TC06,TC07,TC08,TC09(Shares same Member Id), TC03 and TC04(Shares same member id), TC5, TC10 and TC11 - Total 6 members Id`s
				#3.Run all the test cases in single session
				

@PlanDUR			
Feature: Create New PartD Setup
As a RxClaim User I want to create Part D Setup
    
   @TS1          
   Scenario Outline: Create message data setup for DUR tests 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create message for the DUR table "<DUPRXMessageCode>","<DUPRXMessageDesc>","<FromDate>","<ThruDate>"
    Then I navigate to the plan admin menu
   
   Examples: 
     |DUPRXMessageCode|DUPRXMessageDesc                     |FromDate|ThruDate|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |GPIPDID1|NDGPFromdate|NDGPTodate|DURTable|DURflag|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message                          |ContTherpy|
     |SN00392101      |Hard Reject from Override NDC/GPI OVR|010118  |123139  |SAM1L8       |MD SAM1L8 OR LIST1|00071015523|        |010118      |123139    |DHOOOVR |Y      |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921Sch01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |Drug Requires Prior Authorization|N         |          
     |SN00392102      |Soft reject from Plan DUR            |010118  |123139  |SAM1L8       |MD SAM1L8 OR LIST1|00071015523|        |010118      |123139    |DHOOOVR |Y      |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921Sch01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |Drug Requires Prior Authorization|N         |
     
   @TS2
    Scenario Outline: Create DUR table data setup for DUR tests 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create DUR table with "<DURTable>","<DURTableDesc>","<DURTableStatus>","<DurServiceType>","<DurServiceTypeSts>","<DurServiceTypePriority>","<DurServiceTypeResponse>","<FillDateMessage>","<DUPRXMessageCode>","<DUPRXMessageType>","<DUPRXTherapPerc>","<DurServiceType2>","<DurServiceTypeSts2>","<DurServiceTypePriority2>","<DurServiceTypeResponse2>"
    Then I navigate to the plan admin menu
   
   
   Examples: 
     |DURTable|DURTableDesc               |DURTableStatus| DurServiceType| DurServiceTypeSts| DurServiceTypePriority| DurServiceTypeResponse |FillDateMessage|DUPRXMessageCode|DUPRXMessageType|DUPRXTherapPerc|DurServiceType2|DurServiceTypeSts2|DurServiceTypePriority2| DurServiceTypeResponse2 |
		 |DU3921V1|DU3921V1 Plan DUR Medicaid |ON            |DUPRX          |Y                 |60                     | S                      |		           |               |                 |               |DUPTHER				 |Y 								|10											|	H												|
     |DU3921VS|DU3921VH 22 Medicaid DUR   |ON            |DUPRX          |Y                 |60                     | S                      |Y		           |               |                 |50             |							 |									|												|													|
     |DU3921VH|DU3921VG 22 Medicaid DUR   |ON            |DUPRX          |Y                 |10                     | H                      |Y              |SN00392101     |A                |50             | 							 |									|												|													|   
     |DU3921V2|DU3921V2 Plan DUR Medicaid |ON            |DUPRX          |Y                 |60                     | S                      |Y		           |               |                 |10              |							 |									|												|													|
     |DU3921V3|DU3921V3 Plan DUR Medicaid |ON            |DUPRX          |Y                 |60                     | S                      |Y              |SN00392102     |A                |10             |  						 |									|												|													|  
   
   @TS3
   Scenario Outline: Create NDCGPIOR list with DUR table data setup for DUR tests 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I create NDCGPI OR Edit List for DUR with "<NDCGPIORList1>","<NDCGPIORListDesc1>","<NDCPDID1>","<GPIPDID1>""<NDGPFromdate>","<NDGPTodate>","<DURTable>","<DURflag>"
    Then I navigate to the plan admin menu 
   
        
   Examples: 
     |NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |GPIPDID1|NDGPFromdate|NDGPTodate|DURTable|DURflag|
     |SAM1L8       |MD SAM1L8 OR LIST1|00071015523|        |010118      |123139    |DU3921VS|Y      |          
     
       
   @TS4
   Scenario Outline: Create NDCGPIOR list with DUR table data setup for DUR tests 
    
    Given I am on RxClaim PlanAdministrator Menu 
    When I add more drugs to NDC GPI OR list with "<NDCGPIORList1>","<NDCPDID1>","<GPIPDID1>","<NDGPFromdate>","<NDGPTodate>","<DURTable>","<DURflag>"
    Then I navigate to the plan admin menu 
   
        
   Examples: 
     |NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |GPIPDID1|NDGPFromdate|NDGPTodate|DURTable|DURflag|
     |SAM1L8       |MD SAM1L8 OR LIST1|00071015523|        |010118      |123139    |DU3921VS|Y      |          
     |SAM1L8       |MD SAM1L8 OR LIST1|00074431730|        |010118      |123139    |        |N      |
     |SAM1L8       |MD SAM1L8 OR LIST1|00093715310|        |010118      |123139    |DU3921VS|Y      | 
     |SAM1L8       |MD SAM1L8 OR LIST1|00247064407|        |010118      |123139    |        |N      |
     |SAM1L8       |MD SAM1L8 OR LIST1|00597010854|        |010118      |123139    |        |       |
     |SAM1L8       |MD SAM1L8 OR LIST1|40076099155|        |010118      |123139    |DU3921VH|Y      |
     |SAM1L8       |MD SAM1L8 OR LIST1|61958180101|        |010118      |123139    |DU3921VS|Y      |
     |SAM1L8       |MD SAM1L8 OR LIST1|63653133202|        |010118      |123139    |DU3921VH|Y      |
     
   @TS5
  Scenario Outline: Medicare plan setup for DUR scenarios 
    
     Given I am on RxClaim PlanAdministrator Menu
     And I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
     And I add accumulators to the above plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
     And I add DUR to the Plan "<PlanCode>","<DURTable>"
     And I create the NDClist with NDCId mapping "<NDCList1>", "<NDCDecs1>","<NDCPDID1>","<NDGPFromdate>","<NDCPDIDSts>","<CTSFromdate>","<CTSTodate>","<CTSchedule>",
     And I add NDClist to the plan with "<PlanCode>","<NDCList1>","<ndcsq>","<ndcfromdate>","<ndcthrudate>"
     And I add Transitional Benefit override to the plan with "<PlanCode>","<TBLengthPeriod>","<MedicareTBSchedule>","<TBlvl>","<TBlwc>"
     And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
     And I Set PBP "<CarrierID>","<Contract>","<PBP>","<BenefitYear>","<MedicareType>","<SubmitterID>"
     And I Set PartD Master Profile Detail "<CarrierID>","<AccountID>","<GroupID>","<PlanCode>","<FromDate>","<MasterProfileFromDate>","<MasterProfileThruDate>","<DrugCoverageStatusSchedule>","<Contract>","<PBP>"
     Then I navigate to the plan admin menu 
    
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description                 |PriceSchedule|PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|DURTable|NDCGPIORList1|TBOverride|NDCList1 |NDCDecs1|NDCPDID1   |NDGPFromdate|NDCPDIDSts|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TBlvl|TBlwc|CTSFromdate|CTSTodate|CTSchedule|Overrideplan| 
      |DU3921P2  |010116  |123139  |DU3291P2 MedicareDONOTTOH   |DHOO         |DHOO              |010117       |123139       |C                |                |DEVSTD       |EVUBKOT       |DU3921V1|SAM1L8       |Y         |DULI1    |DULI1   |43353084815|010118      |F         |10   |010117     |123139     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | DU3921G01 |DU3921G02  |100118     |123139     | DU3921PMEM02  |DU3921PMEM02  |DU3921PMEM02  |01011988 |100118     |123139     |010101   |123139 |*ALL     |9999      |P3921   |392|2019       |S           |AKSR       |010116               |123139               |ARUSDFLT                  |  010116     |123139       |       |            |             |                  |                |90            |DHOO              |N    |2    |010101     |123139   |          |DU3921P2    | 
    
    
      
   @TS6
  Scenario Outline: Medicaid plan setup for DUR scenarios 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I add accumulators to the above plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
    And I add DUR to the Plan "<PlanCode>","<DURTable>"
    And I create the medicaid setup for the plan with "<PlanCode>","<TBOverride>","<NDCGPIORList1>"    
    Then I navigate to the plan admin menu 
 
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description                 |PriceSchedule|PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|DURTable|NDCGPIORList1|TBOverride|NDCList1 |NDCDecs1|NDCPDID1   |NDGPFromdate|NDCPDIDSts|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID      |FirstName     |LastName      |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TBlvl|CTSFromdate|CTSTodate|CTSchedule|Overrideplan| 
      |DU3921P3  |010116  |123139  |DU3291P3 MedicaidDONOTTOH   |DHOO         |DHOO              |010117       |123139       |C                |                |DEVSTD       |EVUBKOT       |DU3921V1|SAM1L8       |Y         |DULI1    |DULI1   |43353084815|010118      |F         |10   |010117     |123139     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | DU3921G01 |DU3921G02  |100118     |123139     | DU3921PMEM03  |DU3921PMEM03  |DU3921PMEM03  |01011988 |100118     |123139     |010101   |123139 |*ALL     |9999      |P3921   |392|2019       |S           |AKSR       |010116               |123139               |ARUSDFLT                  |  010116     |123139       |       |            |             |                  |                |90            |DHOO              |N    |010101     |123139   |          |DU3921P3    | 
    
   @TS8
  Scenario Outline: TC12_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid has a DUR table attached and the DUR override is set to 'Y'. The drug submitted is not found in the Medicaid DUR table    
    
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I add the new plan to the DUR member with "<MemberID>","<Overrideplan>"    
    And I add DUR to the existing Plan "<PlanCode>","<DURTable>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the claim status with "<ClaimStatus>"
           
  
    Examples: 
       |PlanCode|DURTable|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2 |ClaimStatus|CarrierID|AccountID|GroupID  |MemberID     |FirstName    |LastName     |DOB       |MemFromDate|MemThruDate|Overrideplan|
       |DU3921P3|DU3921V1|777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 011819   | 00039006710    |30      |30  |0    | 73 	 |5  | 30 |100118    |00054019613|P          |SN3921C01|SN3921A01|DU3921G01|DU3921PMEM03 |DU3921PMEM03 |DU3921PMEM03 |01011988  |100118     |123139     |DU3921P3    |   
       
       
    @TS9
  Scenario Outline: TC13_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid has a DUR table attached and the DUR override is set to 'Y'.   The drug submitted is not found in the Medicaid DUR table.    
    
    Given I am on RxClaim PlanAdministrator Menu
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the DUR Claim details with "<ClaimStatus>","<RejCode>","<DURTable>","<DurServiceType2>","<DurServiceType>"
           
  
    Examples: 
       |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2 |MemberID |ClaimStatus|RejCode|DURTable|DurServiceType2|DurServiceType|
       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 011919   | 00039006710    |30      |30  |0    | 73 	 |5  | 30 |100118    |00054019613|DU3921PMEM03|R          |88     |DU3921V1|DUPTHER        |DUPRX|   
    
       
  @TS10
  Scenario Outline: TC14_US1422900_User submits a claim  via F6 for a Medicare member WHEN there is a DUR Table defined in the member's plan      
    
    Given I am on RxClaim PlanAdministrator Menu
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I add the new plan to the DUR member with "<MemberID>","<Overrideplan>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the claim status with "<ClaimStatus>"
           
  
    Examples: 
       |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID    |ClaimStatus|CarrierID | AccountID  | GroupID   |MemberID      |FirstName     |LastName      |DOB      |MemFromDate|MemThruDate|PARTDFromDate|PARTDThruDate|Contract|PBP|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|Overrideplan|
       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 011819   | 00039006710    |30      |30  |0    | 73 	 |5  | 30 |DU3921PMEM02|P          |SN3921C01 | SN3921A01  | DU3921G01 |DU3921PMEM02  |DU3921PMEM02  |DU3921PMEM02  |01011988 |100118     |123139     |010116       |123139       |P3921   |392|       |            |             |                  |                |DU3921P2    |   
    
       
   @TS11
  Scenario Outline: TC15_US1422900_User submits a claim  via F6 for a Medicare member WHEN there is a DUR Table defined in the member's plan      
    
    Given I am on RxClaim PlanAdministrator Menu
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the DUR Claim details with "<ClaimStatus>","<RejCode>","<DURTable>","<DurServiceType2>","<DurServiceType>"
           
  
    Examples: 
       |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID |ClaimStatus|RejCode|DURTable|DurServiceType2|DurServiceType|
       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 011919   | 00039006710    |30      |30  |0    | 73 	 |5  | 30 |DU3921PMEM02|R          |88     |DU3921V1|DUPTHER        |DUPRX|   
      
 
  @TS12
  Scenario Outline: TC16_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid has a DUR table attached and the DUR override is set to 'Y'. The drug submitted is found in the Medicaid DUR table
    
    Given I am on RxClaim PlanAdministrator Menu
    When I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I add accumulators to the above plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
    And I add DUR to the Plan "<PlanCode>","<DURTable>"
    And I create the medicaid setup for the plan with "<PlanCode>","<TBOverride>","<NDCGPIORList1>"    
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I add the new plan to the DUR member with "<MemberID>","<Overrideplan>"    
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
        Then I validate the claim status with "<ClaimStatus>"
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",		
 				Then I validate the DUR Claimone details with "<ClaimStatus2>","<RejCode>","<DURTable2>","<DurServiceType>","<Message1>","<Message2>","<DURMessage>"
 		When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate3>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
 				Then I validate the claim status with "<ClaimStatus>"
 				
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description                 |PriceSchedule|PatientPaySchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|DURTable|NDCGPIORList1|TBOverride|NDCList1 |NDCDecs1|NDCPDID1   |NDGPFromdate|NDCPDIDSts|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TBlvl|CTSFromdate|CTSTodate|CTSchedule|Overrideplan|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|ClaimStatus|FillDate2|ClaimStatus2|RejCode|DurServiceType|Message1                           |Message2                             |FillDate3|DURMessage|DURTable2| 
      |DU3921P4  |010116  |123139  |DU3291P4 MedicaidDONOTTOH   |DHOO         |DHOO              |010117       |123139       |C                |                |DEVSTD       |EVUBKOT       |DU3921V3|SAM1L8       |Y         |DULI1    |DULI1   |43353084815|010118      |F         |10   |010117     |123139     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | DU3921G01 |DU3921G02  |100118     |123139     | DU3921PMEM05  |DU3921PMEM05  |DU3921PMEM05  |01011988 |100118     |123139     |010101   |123139 |*ALL     |9999      |P3921   |392|2019       |S           |AKSR       |010116               |123139               |ARUSDFLT                  |  010116     |123139       |       |            |             |                  |                |90            |DHOO              |N    |010101     |123139   |          |DU3921P4    |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110118   | 63653133202    |30      |30  |0    | 73 	 |5  | 30 |P          |110218   |R           |88     |DUPRX         |Refill Payable on or after 11/16/18|Hard Reject from Override NDC/GPI OVR|111618   |SN00392101|DU3921VH|       
   
   
   @TS13 
  Scenario Outline: TC17_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid has a DUR table attached and the DUR override is set to 'Y'.   The drug submitted is found in the Medicaid DUR table.    
    
    Given I am on RxClaim PlanAdministrator Menu
    When I add DUR to the existing Plan "<PlanCode>","<DURTable>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    	Then I validate the claim status with "<ClaimStatus>"
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
      Then I validate the DUR Claimone details with "<ClaimStatus2>","<RejCode>","<DURTable2>","<DurServiceType>","<Message1>","<Message2>","<DURMessage>"     
  
    Examples: 
       |PlanCode|DURTable|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |MemberID |ClaimStatus|ClaimStatus2|RejCode|DurServiceType|Message1                           |Message2|DURMessage|DURTable2|
       |DU3921P3|DU3921V2|777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110118   | 61958180101 |30      |30  |0    | 73   |5  | 30 |110218    |DU3921PMEM03|P          |R           |88     |DUPRX         |Refill Payable on or after 11/16/18|        |          |DU3921VS |   
   
   
    @TS14
  Scenario Outline: TC18_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid does not have a DUR table attached and the DUR override is set to 'N'.      
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the DUR table in NDC GPI OR list "<NDCGPIORList1>","<NDCDrug>","<DURTable>","<DURflag>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the claim status with "<ClaimStatus>"
    
    Examples: 
       |NDCGPIORList1|NDCDrug |DURTable|DURflag|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID |ClaimStatus|
       |SAM1L8       |ZEMPLAR |        |N      |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110118   | 00074431730    |30      |30  |0    | 73 	 |5  | 30 |DU3921PMEM03|P          |   
    
   @TS15
  Scenario Outline: TC19_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid does not have a DUR table attached and the DUR override is set to 'N'.       
    
    Given I am on RxClaim PlanAdministrator Menu
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the DUR Claimone details with "<ClaimStatus2>","<RejCode>","<DURTable2>","<DurServiceType>","<Message1>","<Message2>","<DURMessage>"
    
     Examples: 
       |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID |ClaimStatus|ClaimStatus2|RejCode|DurServiceType|Message1                           |Message2|DURMessage|DURTable2|
       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110218   | 00074431730    |30      |30  |0    | 73 	 |5  | 30 |DU3921PMEM03|P          |R           |88     |DUPRX         |Refill Payable on or after 11/28/18|        |          |DU3921V2 |   
   
     
   @TS16
  Scenario Outline: TC20_US1422900_User submits a claim  via F6 for a member WHEN there is a DUR Table defined in the member's plan and the NDC/GPI override within F22=Medicaid does not have a DUR table attached and the DUR override is set to 'blank'.        
    
    Given I am on RxClaim PlanAdministrator Menu
    When I update the DUR table in NDC GPI OR list "<NDCGPIORList1>","<NDCDrug>","<DURTable>","<DURflag>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the DUR Claimone details with "<ClaimStatus2>","<RejCode>","<DURTable2>","<DurServiceType>","<Message1>","<Message2>","<DURMessage>"
    
     Examples: 
      |NDCGPIORList1|NDCDrug |DURTable|DURflag|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID |ClaimStatus|ClaimStatus2|RejCode|DurServiceType|Message1                           |Message2|DURMessage|DURTable2|
      |SAM1L8       |ZEMPLAR |        |       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110218   | 00074431730    |30      |30  |0    | 73 	 |5 | 30 |DU3921PMEM03|P          |R           |88     |DUPRX         |Refill Payable on or after 11/28/18|        |          |DU3921V2 |   
   
   
   @TS17
  Scenario Outline: TC21_US1422900_User submits a claim  via F6 for a Medicare member WHEN there is a DUR Table defined in the member's plan subsequent of Medicaid plan with DUR override in place.    
    
    Given I am on RxClaim PlanAdministrator Menu    
    When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID1>","<FirstName1>","<LastName1>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID1>"
    And I add the new plan to the DUR member with "<MemberID1>","<Overrideplan1>"     
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID2>","<FirstName2>","<LastName2>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID2>"
    And I add the new plan to the DUR member with "<MemberID2>","<Overrideplan2>"
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID1>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    	Then I validate the claim status with "<ClaimStatus>"    	     
    When I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID2>","<ProductID1>","<DspQty>","<DS>","<PSC>",
      Then I validate the claim status with "<ClaimStatus>"
  
    Examples: 
       |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2 |ClaimStatus|CarrierID|AccountID|GroupID  |MemberID1  |FirstName1 |LastName1  |DOB       |MemFromDate|MemThruDate|MemberID2  |FirstName2 |LastName2|Overrideplan1|Overrideplan2|  
       |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110118   | 00093715310    |30      |30  |0    | 73 	 |5  | 30 |100118    |00054019613|P          |SN3921C01|SN3921A01|DU3921G01|DU3921PMEM06  |DU3921PMEM06  |DU3921PMEM06  |01011988  |100118     |123139     |DU3921PMEM07  |DU3921PMEM07  |DU3921PMEM07|DU3921P3     |DU3921P2     |   
   
   
   @TS18
  Scenario Outline: TC22_US1422900_User submits a claim  via F6 for a Medicare member WHEN there is a DUR Table defined in the member's plan subsequent of Medicaid plan with DUR override in place.       
    
    Given I am on RxClaim PlanAdministrator Menu    
    And I submit a DUR claim Fsix submit with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID2>","<ProductID1>","<DspQty>","<DS>","<PSC>",
    Then I validate the DUR Claim details with "<ClaimStatus2>","<RejCode>","<DURTable>","<DurServiceType2>","<DurServiceType>"
    
    
     Examples: 
      |BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|MemberID2 |ClaimStatus|ClaimStatus2|RejCode|DURTable|DurServiceType2|DurServiceType|
      |777777  |9999     |GRAUTSRT | TESTDH     | 165488397000  | 00     | 110218   | 00093715310    |30      |30  |0    | 73 	 |5 | 30 |DU3921PMEM07 |P          |R           |88     |DU3921V1|DUPTHER        |DUPRX         |    
        