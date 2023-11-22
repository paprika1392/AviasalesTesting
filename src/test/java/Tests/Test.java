package Tests;

import Steps.Steps;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void Test() {
        Steps.enterCityFromFly("Tbilisi");
        Steps.enterCityToFly("Yerevan");
        Steps.selectRoundTripDates();
        Steps.addOnePassenger();
        Steps.clickSearchButton();
        Steps.switchToPage(1);
        Steps.printCurrentUrl();
        Steps.waitWhilePageIsLoaded();
        Steps.printTicketWithFastestFlight();
    }
}
