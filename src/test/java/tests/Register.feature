#As a registered user, 
#I want to login to the Application, 
#So that I can check my account details


Feature: User Registration

Background:
Given User navigates to Register Account page

Scenario: Register with mandatory fields
When User enters firstname "Mario" into the Firstname field
And Enters lastname "Samperi" into the Lastname field
And Enters email address "samperimario75@gmail.com" into the EmailAddress field
And Enters telephone 1234567890 into the Telephone field
And Enters password 123456 into the Password field
And Enters password 123456 into the Password Confirm field
And Selects Privacy Policy field
And Clicks on Continue button
Then Account should get successfully created


Scenario: Register with all fields
When User enters firstname "Mario" into the Firstname field
And Enters lastname "Samperi" into the Lastname field
And Enters email address "samperimario75@gmail.com" into the EmailAddress field
And Enters telephone 1234567890 into the Telephone field
And Enters password 123456 into the Password field
And Enters password 123456 into the Password Confirm field	
And Selects Privacy Policy field
And Clicks on Continue button
And Select Yes for Newsletter
Then Account should get successfully created


Scenario: Register without providing any fields
When User do not enter details into any fields
And Clicks on Continue button
Then Warning message should displayed for the mandatory fields


Scenario: register with duplicate email address
When User enters firstname "Mario" into the Firstname field
And Enters lastname "Samperi" into the Lastname field
And Enters email address "existingEmail@gmail.com" into the EmailAddress field
And Enters telephone 1234567890 into the Telephone field
And Enters password 123456 into the Password field
And Enters password 123456 into the Password Confirm field	
And Selects Privacy Policy field
And Clicks on Continue button
And Select Yes for Newsletter
Then Warning message informing the User about duplicate email should be displayed

