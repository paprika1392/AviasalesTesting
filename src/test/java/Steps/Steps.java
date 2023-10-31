package Steps;

import Pages.aviasales.HomePage;
import Pages.aviasales.TicketsPage;
import Utils.BrowserClass;

import static Utils.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class Steps {

    public static HomePage actionsOnTheHomePageAviasales = new HomePage();
    public static TicketsPage actionsOnTheTicketsPageAviasales = new TicketsPage();



    public static void startWorkBrowser() {
        BrowserClass.webDriverStartWork();
        BrowserClass.openBrowser(URL_AVIASALES_HOME_PAGE);
    }

    public static void clickAndEnterCityFromFlyAndToFly() {
        actionsOnTheHomePageAviasales.clickCityFromFly();
        actionsOnTheHomePageAviasales.enterCityToFly();
        actionsOnTheHomePageAviasales.enterCityToFly();
    }

    public static void selectRoundTripDates() {
        actionsOnTheHomePageAviasales.clickButtonNextMouth();
        actionsOnTheHomePageAviasales.chooseFirstDate();
        actionsOnTheHomePageAviasales.chooseSecondDate();
    }

    public static void selectCountOfPassengers() {
        actionsOnTheHomePageAviasales.clickPassengersField();
        actionsOnTheHomePageAviasales.clickButtonAddPassenger();
    }

    public static void searchForAvailableOptions() {
        actionsOnTheHomePageAviasales.clickSearchButton();
    }

    public static void switchToNextPageAndPrintCurrentUrl() {
        BrowserClass.getWindowHandles();
        BrowserClass.switchWindow(1); // I can create instance and value of index, if need it
        actionsOnTheTicketsPageAviasales.openCurrentUrl();
    }

    public static void waitWhilePageIsLoaded() {
        actionsOnTheTicketsPageAviasales.waitPageLoaded();
    }

    public static void selectTicketWithFastestFlight() {
        actionsOnTheTicketsPageAviasales.clickTripDurationButton();
        actionsOnTheTicketsPageAviasales.selectFastestTimeOnTickets();
    }

    public static void clearCookiesAngCloseBrowser() throws InterruptedException {
    BrowserClass.clearCookiesAndLocalStorage();
    BrowserClass.closeChrome();
    }



}
