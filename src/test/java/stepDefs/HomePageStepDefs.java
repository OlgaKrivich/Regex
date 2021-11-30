package stepDefs;

import desktop.pages.HomePage;
import driver.SingletonDriver;
import io.cucumber.java.en.When;

public class HomePageStepDefs {

    HomePage homePage = new HomePage(SingletonDriver.getDriver());

    @When("Open Epam home page")
    public void openWebSite() {
        homePage.openWebSite();
    }

    @When("Proceed to Contact us page")
    public void proceedToContactPage(){
        homePage.clickContactUsButton();
    }

}
