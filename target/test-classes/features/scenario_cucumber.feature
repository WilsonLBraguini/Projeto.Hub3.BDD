Feature: Cadastro
  Como usuario
  Quero poder efetuar um cadastro no website advantageonlineshopping
  Para poder realizar compras
  
Scenario: Deve realizar um cadastro com sucesso
  Given que apos preencher todos os campos
  When clicar no botao register
  Then o cadastro deve ser realizado com sucesso
  
Scenario: Nao deve realizar um cadastro 
  Given que apos preencher todos os campos
  When  um usuario ja cadastrado no sistema
  Then  o cadastro nao deve ser realizado

