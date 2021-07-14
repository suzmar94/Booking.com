package tests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("bodyconstraint-inner")));
        WebElement selectedHotel = driver.findElement(By.id("bodyconstraint-inner"));
        Assert.assertTrue("Message if there the word ca not be locted:",
                selectedHotel.getText().contains("Hotels"));

        //due to visual confirmation
        Thread.sleep(7000);
    }
}
