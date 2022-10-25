package amazon.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Zeeshan Asghar
 * This class implements the page factory pattern.It contains locators related to Home
 * page and returns the web elements of Home page.
 * @date 24-10-2022
 */
public class OR_HomePage {
    @CacheLookup
    @FindBy(how = How.ID, using = ("nav-hamburger-menu"))
    public WebElement menuTabbed;
}
