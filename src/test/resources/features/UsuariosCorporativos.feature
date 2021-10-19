#Author: hamtont@gmail.com
@tag
Feature: Cracion de usuarios corporativos.


  @UsuarioCorporativos
  Scenario: Verificar que se permita crear un usuario corporativos en especifico
    Given  que  ingreso al portal de novedades de Summa
    When   ingreso al modulo usuarios corporativos
    And    ingreso todos sus datos correctamente para el usuario corporativo
    Then   el sistema permite crear un usuario corporativos