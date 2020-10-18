Feature: feature to test calculator functionality 

Scenario: Validate Substraction is working 
	Given User is on online calculator page 
	When User click on first number 
	And User click on minus sign 
	And User click on second number 
	And User click on equal Sign 
	Then Answer should appear in answer box 
	
Scenario: Validate Substraction is working 
	Given User is on online calculator page 
	When User click on first number 
	And User click on division sign 
	And User click on second number 
	And User click on equal Sign 
	Then Answer should appear in answer box 
	
Scenario: Validate clear is working 
	Given User is on online calculator page 
	When User click on first number 
	And User click on Clear button 
	Then Answer should appear in answer box