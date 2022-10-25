package amazon.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Zeeshan Asghar
 * This class implements the page factory pattern.It contains locators related to Results
 * page and returns the web elements of Results
 * @date 24-10-2022
 */

public class OR_Results {
    @FindBy(how = How.CSS, using = ("div[data-cel-widget='search_result_2']"))
    public WebElement itemSecond;

}
