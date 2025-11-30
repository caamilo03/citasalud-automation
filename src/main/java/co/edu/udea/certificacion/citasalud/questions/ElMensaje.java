package co.edu.udea.certificacion.citasalud.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ElMensaje implements Question<String> {

    private final Target elemento;

    public ElMensaje(Target elemento) {
        this.elemento = elemento;
    }

    public static ElMensaje de(Target elemento) {
        return new ElMensaje(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).answeredBy(actor);
    }
}

