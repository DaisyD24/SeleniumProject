Feature: Automate Leaftap Application

Scenario: TC001_LogIn and LogOut

Given Launch ChromeBrowser and Load URL
And Enter Username as DemoCSR
And Enter Password as crmsfa
When Click the LogIn button
Then It's navigated HomePage
And Click the LogOut button
And Close browser

Scenario: TC002_LogIn and LogOut for Failure

Given Launch ChromeBrowser and Load URL
And Enter Username as Daisy
And Enter Password as crmsfa
When Click the LogIn button
Then It's navigated same Page
But Verify error message
And Close browser