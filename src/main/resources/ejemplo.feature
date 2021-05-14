#Languaje:es
@smok
Feature: Nombre del conjunto de casos de pruebas
  
  Descripción general

  Background: Nombre del background
    Breve descripción

    Given Una calculada

  Scenario: División por 0
    En esta prueba se validara que la calculadora muestre un error al dividir por cero

    Given el numero A igual a 5 y el numero B igual a 0
    When el usuario divide con la calculadora a sobre b
    Then el sistema muestra un error aritmético

  Scenario Outline: El usuario realiza una suma
    Given el numero a igual a "<numeroA>" y el numero b igual a "<numeroB>"
    When el usuario suma con la calculadora a con b
    Then el usuario valida que el resultado es "<resultado>"

    Examples: 
      | numeroA | numeroB | resultado |
      |       4 |       5 |         9 |
      |     -20 |       5 |       -15 |
      |      20 |      14 |        34 |

  Scenario: El usuario resta
    El usuario valida la resta y que la calculadora guarde la lista de resultados

    Given la lista de numero de a y de b
      |  5 | 4 |
      | 10 | 2 |
    When reste todos los valores de la lista
    Then valide que los resultados sean
      | 1 |
      | 8 |
      
Feature: Prueba de inscripcion
      En esta prueba se desea validar la inscripción exitosa de los usuario al foro

      Scenario: Inscripción de foro éxitosa
      Esta es la forma incorrecta de escribir escenarios de prueba
      
      Given el nombre "Laura Cepero"
      Given el correo del participante "cepero@mail.com"
      Given la profesión "Junior Operations Manager"
      When el usuario abre el navegador
      And el usuario da click en la caja de texto de la url
      And el usuario se escribe la pagina web y se dirige al boton ir
      And el usuario da click al boton ir
      Then el usuario valida que la pagina cargue
      When el usuario da click la caja de texto nombre
      And el usuario ingresa el nombre
      And el usuario da click en la caja de texto email
      And el usuario ingresa el texto
      And el usuario da click en la caja de texto profesión
      And el usuario ingresa la profesión
      And el usuario da click en el boton Registrar
      And el usuario espera 10 segundos a que cargue la pagina
      And el usuario valida que aparezca un letrero con el mensaje inscripción exitosa
      
     Feature: Prueba de inscripción foro
      En esta prueba se desea validar con datos validos la inscripción
      de usuarios a un foro a través de la página web.
      
      Background: Precondición
      Given el navegador con la página abierta de la aplicación a probar
      
      Scenario: Inscripción éxitosa al foro
      
      Given el usuario "Laura Cepero" con el correo "cepero@mail.com" y la profesión "Junior Operations Manager"
      When el usuario ingresa los datos
      And envia el formulario
      Then el usuario valida que aparezca el mensaje "inscripción éxitosa"
      
      