#Author:mudethula_venkateshwarlu@optum.com
#QE: PlanPanthers Team
#Step Definition file: 
#SR42437-US1486365
#Environment: 92

#@Regression
Feature: GPI List with Pharmacy Network and Diagnosis List

  #@TC02
    Scenario Outline: TC02: GPI Present in GPI Lists- Diagonsis List is submitted and submitted Diagnosis Code present in list.
    Given I am on RxClaim PlanAdministrator Menu
    When I navigate to Active Plan GPI List with plan "<PlanCode>"
    And I add Super GPI list "<GPILIST1>", "<Seq1>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode1>"
    And I add Super GPI list "<GPILIST2>", "<Seq2>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode2>"
    And I add Super GPI list "<GPILIST3>", "<Seq3>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode3>"
    And I add Super GPI list "<GPILIST4>", "<Seq4>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode4>"
    When I submit a claim by Diagnosis Code in list with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>", "<ExpectedDiagnosisListQLCodes>","<ExpectedDiagnosisCode>" 
    Then Validate Claim Status is "P" 
    And I verify GPI list in Claim Transaction Additional Info Plan Information "<ExpectedGPIlist>"
    
    Examples: 
      |PlanCode |GPILIST1 |Seq1|GPILIST2|Seq2|GPILIST3|Seq3|GPILIST4|Seq4|FromDate|ThruDate|ProcesQualifier|GPINumber      |DaysSuppl|RejCodeRemap|DiagnosisListCode1|DiagnosisListCode2|DiagnosisListCode3|DiagnosisListCode4|BIN    |ProcCtrl|Group|PharmacyID  |RxNo         |Refill |FillDate |MemberID |ProductID  |DspQty |DS |PSC |Cost |ExpectedGPIlist|ExpectedDiagnosisCode|ExpectedDiagnosisListQLCodes|
      |1SR3631P |1LIST    |10  |2LIST   |20  |3LIST   |30  |4LIST   |40  |010101	|123139	 |						   |97152000006400 |			 	 |					  |D42437            |D42437						|									 |									|888888 |*       |*    |APHARMTEST1 |765488397611 |00     |012419   |1SR3631M |70319003212|10     |10 |0   |10   |4LIST					 |W.0041	      		   |02													|	  