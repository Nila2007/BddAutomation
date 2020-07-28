$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Test/Resources/features/registration.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to register successfully,",
  "description": "     so that user can use all user functionality on my website",
  "id": "user-should-able-to-register-successfully,",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 11128570700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User is should able to register successfully,",
  "description": "",
  "id": "user-should-able-to-register-successfully,;user-is-should-able-to-register-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestDefts.user_is_on_homepage()"
});
formatter.result({
  "duration": 1928342800,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_click_on_register_button()"
});
formatter.result({
  "duration": 1421920800,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_enter_all_required_registration_details()"
});
formatter.result({
  "duration": 1498957900,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_clicks_on_register_submit_button()"
});
formatter.result({
  "duration": 1634751700,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 65345600,
  "status": "passed"
});
formatter.after({
  "duration": 200400,
  "status": "passed"
});
});