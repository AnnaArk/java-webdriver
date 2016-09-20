package PageTests;

import PatternsTask.Tools.DriverTools;
import PatternsTask.Pages.HomePage;
import PatternsTask.Pages.SearchedPage;
import PatternsTask.Tools.StringTools;
import org.apache.xpath.operations.String;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Anna_Arkhipova on 9/15/2016.
 */
public class TestsRunner {

    private static WebDriver driver;

    public static void main(String[] args) {

    }

    @Before
    public void testZero() {

        DriverTools dt = new DriverTools();
        driver = dt.DriverInit();
    }

    // Currently test fails because of bug on the webpage:
    // 1 click on Filter text "Yellow" doesn't sort dresses, as required

    @Test
    public void testOne() {
        //Test1 checks that number near Filter name corresponds to number of found items
        driver.get(HomePage.PAGE_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.clickOnTab("dresses");
        SearchedPage sp = PageFactory.initElements(driver, SearchedPage.class);
        sp.applyColorYellowFilter();
        Assert.assertEquals(StringTools.getItemsNumberFromFilterName(sp.getYellowLinkText()), sp.getFoundResultsAmount());
    }

    @Test
    public void testTwo() {
        //Test2 checks that prices were sorted correctly
        driver.get(HomePage.PAGE_URL);
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.clickOnTab("dresses");
        SearchedPage sp = PageFactory.initElements(driver, SearchedPage.class);
        sp.selectSortingOption(1);
        List<Double> sortedPrices = sp.getSearchedResultPricesAsNumber();
        Collections.sort(sortedPrices);

        for (int i = 0; i < sortedPrices.size(); i++) {
            Assert.assertEquals(sortedPrices.get(i), sp.getSearchedResultPricesAsNumber().get(i));
        }
    }

    @After
    public void end() {
        driver.close();
    }
}
