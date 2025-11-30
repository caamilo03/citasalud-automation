package co.edu.udea.certificacion.citasalud.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CitaSaludPqrsStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario navega a la página de CitaSalud PQRS")
    public void queElUsuarioNavegaALaPaginaDeCitaSaludPqrs() {
        // TODO: Implementar navegación
        // OnStage.theActorCalled("Usuario").wasAbleTo(
        //     Open.url("https://citasalud-pqrs-flow.vercel.app/")
        // );
    }

    @Cuando("el usuario completa el formulario de PQRS con los siguientes datos")
    public void elUsuarioCompletaElFormularioDePqrsConLosSiguientesDatos(DataTable dataTable) {
        // TODO: Implementar llenado de formulario
        // var data = dataTable.asMap(String.class, String.class);
    }

    @Cuando("el usuario envía el formulario")
    public void elUsuarioEnviaElFormulario() {
        // TODO: Implementar envío del formulario
    }

    @Entonces("el usuario debería ver un mensaje de confirmación exitoso")
    public void elUsuarioDeberiaVerUnMensajeDeConfirmacionExitoso() {
        // TODO: Implementar verificación del mensaje
    }
}

