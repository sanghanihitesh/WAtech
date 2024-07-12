Feature: Sports Functionality
  As a User I want to verify Sports Functionality

  Background: Given I am On Homepage

  @regression
  Scenario: I want to explore Sports Tab
    When    I click on Sports New Link
    And     I click on Explore tab
    And     I click on Tennis button
    Then    I verify Tennis Text on page


