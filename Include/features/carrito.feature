Feature: Cart operations in Linio Web
  To be able to buy in the store
  As new user 
  I want to performs the cart operations

  Scenario: Add products  to cart
    Given the user has opened the website
    When he selects the category
      | categoria | subcategoria | subitem        | producto                          |
      | Moda      | Hombres      | Zapatos Hombre | Tenis New Balance Hombre Moda 574 |
    When he adds a products to the cart
      | cantidad | talla |
      |        2 |    43 |
    Then he sould see added product in the cart
		