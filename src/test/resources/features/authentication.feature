Feature: Authentication to e-shop
  As an user
  I want to sign in to the application, so that I can continue shopping

  Background:
    Given Home page is opened
    When I click Sign in link in top menu


  Scenario: Authentication - positive flow
    And I fill login field "testUser1234@test.pl"
    And I fill password field "password12345"
    And I click Sign in button
    Then I can see page for authenticated user

 # Scenario: Email adreess is invalid
 #   And I fill login field "test"
 #   And I fill password field "passwordpassword"
 #   And I click Sign in button
 #   Then Error message is presented "Invalid email adress"

 # Scenario: Password is invalid
 #   And I fill login field "test"
 #   And I fill password field "1234"
 #   And I click Sign in button
 #   Then Error message is presented "Invalid password adress"

 # Scenario: Empty password
 #   And I fill login field "test"
 #  And I click Sign in button
 #   Then Error message is presented "Password is required"

  Scenario Outline: Authentication - Negative flow
    And I fill login field "<emailAddress>"
    And I fill password field "<password>"
    And I click Sign in button
    Then Error message is presented "<error Message>"
    Examples:
      | emailAddress | password | error Message |
      |              |          |An email adress is required               |
      |invalid       |11111     | Invalid email address.                   |
      |test.test.pl  |1111      |Invalid email address                     |
      |test@test.pl |           |Password is required                      |
      |test@test.pl |12356      |Authentication failed                     |
