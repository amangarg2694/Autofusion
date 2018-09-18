Feature: Verify the Update ‘S’ Indicator to Field Type in Pharmacy Detail Screen
 As a RxClaim User I want to Verify Update ‘S’ Indicator to Field Type
 
 Scenario Outline: Verify the system standard help text to the Suppress Update flag on the Pharmacy Detail screen (RCPHA026)
 Given I am on RxClaim PlanAdministrator Menu
 When I select Option "7" to navigate to "RxClaim Provider Maintenance"
 And  I select Option "1" to navigate to "Pharmacy"
 And I select a pharamacy "<phy>" to navigate to Pharmacy Detail Page screen using option "<opt1>"
 Then I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen 
 
 Examples: 
 |phy      |opt1|
 |SRAHPHARM|2   |
 |SRAHPHARM|5   |
 
 Scenario Outline: Verify the system standard help text to the Suppress Update flag on the Pharmacy Detail screen (RCPHA027I).
 Given I am on RxClaim PlanAdministrator Menu
 And I select Option "CCTC00" to navigate to "RxClaim Help Desk - Full Inquiry Menu"
 When I select Option "6" to navigate to "RxClaim Provider Inquiry"
 And  I select Option "1" to navigate to "Pharmacy"
 And I select a pharamacy "<phy>" to navigate to Pharmacy Detail Page screen in "CCTC00" using option "<opt1>"
 Then I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen 
 And I go back to RxClaim PlanAdministrator Menu
 Examples: 
 |phy      |opt1|
 |SRAHPHARM|5   |
 
 
  Scenario Outline: Verify the system standard help text to the Suppress Update flag on the Pharmacy Detail screen (RCPHA027I).
 Given I am on RxClaim PlanAdministrator Menu
 And I select Option "CCTB00" to navigate to "RxClaim Provider Maintenance Menu"
 When I select Option "4" to navigate to "RxClaim Provider Maintenance"
 And  I select Option "1" to navigate to "Pharmacy"
 And I select a pharamacy "<phy>" to navigate to Pharmacy Detail Page screen in "CCTB00" using option "<opt1>"
 Then I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen 
 And I go back to RxClaim PlanAdministrator Menu
 Examples: 
 |phy      |opt1|
 |SRAHPHARM|5   |
 