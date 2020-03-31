Feature: Consulta por filtro
  Como usuario 
  Gostaria de poder realizar consultas por filtro 
  Para poder realizar compras

#Cenário Positivo

Scenario: Deve realizar consulta por filtro com sucesso
  Given que estou acessando a aplicacao
  When  seleciono o icone lupa
  And   abrir o campo para pesquisa
  And   informo o produto "LAPTOPS"
  And   confirmo a pesquisa
  Then  visualizo o produto procurado
 
#Cenário Negativo  
 
Scenario: Nao deve realizar consulta de produto inexistente
  Given que estou acessando a aplicacao
  When  seleciono o icone lupa
  And   abrir o campo para pesquisa
  And   informo o produto "BIKE"
  And   confirmo a pesquisa
  Then  sou notificado que nao existe resultado para pesquisa
