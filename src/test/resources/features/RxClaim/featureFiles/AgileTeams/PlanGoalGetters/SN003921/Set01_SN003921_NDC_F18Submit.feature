#Author: akkanapally.sridhar@optum.com
#Stepdefinitionfile:TBEligibleClaims.java
#QE: Pavneet
## NOTE: Data is present in 8405(92),Change the member ID only before running the script and it is amandatory(Same member in TC001, TC003, TC004, TC005, TC006) 
         ## And ( Same member in TC002, TC007, TC008). All below tests should be executed in same session.Set03 feature file is dependent on Set01 feature file 
				 ## Same comments applicable to Set03 Feature file

@PlanDUR
@Regression
@TBEligibleClaims_CT_01
Feature: Initialize override array for TB eligible claims
  

 
  Scenario Outline: US1431357_TC001_User submits a claim  via F18 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'Y' in the NDC/GPI override within 
    
    Given I am on RxClaim PlanAdministrator Menu
    When I create Contingent Therapy Schedule with protocol mapping "<CTSchedule>","<CTScheduleDesc>","<MessageCode1>","<MessageType1>","<MessageCode2>","<MessageType2>","<ProSeq>","<ProNDCId>","<ProGPIId>","<ProType>","<ProStsOverride>"
    And I create the NDClist with NDCId and CT Schedule mapping "<NDCList1>", "<NDCDecs1>","<NDCPDID1>","<NDGPFromdate>","<NDCPDIDSts>","<CTSFromdate>","<CTSTodate>","<CTSchedule>",
    And I create NDCGPI OR Edit List for NDC with "<NDCGPIORList1>","<NDCGPIORListDesc1>","<NDCPDID1>","<NDGPFromdate>","<NDGPTodate>","<ContingentTherapy>"
    And I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I add NDClist to the plan with "<PlanCode>","<NDCList1>","<ndcsq>","<ndcfromdate>","<ndcthrudate>"
    And I create the medicaid setup for the plan with "<PlanCode>","<TBOverride>","<NDCGPIORList1>"
    And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    #And I create BIN in Transaction control screen for claim router submission with "<BIN>","<ProcCtrl>","<Group>","<Bfromdate>","<Btodate>","<CarrierID>","<AccountID>","<BINGroup>","<Windowdays>"
    And I update the ContingentTherapy to Y in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a router claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the claim details with "<ClaimStatus>","<NDCList1>"
    And I resubmit the claim with drug mapped to NDCGPIlist "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted Claim details with "<ClaimStatus2>","<RejCode>","<Message>","<NDCList1>","<ContTherpy>"

    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message                          |ContTherpy|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921Sch01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |Drug Requires Prior Authorization|N         |          

    
  Scenario Outline: US1431357_TC002_User submits a claim via F18 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I create plan with member eligibility and pricing option "<PlanCode>","<FromDate>","<Description>","<ThruDate>","<PriceSchedule>","<PatientPaySchedule>"
    And I add accumulators to the above plan "<TrOOPFromDate>","<TrOOPThruDate>","<AccumulationLevel>","<AccumulationCode>","<TrOOPSchedule>","<CMSLabelerList>"
    And I add NDClist to the plan with "<PlanCode>","<NDCList1>","<ndcsq>","<ndcfromdate>","<ndcthrudate>"
    And I add Transitional Benefit override to the plan with "<PlanCode>","<TBLengthPeriod>","<MedicareTBSchedule>","<TBlvl>","<TBlwc>"
    And I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And I Set PBP "<CarrierID>","<Contract>","<PBP>","<BenefitYear>","<MedicareType>","<SubmitterID>"
    And I Set PartD Master Profile Detail "<CarrierID>","<AccountID>","<GroupID>","<PlanCode>","<FromDate>","<MasterProfileFromDate>","<MasterProfileThruDate>","<DrugCoverageStatusSchedule>","<Contract>","<PBP>"
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
    And I create BIN in Transaction control screen for claim router submission with "<BIN>","<ProcCtrl>","<Group>","<Bfromdate>","<Btodate>","<CarrierID>","<AccountID>","<BINGroup>","<Windowdays>"
    And I submit a router claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the claim details with "<ClaimStatus>","<NDCList1>"
    And I resubmit the claim with drug mapped to NDCGPIlist "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted second Claim details with "<ClaimStatus>","<Message1>","<Message2>","<Message3>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>","<MedicareTBSchedule>"
    And I resubmit the second claim with drug mapped to NDCGPIlist "<RxNo>","<FillDate3>","<ProductID2>"
			Then I validate the resubmitted above Claim with "<ClaimStatus2>","<RejCode>","<Message1>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
			
			#Update new Group only from CAG creation if CAG created in above feature 
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message1            |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TBlvl|TBlwc|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M15  |SN3921M15  |SN3921M15  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |100118   |102718   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |D         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |G    |0    |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT        |

        
      
  
  Scenario Outline: US1431357_TC003_User submits a claim  via F18 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'N' in the NDC/GPI override within  
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to N in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT is N with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
    
   
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |N                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |    

         
   
  Scenario Outline: US1431357_TC004_User submits a claim  via F18 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within   
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT is empty with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
   
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |    

  
  Scenario Outline: US1431357_TC005_User submits a claim  via F18 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within    
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for member PA with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
    
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 101518   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |101518   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |SN3921P20|N   |*  |*  |00071015523|101518|102018|O    |PA    |N               |

           
     
  Scenario Outline: US1431357_TC006_User submits a claim  via F18 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan     
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
   
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate1 | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message          |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M08  |SN3921M08  |SN3921M08  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118    | 59676096001 |20      |10  |0    | 20   |10 | 30 |110218   |00071015523|P          |R           |75     |ct has been met  |D         |P         |SN3921P20|N   |*  |*  |00071015523|101518|102018|O    |PA    |N               |

    
  Scenario Outline: US1431357_TC007_User submits a claim via F18 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
   
    Given I am on RxClaim PlanAdministrator Menu
    And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate3>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the Claim for member PA with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
     
     			
		
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message             |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M15  |SN3921M15  |SN3921M15  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |100118   |102718   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |D         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT       |SN3921P23|N   |*  |*  |00071015523|101518|102918|O    |PA    |N               |

          
  
  Scenario Outline: US1431357_TC008_User submits a claim via F18 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I submit a claimone with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
      Then I validate the Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
   		
			
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message         |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M15  |SN3921M15  |SN3921M15  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |110218   |102718   |00071015523|P          |R           |75     |ct has been met |Remaining CMS Transition days supply is|20.     |D         |P         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT        |

             
      