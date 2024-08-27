Feature: New User View

  Scenario: Validate new user is able to go to the registration page
    Given user navigates to the login page
    When user clicks on new registration button
    Then user should be able to view the registration page