$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/deals.feature");
formatter.feature({
  "name": "deal data creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "rediff data table",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on base page1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.user_is_on_base_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the \"https://www.rediff.com/\" base page1",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.navigate_to_the_something_base_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in button in base page to land on login page1",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.click_on_sign_in_button_in_base_page_to_land_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username and password and log in1",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.user_enters_the_username_and_password_and_log_in(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027login1\u0027]\"}\n  (Session info: chrome\u003d96.0.4664.93)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-LNB1H88U\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.93, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\sivaj\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59801}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 44a63510c5eabe674eddc4ade393704d\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027login1\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy20.findElement(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:194)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.sendKeys(Unknown Source)\r\n\tat com.wbl.pages.LoginPage.login(LoginPage.java:67)\r\n\tat stepDefinitions.ContactsStepDef.user_enters_the_username_and_password_and_log_in(ContactsStepDef.java:56)\r\n\tat ✽.user enters the username and password and log in1(file:///C:/Users/sivaj/eclipse-workspace/FreeCRMTestAutomation/src/test/java/features/deals.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify the user successfully logged in and navigated to home page1",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.verify_the_user_successfully_logged_in_and_navigated_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Address Book button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.click_on_address_book_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on new contact and moves to new contatcs page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.click_on_new_contact_and_moves_to_new_contatcs_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter details for contact",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.user_enter_details_for_contact(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ContactsStepDef.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});