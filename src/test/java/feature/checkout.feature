Feature: checkout

  Scenario Outline: validate user is able to checkout
    Given user is in the cart
    When user clicks checkout button
    And checkout information page is filled with "<firstname>", "<lastname>" and "<zipcode>"
    Then user can finish transaction

    Examples:
      | firstname      | lastname     | zipcode |
      | standard_user  | secret_sauce | 3001    |