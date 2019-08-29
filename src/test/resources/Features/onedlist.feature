@tag
Feature: Generate the user Id
  I want to use this template for my feature file

  @tag1
  Scenario: User id details
    Given User should launch browser
    And User click add customer link
    When User will provide valid details
      | fname   | Arul           |
      | lname   | kumar          |
      | email   | arul@gmail.com |
      | address | Velacherry     |
      | Phno    |     9790043289 |
    Then To verified the customer id is displayed
