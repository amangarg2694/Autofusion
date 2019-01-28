#Author: akkanapally.sridhar@optum.com
#Stepdefinitionfile:TBEligibleClaims.java
#QE: Pavneet
#Note: Run this feature file after running the feature file "Set02_SN003921_GPI_F18Submit.feature"
## NOTE: Data is present in 8405(92),Change the member ID only before running the script and it is mandatory(Same member in TC025, TC027,TC028,TC029,TC030 - Replace with new memeber) 
        ## And ( Same member for TC026, TC031, TC032 - Replace with new member). All below tests should be executed in same session.

@PlanDUR
@TBEligibleClaims_CT_04
Feature: Initialize override array for TB eligible claims
  

  @TC25
  Scenario Outline: US1431357_TC025_User submits a claim  via F6 for a member where the plan has CT defined in edit 11 (GPI) and CT override is set to 'Y' in the NDC/GPI override within F22=Medicaid of the member's plan   
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to Y in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList2>","<ContingentTherapy>"
    And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
    And I update the member details with "<MemberID>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the claim details for CT schedule drug with "<ClaimStatus>","<GPIList1>"
    And I resubmit the manual claim with Fsix "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted Claim details for GPIlist drug with "<ClaimStatus2>","<RejCode>","<Message>","<GPIList1>","<ContTherpy>"

    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2     |ClaimStatus|ClaimStatus2|RejCode|Message                          |ContTherpy|
      |SN3291P4  |010118  |123139  |SN3291 PlanGPI4 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |Y                |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G04 |SN3921G04  |010101     |123139     | SN3921MGP37Re  |SN3921MGP37Re  |SN3921MGP37Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407    |20      |10  |0    | 20 	 |10 | 30 |100118    |00054019613    |P          |R           |75     |Drug Requires Prior Authorization|N         |          

     
  @TC26
  Scenario Outline: US1431357_TC026_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 11 (GPI) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
     And I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<MemFromDate>","<MemThruDate>"
     And I update the member details with "<MemberID>"
     And I Set Medicare "<MemberID>","<PARTDFromDate>","<PARTDThruDate>","<Contract>","<PBP>","<Segment>","<SubsidyLevel>","<CopayCategory>","<PARTDEffectiveDate>","<EnrollmentSource>"
     And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID1>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the claim details for CT schedule drug with "<ClaimStatus>","<GPIList1>"
     And I resubmit the manual claim with Fsix "<RxNo>","<FillDate2>","<ProductID2>"
      Then I validate the resubmitted second GPI Claim details with "<ClaimStatus>","<Message1>","<Message2>","<Message3>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>","<MedicareTBSchedule>"
     And I resubmit the manual claim with Fsix "<RxNo>","<FillDate3>","<ProductID2>"
			Then I validate the resubmitted above GPI Claim with "<ClaimStatus2>","<RejCode>","<Message1>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
			
			
			#Update Group only from CAG creation  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message1            |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|
      |SN3291P5  |010118  |123139  |SN3291 PlanGPI5 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |Y                |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G05 |SN3921G05  |010101     |123139     | SN3921MGP38Re  |SN3921MGP38Re  |SN3921MGP38Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407    |20      |10  |0    | 10 	 |10 | 20 |100118    |102718   |00054019613|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |L         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT        |          
      
      
   @TC27
  Scenario Outline: US1431357_TC027_User submits a claim  via F6 for a member where the plan has CT defined in edit 11 (GPI) and CT override is set to 'N' in the NDC/GPI override within F22=Medicaid of the member's plan    
    								 	
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to N in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList2>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
      Then I validate the Claim for GPIlist drug and CT is N with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
    
    #Same setup as TC01 except ContingentTherapy
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2     |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
      |SN3291P4  |010118  |123139  |SN3291 PlanGPI4 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |N                |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G04 |SN3921G04  |010101     |123139     | SN3921MGP37Re  |SN3921MGP37Re  |SN3921MGP37Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407    |20      |10  |0    | 20 	 |10 | 30 |100118    |00054019613    |P          |R           |75     |CT HAS NOT BEEN MET|L         |R         |          
			
         
   @TC28
  Scenario Outline: US1431357_TC028_User submits a claim  via F6 for a member where the plan has CT defined in edit 11 (GPI) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan     
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList2>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
      	Then I validate the Claim for GPIlist drug and CT is empty with "<ClaimStatus2>","<RejCode>","<Message>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
       
    #Same setup as TC01 except ContingentTherapy
    Examples: 
       |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1     | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2 |ProductID2     |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|
       |SN3291P4  |010118  |123139  |SN3291 PlanGPI4 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |                 |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G04 |SN3921G04  |010101     |123139     | SN3921MGP37Re  |SN3921MGP37Re  |SN3921MGP37Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407    |20      |10  |0    | 20 	 |10 | 30 |100118    |00054019613    |P          |R           |75     |CT HAS NOT BEEN MET|L         |R         |          
			
  @TC29
  Scenario Outline: US1431357_TC029_User submits a claim  via F6 for a member where the plan has CT defined in edit 11 (GPI) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan      
    								 
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList2>","<ContingentTherapy>"
    And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
       Then I validate the GPI Claim for PA member with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
       
    #Same setup as TC01 except ContingentTherapy
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2      |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P4  |010118  |123139  |SN3291 PlanGPI4     |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |                 |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G04 |SN3921G04  |010101     |123139     | SN3921MGP37Re|SN3921MGP37Re|SN3921MGP37Re|01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407 |20      |10  |0    | 20 	|10 | 30 |101518    |00054019613    |P          |R           |75     |CT HAS NOT BEEN MET|L         |R         |SN3921P21|G   |*  |*  |12408040000305|101518|102018|O    |PA    |N               |

           
     @TC30
  Scenario Outline: US1431357_TC030_User submits a claim  via F6 for a member where the plan has CT defined in edit 11 (GPI) and CT override is set to 'blank' in the NDC/GPI override within F22=Medicaid of the member's plan       
    
    Given I am on RxClaim PlanAdministrator Menu
    And I update the ContingentTherapy to blank in NDCGPI OR Edit List screen for NDC with "<NDCGPIORList2>","<ContingentTherapy>"
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate2>","<MemberID>","<ProductID2>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	Then I validate the GPI Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
       
    #Same setup as TC01 except ContingentTherapy
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description         |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|ndcsq|ndcfromdate|ndcthrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID   |FirstName  |LastName   |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID1  | DspQty | DS | PSC | Cost |Fee| UCW|FillDate2|ProductID2      |ClaimStatus|ClaimStatus2|RejCode|Message            |ContTherpy|ContStatus|PANumber |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P4  |010118  |123139  |SN3291 PlanGPI4     |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |                 |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G04 |SN3921G04  |010101     |123139     | SN3921MGP37Re|SN3921MGP37Re|SN3921MGP37Re|01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110118   | 00247064407 |20      |10  |0    | 20 	|10 | 30 |110218    |00054019613    |P          |R           |75     |ct has been met    |L         |P         |SN3921P20|G   |*  |*  |12408040000305|101518|102018|O    |PA    |N               |


     @TC31
  Scenario Outline: US1431357_TC031_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 11 (GPI) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
     And I create PA on Member for CT "<MemberID>","<PANumber>","<Type>","<MSC>","<OTC>","<NDCGPIList>","<From>","<Thru>","<Agent>","<Reason>","<IgnoreDrugStatus>"
     And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
    	 Then I validate the GPI Claim for PA member with "<ClaimStatus>","<Message>","<PANumber>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
     			
			#Update Group only from CAG creation  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID     | DspQty | DS | PSC | Cost |Fee| UCW |FillDate2 |FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message             |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|PANumber |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P5  |010118  |123139  |SN3291 PlanGPI5 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |Y                |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G05 |SN3921G05  |010101     |123139     | SN3921MGP38Re  |SN3921MGP38Re  |SN3921MGP38Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 101518   | 00054019613   |20      |10  |0    | 10 	 |10 | 20 |100118    |102718   |00054019613|P          |R           |75     |CT HAS NOT BEEN MET |Remaining CMS Transition days supply is|20.     |L         |R         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT       |SN3921GP3|G   |*  |*  |12408040000305|101518|102018|O    |PA    |N               |          
      
    
               
  @TC32
  Scenario Outline: US1431357_TC032_User submits a claim via F6 for a Medicare member for a product which has CT defined within edit 11 (GPI) of the member's plan. 
    
    Given I am on RxClaim PlanAdministrator Menu
    And I submit a manual claim Fsix with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<Fee>","<UCW>"
      Then I validate the GPI Claim for CT with "<ClaimStatus>","<Message>","<CTSchedule>","<GPIList1>","<ContTherpy>","<ContStatus>"
   		
			#Update Group only from CAG creation  
    Examples: 
      |PlanCode  |FromDate|ThruDate|Description     |PriceSchedule|PatientPaySchedule|NDCGPIORList2|NDCGPIORListDesc2  |GPIPDID1      |NDGPFromdate|NDGPTodate|ContingentTherapy|TBOverride|GPIList1 |GPIDecs1|GPIPDIDSts|CTSFromdate|CTSTodate|CTSchedule |CTScheduleDesc |MessageCode1|MessageType1|MessageCode2|MessageType2|ProSeq|ProNDCId   |ProGPIId      |ProType|ProStsOverride|gpisq|gpifromdate|gpithrudate|CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID  |AccountName | GroupID   |GroupName  |GroupFromDt|GroupThruDt| MemberID     |FirstName    |LastName     |DOB      |MemFromDate|MemThruDate|Bfromdate|Btodate|BINGroup |Windowdays|BIN     |ProcCtrl |Group    | PharmacyID | RxNo          | Refill | FillDate | ProductID     | DspQty | DS | PSC | Cost |Fee| UCW |FillDate2 |FillDate3|ProductID2 |ClaimStatus|ClaimStatus2|RejCode|Message             |Message2                               |Message3|ContTherpy|ContStatus|Contract|PBP|BenefitYear|MedicareType|SubmitterID|MasterProfileFromDate|MasterProfileThruDate|DrugCoverageStatusSchedule|PARTDFromDate|PARTDThruDate|Segment|SubsidyLevel|CopayCategory|PARTDEffectiveDate|EnrollmentSource|TBLengthPeriod|MedicareTBSchedule|TrOOPFromDate|TrOOPThruDate|AccumulationLevel|AccumulationCode|TrOOPSchedule|CMSLabelerList|PANumber |Type|MSC|OTC|NDCGPIList    |From  |Thru  |Agent|Reason|IgnoreDrugStatus|
      |SN3291P5  |010118  |123139  |SN3291 PlanGPI5 |MACSHEPS     |MACPATPAY         |NDGP3921L5   |MD NDCGPI OR GLIST4|00054019613   |010118      |123119    |Y                |Y         |SANDL5   |SANDL5  |P         |010118     |123119   |CT3921SHG4 |CT SCHEDULEGPI3|CT MET      |A           |CT UNMET    |A           |1     |           |00247064407   |P      |F             |1    |010101     |123119     |SN3921C01 | SN3921C01   |712        |MAIL ADD  |City|IL   |78654|010101        |123139        |*DEFAULT   |*DEFAULT      |SN3921A01  |SN3921A01   | SN3921G05 |SN3921G05  |010101     |123139     | SN3921MGP38Re  |SN3921MGP38Re  |SN3921MGP38Re  |01011988 |100118     |123119     |010101   |123139 |*ALL     |9999      |777777  |9999     |GRAUTSRT | 2400101    | 165488397000  | 00     | 110218   | 00054019613   |20      |10  |0    | 10 	 |10 | 20 |100118    |102718   |00054019613|P          |R           |75     |ct has been met     |Remaining CMS Transition days supply is|20.     |L         |P         |P3921   |392|2019       |S           |AKSR       |010118               |123139               |ARUSDFLT                  |  010101     |123139       |       |            |             |                  |                |20            |EVUAKAN           |010101       |123139       |C                |                |EVUBKOT      |EVUBKOT       |SN3921GP3|G   |*  |*  |12408040000305|101518|102018|O    |PA    |N               |          
        
     
     
      