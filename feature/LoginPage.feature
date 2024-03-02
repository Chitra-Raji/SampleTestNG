Feature: Login Page Execution

@tag1
Scenario: Username and password
Given Login to Application
When Enter the Username "AIITE"
And Enter the Password "AIITE@134"
And Enter the Login Button
Then Validate the home page

@tag2
Scenario: InValidUsername and password
Given Login to Application
When Enter the Username "AIITE"
And Enter the Password "AIITE@134"
And Enter the Login Button
Then Validate the home page

@tag1
Scenario: Username and InValidpassword
Given Login to Application
When Enter the Username "AIITE"
And Enter the Password "AIITE@134"
And Enter the Login Button
Then Validate the home page