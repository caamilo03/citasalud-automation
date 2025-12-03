package co.edu.udea.certificacion.citasalud.tasks;

import co.edu.udea.certificacion.citasalud.userinterfaces.CitaSaludPqrsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SubmitPqrsForm {

    public static Performable now() {
        return Task.where("{0} submits the PQRS form",
                Click.on(CitaSaludPqrsPage.SUBMIT_BUTTON)
        );
    }
}

