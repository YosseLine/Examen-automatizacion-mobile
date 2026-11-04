
@LoginTest
 Feature: Sauce Labs App

   @Login1
   Scenario: Login Ok
     Given ingreso al aplicativo de SauceLabs
     When inicio sesión con mi usuario "standard_user" y clave "secret_sauce"

     @Login2
   Scenario: Login 2 Ok
     Given ingreso al aplicativo de SauceLabs
     When ingreso el usuario "standard_user"
     And ingreso la clave "secret_sauce"
     And hago clic en LOGIN
     Then valido el login OK