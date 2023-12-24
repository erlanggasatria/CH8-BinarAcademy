package erlanggasatria.StepDef;

import erlanggasatria.BaseTest;
import erlanggasatria.Pages.HomePage;
import erlanggasatria.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.validateOnPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("show error massage")
    public void showErrorMassage() {
        loginPage.invalidlogin();
    }
}
