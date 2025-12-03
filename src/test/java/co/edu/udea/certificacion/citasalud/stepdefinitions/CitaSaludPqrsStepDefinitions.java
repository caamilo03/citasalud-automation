package co.edu.udea.certificacion.citasalud.stepdefinitions;

import co.edu.udea.certificacion.citasalud.tasks.Login;
import co.edu.udea.certificacion.citasalud.tasks.NavigateTo;
import co.edu.udea.certificacion.citasalud.utils.WaitTime;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.*;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.certificacion.citasalud.userinterfaces.LoginPage.LOGGIN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CitaSaludPqrsStepDefinitions {

    public final Actor User = Actor.named("Customer");
    @Managed(driver ="chrome", uniqueSession = true)
    public WebDriver driver;

    private final EnvironmentVariables page; // Realmente son variables de entorno pero por facilidad de lectura le puse nombre page, eso que suele calificar coronado de legibilidad y tales


                                                     // NOTA: BORRAR ESE COMENTARIO XD


    public CitaSaludPqrsStepDefinitions(EnvironmentVariables page) {
        this.page = page;
    }

    @Before
    public void config(){
        User.can(BrowseTheWeb.with(driver));
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Customer");
    }


    @Given("the user opens the CitaSalud page")
    public void theUserOpensTheCitaSaludPage() {
        User.wasAbleTo(NavigateTo.citaSalud(page));
    }
    @When("the user tries to sign in with {string} and {string}")
    public void theUserTriesToSignInWithAnd(String name, String password) {
        User.attemptsTo(Login.with(name, password));
        User.attemptsTo(Click.on(LOGGIN_BUTTON)); // No se si esto dejarlo así o tal vez ponerlo como un when distinto dentro de la HU
        WaitTime.putWaitTimeOf(12000);
    }
    @Then("the user should see the PQRS main page")
    public void theUserShouldSeeThePQRSMainPage() {
        User.should(seeThat("PQRS dashboard",actor -> driver.getCurrentUrl().contains("/dashboard"))); // Esta validación solo puede ser accesible con un token valido, de otra manera se va al login
    }
    @Given("the user navigates to the CitaSalud PQRS page")
    public void theUserNavigatesToTheCitaSaludPQRSPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user fills out the PQRS form with the following information")
    public void theUserFillsOutThePQRSFormWithTheFollowingInformation(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @When("the user submits the form")
    public void theUserSubmitsTheForm() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should see a successful confirmation message")
    public void theUserShouldSeeASuccessfulConfirmationMessage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

