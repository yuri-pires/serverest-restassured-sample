@regression @smoke
Feature: /products resource

  Search registered products, or as Administrator, manage the products

  Scenario: Create a product
    Given I have access to the ServeRest
    When I Send a POST request to the products endpoint with a valid Product object
    Then System should create a new Product
    And I should receive on the answer the Product ID