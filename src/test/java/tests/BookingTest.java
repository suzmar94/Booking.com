package tests;

import org.junit.Test;
import pages.*;

public class BookingTest extends BaseTest {
    @Test
    public void BookingMainTest() throws InterruptedException {

        BookingHomePage mainPage = new BookingHomePage(driver);
        mainPage.bookingMain();
        ParisHotelsPage hotels = new ParisHotelsPage(driver);
        hotels.searchDetails();
        HotelSelectionPage hotel = new HotelSelectionPage(driver);
        hotel.selectHotel();


        //due to visual confirmation
        Thread.sleep(7000);
    }



}
