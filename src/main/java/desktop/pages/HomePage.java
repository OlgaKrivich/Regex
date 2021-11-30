package desktop.pages;

import abstractClasses.page.AbstractPage;
import driver.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    public static final String BASE_URL = "https://www.epam.com/about";

    @FindBy(xpath = "//span[@class='cta-button__text']")
    private WebElement contactUsButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openWebSite() {
        SingletonDriver.getDriver().get(BASE_URL);
    }

    public void clickContactUsButton(){
        contactUsButton.click();
    }
}
