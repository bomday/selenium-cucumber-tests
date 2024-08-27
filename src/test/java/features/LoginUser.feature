Feature: Login User View

  Scenario: Validate user is able to login website
    Given user navigates to the login page
    When user successfully enters the log in details
    Then user should be able to view the product category page