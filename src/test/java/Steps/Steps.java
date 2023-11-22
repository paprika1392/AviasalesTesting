package Steps;

import Pages.aviasales.HomePage;
import Pages.aviasales.TicketsPage;
import Utils.Browser;

import static Utils.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class Steps {

    public static HomePage homePage = new HomePage();
    public static TicketsPage ticketsPage = new TicketsPage();


    public static void openBrowser() {
        Browser.webDriverStartWork();
        Browser.setUrl(URL_AVIASALES_HOME_PAGE);
        Browser.customizeBrowserWindow();
    }

    public static void clearCookies() {
        Browser.clearCookiesAndLocalStorage();
    }

    public static void enterCityFromFly(String cityFrom) {
        homePage.clickCityFromFly();
        homePage.enterCityFromFly(cityFrom);
    }

    public static void enterCityToFly(String cityTo) {
        homePage.enterCityToFly(cityTo);
    }

    public static void selectRoundTripDates() {
        homePage.clickDepartField();
//        actionsOnTheHomePageAviasales.clickButtonNextMouth();
        homePage.chooseFirstDate();
        homePage.chooseSecondDate();
    }

    public static void addOnePassenger() {
        homePage.clickPassengersField();
        homePage.clickButtonAddPassenger();
    }

    public static void clickSearchButton() {
        homePage.clickSearchButton();
    }

    public static void switchToPage(int index) {
        Browser.getWindowHandles();
        Browser.switchWindow(index);
    }

        public static void printCurrentUrl() {
        ticketsPage.getCurrentUrl();
    }

    public static void waitWhilePageIsLoaded() {
        ticketsPage.waitPageLoaded();
    }

    public static void printTicketWithFastestFlight() {
        ticketsPage.scrollWhileFindSortButton();
        ticketsPage.clickSortingButton();
        ticketsPage.clickTripDurationButton();
        ticketsPage.printFastestTimeOnTickets();
    }


    public static void closeBrowser() throws InterruptedException {
        Browser.closeBrowser();
    }



}
