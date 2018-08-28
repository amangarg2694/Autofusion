Feature: Verify that the Reimbursement ID in the Insurance Segment is populated with same as Network ID from Compound Claim Transaction Additional Info

Scenario Outline: Verify that the Reimbursement ID in the Insurance Segment is populated with same as Network ID from Claim Transaction Additional Info
#TC2/TC4

Given I am on RxClaim PlanAdministrator Menu
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
And I submitt a compound claim withh "<BIN>","<ProcCtrl>","<Group>","<PharmacyID>","<RxNo>","<Refill>","<FillDate>","<MemberID>","<ProductID>","<DspQty>","<DS>","<PSC>","<Cost>","<com>" with F18 option
And Validate Claim Status is "P"
And I get the network id value from the claim
And I am on RxClaim PlanAdministrator Menu
And I select Option "CCT800" to navigate to "RxClaim System Administration Menu"
And I select Option "13" to navigate to "Communication Logs Menu"
And I select Option "1" to navigate to "Communications Log by Req Date/Req Time"
And I search  for pharmacy "<PharmacyID>" for the claim and check for reimbursement id

 




Examples: 
|Plan1   |CarrierID | AccountID   | GroupID     | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | ProductID  | DspQty | DS | PSC | Cost |rxorg|com| 
|RUSH_TEST |SN3513    |SN3513_A     |	SN3513_G    | 3513_MEM15 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |122115235646  |00      |081718    | 00000000000|30      |30  |00   |100   |1|2|
#|MADHU_N |SN3513    |SN3513_A     |	SN3513_G    | 3513_MEM13 | AUTOMEM    | AUTOMEM   | 12251987	| 010101    | 123139    |777777   |ASHE     |*      |RADTEST       |122111235646  |00      |081718    | 00000000000|30      |30  |00   |100   |1|2|
