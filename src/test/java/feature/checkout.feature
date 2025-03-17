Feature: checkout

  Scenario: validate user is able to checkout
    Given user is in the cart
    When user clicks checkout button
    And checkout information page is filled
    Then user can finish trasaction