package br.com.rsinet.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/cenario_cucumber.feature",
		glue = "br.com.rsinet.steps",
		plugin = "pretty", monochrome = true,
		snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
        
)
public class Runner {
	


}
