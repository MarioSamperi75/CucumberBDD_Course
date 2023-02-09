#As a registered user, 
#I want to login to the Application, 
#So that I can check my account details


# use @dev or @ignore or @wip tag to mark tests ypu wont skip to run tests
# names are conventrions
# (if a test is in progress, but not ready e.g.)
# then add a filter to the runner (see file)

#the commons tag on the top of feature
@all
Feature: User Login
Register User should be able to login to access account details

Background:
Given User navigates to Login page

@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And Enters valid password <password>
And Clicks on Login button
Then User should login successfully
Examples:
|email 										|password	|
|samperimario75@gmail.com	|123456		|
|mariosss@libero.it				|234567		|
|marios.samperi@vina.se		|345678		|

@login @invalidcredentials @smoke @regression
Scenario: Login with invalid credentials
When User enters invalid email address "samperimario75dsafsadsgmail.com"
And Enters invalid password "dfasdfdsa"
And Clicks on Login button
Then User should get a proper warning message

@login @validemailandinvalidpassword @regression
Scenario: Login with valid email address and invalid password
When User enters invalid email address "samperimario75gmail.com"
And Enters invalid password ""
And Clicks on Login button
Then User should get a proper warning message

@login @invalidemailandvalidpassword @regression
Scenario: Login with invalid email address and valid password
When User enters invalid email address "samperimario75fdadsfgmail.com"
And Enters invalid password ""
And Clicks on Login button
Then User should get a proper warning message

@login @nocredentials @regression
Scenario: Login without providing any credentials
When User does not enter any credentials
And Clicks on Login button
Then User should get a proper warning message



