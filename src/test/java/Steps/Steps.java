package Steps;

import Pages.HomePageAviaSales;
import Pages.SelectionOfTicketsPageAviaSales;
import UtilsClass.BrowserClass;

import static UtilsClass.Constants.Constants.URL_AVIASALES_HOME_PAGE;

public class Steps {

    public static HomePageAviaSales actionsOnTheHomePageAviasales = new HomePageAviaSales();
    public static SelectionOfTicketsPageAviaSales actionsOnTheTicketsPageAviasales = new SelectionOfTicketsPageAviaSales();



    public static void openCurrentBrowser() {
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



}
