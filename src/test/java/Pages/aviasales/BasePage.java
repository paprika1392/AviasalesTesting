package Pages.aviasales;

import Utils.BrowserClass;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        driver = BrowserClass.getDriver();
    }
}
