package Tests;

import Steps.Steps;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest
    public void startWorkDriver() throws InterruptedException { //  setpropertys and driver manage
        Steps.startWorkBrowser();
   }

   @AfterTest
    public void finishWorkDriver() throws InterruptedException {
        Steps.clearCookiesAngCloseBrowser();
   }
}
