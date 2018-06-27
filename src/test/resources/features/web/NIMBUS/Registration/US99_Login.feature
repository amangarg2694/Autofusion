@US1234 @Login

Feature: QADemo Titles

  As a webuser
  I want to browse the demoQA site
  to check if can register as a new user

  

    
    
  
    
  @replacedata
    Scenario Outline: Check the About us page
    Given I navigate to demo site
    When i click on "<link>"
    Then the title of the page "About us | Demoqa"
    And  the "<Registration>" button is displayed
    
		 Examples:
		
		| link        | Registration |
		
		| LinkedMED     | RegistrationLink |
		
		
		 @replacedata
    Scenario Outline: Check now  the About us page
    Given I navigate to demo site
    When i click on "<link>"
    Then the title of the page "About us hello | Demoqa"
    And  the "<Registration>" button is displayed
    
		 Examples:
		
		| link        | Registration |
		
		| helosai     | RegistrationLink |



    