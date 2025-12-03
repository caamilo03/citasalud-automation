package co.edu.udea.certificacion.citasalud.tasks;

import co.edu.udea.certificacion.citasalud.interactions.SelectDropdownValue;
import co.edu.udea.certificacion.citasalud.userinterfaces.CitaSaludPqrsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillPqrsForm {

    public static Performable withData(Map<String, String> formData) {
        // Usar getValue helper para evitar repetir formData.getOrDefault
        return Task.where("{0} fills the PQRS form",
                SelectFromOptions.byVisibleText(getValue(formData, "type", "Petición"))
                        .from(CitaSaludPqrsPage.SELECT_TYPE),
                Enter.theValue(getValue(formData, "description")).into(CitaSaludPqrsPage.TEXT_AREA_DESCRIPTION)
        );
    }

    private static String getValue(Map<String, String> formData, String key) {
        return getValue(formData, key, "");
    }

    private static String getValue(Map<String, String> formData, String key, String defaultValue) {
        return formData.getOrDefault(key, defaultValue);
    }
}

