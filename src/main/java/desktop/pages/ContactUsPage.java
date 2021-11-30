package desktop.pages;

import static utils.StringUtils.getValueByRegEx;

import abstractClasses.page.AbstractPage;
import driver.SingletonDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='source-sans'][1]")
    private WebElement address;

    public static List<String> getItemsOfAddress() {
        return Arrays.stream((SingletonDriver.getDriver()
                .findElement(By.xpath(
                        "//span[@class='source-sans'][1]"))
                .getText().split("•"))).collect(Collectors.toList());
    }

    public List<String> getItemsWithoutCharacters(List<String> list) {
        List<String> listAddress = new ArrayList<>();
        String country = getValueByRegEx(list.get(2), "\\w+");
        String postalCode = getValueByRegEx(list.get(1), "[A-Z]{2}\\s[0-9]{5,}\\s");
        String city = getValueByRegEx(list.get(1), "[a-zA-Z]{6,}");
        String streetName = getValueByRegEx(list.get(0), "[a-zA-z]+\\s?[a-zA-z]+");
        String streetNumber = getValueByRegEx(list.get(0), "\\d+");
        String office = getValueByRegEx(list.get(1), "[0-9]{1,}");
        listAddress.add(country);
        listAddress.add(postalCode);
        listAddress.add(city);
        listAddress.add(streetName);
        listAddress.add(streetNumber);
        listAddress.add(office);
        return listAddress;
    }


}
