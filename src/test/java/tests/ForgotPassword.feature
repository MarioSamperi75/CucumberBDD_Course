Feature: Forgot Password Functionality

Scenario: Reset Password on forgetting it
Given User opens the Application
When User clicks on MyAccount
And Selects login option
And Clicks on Forgotten Password option
And Enters valid email address
And Clicks on Continue button
Then Proper confirmation message should be displayed
