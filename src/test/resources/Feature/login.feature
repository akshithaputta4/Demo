Feature: Validating the product

  Scenario: Show the product
    Given I open the URL
    When I pass the string "belt"
    Then The current URL should contain "belt"

