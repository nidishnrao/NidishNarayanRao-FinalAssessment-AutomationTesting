Feature: Orange HRM Test Case

Scenario: Verify user is able to login with valid user id and password
	Given browser is open and application is in login page
	When user enters user name and password
	Then home page is displayed

Scenario: Verify user is able to apply leave
	Given browser is open and application is in login page
	When user enters user name and password
	Then home page is displayed
	Then apply leave

Scenario: Verify method over loading for searching 
	Given browser is open and application is in login page
	When user enters user name and password
	Then home page is displayed
	Then search employee

