@regression @smoke
Feature: /products resource

  Search registered products, or as Administrator, manage the products

  Scenario: Create a product
    Given I have access to the ServeRest
    When I send a POST request to the products endpoint with a valid product
    Then The system should create a new Product
    And I should receive on the answer the Product ID
