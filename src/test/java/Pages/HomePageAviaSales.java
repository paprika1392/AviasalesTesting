package Pages;

import UtilsClass.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class HomePageAviaSales {

    public final By enterCityFrom = By.xpath("//input[@placeholder='From']");
    public final By enterCityTo = By.xpath("//input[@placeholder='To']");
    public final By waitLoadHomePage = By.cssSelector(".--explore");
    public final By clickDepartField = By.xpath("//div[@class='page-header --compact']//input[@placeholder='Depart']");
    public final By clickNext = By.xpath("//button[@class='calendar-navbar__button --next']");
    public final By firstData = By.xpath("//div[@aria-label='Fri Dec 01 2023']");
    public final By secondDate = By.xpath("//div[@aria-label='Fri Dec 08 2023']");
    public final By clickPassengers = By.xpath("//div[@data-test-id='passengers-field']");
    public final By ButtonAddPassenger = By.xpath("//div[@data-test-id='passengers-adults-field']//a[contains(@class, 'increment')]");
    public final By buttonSearch = By.xpath("//div[@class='avia-form__submit']//div[text()='Search flights']");


    public HomePageAviaSales enterCityFromFly () {

        BrowserClass.getDriver().findElement(enterCityFrom).click();
        BrowserClass.getDriver().findElement(enterCityFrom).sendKeys("Tbilisi");
        return this;
    }

    public HomePageAviaSales enterCityToFly () {

        BrowserClass.getDriver().findElement(enterCityTo).sendKeys("Yerevan");
        return this;
    }

    public HomePageAviaSales clickDepartField() {

        WebDriverWait wait = new WebDriverWait(BrowserClass.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickDepartField));

        WebElement element = BrowserClass.getDriver().findElement(clickDepartField);

        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
        js.executeScript("arguments[0].click()",element);

               return this;
    }

    public HomePageAviaSales clickButtonNextMouth() {

        WebElement element = BrowserClass.getDriver().findElement(clickNext);
        Actions action = new Actions(BrowserClass.getDriver());
        action.doubleClick(element).perform();
        return this;
    }

    public HomePageAviaSales chooseFirstDate () {

        BrowserClass.getDriver().findElement(firstData).click();
        return this;
    }

    public HomePageAviaSales chooseSecondDate () {

        BrowserClass.getDriver().findElement(secondDate).click();
        return this;
    }

    public HomePageAviaSales clickPassengersField() {

        BrowserClass.getDriver().findElement(clickPassengers).click();
        return this;
    }

    public HomePageAviaSales clickAddPassengerButton() {

        BrowserClass.getDriver().findElement(ButtonAddPassenger).click();
        return this;
    }

    public HomePageAviaSales clickSearchButton() {

        WebElement element = BrowserClass.getDriver().findElement(buttonSearch);
        JavascriptExecutor js = (JavascriptExecutor)BrowserClass.getDriver();
        js.executeScript("arguments[0].click()",element);

        return this;
    }


}
