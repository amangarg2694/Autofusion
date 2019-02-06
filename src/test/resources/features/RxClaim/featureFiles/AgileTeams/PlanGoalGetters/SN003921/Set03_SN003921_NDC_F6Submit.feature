#Author: akkanapally.sridhar@optum.com
#Stepdefinitionfile:TBEligibleClaims.java
#QE: Pavneet
#Note: #Note: Run this feature file after running the feature file "Set01_SN003921_NDC_F18Submit.feature"
## NOTE: Data is present in 8405(92),Change the member ID only before running the script and it is mandatory(Same member in TC017, TC019,TC020,TC021,TC022 - Replace with new memeber) 
        ## And ( Same member forTC018,TC023,TC024 - Replace with new member). All below tests should be executed in same session.

@PlanDUR
@TBEligibleClaims_CT_02
Feature: Initialize override array for TB eligible claims
  
# Run this set after running Set01_SN003921_NDC_F18Submit.feature
  @TC17
  Scenario Outline: US1431357_TC017_User submits a claim  via F6 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'Y' in the NDC/GPI override within F22=Medicaid of the member's plan  
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to Y in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the claim details with "<ClaimStatus>","<NDCList1>"
    And I resubmit the manual claim with Fsix "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted Claim details with "<ClaimStatus2>","<RejCode>","<Message>","<NDCList1>","<ContTherpy>"

    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message                          |ContTherpy|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921Sch01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M31Re  |SN3921M31Re  |SN3921M31Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |Drug Requires Prior Authorization|N         |          

    @TC18
  Scenario Outline: US1431357_TC018_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the claim details with "<ClaimStatus>","<NDCList1>"
    And I resubmit the manual claim with Fsix "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted second Claim details with "<ClaimStatus>","<Message1>","<Message2>","<Message3>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>","<MedicareTBSchedule>"
    And I resubmit the manual claim with Fsix "<RxNo>","<FillDate3>","<ProductID2>"
			Then I validate the resubmitted above Claim with "<ClaimStatus2>","<RejCode>","<Message1>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
			
		 
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message1            |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M32Re  |SN3921M32Re  |SN3921M32Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |100118   |102718   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |D         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT        |

        
      
   @TC19
  Scenario Outline: US1431357_TC019_User submits a claim  via F6 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'N' in the NDC/GPI override within F22=Medicaid of the member's plan   
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to N in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT is N with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
    
   
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |N                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M31Re  |SN3921M31Re  |SN3921M31Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |    

         
   @TC20
  Scenario Outline: US1431357_TC020_User submits a claim  via F6 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan    
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT is empty with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M31Re  |SN3921M31Re  |SN3921M31Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |100118   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |    

  @TC21
  Scenario Outline: US1431357_TC021_User submits a claim  via F6 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan     
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for member PA with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M31Re  |SN3921M31Re  |SN3921M31Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 101518   | 59676096001 |30      |30  |0    | 20 	|10 | 30 |101518   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET|D         |R         |SN3921P20|N   |*  |*  |00071015523|101518|102018|O    |PA    |N               |

           
     @TC22
  Scenario Outline: US1431357_TC022_User submits a claim  via F6 for a member where the plan has CT defined in edit 10 (NDC) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan     
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList1>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
       
    
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate1 | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message          |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P1  |010118  |123139  |SN3291P1 PlanTC01   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |                 |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G01 |SN3921G01  |010101     |123139     | SN3921M31Re  |SN3921M31Re  |SN3921M31Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118    | 59676096001 |20      |10  |0    | 20   |10 | 30 |110218   |00071015523|P          |R           |75     |ct has been met  |D         |P         |SN3921P20|N   |*  |*  |00071015523|101518|102018|O    |PA    |N               |

     @TC23
  Scenario Outline: US1431357_TC023_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
  
    Given I am on RxClaim PlanAdministrator Menu
     And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate3>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the Claim for member PA with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
     
     			
		  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message             |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|PANumber |Type|MSC|OTC|NDCGPIList |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M32Re  |SN3921M32Re  |SN3921M32Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |100118   |102718   |00071015523|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |D         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT       |SN3921P23|N   |*  |*  |00071015523|101518|102918|O    |PA    |N               |

          
  @TC24
  Scenario Outline: US1431357_TC024_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 10 (NDC) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
      Then I validate the Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<NDCList1>","<ContTherpy>","<ContStatus>"
   		
		 
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList1|NDCGPIORListDesc1 |NDCPDID1   |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|NDCList1 |NDCDecs1|NDCPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  |DspQty |DS | PSC | Cost |Fee| UCW|FillDate2|FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message         |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|
      |SN3291P2  |010118  |123139  |SN3291P2 PlanTC02   |MACSHEPS     |MACPATPAY         |NDGP3921L1   |MD NDCGPI OR LIST1|00071015523|010118      |123119    |Y                |Y         |SANDL2   |SANDL2  |P         |010118     |123119   |CT3921SCH01|CT SCHEDULETC01|CT MET      |A           |CT UNMET    |A           |1     |59676096001|              |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G02 |SN3921G02  |010101     |123139     | SN3921M32Re  |SN3921M32Re  |SN3921M32Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 59676096001 |20     |10 |0    | 10 	|10 | 20 |110218   |102718   |00071015523|P          |R           |75     |ct has been met |Remaining CMS Transition days supply is|20.     |D         |P         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT        |

             
      