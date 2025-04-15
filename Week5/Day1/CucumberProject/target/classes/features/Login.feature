Feature: Login functionality of Leaftaps application

Scenario: Login with Valid credentials
Given Launch the browser
And Load the url
And Enter the username as 'DemoCSR'
And Enter the password as crmsfa
When Click on the Login button
Then It should navigate to the next page

Scenario: Login with Invalid credentials
Given Launch the browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as crmsfa
When Click on the Login button
But It should throw the error message