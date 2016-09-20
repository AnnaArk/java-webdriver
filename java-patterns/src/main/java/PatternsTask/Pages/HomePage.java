package PatternsTask.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 *
 */
public class HomePage extends Page {

    private WebDriver driver;
    public static final String PAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title='Women']")
    WebElement buttonWoman;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li/a[@title='Dresses']")
    WebElement dressesButton;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnTab(String tabName) {
        //Method is used to click on one of possible tabs Dresses or Woman
        //Better to compare String using Equals
        if ("dresses".equals(tabName)) {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            dressesButton.click();
        }
        if (tabName == "women") {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            buttonWoman.click();
        }
    }
}
