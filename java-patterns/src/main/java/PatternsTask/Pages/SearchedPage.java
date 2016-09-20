package PatternsTask.Pages;

import PatternsTask.Tools.StringTools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna_Arkhipova on 9/15/2016.
 */
public class SearchedPage extends Page {

    private WebDriver driver;

    @FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_3']/li[7]/label/a")
    private WebElement linkColorYellow;

    @FindBy(xpath = "//ul[contains(@class,'product_list')]/li")
    List<WebElement> searchedResults;

    @FindBy(xpath = "//div[@class=\"right-block\"]//span[@itemprop=\"price\"]")
    private List<WebElement> searchedResultPrices;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortingOptionsElement;

    @FindBy(xpath = "//select[@id='selectProductSort']/option")
    List<WebElement> sortingOptionsList;

    public SearchedPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void applyColorYellowFilter() {
        //Method is used to apply Yellow filter. Also FluentWait was added
        linkColorYellow.click();
        waitForAjax();
    }

    public int getFoundResultsAmount() {
        //Method is used to count number of searched results and return it
        return searchedResults.size();
    }

    //This method is used to open the list of sorting options and click item passed in <index> parameter (0 corresponds for nothing, 1 - price:asc etc)
    public void selectSortingOption(int index) {
        sortingOptionsElement.click();
        sortingOptionsList.get(index).click();
        waitForAjax();
    }

    public List<Double> getSearchedResultPricesAsNumber() {
        //Method is creating List of prices that were converted to double
        List<Double> searchResultPricesAsNumber = new ArrayList<Double>();
        for (WebElement s : searchedResultPrices) {
            searchResultPricesAsNumber.add(StringTools.convertPriceToNumber(s.getText()));
        }
        return searchResultPricesAsNumber;
    }

    public String getYellowLinkText() {
        return linkColorYellow.getText();
    }
}
