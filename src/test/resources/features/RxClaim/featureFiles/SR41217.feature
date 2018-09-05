Feature: Create New Member
As a RxClaim User I want to create a New Member with existing CAG
    
             
   Scenario Outline: Create a new member in RxClaim with existing CAG
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
    And I press "Enter" Key
    And I enter "Y" in field "CommandPrompt" on "MemberDetailScreen"
    And I press "F8" Key
    And I enter Option "8" to navigate to "Member Alternate Insurance Information"
    And I press "Enter" Key
    And I take Option "1" to navigate to "Active Member Alternate Insurance"
    And I press "F6" Key
    And I enter "<RCMAIFromDate>","<RCMAIThruDate>","<RCMAIFlag>","<RCMAIType>","<RCMAICode>","<RCMAIID>"
    
    And I press "Enter" Key
    And I press "F12" Key
    And I press "F12" Key
    And I enter Option "17" to navigate to "Medicare"
    And I enter Option "2" to navigate to "Member Coverage Information"
    And I take Option "1" to navigate to "Active Member Coverage"
    And I press "F6" Key
    And I enter "<RCMMCFromDate>","<RCMMCThruDate>" "<RCMMCCoverageType>"  "<RCMMCBIN>"  "<RCMMCHelpdeskPhone>" "<RCMMCCoverageID>" "<RCMMCMemberID>" "<RCMMCPersonCode>" "<RCMMCCoverageCategory>" on "Member Coverage Detail"
    And I press "Enter" Key
    And I am on RxClaim PlanAdministrator Menu 
    
    And I copy the input file from "<srcfile>","<srclib>" to "<destfile>","<destlib>" "<ReplaceOrAdd>" "<YES_NO>" to prepare input file
    And I work with file "<destfile>","<destlib>" to update member details with "<CarrierID>","<AccountID>","<GroupID>","<MemberID>","<First Name>","<Last Name>","<DOB>","<From Date>","<Thru Date>"
    
    
    
    
    
    Examples:
    | CarrierID | AccountID   | GroupID  | MemberID  | First Name | Last Name | DOB      | From Date | Thru Date |RCMAIFromDate|RCMAIThruDate|RCMAIFlag|RCMAIType|RCMAICode|RCMAIID |RCMMCFromDate|RCMMCThruDate|RCMMCCoverageType|RCMMCBIN|RCMMCHelpdeskPhone|RCMMCCoverageID|RCMMCMemberID|RCMMCPersonCode|RCMMCCoverageCategory|srcfile  |srclib |destfile |destlib   |ReplaceOrAdd|YES_NO|
		|	SR41217C  | SR41217A    |	SR41217G | SR41217N | AUTOMEM    | AUTOMEM   | 12251987 | 010101    | 123139    |010117			 |010118			 |Y	       |O				 |C41217   |202020  |010117				 |123118			|1								|000000  |12345678				  |C41217					|202020				|001					  |O										|SR41218F2|USRMAMH|SR41217F4|CLM8402OBJ|ADD         |YES   |
    
        
    
    
    