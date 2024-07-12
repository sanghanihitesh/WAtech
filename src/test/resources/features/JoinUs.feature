Feature:Register Functionality
  AS a User I want to verify Register or JoinUs features

  Background: Given I am on HomePage

  @smoke
  Scenario: AS a User I can Register successfully
    When I click On JoinUs Button
    And I enter Email
    And I select Title
    And I enter FirstName
    And I enter SurName
    And I enter DateOfBirth
    And I select Gender
    Then I click on nextButton


