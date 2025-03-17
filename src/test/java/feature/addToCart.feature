Feature: Add to cart

  Scenario: validate user is able to view products
    Given user has successfully loged in
    When user clicks add to cart
    And user is able to view cart
    Then user can see added item in the cart