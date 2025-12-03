package co.edu.udea.certificacion.citasalud.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "co.edu.udea.certificacion.citasalud.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-reports/login.html"}

)
public class LoginRunner {
}

