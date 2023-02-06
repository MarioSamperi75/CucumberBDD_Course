#As a registered user, 
#I want to login to the Application, 
#So that I can check my account details

Feature: User Login
Register User should be able to login to access account details

Scenario: Login with valid credentials
Given User navigates to Login page
When User enters valid email address "samperimario75@gmail.com"
And Enters valid password "*******"
And Clicks on Login button
Then User should login successfully

Scenario: Login with invalid credentials
Given User navigates to Login page
When User enters invalid email address "samperimario75dsafsads@gmail.com"
And Enters invalid password "dafsdfadsf"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with valid email address and invalid password
Given User navigates to Login page
When User enters invalid email address "samperimario75@gmail.com"
And Enters invalid password "dafsdfadsf"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login with invalid email address and valid password
Given User navigates to Login page
When User enters invalid email address "samperimario75fdadsf@gmail.com"
And Enters invalid password "********"
And Clicks on Login button
Then User should get a proper warning message

Scenario: Login without providing any credentials
Given User navigates to Login page
When User does not enter any credentials
And Clicks on Login button
Then User should get a proper warning message



