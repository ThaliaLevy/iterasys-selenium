$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PaginaPrincipal.feature");
formatter.feature({
  "line": 1,
  "name": "Validar site da Wikipedia",
  "description": "",
  "id": "validar-site-da-wikipedia",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1687155300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Tela Inicial e de resultado de pesquisa",
  "description": "",
  "id": "validar-site-da-wikipedia;tela-inicial-e-de-resultado-de-pesquisa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "abriu o site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "preencheu o campo de busca com \"Natal\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clicou na lupa da pesquisa",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "mostrou o resultado da busca \"Natal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PaginaPrincipal.abriuOSite()"
});
formatter.result({
  "duration": 2220045300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Natal",
      "offset": 32
    }
  ],
  "location": "PaginaPrincipal.preencheuOCampoDeBuscaCom(String)"
});
formatter.result({
  "duration": 115568900,
  "status": "passed"
});
formatter.match({
  "location": "PaginaPrincipal.clicouNaLupaDaPesquisa()"
});
formatter.result({
  "duration": 1698164900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Natal",
      "offset": 30
    }
  ],
  "location": "PaginaPrincipal.mostrouOResultadoDaBusca(String)"
});
formatter.result({
  "duration": 4118600,
  "status": "passed"
});
formatter.after({
  "duration": 16000,
  "status": "passed"
});
});