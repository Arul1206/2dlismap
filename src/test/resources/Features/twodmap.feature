@tag
Feature: Add traiff
  I want to use this template for my feature file

  @tag1
  Scenario: Add traiff plan
    Given User should launch the browser
    And User click add tariff plan
    When User provide valid details
    	|Rental | Localmins | Internationalmins | FreeSMS |LocalChrgs | InternationalChrgs | SMSChgs | 
      | 4 | 25 | 50  | 100 | 25 | 50 | 10 |
      | 4 | 25 | 50  | 100 | 25 | 70 | 20 |