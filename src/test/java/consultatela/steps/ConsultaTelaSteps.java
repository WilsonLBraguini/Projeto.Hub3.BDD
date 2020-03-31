package consultatela.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConsultaTelaSteps {
	private WebDriver driver;
	
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

	@When("^seleciono um link especifico$")
	public void selecionoUmLinkEspecifico() throws Throwable {
		driver.findElement(By.id("tabletsImg")).click();
	}

	@Then("^visualizo o produto selecionado$")
	public void visualizoOProdutoSelecionado() throws Throwable {
		//driver.close();
	}

	@When("^seleciono uma imagem que nao seja um link$")
	public void selecionoUmaImagemQueNaoSejaUmLink() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"img-special-offer\"]/figure/img")).click();
	}

	@Then("^nao sera exibido nenhum resultado$")
	public void naoSeraExibidoNenhumResultado() throws Throwable {
		//driver.close();
	}


}
