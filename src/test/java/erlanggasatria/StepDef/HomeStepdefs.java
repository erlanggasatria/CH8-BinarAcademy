package erlanggasatria.StepDef;

import erlanggasatria.BaseTest;
import erlanggasatria.Pages.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepdefs extends BaseTest {
    HomePage homePage = new HomePage();

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateOnPage();
    }
}
