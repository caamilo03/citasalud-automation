package co.edu.udea.certificacion.citasalud.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA implements Task {

    private final String url;

    public NavegarA(String url) {
        this.url = url;
    }

    public static NavegarA laPaginaDeCitaSalud() {
        return Tasks.instrumented(NavegarA.class, "https://citasalud-pqrs-flow.vercel.app/");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.url(url)
        );
    }
}

