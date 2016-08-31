package com.company.webDriverTasks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Anna_Arkhipova on 8/31/2016.
 */
public class CoreFunctions {
    private WebDriver driver;

    public CoreFunctions(WebDriver webDriver) {
        this.driver = webDriver;
        driver.manage().window().maximize();
    }


    public void countLinksOnPage(String pageUrl) throws InterruptedException {

        driver.get(pageUrl);

        // Collect all the links from the webpage. All the links are associated with the Tag ‘a‘.
        List<WebElement> linkElements;
        linkElements = driver.findElements(By.xpath("//body//a"));
        System.out.println("Total number of link elements on the page: " + linkElements.size());

        //Iterating through every link to print the Link Text on the console screen.
        int i =0;
        for (WebElement linkElement : linkElements) {
            i++;
            System.out.println(i + ". " + linkElement.getText());
        }

        driver.quit();
    }
    //Method for entering Login and password to http://www.diary.ru/
    public void typeLoginPaswd(String loginPage) {

        WebElement loginField = driver.findElement(By.id("usrlog2"));
        WebElement passwordField = driver.findElement(By.id("usrpass2"));
        WebElement enterButton = driver.findElement(By.cssSelector(".submit"));

        loginField.sendKeys("TesterJavaTraining");
        passwordField.sendKeys("q1w2e3r4");
        enterButton.click();
        driver.quit();
    }

    // Method for task5 to search for required query in google
    public void searchByQuery(String url, String searchQuery) {
        driver.get(url);
        WebElement searchField = driver.findElement((By.id("lst-ib")));
        searchField.sendKeys(searchQuery);
        searchField.sendKeys(Keys.ENTER);
    }
    // Method for task5 to check if expected  text (site) is present in returned results on any page and to:
    // - Save  screenshot if result is found
    // - Provide user with the corresponding error message if result is not found
    // - Print to Console  Page number if result is found

    public boolean findAndGetResult(String expectedText, String path) throws IOException, InterruptedException {

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        boolean resultFound = false;
        int maxNumOfPage = 20;

        for (int i = 1; i <= maxNumOfPage; i++) {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //Going through returned list of elements on the page and checking if any contains expected text
            List<WebElement> linkSearchResults;
            linkSearchResults = driver.findElements(By.xpath("//cite[contains(@class,\"_Rm\")]"));
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            for (WebElement x : linkSearchResults) {
                if (x.getText().contains(expectedText)) {
                    System.out.println(expectedText + " found on page " + i);
                    resultFound = true;
                    break;
                }
            }
            //Take screenshot and save to path directory if expected text was found
            if (resultFound) {
                File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File(path + System.currentTimeMillis()+expectedText+" is found on " + i +"page.png"));
                break;
            }

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            // Check that page is not the last page in search results.
            // If not the last go to next page and run search loop again.
            if(!driver.findElements(By.xpath("//td[@class=\"cur\"]/following-sibling::td")).isEmpty()){
                int nextPageId = i + 1;
                String nextPageLocator = "//a[@aria-label=\"Page " + nextPageId + "\"]";

                if (i!=1) {
                    FluentWait wait = new FluentWait(driver);
                    wait.withTimeout(5, TimeUnit.SECONDS);
                    wait.pollingEvery(250, TimeUnit.MILLISECONDS);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='cnt']/div[8][@class=\"mw\"]/div[@class=\"flyr-c\"]")));
                }
                WebElement nextPage = driver.findElement((By.xpath(nextPageLocator)));
                nextPage.click();
            }
            else {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                break;
            }
        }
        driver.quit();
        return resultFound;
    }


}
