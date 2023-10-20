package Tests;

import Pages.HomePageAviaSales;
import Pages.SelectionOfTicketsPageAviaSales;
import UtilsClass.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static UtilsClass.Configs.BrowserConfig.CLEAR_COOKIES_AND_STORAGE;

public class BaseTest {

    private final String URL_AVIASALES_HOME_PAGE = "https://www.aviasales.ge/";

    @Test
    public void startWorkDriver() throws InterruptedException { //  setpropertys and driver manage

        BrowserClass.webDriverStartWork();
        BrowserClass.openBrowser(URL_AVIASALES_HOME_PAGE);

        HomePageAviaSales actionsHomePage = new HomePageAviaSales();
        actionsHomePage.enterCityFromFly();
        actionsHomePage.enterCityToFly();
        actionsHomePage.clickDepartField();
        actionsHomePage.clickButtonNextMouth();
        actionsHomePage.chooseFirstDate();
        actionsHomePage.chooseSecondDate();
        actionsHomePage.clickPassengersField();
        actionsHomePage.clickAddPassengerButton();
        actionsHomePage.clickSearchButton();

        Thread.sleep(5000);

        BrowserClass.switchToWindows(1);

        SelectionOfTicketsPageAviaSales actionSelectionOfTicketsPage = new SelectionOfTicketsPageAviaSales();
        actionSelectionOfTicketsPage.openCurrentUrl();
//        actionSelectionOfTicketsPage.waitUntilPageIsLoaded();
//        actionSelectionOfTicketsPage.closePriceAlert();
        actionSelectionOfTicketsPage.clickSortingButton();
        actionSelectionOfTicketsPage.clickTripDurationButton();
//        actionSelectionOfTicketsPage.clickSearchFlightsButton();


    }

//    @AfterTest
//    public void cleanCookies() {
//        BrowserClass.clearCookiesAndLocalStorage();

//    }

//    @AfterTest(alwaysRun = true)
//    public void closeBrowser() throws InterruptedException {
//        BrowserClass.closeChrome();
//    }


}
