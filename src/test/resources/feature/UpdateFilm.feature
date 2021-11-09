Feature: Updating the description of a movie
  As a staff member, I want to update the description of a so that it shows the correct information

  Scenario: Update description of a movie
    Given The the film named "Zorro Ark" has the wrong description
    When I update the description of the movie with title "Zorro Ark" to "legend of the wild west"
    Then the movie "Zorro Ark" should the description changed to "legend of the wild west"