package co.edu.udea.certificacion.citasalud.stepdefinitions;

import co.edu.udea.certificacion.citasalud.questions.ElMensaje;
import co.edu.udea.certificacion.citasalud.tasks.FillPqrsForm;
import co.edu.udea.certificacion.citasalud.tasks.Login;
import co.edu.udea.certificacion.citasalud.tasks.NavigateTo;
import co.edu.udea.certificacion.citasalud.tasks.NavigateToPqrsForm;
import co.edu.udea.certificacion.citasalud.tasks.SubmitPqrsForm;
import co.edu.udea.certificacion.citasalud.userinterfaces.CitaSaludPqrsPage;
import co.edu.udea.certificacion.citasalud.utils.WaitTime;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static co.edu.udea.certificacion.citasalud.userinterfaces.LoginPage.LOGGIN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.containsString;

public class CitaSaludPqrsStepDefinitions {

    @Managed(driver ="chrome", uniqueSession = true)
    public WebDriver driver;

    @net.serenitybdd.annotations.Managed
    private EnvironmentVariables environmentVariables;

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Customer").can(BrowseTheWeb.with(driver));
    }

    @Given("the user opens the CitaSalud page")
    public void theUserOpensTheCitaSaludPage() {
        theActorCalled("Customer").wasAbleTo(NavigateTo.citaSalud(environmentVariables));
    }

    @When("the user tries to sign in with {string} and {string}")
    public void theUserTriesToSignInWithAnd(String name, String password) {
        theActorCalled("Customer").attemptsTo(Login.with(name, password));
        theActorCalled("Customer").attemptsTo(Click.on(LOGGIN_BUTTON));
        WaitTime.putWaitTimeOf(3000);
    }

    @Then("the user should see the PQRS main page")
    public void theUserShouldSeeThePQRSMainPage() {
        WaitTime.putWaitTimeOf(2000);
        theActorCalled("Customer").should(seeThat("PQRS dashboard",actor -> driver.getCurrentUrl().contains("/dashboard")));
    }

    @Given("the user navigates to the CitaSalud PQRS page")
    public void theUserNavigatesToTheCitaSaludPQRSPage() {
        theActorCalled("Customer").attemptsTo(NavigateToPqrsForm.fromDashboard());
        WaitTime.putWaitTimeOf(2000);
    }

    @When("the user fills out the PQRS form with the following information")
    public void theUserFillsOutThePQRSFormWithTheFollowingInformation(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        String tipo = data.get("type");
        String descripcion = data.get("description");

        theActorCalled("Customer").attemptsTo(FillPqrsForm.withData(tipo, descripcion));
        WaitTime.putWaitTimeOf(2000);
    }

    @When("the user submits the form")
    public void theUserSubmitsTheForm() {
        theActorCalled("Customer").attemptsTo(SubmitPqrsForm.now());
        WaitTime.putWaitTimeOf(2000);
    }

    @Then("the user should see a successful confirmation message")
    public void theUserShouldSeeASuccessfulConfirmationMessage() {
        theActorCalled("Customer").should(
                seeThat(ElMensaje.de(CitaSaludPqrsPage.SUCCESS_MESSAGE),
                        containsString("radicada correctamente")
                ).orComplainWith(AssertionError.class, "No se mostró el mensaje de confirmación")
        );
    }

}

