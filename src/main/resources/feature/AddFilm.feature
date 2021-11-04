Feature: Add new movie for the database
  As a staff member, I want to a new movie called "Nemo the come back" to the database, so people know about it

  Scenario: Add "Nemo the comeback" to the database
    Given I am on the form page
    And I fill all the fields
    When I select "add"
    Then I should be shown the movie added to the list

  Scenario: "Nemo the comeback" not added to the database
    Given I am on the search page
    When I search for "Nemo the comeback"
    Then I should be told "Movie not found"