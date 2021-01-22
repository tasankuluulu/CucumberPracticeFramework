$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "login test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.syntax.stepDefinitions.loginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "varify welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.syntax.stepDefinitions.loginStepDefinitions.varify_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});