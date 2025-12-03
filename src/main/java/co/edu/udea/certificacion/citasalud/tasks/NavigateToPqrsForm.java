package co.edu.udea.certificacion.citasalud.tasks;

import co.edu.udea.certificacion.citasalud.userinterfaces.CitaSaludPqrsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToPqrsForm {

    public static Performable fromDashboard() {
        return Task.where("{0} navigates to the PQRS form",
                WaitUntil.the(CitaSaludPqrsPage.RADICAR_PQRS_BUTTON, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(CitaSaludPqrsPage.RADICAR_PQRS_BUTTON)
        );
    }
}

