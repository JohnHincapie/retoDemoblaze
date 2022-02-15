#language: en
Feature: Cart operations

  Scenario Outline: Add product
    Given that "User" has opened the ecommerce
    When he selects the product from the following section
      | category   | product   |
      | <category> | <product> |
    And he adds the product to the cart
    Then he should see the added product in the cart


    Examples:
      | category | product          |
      | Phones   | Nokia lumia 1520 |
      | Phones   | Iphone 6 32gb    |
      | Laptops  | Sony vaio i5     |
      | Laptops  | MacBook air      |
      | Monitors | Apple monitor 24 |
      | Monitors | ASUS Full HD     |