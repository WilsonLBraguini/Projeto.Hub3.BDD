Feature: Realizar Login
  Como usuario 
  Quero poder efetuar login no website advantageonlineshopping
  Para poder realizar compras
  
Scenario: Deve efetuar login com sucesso
  Given que estou acessando a aplicacao
  When informo o usuario "Wilson"
  And a senha "Rsi12345"
  And selecionar entrar
  Then visualizo a pagina inicial


#Scenario: Nao deve efetuar login de usuario nao cadastrado
  #Given que estou acessando a aplicacao
  #When informo o usuario "Zetineciv"
  #And a senha "Rsi358269"
  #And selecionar entrar
  #Then sou notificado que usuario ou senha sao incorretos
    
