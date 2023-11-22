package Tests;

import Steps.Steps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest
    public void startWorkDriver() { //  setpropertys and driver manage
        Steps.openBrowser();
        Steps.clearCookies();
   }

    @AfterTest
    public void finishWorkDriver() throws InterruptedException {
        Steps.closeBrowser();
   }
}
