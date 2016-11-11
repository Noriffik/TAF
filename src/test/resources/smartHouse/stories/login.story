Meta:
@flow

Narrative:
As a user
I can log in to the smart house
So that I can settings of application

Scenario: AC-1 Login screen
Given unregitered user is on default page of smart house site
When user navigates to login page
Then user sees a screen with the such elements: username (i.e. email) text field, password field, action button to submit credentials

Scenario: AC-2 Login (Happy Path)
Given user entered a valid <email> and <password> AND it's a valid employee ID
When user clicks Submit button
Then user is logged in
Examples:
|email               |password|
|admin@smarthouse.com|admin   |

Scenario: AC-3 Submit (Rainy day - user does not exist)
Given user entered an invalid <email> and <password> (e.g. user does not exist)
When user clicks Submit button
Then error message shown
And user remains on login page
Examples:
|email               |password|
|admin@smarthouse.com|admin   |
