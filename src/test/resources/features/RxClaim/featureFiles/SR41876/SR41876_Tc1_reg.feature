@Regression
Feature: Verify that the Reimbursement ID in the Insurance Segment is populated with same as Network ID from Claim Transaction Additional Info


#change MemberID
Scenario Outline: Verify that the Reimbursement ID in the Insurance Segment is populated with same as Network ID from Claim Transaction Additional Info

Given I am on RxClaim PlanAdministrator Menu
# When I create Member with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<FirstName>","<LastName>","<DOB>","<FromDate>","<ThruDate>"
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
And I enter override plan "<Plan1>" on MemberdetailScreen
And I press "Enter" Key
And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
And I press "F12" Key
And Validate "Member Added." message should displayed on "AddMemberScreen"
And I am on RxClaim PlanAdministrator Menu 

And I submit a claim with "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<rxorg>" with F18 option
And Validate Claim Status is "P"
And I get the network id value from the claim
And I am on RxClaim PlanAdministrator Menu
And I select Option "CCT800" to navigate to "RxClaim System Administration Menu"
And I select Option "13" to navigate to "Communication Logs Menu"
And I select Option "1" to navigate to "Communications Log by Req Date/Req Time"
Then I search  for pharmacy "<PharmacyID>" for the claim and check for reimbursement id
And I goback to RxClaim Plan Administrator Menu screen from Communication log screen
 




Examples: 
|Plan1   |CarrierID | AccountID   | GroupID     | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost |rxorg| 
|MADHU_N|SN3513    |SN3513_A     |	SN3513_G    | 3513_Mse1 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |110112212346  |00      |081718    | 00591571501|30      |30  |00   |100   |1|
|RUSH_TEST|SN3513    |SN3513_A     |	SN3513_G    | 3513_Mse2| AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |101132135546  |00      |081718    | 00591571501|30      |30  |00   |100   |1|
|RUSH_TEST1|SN3513    |SN3513_A     |	SN3513_G    | 3513_Mse3 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |APHARM       |144112231236  |00      |081718    | 00591571501|30      |30  |00   |100   |1|
|RUSH_TEST2|SN3513    |SN3513_A     |	SN3513_G    | 3513_Mse4 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |133112235123  |00      |081718    | 00591571501|30      |30  |00   |100   |1|
|RUSH_TEST3|SN3513    |SN3513_A     |	SN3513_G    | 3513_Mse5 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |171222235546  |00      |081718    | 00591571501|30      |30  |00   |100   |1|
#book 1test data|RUSH_TEST|SN3353    |SN3353_A     |	SN3353_G    | 3513_MMF2| AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |610097  |9999     |*      |2400101       |101132124546  |00      |081718    | 00591571501|30      |30  |00   |100   |1|