package cadastro.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	private WebDriver driver;
	private WebElement loginModal;
	
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

	@When("^seleciono menu usuario$")
	public void selecionoMenuUsuario() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	}

	@When("^seleciono o link criar nova conta$")
	public void selecionoOLinkCriarNovaConta() throws Throwable {
		loginModal = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]"));
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
	}

	@When("^informo o usuario \"([^\"]*)\"$")
	public void informoOUsuario(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input")).sendKeys(arg1);
	}

	@When("^informo o Email \"([^\"]*)\"$")
	public void informoOEmail(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^informo uma senha \"([^\"]*)\"$")
	public void informoUmaSenha(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys(arg1);
	}

	@When("^confirmo a senha \"([^\"]*)\"$")
	public void confirmoASenha(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^informo o nome \"([^\"]*)\"$")
	public void informoONome(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys(arg1);
	}

	@When("^informo o sobrenome \"([^\"]*)\"$")
	public void informoOSobrenome(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^informo o telefone \"([^\"]*)\"$")
	public void informoOTelefone(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys(arg1);
	}

	@When("^seleciono o pais$")
	public void selecionoOPais() throws Throwable {
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[30]")).click();
	}

	@When("^informo a cidade \"([^\"]*)\"$")
	public void informoACidade(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^informo o endereco \"([^\"]*)\"$")
	public void informoOEndereco(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input")).sendKeys(arg1);
	}

	@When("^informo o Estado \"([^\"]*)\"$")
	public void informoOEstado(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input")).sendKeys(arg1);
	}

	@When("^informo o codigo postal \"([^\"]*)\"$")
	public void informoOCodigoPostal(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input")).sendKeys(arg1);
	}

	@When("^seleciono checkbox em concordo com as condicoes de uso e privacidade$")
	public void selecionoCheckboxEmConcordoComAsCondicoesDeUsoEPrivacidade() throws Throwable {
		try {
			driver.findElement(By.name("i_agree")).click();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("^seleciono Registrar$")
	public void selecionoRegistrar() throws Throwable {
		//driver.findElement(By.id("register_btnundefined")).click();
	}

	@Then("^visualizo a pagina inicial$")
	public void visualizoAPaginaInicial() throws Throwable {
		//driver.close();
	}
	
	@Then("^sou notificado que o usuario ja existe$")
	public void souNotificadoQueOUsuarioJaExiste() throws Throwable {
		//driver.close();
	}


}
