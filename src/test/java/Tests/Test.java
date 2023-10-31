package Tests;

import Steps.Steps;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void Test() {
        Steps.clickAndEnterCityFromFlyAndToFly();
        Steps.selectRoundTripDates();
        Steps.selectCountOfPassengers();
        Steps.searchForAvailableOptions();
        Steps.switchToNextPageAndPrintCurrentUrl();
        Steps.waitWhilePageIsLoaded();
        Steps.selectTicketWithFastestFlight();
    }
}
