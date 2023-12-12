package Pages.aviasales;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {

    public final By enterCityFrom = By.xpath("//input[@placeholder='From']");
    public final By enterCityTo = By.xpath("//input[@placeholder='To']");
    public final By loadHomePage = By.cssSelector(".--explore");
    public final By clickDepartField = By.xpath("//button[@data-test-id='start-date-field']");
    public final By clickNext = By.xpath("//button[@class='calendar-navbar__button --next']");
    public final By firstData = By.xpath("//div[contains(@class,'today')]"); //always selects today's date
    public final By secondDate = By.xpath("(//div[@role='grid'][2]//div[@role='gridcell'])[1]");//always selects first date of next month
    public final By clickPassengers = By.xpath("//div[text()='1 passenger']");
    public final By ButtonAddAdult = By.xpath("//div[@data-test-id='number-of-adults']//button[@data-test-id='increase-button']");
    public final By buttonSearch = By.xpath("//button[@data-test-id='form-submit']");


    public void clickCityFromFly() {
        driver.findElement(enterCityFrom).click();
    }

    public void enterCityFromFly(String cityFrom) {
        driver.findElement(enterCityFrom).sendKeys(cityFrom);
    }

    public void enterCityToFly(String cityTo) {
        driver.findElement(enterCityTo).sendKeys(cityTo);

    }

    public void clickDepartField() {
        Browser.waitUntilElemToBeClickable(clickDepartField);

        WebElement element = driver.findElement(clickDepartField);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);

    }

    public void clickButtonNextMouth() {
        WebElement element = driver.findElement(clickNext);
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }

    public void chooseFirstDate () {
        driver.findElement(firstData).click();
    }

    public void chooseSecondDate () {
//        Browser.waitUntilElemToBeClickable(secondDate);
        driver.findElement(secondDate).click();
    }

    public void clickPassengersField() {
        driver.findElement(clickPassengers).click();
    }

    public void clickButtonAddPassenger() {
        driver.findElement(ButtonAddAdult).click();
    }

    public void clickSearchButton() {
        WebElement element = driver.findElement(buttonSearch);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);

    }


}
