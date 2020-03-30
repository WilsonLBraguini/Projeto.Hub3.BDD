package br.com.rsinet.steps;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {
	
	//Cadastro Positivo
	
	@Given("^que apos preencher todos os campos$")
	public void que_apos_preencher_todos_os_campos() throws Throwable {


	}

	@When("^clicar no botao register$")
	public void clicar_no_botao_register() throws Throwable {
		
	}

	@Then("^o cadastro deve ser realizado com sucesso$")
	public void o_cadastro_deve_ser_realizado_com_sucesso() throws Throwable {
	  
	}
	
	//Cadastro Negativo
	
	@When("^um usuario ja cadastrado no sistema$")
	public void um_usuario_ja_cadastrado_no_sistema() throws Throwable {
	    
	}

	@Then("^o cadastro nao deve ser realizado$")
	public void o_cadastro_nao_deve_ser_realizado() throws Throwable {
	    
	}
	
	


}
