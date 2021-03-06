package driver;

import static constants.Constants.IMPLICITLY_WAIT_TIMEOUT;
import static driver.CapabilitiesHelper.getChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver {

    private static WebDriver instance;

    private SingletonDriver() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            WebDriverManager.chromedriver().setup();
            instance = new ChromeDriver(getChromeOptions());
            instance.manage().window().maximize();
            instance.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
        }
        return instance;
    }
}
