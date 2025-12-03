package co.edu.udea.certificacion.citasalud.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CitaSaludPqrsPage {

    // Botón para acceder al formulario PQRS desde el dashboard
    public static final Target RADICAR_PQRS_BUTTON = Target.the("Botón Radicar PQRS")
            .located(By.xpath("//button[contains(text(),'Radicar PQRS')]"));

    // Campos del formulario PQRS
    public static final Target SELECT_TYPE = Target.the("Selector tipo PQRS")
            .located(By.id("tipoId"));

    public static final Target TEXTAREA_DESCRIPTION = Target.the("Campo descripción")
            .located(By.id("descripcion"));

    public static final Target SUBMIT_BUTTON = Target.the("Botón enviar formulario")
            .located(By.xpath("//button[@type='submit' and contains(text(),'Radicar PQRS')]"));

    public static final Target SUCCESS_MESSAGE = Target.the("Mensaje de confirmación")
            .located(By.xpath("//div[contains(text(),'PQRS radicada correctamente')]"));

    private CitaSaludPqrsPage() {
        // Constructor privado para evitar instanciación
    }
}

