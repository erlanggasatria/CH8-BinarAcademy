@login @regression
Feature: Login

  @positive-test @smoke
  Scenario: Login with valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage

  @negative-test
  Scenario: Login with invalid username and password
    Given user is on login page
    And user input username with "dewagde"
    And user input password with "erlanggasatria"
    When user click on login button
    Then show error massage
