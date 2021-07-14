package pages;
import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HotelSelectionPage extends BaseHelper {

    @FindBy(id = "hotellist_inner")
    WebElement hotelsListWrapper;

    public HotelSelectionPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private void chooseDesiredHotel(){
        wdWait.until(ExpectedConditions.visibilityOf(hotelsListWrapper));
        WebElement bestRatedHotel = driver.findElement(By.className("sr_card_photo_wrapper"));
        bestRatedHotel.click();
    }
    public void selectHotel(){
        chooseDesiredHotel();
    }
}
