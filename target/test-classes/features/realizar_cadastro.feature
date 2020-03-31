Feature: Realizar cadastro
  Como usuario 
  Quero poder realizar um cadastro no website advantageonlineshopping
  Para poder realizar compras

#Cenário Positivo

Scenario: Deve realizar cadastro com sucesso
  Given que estou acessando a aplicacao
  When  seleciono menu usuario
  And   seleciono o link criar nova conta
  And   informo o usuario "AnnaCau"
  And   informo o Email "anapaulacau@gmail.com"
  And   informo uma senha "Rsi67891"
  And   confirmo a senha "Rsi67891"
  And   informo o nome "Anna"
  And   informo o sobrenome "Cau"
  And   informo o telefone "936123612"
  And   seleciono o pais
  And   informo a cidade "Osasco"
  And   informo o endereco "Rua Antonio Peres Paniagua, 410 - Quitauna"
  And   informo o Estado "Sao Paulo"
  And   informo o codigo postal "06186-100"
  And   seleciono checkbox em concordo com as condicoes de uso e privacidade
  And   seleciono Registrar
  Then  visualizo a pagina inicial
  
  #Cenário Negativo 
  
 Scenario: Nao deve realizar cadastro de usuario ja cadastrado
  Given que estou acessando a aplicacao
  When  seleciono menu usuario
  And   seleciono o link criar nova conta
  And   informo o usuario "Wilson"
  And   informo o Email "wilson.braguini@rsinet.com.br"
  And   informo uma senha "Rsi12345"
  And   confirmo a senha "Rsi12345"
  And   informo o nome "Wilson"
  And   informo o sobrenome "Braguini"
  And   informo o telefone "912345678"
  And   seleciono o pais
  And   informo a cidade "Osasco"
  And   informo o endereco "Rua Antonio Peres Paniagua, 410 - Quitauna"
  And   informo o Estado "Sao Paulo"
  And   informo o codigo postal "06186-100"
  And   seleciono checkbox em concordo com as condicoes de uso e privacidade
  And   seleciono Registrar
  Then  sou notificado que o usuario ja existe 
