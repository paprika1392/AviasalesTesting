package UtilsClass;

import Pages.HomePageAviaSales;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static UtilsClass.Configs.BrowserConfig.CLEAR_COOKIES_AND_STORAGE;
import static UtilsClass.Configs.BrowserConfig.HOLD_BROWSER_OPEN;
import static UtilsClass.Constants.Constants.IMP_WAIT;

public class BrowserClass {

    private static WebDriver driver; //singlton

    private BrowserClass() {   //singlton
    }

    public static WebDriver getDriver() { //singlton
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void webDriverStartWork() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(IMP_WAIT, TimeUnit.SECONDS);

    }


    public static void openBrowser(String url) {
        driver.get(url);
    }

    public static void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    public static void closeChrome() throws InterruptedException {
        Thread.sleep(5000); // Use only for DEBUG

        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

    public static ArrayList<String> switchToWindows(int index) {

        ArrayList<String> windowHandles = new ArrayList<String>();
        windowHandles.addAll(driver.getWindowHandles());
        System.out.println("Current window handles is: " + windowHandles);
        driver.switchTo().window(windowHandles.get(index));

        return windowHandles;

    }
}
