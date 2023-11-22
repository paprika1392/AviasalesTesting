package Tests;

import Steps.Steps;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void Test() {
        Steps.enterCityFromFly("Tbilisi");
        Steps.enterCityToFly("Yerevan");
        Steps.selectRoundTripDates();
        Steps.selectCountOfPassengers();
        Steps.searchForAvailableOptions();
        Steps.switchToNextPage(1);
        Steps.printCurrentUrl();
        Steps.waitWhilePageIsLoaded();
        Steps.selectTicketWithFastestFlight();
    }
}
