Feature: I want to remove "Nemo the comeback"
  As a staff member, I want to remove "Avengers Endgame part 3" from the database so then I can it does not appear

  Scenario: Delete "Nemo the comeback"
    Given That I deleted "Nemo the comeback"
    When I search for "Nemo the comeback"
    Then No result should appear