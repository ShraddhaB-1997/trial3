Feature: Testing Login

Scenario Outline: Login Process
Given User opens IE and launches the application
When user clicks on sign in button
And user enters the user name as "<userName>" in username field
And user enters the password as "<password>" in password field
And user clicks on login button
Then login is succesful

Examples: 
|userName|password|
|Shraddha123|TestMe123|
