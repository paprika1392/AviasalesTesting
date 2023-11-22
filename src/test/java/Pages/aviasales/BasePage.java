package Pages.aviasales;

import Utils.Browser;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        driver = Browser.getDriver();
    }
}
