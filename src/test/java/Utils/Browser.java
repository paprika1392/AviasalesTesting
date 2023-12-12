package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static Utils.Configs.BrowserConfig.*;

public class Browser {

    private static WebDriver driver; //singlton

    private Browser() {   //singlton
    }

    public static WebDriver getDriver() { //singlton
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); //automatic driver download
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void webDriverStartWork() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver.exe"); // manual driver download
        getDriver();
    }

    public static void customizeBrowserWindow() {
        driver.manage().window().maximize();
    }

    public static void setUrl(String url) {
        driver.get(url);
    }

    public static void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    public static void closeBrowser() {
        if (!HOLD_BROWSER_OPEN) {
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


    public static WebDriverWait getWebDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait;
    }

    public static void waitUntilElemToBeClickable(By locator) {
        getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
    }
}
