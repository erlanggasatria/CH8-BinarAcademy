@Sorting @regression
  Feature: Sorting

    Scenario: sorting price from low to high
      Given User Success login with valid username "standard_user" and password "secret_sauce"
      And user is on homepage
      And click icon sorting
      When click choice filter low to high



