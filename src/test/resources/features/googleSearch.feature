Feature: Google Search

  Background:
    Given Google page is opened
    When I click accept Accept all button

  Scenario: Search in google
    #Given Google page is opened
    #When I click accept Accept all button
    And I type in the search bar "Cucumber"
    Then Results will be desplayed


    Scenario Outline: Search in google with Scenario Outline
      #Given Google page is opened
      #When I click accept "Accept all"
      And I type in the search bar "<searchPhrase>"
      Then Results will be desplayed

      Examples:
        |searchPhrase|
        |Cucumber    |
        |Selenium    |
        |SDA academy |

      Scenario: No search phrase
        #Given Google page is opened
        #When I click accept "Accept all"
        And I click Enter button on keyboard
        Then Search results page is not presented



