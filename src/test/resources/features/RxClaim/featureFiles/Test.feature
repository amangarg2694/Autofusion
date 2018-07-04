Feature:  Verify  the  external Transaction Number for XTR Transaction Type for Rejected Claims
  As a RxClaim User I want to check XTR Transaction Type for rejected claims

  Scenario Outline: Verify  the  external Transaction Number for XTR Transaction Type=5 for Rejected Claims
    Given I am on RxClaim PlanAdministrator Menu
    When I Capture the text in the report
    
  Examples: 
      | BIN     | ProcCtrl| Group | PharmacyID  |RxNo          | Refill | FillDate | MemberID     | ProductID  | DspQty | DS | PSC | Cost | Carrier | Account | Groupid | First Name | Last Name | DOB      | Start Date | End Date  |  
		|	777777  | SR41632     |	*  | APHARM      | 900019931100 | 00     | 6212018   | SR41632_PR1 | 00071015523|2      |2  |  | 100   | SR41632CJ | SR41632A1 | SR41632GS | AUTOMEM    | AUTOMEM   | 12251987 |    010101 |    123139 |
       