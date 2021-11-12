$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "Login into application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "positive test validating login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "intialiize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate to the \"https://www.rediff.com/\" base page",
  "keyword": "And "
});
formatter.step({
  "name": "click on sign in button in base page to land on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the \u003cusername\u003e and \u003cpassword\u003e and log in",
  "keyword": "When "
});
formatter.step({
  "name": "verify the user successfully logged in and navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "bhavana.rayabandi",
        "Cabcar#0987"
      ]
    }
  ]
});
formatter.scenario({
  "name": "positive test validating login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "intialiize the browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.intialiize_the_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the \"https://www.rediff.com/\" base page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.navigate_to_the_something_base_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in button in base page to land on login page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.click_on_sign_in_button_in_base_page_to_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the bhavana.rayabandi and Cabcar#0987 and log in",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.user_enters_the_and_and_log_in(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user successfully logged in and navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinition.verify_the_user_successfully_logged_in_and_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});