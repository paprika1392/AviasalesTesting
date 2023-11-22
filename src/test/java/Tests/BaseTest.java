package Tests;

import Steps.Steps;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    @BeforeTest
    public void startWorkDriver() throws InterruptedException { //  setpropertys and driver manage
        Steps.openBrowser();
        Steps.clearCookies();
   }

//   @AfterTest
    public void finishWorkDriver() throws InterruptedException {
        Steps.closeBrowser();
   }
}
