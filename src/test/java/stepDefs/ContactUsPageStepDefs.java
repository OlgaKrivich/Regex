package stepDefs;

import static desktop.pages.ContactUsPage.getItemsOfAddress;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import desktop.pages.ContactUsPage;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import java.util.Map;

public class ContactUsPageStepDefs {

    ContactUsPage contactUsPage = new ContactUsPage();

    @Then("I verify the following address")
    public void verifyAddress(@Transpose Map<String, String> list) {
        assertSoftly(softAssertions -> list
                .forEach((k, v) -> softAssertions
                        .assertThat(contactUsPage.getItemsWithoutCharacters(getItemsOfAddress()))
                        .withFailMessage("Address error")
                        .isEqualTo(v)));
    }
}
