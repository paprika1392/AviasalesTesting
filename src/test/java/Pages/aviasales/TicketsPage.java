package Pages.aviasales;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketsPage extends BasePage {

    public final By windowPriceAlert = By.xpath("//div[text()= 'Price alert']");
    public final By closeWindowPriceAlert = By.xpath("//span[text()= 'Close']/..");
    public final By pageLoaded = By.cssSelector(".loader__stripes");
    public final By sortButton = By.xpath("//div[text()='Sort']/..");
    public final By tripDurationButton = By.xpath("//div[text()='Trip duration']");
    public final By closePriceAlertButton = By.xpath("//span[text()='Close']");
    public final By clickCreatePriceAlert = By.cssSelector(".direction-subscriptions__btn-subs");
    public final By durationElement = By.xpath("(//div[@class='ticket-desktop']//div[contains(text(), 'Duration:' )])[1]");


    public void getCurrentUrl() {
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + strUrl);

    }

    public void waitPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(pageLoaded));
    }

    public void waitOpenAndCloseWindowPriceAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 70);
        wait.until(ExpectedConditions.elementToBeClickable(windowPriceAlert));

        driver.findElement(closeWindowPriceAlert).click();
    }


    public void clickSortingButton() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(sortButton));
        driver.findElement(sortButton).click();

//        Actions act =  new Actions(driver);
//        act.moveToElement(driver.findElement(sortingButton)).click().perform();

//        WebElement element = driver.findElement(sortingButton); // resolve  with JS
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click()",element);
    }

    public void findTripDurationButton() {
        // Scrolling down the page till the element is found
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        WebElement element = driver.findElement(tripDurationButton);
        // Scrolling down the page by pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,850)", "");
    }

    public void clickTripDurationButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(tripDurationButton));
        driver.findElement(tripDurationButton).click();
    }

    public void printFastestTimeOnTickets() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(durationElement));
        String fastestTime = driver.findElement(durationElement).getText();
        System.out.println("The fastest time of flight is: " + fastestTime);
    }

}
