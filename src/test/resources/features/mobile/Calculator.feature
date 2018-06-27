@Calc
Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself



@CalcTest
Scenario Outline: Adding two number

Given I open calcutaor 
	 When I add "<Number1>" and "<Number2>"
   Then sum of them should be displayed
   
Examples:
    | Number1								| Number2 |
    | 5	                    | 7       |
 

    
       