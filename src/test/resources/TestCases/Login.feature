Feature: Create Project with POST request

  Background: test.
    Given I have a connection with Todo.Ly

  @Regression @Acceptance @PositiveTest
  Scenario: As client I want to send a POST request So that create a project.
    When I send a POST request to projects.json end point with the json
    """
   {
          "Content": "MyCucumber5",
          "Icon": 1
   }
    """
    Then the response code should be 200
    And the response body contains
    """
    Test
    """


