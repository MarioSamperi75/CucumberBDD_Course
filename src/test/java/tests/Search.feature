Feature: Search functionality

Scenario:  Search for a valid product
Given User opens the Application
When User enters valid product into Search field
And User clicks on Search button
Then Valid Product should get displayed in search results

Scenario:  Search for a non-existing product
Given User opens the Application
When User enters non-existing product into Search field
And User clicks on Search button
Then Proper text informing the User about not product matching should be displayed

Scenario:  Search without providing ani product
Given User opens the Application
When User do not enter any product into Search field
And User clicks on Search button
Then Proper text informing the User about not product matching should be displayed