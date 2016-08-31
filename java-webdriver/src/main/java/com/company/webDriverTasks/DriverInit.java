package com.company.webDriverTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Anna_Arkhipova on 8/31/2016.
 */
public final class DriverInit {

    private DriverInit() {

    }

    // Initialize FireFox driver. Work fine with Firefox version 47.0.1.
    // With higher FF versions driver is required.
    public static WebDriver initializeFirefox() {
        System.out.println("\n" + "\n" + "Init FireFox");
        return new FirefoxDriver();
    }

    // Initialize IE Driver
    public static WebDriver initializeIE() {
        String service = "d:\\drivers\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", service);
        System.out.println("\n" + "\n" + "Init IE");
        return new InternetExplorerDriver();
    }

    // Initialize ChromeDriver
    public static WebDriver initializeChrome() {
        String exePath = "d:\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        System.out.println("\n" + "\n" + "Init Chrome");
        return new ChromeDriver();
    }


}
