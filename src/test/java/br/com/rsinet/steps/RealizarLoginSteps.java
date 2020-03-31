
package br.com.rsinet.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RealizarLoginSteps {
	private WebDriver driver;
	
	@Given("^que estou acessando a aplicacao$")
	public void que_estou_acessando_a_aplicacao() throws Throwable {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuUser")).click();
	}

	@When("^informo o usuario \"([^\"]*)\"$")
	public void informo_o_usuario(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).sendKeys(arg1);
	}

	@When("^a senha \"([^\"]*)\"$")
	public void a_senha(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^selecionar entrar$")
	public void selecionar_entrar() throws Throwable {
		driver.findElement(By.id("sign_in_btnundefined")).sendKeys(Keys.ENTER);
	}

	@Then("^visualizo a pagina inicial$")
	public void visualizo_a_pagina_inicial() throws Throwable {
		String texto = driver.findElement(By.linkText("Wilson")).getText();
		Assert.assertEquals("Wilson", texto);
		//driver.close();
	}
	
	@Then("^sou notificado que usuario ou senha sao incorretos$")
	public void souNotificadoQueUsuarioOuSenhaSaoIncorretos() throws Throwable {
	    
	}
	
	
}