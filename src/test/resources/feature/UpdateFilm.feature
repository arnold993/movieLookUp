Feature: Can I change the description
  As a staff member, I want to update the description of the movie "Nemo the come back" so people understand it

  Scenario: Leave review on a movie
    Given I am on the selected movie
    When I write a review on the title "Avengers Endgame Part 3"
    Then I should see the review added to the title "Avengers Endgame Part 3"