package cadastro.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/realizar_cadastro.feature" ,
		glue = "cadastro.steps",
		tags = "~@ignore",
		plugin = "pretty", monochrome = true,
		snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
        
)

public class CadastroRunner {

}
