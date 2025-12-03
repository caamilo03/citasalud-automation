package co.edu.udea.certificacion.citasalud.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CitaSaludPqrsPage {

    // Botón para acceder al formulario PQRS desde el dashboard
    public static final Target RADICAR_PQRS_BUTTON = Target.the("Botón Radicar PQRS")
            .located(By.xpath("//button[contains(text(),'Radicar PQRS')]"));

    // Campos del formulario PQRS
    public static final Target SELECT_TYPE = Target.the("Selector tipo PQRS")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div[2]/form/div[1]/select"));

    public static final Target TEXT_AREA_DESCRIPTION = Target.the("Campo descripción")
            .located(By.xpath("//*[@id=\"descripcion\"]"));

    public static final Target SUBMIT_BUTTON = Target.the("Botón enviar formulario")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div/main/div/div/div[3]/div[2]/form/div[3]/button[1]"));

    public static final Target SUCCESS_MESSAGE = Target.the("Mensaje de confirmación")
            .located(By.xpath("//*[@id=\"root\"]/div[1]/ol/li/div/div[1]"));

    private CitaSaludPqrsPage() {
        // Constructor privado para evitar instanciación
    }
}

