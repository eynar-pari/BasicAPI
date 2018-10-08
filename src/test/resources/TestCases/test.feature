#Feature: User
#
#  @Regression @SmokeTest @BVT
#  Scenario Outline: title test case
#
#    Given I have an account created
#    And I have an account updated
#    And the account is administrator
#    When I set the [user] field with <user>
#    And I set the [pwd] field with <password>
#    And I click on [login] button
#    Then the main page should be displayed
#    And the login page should not be displayed
#
#    Examples:
#      | user  | password |
#      | admin | admin    |
#      | user1 | pwd1     |
#      | user2 | pwd2     |
#      | user3 | pwd3     |
#      | user4 | pwd4     |
#
#
#  @SmokeTest
#  Scenario: title test case2
#
#    Given I have an account created
#    And I have an account updated
#    And the account is administrator
#    When I set the [user] field with admin
#    And I set the [pwd] field with admin
#    And I click on [login] button
#    Then the main page should be displayed
#    And the login page should not be displayed
#
#
#Feature: Create Project with POST request
#
#  @Regression @Acceptance
#  Scenario: As client, I can send a POST request to create a project.
#
#    # Comentarios
#    Given I have a connection with Todo.Ly
#    When I send a POST request to projects.json end point with the json
#    """
#    {
#          "Content": "Eynar9999",
#          "Icon": 4
#    }
#    """
#    Then the response code should be 200
#    But the response code should be 200
#    And the response code should be 200
#
#
#
#Feature: Create Project with POST request
#
#  Background: common
#    Given I have a connection with Todo.Ly
#
#  @Regression @Acceptance
#  Scenario: scenario 1
#    When I send a POST request to projects.json end point with the json
#    """
#    {
#          "Content": "Eynar9999",
#          "Icon": 4
#    }
#    """
#    Then the response code should be 200
#
#  @Regression @Acceptance
#  Scenario: scenario 2
#    When I send a POST request to projects.json end point with the json
#    """
#    {
#          "Content": "Eynar9999",
#          "Icon": 4
#    }
#    """
#    Then the response code should be 200
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
