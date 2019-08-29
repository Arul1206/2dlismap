@tag
Feature: Add traiff
  I want to use this template for my feature file

  @tag1
  Scenario: Add traiff plan
    Given User should launch the browser
    And User click add tariff plan
    When User provide valid details
    | 5000 | 25 | 50 | 100 | 1.00 | 5.00 | 25 |
    | 15000 | 25 | 50 | 100 | 1.00 | 10.00 | 75 |
    Then Verify the output