Feature: Add job category
	//@Valid
Scenario Outline: Add valid job category
Given User navigate to job category
When User enter <jobCategory>
And User clicks on save button
Then User redirected to job category page

Examples: 
|jobCategory|
|Tester1233|
|Tester2333|

      