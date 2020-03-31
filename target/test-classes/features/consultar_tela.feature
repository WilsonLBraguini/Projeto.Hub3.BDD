Feature: Consulta tela principal
  Como usuario 
  Gostaria de realizar consultas atraves da tela principal
  Para poder realizar compras

#Cen�rio Positivo

Scenario: Deve realizar consulta atraves da tela principal
  Given que estou acessando a aplicacao
  When  seleciono um link especifico
  Then  visualizo o produto selecionado
  
 #Cen�rio Negativo  
 
Scenario: Nao realizar consulta atraves da tela principal
  Given que estou acessando a aplicacao
  When  seleciono uma imagem que nao seja um link
  Then  nao sera exibido nenhum resultado 
