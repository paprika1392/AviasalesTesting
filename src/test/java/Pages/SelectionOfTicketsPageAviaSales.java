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

    public final By waitPageLoaded = By.cssSelector(".loader__stripes");
    public final By sortingButton = By.xpath("//div[text()='Sorting']");
    public final By tripDurationButton = By.xpath("//div[text()='Trip duration']");
    public final By searchFlightsButton = By.xpath("//div[text()='Search flights']");
    public final By buttonClosePriceAlert = By.xpath("//span[text()='Close']");
    public final By clickCreatePriceAlert = By.cssSelector(".direction-subscriptions__btn-subs");

    public static void openCurrentUrl() {
        String strUrl = BrowserClass.getDriver().getCurrentUrl();
        System.out.println("Current URL is: " + strUrl);

    }

    public SelectionOfTicketsPageAviaSales waitUntilPageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 20);
//        WebElement element = BrowserClass.getDriver().findElement(waitPageLoaded);
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreatePriceAlert));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(clickCreatePriceAlert));
        return this;
    }


    public SelectionOfTicketsPageAviaSales closePriceAlert() { // For popup PriceAlert

        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(clickCreatePriceAlert));
        WebElement element = BrowserClass.getDriver().findElement(clickCreatePriceAlert);
        Actions action = new Actions(BrowserClass.getDriver());
        action.doubleClick(element).perform();

//        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 30);
//        wait.until(ExpectedConditions.elementToBeClickable(buttonClosePriceAlert));
//        BrowserClass.getDriver().findElement(buttonClosePriceAlert).click();
        return this;
    }

    public SelectionOfTicketsPageAviaSales clickSortingButton() {

        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortingButton));
//        BrowserClass.getDriver().findElement(sortingButton).click();

        WebElement element = BrowserClass.getDriver().findElement(sortingButton);
        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
        js.executeScript("arguments[0].click()",element);

        return this;
    }

    public SelectionOfTicketsPageAviaSales clickTripDurationButton() {

        BrowserClass.getDriver().findElement(tripDurationButton);
        return this;
    }

    public SelectionOfTicketsPageAviaSales clickSearchFlightsButton() {

        BrowserClass.getDriver().findElement(searchFlightsButton);
        return this;
    }
}
