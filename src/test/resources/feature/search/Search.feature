Feature: Search engine - title
  As a user I want to see search request as the search page title

  Background:
    Given I am on the Google search page

  @DEMO
  Scenario: Finding some cheese
    When I search for "Cheese"
    Then the page title should start with "cheese"

  @DEMO
  Scenario: Finding some wine
    When I search for "Wine"
    Then the page title should start with "wine"

#  @DEMO
#  Scenario Outline: Finding some food
#    Given users are in db:
#      | name | password |
#      | user | 123456   |
#      | adm  | qwerty   |
#    When I search for "<query>"
#    Then the page title should start with "<expected>"
#    Examples:
#      | query   | expected |
#      | Cheese! | cheese   |
#      | Wine    | wine     |