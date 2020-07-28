@regression
    Feature: User should able to register successfully,
           so that user can use all user functionality on my website


@trail
    Scenario: User is should able to register successfully,
  Given user is on homepage
            When user click on register button
            And user enter all required registration details
            And  user clicks on register-submit button
            Then user should able to register successfully
