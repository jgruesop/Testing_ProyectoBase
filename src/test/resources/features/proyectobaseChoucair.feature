# Autor: Jhonatan Grueso

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Michell wants to learn automation at the academy Choucair
    | strUser  | strPassword   |
    | SuUsuario| SuContraseña  |
    When he search for the course on the Choucair academy platform
    | strCourse                 |
    | ValorABuscar              |
    Then he finds the course called
    | strCourse                 |
    | ValorABuscar              |
