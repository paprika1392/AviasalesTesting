package Pages.aviasales;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public final By enterCityFrom = By.xpath("//input[@placeholder='From']");
    public final By enterCityTo = By.xpath("//input[@placeholder='To']");
    public final By loadHomePage = By.cssSelector(".--explore");
    public final By clickDepartField = By.xpath("//div[@class='page-header --compact']//input[@placeholder='Depart']");
    public final By clickNext = By.xpath("//button[@class='calendar-navbar__button --next']");
    public final By firstData = By.xpath("//div[@class='calendar__day-cell today']"); //always selects today's date
    public final By secondDate = By.xpath("(//div[@class='calendar__month'][2]//div[@class='calendar-day'])[1]");//always selects first date of next month
    public final By clickPassengers = By.xpath("//div[@data-test-id='passengers-field']");
    public final By ButtonAddPassenger = By.xpath("//div[@data-test-id='passengers-adults-field']//a[contains(@class, 'increment')]");
    public final By buttonSearch = By.xpath("//div[@class='avia-form__submit']//div[text()='Search flights']");


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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickDepartField));

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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(secondDate));
        driver.findElement(secondDate).click();
    }

    public void clickPassengersField() {
        driver.findElement(clickPassengers).click();
    }

    public void clickButtonAddPassenger() {
        driver.findElement(ButtonAddPassenger).click();
    }

    public void clickSearchButton() {
        WebElement element = driver.findElement(buttonSearch);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",element);

    }


}
