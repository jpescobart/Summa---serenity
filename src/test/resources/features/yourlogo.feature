#Author: hamtont@gmail.com
@tag
Feature: Cracion de novedades ocasionales y fijas para un colaborador registrado.
 

    @Novedades @Ocasionales
      Scenario: Verificar que se permita crear una novedad ocasional para un cliente en especifico
      Given  que  ingreso al portal de novedades de Summa
      When   seleccion un cliente e ingresos todos los datos para una novedad ocasional
      Then   el sistema permite enviar la novedad generada correctamente

  @Novedades @Fijas
  Scenario: Verificar que se permita crear una novedad fija para un cliente en especifico
    Given  que  ingreso al portal de novedades de Summa
    When   seleccion un cliente e ingresos todos los datos para una novedad fija
    Then   el sistema permite enviar la novedad generada correctamente

  @Novedades @FijasEpeciales
  Scenario Outline: Verificar que se permita crear una novedad fija especial para un cliente en especifico
    Given  que  ingreso al portal de novedades de Summa
    When   seleccion un cliente e ingresos todos los datos para una novedad fija especial con "<accion>"
    Then   el sistema permite enviar la novedad generada correctamente
    Examples:
    |      accion   |
    |        1      |
    |        2      |
    |        3      |
    |        4      |
    |        5      |


  @Novedades @FijasEspeciales
  Scenario: Verificar que se permita crear varias novedades fijas especiales para un cliente en especifico
    Given  que  ingreso al portal de novedades de Summa
    When   seleccion un cliente e ingresos todos los datos para una novedad fija especial
    And    genero varias novedades espciales
    Then   el sistema permite enviar las novedades generadas correctamente