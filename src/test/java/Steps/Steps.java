package Steps;

import Pages.aviasales.HomePage;
import Pages.aviasales.TicketsPage;
import Utils.BrowserClass;

import static Utils.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class Steps {

    public static HomePage actionsOnTheHomePageAviasales = new HomePage();
    public static TicketsPage actionsOnTheTicketsPageAviasales = new TicketsPage();


    public static void openBrowser() {
        BrowserClass.webDriverStartWork();
        BrowserClass.setUrl(URL_AVIASALES_HOME_PAGE);
        BrowserClass.customizeBrowserWindow();
    }

    public static void clearCookies() {
        BrowserClass.clearCookiesAndLocalStorage();
    }

    public static void enterCityFromFly(String cityFrom) {
        actionsOnTheHomePageAviasales.clickCityFromFly();
        actionsOnTheHomePageAviasales.enterCityFromFly(cityFrom);
    }

    public static void enterCityToFly(String cityTo) {
        actionsOnTheHomePageAviasales.enterCityToFly(cityTo);
    }

    public static void selectRoundTripDates() {
        actionsOnTheHomePageAviasales.clickDepartField();
//        actionsOnTheHomePageAviasales.clickButtonNextMouth();
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

    public static void switchToNextPage(int index) {
        BrowserClass.getWindowHandles();
        BrowserClass.switchWindow(index);
    }

        public static void printCurrentUrl() {
        actionsOnTheTicketsPageAviasales.getCurrentUrl();
    }

    public static void waitWhilePageIsLoaded() {
        actionsOnTheTicketsPageAviasales.waitPageLoaded();
    }

    public static void selectTicketWithFastestFlight() {
        actionsOnTheTicketsPageAviasales.findTripDurationButton();
        actionsOnTheTicketsPageAviasales.clickSortingButton();
        actionsOnTheTicketsPageAviasales.clickTripDurationButton();
        actionsOnTheTicketsPageAviasales.selectFastestTimeOnTickets();
    }


    public static void closeBrowser() throws InterruptedException {
        BrowserClass.closeBrowser();
    }



}
