package Tests;

import Pages.HomePageAviaSales;
import Pages.SelectionOfTicketsPageAviaSales;
import UtilsClass.BrowserClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static UtilsClass.Configs.BrowserConfig.CLEAR_COOKIES_AND_STORAGE;
import static UtilsClass.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class BaseTest {

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
        actionsHomePage.clickButtonAddPassenger();
        actionsHomePage.clickSearchButton();

        Thread.sleep(5000);

        BrowserClass.switchWindow(1);

        SelectionOfTicketsPageAviaSales actionSelectionOfTicketsPage = new SelectionOfTicketsPageAviaSales();
        actionSelectionOfTicketsPage.openCurrentUrl();
        actionSelectionOfTicketsPage.waitPageLoaded();
        actionSelectionOfTicketsPage.waitOpenAndCloseWindowPriceAlert();
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
