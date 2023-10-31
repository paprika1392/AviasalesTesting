package Tests;

import Pages.aviasales.HomePage;
import Pages.aviasales.TicketsPage;
import UtilsClass.BrowserClass;
import org.testng.annotations.Test;

import static UtilsClass.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class BaseTest {

    @Test
    public void startWorkDriver() throws InterruptedException { //  setpropertys and driver manage

        BrowserClass.webDriverStartWork();
        BrowserClass.openBrowser(URL_AVIASALES_HOME_PAGE);

        HomePage actionsHomePage = new HomePage();
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

        TicketsPage actionSelectionOfTicketsPage = new TicketsPage();
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
