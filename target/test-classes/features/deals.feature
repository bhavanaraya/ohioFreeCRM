Feature: deal data creation
Scenario: rediff data table

Given user is on base page1

And navigate to the "https://www.rediff.com/" base page1
And click on sign in button in base page to land on login page1
When user enters the username and password and log in1
|bhavana.rayabandi	|Cabcar#0987	|
Then verify the user successfully logged in and navigated to home page1
Then click on Address Book button
Then click on new contact and moves to new contatcs page
Then user enter details for contact
|saraswathi		|saraswathi@gmail.com 	|CU Denver	|personal	|
#|siri			|siri@gmail.com			|US company	|personal	|
Then close the browser

