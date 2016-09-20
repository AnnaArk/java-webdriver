package PatternsTask.Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 */
public class DriverTools {

    public DriverTools() {
    }

    public WebDriver DriverInit() {
        java.lang.String exePath = "d:\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        return new ChromeDriver();
    }
}
