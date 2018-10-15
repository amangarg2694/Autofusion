 Feature: Verify the Update ‘S’ Indicator to Field Type in Pharmacy Detail Screen1
 As a RxClaim User I want to Verify Update ‘S’ Indicator to Field Type
 
  Scenario Outline: Verify the system standard help text to the Suppress Update flag on the Pharmacy Detail screen (RCPHA027I).
 Given I am on "RxClaim Provider Maintenance Menu" using "CCTB00"
 When I select Option "4" to navigate to "RxClaim Provider Maintenance"
 And  I select Option "1" to navigate to "Pharmacy"
 And I select a pharamacy "<phy>" to navigate to Pharmacy Detail Page screen in "CCTB00" using option "<opt1>"
 Then I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen 
 And I go back to RxClaim PlanAdministrator Menu
 
 Examples: 
 |phy      |opt1|
 |SRAHPHARM|5   |
 |SRAHPHARM|2   |
 
 Scenario Outline: Verify the system standard help text to the Suppress Update flag on the Pharmacy Detail screen (RCPHA002I)
 Given  I am on RxClaim PlanAdministrator Menu
 When I select Option "17" to navigate to "RxAuth Main Menu"
 And I select Option "1" to navigate to "RxAuth Request Menu"
 And I select Option "3" to navigate to "Request"
 And I press "F16" Key 
 And I select a pharamacy "<phy>" to navigate to Request Detail Pagescreen using option "<opt1>"
 And I press "F4" Key on pharmacy Id to navigate to Pharmacy Detail Page 
 Then I validate the system standard help text to the Suppress Update flag  on the Pharmacy Detail screen
 And I go back to RxClaim PlanAdministrator Menu
 And I press "F3" Key 
 
 Examples: 
 |phy|opt1|
 |APHARM|5|