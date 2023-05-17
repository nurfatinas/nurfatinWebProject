Feature: Login 
Scenario Outline: Login with valid credentials

Given User navigate to login page
When User enter <username> and <password>
And User clicks on Login button
Then User redirected to homepage

Examples:
|username|password|
|Admin|hUKwJTbofgPU9eVlw/CnDQ==|