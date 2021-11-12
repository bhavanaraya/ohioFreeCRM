Feature: Login into application

Scenario Outline: positive test validating login
Given intialiize the browser with chrome
And navigate to the "https://www.rediff.com/" base page 
And click on sign in button in base page to land on login page
When user enters the <username> and <password> and log in
 
Then verify the user successfully logged in and navigated to home page

Examples:
|username			|password		|
|bhavana.rayabandi	|Cabcar#0987	|
#|siri				|siriosd		|
 