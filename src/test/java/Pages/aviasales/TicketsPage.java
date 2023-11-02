package Pages.aviasales;

import Utils.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketsPage {

    public final By waitWindowPriceAlert = By.xpath("//div[text()= \"Price alert\"]");
    public final By closeWindowPriceAlert = By.xpath("//span[text()= \"Close\"]/..");
    public final By waitPageLoaded = By.cssSelector(".loader__stripes");
    public final By sortButton = By.xpath("//div[text()='Sort']/..");
    public final By tripDurationButton = By.xpath("//div[text()='Trip duration']");
    public final By buttonClosePriceAlert = By.xpath("//span[text()='Close']");
    public final By clickCreatePriceAlert = By.cssSelector(".direction-subscriptions__btn-subs");
    public final By durationElement = By.xpath("//div[contains(text(), 'Duration: ')]");


    public void openCurrentUrl() {
        String strUrl = BrowserClass.getDriver().getCurrentUrl();
        System.out.println("Current URL is: " + strUrl);

    }

    public void waitPageLoaded() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 40);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(waitPageLoaded));
    }

    public void waitOpenAndCloseWindowPriceAlert() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 70);
        wait.until(ExpectedConditions.elementToBeClickable(waitWindowPriceAlert));

        BrowserClass.getDriver().findElement(closeWindowPriceAlert).click();
    }


    public void clickSortingButton() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(sortButton));
        BrowserClass.getDriver().findElement(sortButton).click();

//        Actions act =  new Actions(BrowserClass.getDriver());
//        act.moveToElement(BrowserClass.getDriver().findElement(sortingButton)).click().perform();

//        WebElement element = BrowserClass.getDriver().findElement(sortingButton); // resolve  with JS
//        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
//        js.executeScript("arguments[0].click()",element);
    }

    public void findTripDurationButton() {
        WebElement element = BrowserClass.getDriver().findElement(tripDurationButton);
        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
        // Scrolling down the page till the element is found
//        js.executeScript("arguments[0].scrollIntoView();", element);
        // Scrolling down the page by pixels
        js.executeScript("window.scrollBy(0,850)", "");
    }

    public void clickTripDurationButton() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(tripDurationButton));
        BrowserClass.getDriver().findElement(tripDurationButton).click();
    }

    public void selectFastestTimeOnTickets() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(durationElement));
        BrowserClass.getDriver().findElements(durationElement);
    }

}
