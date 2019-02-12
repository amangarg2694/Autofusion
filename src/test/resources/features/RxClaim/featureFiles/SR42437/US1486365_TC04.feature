#Author:mudethula_venkateshwarlu@optum.com
#QE: 
#Step Definition file: test.java
#SR42437-US1486365
#Environment: 92

#@Regression
Feature: GPI List with Pharmacy Network and Diagnosis List

  #@TC04
    Scenario Outline: TC04: GPI is not present in lists with Pharm Network on the claim - Diagonsis Code not submitted
    Given I am on RxClaim PlanAdministrator Menu
    When I navigate to Active Plan GPI List with plan "<PlanCode>"
    And I add Super GPI list "<GPILIST1>", "<Seq1>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode1>"
    And I add Super GPI list "<GPILIST2>", "<Seq2>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumberNo>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode2>"
    And I add Super GPI list "<GPILIST3>", "<Seq3>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumber>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode3>"
    And I add Super GPI list "<GPILIST4>", "<Seq4>", "<FromDate>", "<ThruDate>", "<ProcesQualifier>", "<GPINumberNo>", "<DaysSuppl>", "<RejCodeRemap>", "<DiagnosisListCode4>"
    When I submit a claim by Diagnosis Code in list with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>", "<ExpectedDiagnosisListQLCodes>","<ExpectedDiagnosisCode>" 
    Then Validate Claim Status is "P" 
    And I verify GPI list in Claim Transaction Additional Info Plan Information "<ExpectedGPIlist>"
    
    Examples: 
      |PlanCode |GPILIST1 |Seq1|GPILIST2|Seq2|GPILIST3|Seq3|GPILIST4|Seq4|FromDate|ThruDate|ProcesQualifier|GPINumber      |GPINumberNo		 |DaysSuppl|RejCodeRemap|DiagnosisListCode1|DiagnosisListCode2|DiagnosisListCode3|DiagnosisListCode4|BIN    |ProcCtrl|Group|PharmacyID  |RxNo         |Refill |FillDate |MemberID |ProductID  |DspQty |DS |PSC |Cost |ExpectedGPIlist|ExpectedDiagnosisCode|ExpectedDiagnosisListQLCodes|
      |2SR3631P |1LIST    |10  |2NLIST  |20  |3LIST   |30  |4NLIST   |40  |010101	|123139	 |						   |97152000006400 |39400010100310 |			 	 |					  |D42437            |D42437						|									 |									|888888 |*       |*    |APHARMTEST1 |765488397611 |89     |012919   |4SR3631M |70319003212|10     |10 |0   |10   |							 | 				      		   |													|	  