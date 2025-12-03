package co.edu.udea.certificacion.citasalud.tasks;

import co.edu.udea.certificacion.citasalud.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {
    public static Performable with(String username, String password) {
        return Task.where(Enter.theValue(username).into(LoginPage.NAME),
        Enter.theValue(password).into(LoginPage.PASSWORD));
    }



}
