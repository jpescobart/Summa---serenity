#Author: hamtont@gmail.com
@tag
Feature: Cracion de grupos de novedades.


  @GruposNovedades @Ocasionales
  Scenario: Verificar que se permita crear una grupo de novedades en especifico sin un usuario asignado
    Given  que  ingreso al portal de novedades de Summa
    When   ingreso al modulo grupo de novedades
    And    ingreso todos sus datos correctamente para crear el grupo de novedad
    Then   el sistema permite crear un grupo de novedades


  @GruposNovedades @Ocasionales
  Scenario: Verificar que se permita crear una grupo de novedades en especifico con un usuario asignado
    Given  que  ingreso al portal de novedades de Summa
    When   ingreso al modulo usuarios corporatavivos
    And    creo un usuario externo
    And    ingreso al modulo grupo de novedades
    And    ingreso todos sus datos correctamente para crear el grupo de novedad par el usuario creado
    Then   el sistema permite crear un grupo de novedades asociado al usuario externo creado