@US4567 @Login

Feature: OptumRx Home PAge

  As an Optum employee
  I want to browse the OptumRX  home site
  to check if can choose a team to join

  
@CI @Smoke @Regression
  Scenario: Vist  the OptumRx homepage 
    Given I navigate to OptumRx site
    Then the title of the home page  is "OptumRxHome"
    
    
@CI @P1
  Scenario: Verify the Welcome label 
    Given I navigate to OptumRx site
       
    Then the "Welcome to OptumRx" label is displayed
    
    
  @not_ready
  
   Scenario: Verify the Welcome label 
    Given I navigate to OptumRx site an login
       
    Then Welome Screen is displayed
    
  #@UIdata
    #Scenario Outline: Check the About us page
    #Given I navigate to demo site
    #When i click on "<link>"
    #Then the title of the page "About us | Demoqa"
    #And  the "<Registration>" button is displayed
    #
#		 Examples:
#		
#		| link        | Registration |
#		
#		| Aboutus     | RegisterME |



    