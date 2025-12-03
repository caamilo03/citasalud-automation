package co.edu.udea.certificacion.citasalud.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;



public class NavigateTo implements Task {

    private final String url;

    public NavigateTo(String url){
        this.url = url;
    }

    public static NavigateTo citaSalud(EnvironmentVariables environmentVariables){
        String baseUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("citasalud.webdriver.base.url");

        return new NavigateTo(baseUrl);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}

