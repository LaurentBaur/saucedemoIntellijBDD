@Login
Feature: Acessar site
  Como usuário do site SauceDemo
  Quero informar dados
  Para poder acessar o site

Background: Acessar site sauce demo
Given acesse o site do sauce demo


  @positivo
  Scenario: Realizar login com sucesso
    When preencher dados válidos
    And clicar no botão login
    Then logado com sucesso

  @negativo @bloqueado
  Scenario: Realizar login com usuário bloqueado
    When preencher dados com usuário bloqueado
    And clicar no botão login
    Then recebo mensagem de erro

  @negativo
  Scenario: Realizar login em branco
    When não preencher os dados de usuário
    And clicar no botão login
    Then recebo mensagem de dados em branco




