@US1234 @Login

Feature: Verify MyUHC Page

  As a webuser
  I want to browse the myUHC  site
  to check if can register as a new user

  
@Sanity
  Scenario: Vist  the myUHC homepage 
    Given I navigate to the website
    Then the page title is "LinkedMED"
    
  
    
    
    
@Smoke
 Scenario: Check the Registration at About us page
  GivenI navigate to the website
    
  Then the home Page displayes "LinkedMED" button
   

    
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



    