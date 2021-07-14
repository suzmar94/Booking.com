package pages;
import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ParisHotelsPage extends BaseHelper {

    @FindBy(className="bui-calendar__control--next")
    WebElement nextButton;
    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[3]/div/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[2]")
    WebElement date19;
    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[3]/div/div[1]/div[2]/div/div/div/div[2]")
    WebElement endDateTable;
    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[3]/div/div[2]/div/div/div[3]/div[1]/table/tbody/tr[5]/td[1]")
    WebElement date25;
    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[4]/div/div/div/div[2]/div[1]")
    WebElement childrenBox;
    @FindBy(className = "sb-searchbox__button")
    WebElement searchBtn;

    public ParisHotelsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private void findMonth(){
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("bui-calendar__control--next")));
        nextButton.click();
        nextButton.click();
    }
    private void selectStartDate(){
        date19.click();
    }
    private void selectEndDate(){
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[3]/div/div[1]/div[2]/div/div/div/div[2]")));
        endDateTable.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/div[1]/div[2]/div[1]/div[1]/form/div[3]/div/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[1]")));
        date25.click();
    }
    private void boxChildren(){
        childrenBox.click();
    }
    private void childrenNumber(){
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sb-group-children")));
        WebElement numberDiv = driver.findElement(By.className("sb-group-children"));
        List<WebElement> elements = numberDiv.findElements(By.tagName("option"));
        System.out.println("Number of options:" +elements.size());
        elements.get(1).click();
    }
    private void searchButton(){
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("sb-searchbox__button")));
        searchBtn.click();
    }
    public void searchDetails(){
        findMonth();
        selectStartDate();
        selectEndDate();
        boxChildren();
        childrenNumber();
        searchButton();
    }
}
