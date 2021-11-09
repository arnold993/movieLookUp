Feature: I want to remove "Nemo the comeback"
  As a staff member, I want to remove a movie from the database so that it does not show up as a result

  Scenario: Delete movie from database
    Given that the movie I want to delete is "Nemo"
    When I try to delete the movie
    Then the film "Nemo" should not appear in the database