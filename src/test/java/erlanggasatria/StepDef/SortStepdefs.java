package erlanggasatria.StepDef;

import erlanggasatria.BaseTest;
import erlanggasatria.Pages.HomePage;
import erlanggasatria.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortStepdefs extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User Success login with valid username {string} and password {string}")
    public void userSuccessLoginWithValidUsernameAndPassword(String username, String password) {
        loginPage.validateOnPage();
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLogin();
    }

    @And("click icon sorting")
    public void clickIconSorting() {
        homePage.Filterbutton();
    }


    @When("click choice filter low to high")
    public void ClickChoiceFilterLowToHigh() {
        homePage.FilterlowtoHigh();
    }


}
