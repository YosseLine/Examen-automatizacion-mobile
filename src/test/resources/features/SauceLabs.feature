
@AppTest
Feature: Sauce Labs App
  @AddProductTest
  Scenario Outline: Validacion de productos agregados a la compra
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente
    Examples:
      | PRODUCTO                        | UNIDADES |
      | Sauce Labs Backpack     | 1                   |
      | Sauce Labs Bolt - T-Shirt | 1                   |
      | Sauce Labs Bike Light     | 2                   |