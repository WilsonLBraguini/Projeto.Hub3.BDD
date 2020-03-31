package consultafiltro.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ConsultaFiltroSteps {
	private WebDriver driver;
	private WebElement consultaPorFiltro;
	
	@Given("^que estou acessando a aplicacao$")
	public void queEstouAcessandoAAplicacao() throws Throwable {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
	}

	@When("^seleciono o icone lupa$")
	public void selecionoOIconeLupa() throws Throwable {
		driver.findElement(By.id("menuSearch")).click();
	}

	@When("^abrir o campo para pesquisa$")
	public void abrirOCampoParaPesquisa() throws Throwable {
		consultaPorFiltro = driver.findElement(By.id("autoComplete"));
	}

	@When("^informo o produto \"([^\"]*)\"$")
	public void informoOProduto(String arg1) throws Throwable {
		consultaPorFiltro.sendKeys(arg1);
	}

	@When("^confirmo a pesquisa$")
	public void confirmoAPesquisa() throws Throwable {
		consultaPorFiltro.sendKeys(Keys.ENTER);
		
	}

	@Then("^visualizo o produto procurado$")
	public void visualizoOProdutoProcurado() throws Throwable {
		//driver.close();
	}

	@Then("^sou notificado que nao existe resultado para pesquisa$")
	public void souNotificadoQueNaoExisteResultadoParaPesquisa() throws Throwable {
		//driver.close();
	}
	


}
