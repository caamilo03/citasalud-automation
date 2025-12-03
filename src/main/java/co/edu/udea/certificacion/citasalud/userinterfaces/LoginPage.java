package co.edu.udea.certificacion.citasalud.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target NAME = Target.the("campo nombre")
            .located(By.xpath("//*[@id=\"username\"]"));
    public static Target PASSWORD = Target.the("campo contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static Target LOGGIN_BUTTON = Target.the("botón de login")
            .located(By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/button"));
}
