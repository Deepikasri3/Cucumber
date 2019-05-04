Feature: Amazon application login functionality testing
This feature includes test cases such as login valid username and password.. etc

Scenario: Login the application with valid username and password
Given user should be in Amazon Home page
When user mouse hover to signIn button in the Header
And user click on signin button in Ajax call
And user enter the email/mobile number in the emailid field
And user enter the password in the password field
And user click on logIn button