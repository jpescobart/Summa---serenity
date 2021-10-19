#Author: hamtont@gmail.com
@tag
Feature: Cracion de usuarios externos.


  @UsuarioExterno
  Scenario: Verificar que se permita crear un usuario externo en especifico
    Given  que  ingreso al portal de novedades de Summa
    When   ingreso al modulo usuarios externos
    And    ingreso todos sus datos correctamente
    Then   el sistema permite crear un usuario externo