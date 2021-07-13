package pages;
import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BookingHomePage extends BaseHelper {

    @FindBy(id="ss")
    WebElement enterCity;
    @FindBy(className="xp__button")
    WebElement searchButton;

    public BookingHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private void navigateToPage(){
        driver.get("https://www.booking.com/");
    }
    private void enterDestination(){
        wdWait.until(ExpectedConditions.visibilityOf(enterCity));
        enterCity.sendKeys("Paris");
    }
    private void clickOnSearchButton(){
        searchButton.click();

    }

    public void bookingMain(){
        navigateToPage();
        enterDestination();
        clickOnSearchButton();
    }
}
