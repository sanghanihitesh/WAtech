Feature: Login Functionality
  As a User I want to Login successfully

  Background: I am on Homepage

  @sanity
  Scenario Outline: Successful login with valid credentials
    When I click on Login Link
    And I enter "<email>"
    And I enter "<password>"
    And I click on Login button
    Then I should Login successfully

    Examples:
      | email              | password     |
      | hitu2005@gmail.com | Dhyaana0305@ |
