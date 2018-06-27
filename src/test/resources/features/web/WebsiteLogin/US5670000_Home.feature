@US4567 @Home

Feature: QADemo Titles

  As a webuser
  I want to browse the demoQA site
  to check if can register as a new user

  
@Sanity
  Scenario: Vist  the homepage 
    Given I navigate to demo site
    Then the title of the page "Demoqa | Just another WordPress site"
    
    
@Smoke
  Scenario: Check the Registration at About us page
    Given I navigate to demo site
    When i click on "Aboutus"
    Then the title of the page "About us | Demoqa"
    And  the "Registration" button is displayed
    
    
  
    
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



    