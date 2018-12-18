@Regression4
Feature: Verify whether the claim gets paid or Rejected when Contingent Therapy Type is P,Exclude Level is NDC with Wildacard Zero and CT Protocol Sequece product is NDC
 As a RxClaim User I want to Verify whether the claim gets paid or Rejected when Contingent Therapy Type is P,Exclude Level is NDC with Wildacard Zero and CT Protocol Sequece product is NDC
 
  Scenario Outline: Verify whether the claim gets paid or Rejected when Contingent Therapy Type is P,Exclude Level is NDC with Wildacard Zero and CT Protocol Sequece product is NDC
 		Given I am on RxClaim PlanAdministrator Menu  
    When  I select Option "4" to navigate to "RxClaim Plan Maintenance"
    And I select Option "3" to navigate to "Active Contingent Therapy Schedule"
    And I create Active Contingent Therapy Schedule with "<Schedule1>","<desc>","<mmsgcde>","<mmstyp>","<umsgcde>","<umsgtyp>"
    And I create Active Contingent Therapy Schedule Protocol with "<seq>" for "<Schedule1>" and having "<NDCListId>","<perioddays>","<mindur>","<Inccurcl>","<exccl>","<level>","<wildcard>" 
    And  I am on RxClaim PlanAdministrator Menu
  	 When I create CAG with "<CarrierID>","<CarrierName>","<Processor>","<MailingAdd>","<City>","<State>","<Zip>","<ContractFromDt>","<ContractThruDt>","<ContractEnt>","<BusinessType>","<AccountID>","<AccountName>","<GroupID>","<GroupName>","<GroupFromDt>","<GroupThruDt>","<PlanCode>"
    And  Validate CAG created with details "<CarrierID>" ,"<AccountID>","<GroupID>"
    And I am on RxClaim PlanAdministrator Menu
     When I select Option "1" to navigate to "Eligibility/Claim Transaction Maintenance"
    And I select Option "2" to navigate to "Active/Eligible Member by ID"
    And I press "F6" Key 
    And I enter "<CarrierID>" in field "CarrierID" on "AddMemberScreen"
    And I enter "<AccountID>" in field "AccountID" on "AddMemberScreen"
    And I enter "<GroupID>" in field "GroupID" on "AddMemberScreen"
    And I enter "<MemberID>" in field "MemberID" on "AddMemberScreen"
    And I press "Enter" Key 
    And I enter "<First Name>" in field "FirstName" on "MemberDetailScreen"
    And I enter "<Last Name>" in field "LastName" on "MemberDetailScreen" 
    And I enter "<DOB>" in field "DOB" on "MemberDetailScreen"
    And I enter "<From Date>" in field "FromDate" on "MemberDetailScreen" 
    And I enter "<Thru Date>" in field "ThruDate" on "MemberDetailScreen"
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F12" Key
    And Validate "Member Added." message should displayed on "AddMemberScreen"
    And I am on RxClaim PlanAdministrator Menu
    And Add PriorAuthorization to  member "<MemberID>" with "<num>","<NDCListId>","<Type>","<Msc>","<date1>","<agt>","<rsn>"  
    And I am on RxClaim PlanAdministrator Menu 
    And I submitt a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "P"
    And I am on RxClaim PlanAdministrator Menu 
    And I submitt a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo1>","<Refill>","<FillDate1>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>"
    Then Validate Claim Status is "R"
    And I press "F7" Key
    And I press "F7" Key
    Then I Validate the Plan Contingent Therapy as "<CT>" and status  as "<CS>"of the claim
    Examples:
    | Schedule1     | desc       |perioddays|mindur|Inccurcl|exccl|level|wildcard|mmsgcde  |mmstyp|umsgcde|umsgtyp|seq|   CarrierID | CarrierName |Processor  |MailingAdd|City|State|Zip  |ContractFromDt|ContractThruDt|ContractEnt| BusinessType |AccountID |AccountName  | GroupID   |GroupName  	|GroupFromDt|GroupThruDt|PlanCode	 |MemberID		 | First Name      | Last Name     | DOB      | From Date | Thru Date |     num       |NDCListId  |Type	|Msc|date1 |agt|rsn| BIN     | ProcCtrl | Group | PharmacyID  |RxNo         |RxNo1			 | Refill | FillDate | MemberID   | ProductID  | DspQty | DS | PSC | Cost | FillDate1|CT	|CS| 
    | SR41397SCH    | SR41397SCH  | 180     |30     |Y      |S     |N   |0       |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP 	|Test Group 	|010101     |123139     |SN3071PL01|ffmm1_41397  |   mem1_41397    | mem1_41397    | 12251987	| 010101    | 123139    |12345678912    |43353086030|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |123466661234 |123455661234| 00     | 050218   | MEMTEST345 | 43353086030|30      |30     |0  |100   |050918	 |D		|R|
    | SR41397SCH1   | SR41397SCH1 | 180			|10			|Y			|S		 |N		|2			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP_1 |Test Group1 	|010101     |123139     |SN3071PL04|femm2_41397  |   mem2_41397    | mem2_41397    | 12251987	| 010101    | 123139    |12345678914    |43353086030|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |223123661234 |223113661234| 00     | 050218   | MEMTEST345 | 43353086030|30      |30     |0  |100   |050918   |D		|R|
    | SR41397SCH2   | SR41397SCH2 | 180			|10			|Y			|S		 |N		|2			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP_2 |Test Group1 	|010101     |123139     |SN3071PL06|femm3_41397  |   mem3_41397    | mem3_41397    | 12251987	| 010101    | 123139    |44555235943    |43353086030|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |121121111454 |121122111454| 00     | 050218   | MEMTEST345 | 43353086030|30      |30     |0  |100   |050918   |D		|R|
    | SR41397SCH3   | SR41397SCH3 | 180			|10			|Y			|S		 |G		|0			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP_3 |Test Group1 	|010101     |123139     |SN3071PL38|femm4_41397  |   mem4_41397    | mem4_41397    | 12251987	| 010101    | 123139    |14551235943    |66302030001|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |123444555554 |113444555554| 00     | 050218   | MEMTEST345 | 66302030001|30      |30     |0  |100   |050918	 |L		|R|
    | SR41397SCH4   | SR41397SCH4 | 180			|10			|Y			|S		 |G		|0			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account			  | 3071GRP_4 |Test Group1 	|010101     |123139     |SN3071PL39|femm5_41397  |   mem4_41397    | mem4_41397    | 12251987	| 010101    | 123139    |23444325943    |66302030001|N    |* 	|050218|A	 |AA |777777   | AKAN     |	*ALL  | APHARM      |232415677774 |232414677774| 00     | 050218   | MEMTEST345 | 66302030001|30      |30     |0  |100   |050918	 |L		|R|
    | SR41397SCH5   | SR41397SCH5 | 180			|10			|Y			|S		 |G		|10			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP_5 |Test Group1 	|010101     |123139     |SN3071PL38|femm6_41397  |   mem4_41397    | mem4_41397    | 12251987	| 010101    | 123139    |11234325943    |66302030001|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |115551111374 |125551111374| 00     | 050218   | MEMTEST345 | 66302030001|30      |30     |0  |100   |050918	 |L		|R|
    | SR41397SCH6   | SR41397SCH6 | 180			|10			|Y			|S		 |G		|12			 |2        |A     |2      |A      |1   | 3071CAR   | Test Carrier|712        |MAIL ADD  |City|IL   |78654|010101        |123139        |PRTD   |*DEFAULT      |3071ACC |Test Account 				| 3071GRP_6 |Test Group1 	|010101     |123139     |SN3071PL42|femm7_41397  |   mem4_41397    | mem4_41397    | 12251987	| 010101    | 123139    |12312233943    |66302030001|N    |* 	|050218|A  |AA |777777   | AKAN     |	*ALL  | APHARM      |211445555664 |211345555664| 00     | 050218   | MEMTEST345 | 66302030001|30      |30     |0  |100   |050918	 |L		|R|