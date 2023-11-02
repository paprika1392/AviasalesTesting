package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static Utils.Configs.BrowserConfig.CLEAR_COOKIES_AND_STORAGE;
import static Utils.Configs.BrowserConfig.HOLD_BROWSER_OPEN;

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
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe"); // manual driver download
        WebDriverManager.chromedriver().setup(); //automatic driver download

        driver = new ChromeDriver();
        driver.manage().window().maximize();
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


    public static ArrayList<String> getWindowHandles() {
        ArrayList<String> windowHandles = new ArrayList<String>();
        windowHandles.addAll(driver.getWindowHandles());
        System.out.println("Current window handles is: " + windowHandles);
        return windowHandles;
    }

    public static void switchWindow(int index) {
        ArrayList<String> currentHandles = getWindowHandles();
        driver.switchTo().window(currentHandles.get(index));
    }
}
