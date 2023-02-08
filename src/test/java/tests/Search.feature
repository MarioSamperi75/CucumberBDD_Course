@all
Feature: Search functionality

#This is a comment

Background:
Given User opens the Application

@search @validproduct @smoke @regression
Scenario:  Search for a valid product
When User enters valid product into Search field
And User clicks on Search button
Then Valid Product should get displayed in search results

@search @nonexistingproduct @regression
Scenario:  Search for a non-existing product
When User enters non-existing product into Search field
And User clicks on Search button
Then Proper text informing the User about not product matching should be displayed

@search @noproduct @regression
Scenario:  Search without providing ani product
When User do not enter any product into Search field
And User clicks on Search button
Then Proper text informing the User about not product matching should be displayed