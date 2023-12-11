package Tests;

import Steps.Steps;
import org.testng.annotations.Test;

public class AviaSalesTest extends BaseTest {

    @Test
    public void testAviaSales() {
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
