package Pages;

import UtilsClass.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class SelectionOfTicketsPageAviaSales {

    public final By waitWindowPriceAlert = By.xpath("//div[text()= \"Price alert\"]");
    public final By closeWindowPriceAlert = By.xpath("//span[text()= \"Close\"]/..");
    public final By waitPageLoaded = By.cssSelector(".loader__stripes");
    public final By sortingButton = By.xpath("//div[text()='Sorting']/..");
    public final By tripDurationButton = By.xpath("//div[text()='Trip duration']");
    public final By buttonClosePriceAlert = By.xpath("//span[text()='Close']");
    public final By clickCreatePriceAlert = By.cssSelector(".direction-subscriptions__btn-subs");
    public final By durationElement = By.xpath("//div[contains(text(), 'Duration: ')]");

    public static void openCurrentUrl() {
        String strUrl = BrowserClass.getDriver().getCurrentUrl();
        System.out.println("Current URL is: " + strUrl);

    }

    public SelectionOfTicketsPageAviaSales waitPageLoaded() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(waitPageLoaded));

        return this;
    }

    public SelectionOfTicketsPageAviaSales waitOpenAndCloseWindowPriceAlert() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 70);
        wait.until(ExpectedConditions.elementToBeClickable(waitWindowPriceAlert));

        BrowserClass.getDriver().findElement(closeWindowPriceAlert).click();

        return this;
    }


    public SelectionOfTicketsPageAviaSales clickSortingButton() {

        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(sortingButton));
        BrowserClass.getDriver().findElement(sortingButton).click();

//        Actions act =  new Actions(BrowserClass.getDriver());
//        act.moveToElement(BrowserClass.getDriver().findElement(sortingButton)).click().perform();

//        WebElement element = BrowserClass.getDriver().findElement(sortingButton); // resolfe  with JS
//        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
//        js.executeScript("arguments[0].click()",element);

        return this;
    }

    public SelectionOfTicketsPageAviaSales clickTripDurationButton() {
        BrowserClass.getDriver().findElement(tripDurationButton).click();

        return this;
    }

    public SelectionOfTicketsPageAviaSales selectFastestTimeOnTickets() {
        BrowserClass.getDriver().findElements(durationElement);


        return this;
    }

}
