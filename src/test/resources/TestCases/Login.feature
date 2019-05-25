Feature: Login

  @Regression @Acceptance
  Scenario: As client, I can send a POST request to create a project.

    Given I Open OWASP ZAP tool
    And I start to record all request

    When I go to http://todo.ly/
    And I click on Login Link on Main Page
    And I set email Field with 'eynar.pari@gmail.com' on Login Modal
    And I set password Field with 'Control123!' on Login Modal
    And I click on Login Button on Login Modal

    Then I execute OWASP ZAP Vulnerability Attack
    And I generate the report for OWASPZ ZAP
