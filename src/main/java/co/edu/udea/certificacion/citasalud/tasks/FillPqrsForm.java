package co.edu.udea.certificacion.citasalud.tasks;

import co.edu.udea.certificacion.citasalud.userinterfaces.CitaSaludPqrsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillPqrsForm {

    public static Performable withData(String tipo, String descripcion) {
        return Task.where("{0} fills out the PQRS form with type: " + tipo,
                WaitUntil.the(CitaSaludPqrsPage.SELECT_TYPE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CitaSaludPqrsPage.SELECT_TYPE),
                net.serenitybdd.screenplay.actions.Scroll.to(By.xpath("//span[contains(text(),'" + tipo + "')]")),
                Click.on(By.xpath("//span[contains(text(),'" + tipo + "')]")),
                Enter.theValue(descripcion).into(CitaSaludPqrsPage.TEXTAREA_DESCRIPTION)
        );
    }
}

