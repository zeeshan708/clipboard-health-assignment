package amazon.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author Zeeshan Asghar
 * This class implements the page factory pattern.It contains locators related to header
 * page and returns the web elements of header page.
 * @date 24-10-2022
 */
public class OR_Header {
    @CacheLookup
    @FindBy(how = How.ID, using = ("a-autoid-0-announce"))
    public WebElement btnSortBy;

    @CacheLookup
    @FindBy(how = How.XPATH, using = ("//a[normalize-space()='Price: High to Low']"))
    public WebElement drpDownHighToLow;
}
