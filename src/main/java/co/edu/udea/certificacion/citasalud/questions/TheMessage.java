package co.edu.udea.certificacion.citasalud.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheMessage implements Question<String> {

    private final Target target;

    private TheMessage(Target target) {
        this.target = target;
    }

    public static TheMessage of(Target target) {
        return new TheMessage(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        try {
            return target.resolveFor(actor).getText();
        } catch (Exception e) {
            return "";
        }
    }
}
