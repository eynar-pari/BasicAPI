Feature: Login

   @Owasp
  Scenario: As client, I want to set user and  password so that to enter to the app

    Given I go to http://todo.ly/
    When I click on Login Link on Main Page
    And I set email Field with 'email.email@gmail.com' on Login Modal
    And I set password Field with 'P@SSWORD' on Login Modal
    Then I click on Login Button on Login Modal
