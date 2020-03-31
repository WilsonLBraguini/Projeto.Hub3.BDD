package consultatela.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/consultar_tela.feature" ,
		glue = "consultatela.steps",
		tags = "~@ignore",
		plugin = "pretty", monochrome = true,
		snippets = SnippetType.CAMELCASE,
        dryRun = false ,
        strict = false
        
)

public class CosultaTelaRunner {

}
