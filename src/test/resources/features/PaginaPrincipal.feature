Feature: Validar site da Wikipedia
  Scenario: Tela Inicial e de resultado de pesquisa
    Given abriu o site
    When preencheu o campo de busca com "Natal"
    And clicou na lupa da pesquisa
    Then mostrou o resultado da busca "Natal"
