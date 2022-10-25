package amazon.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * @author Zeeshan Asghar
 * This class implements the page factory pattern.It contains locators related to Left Menu
 * returns the web elements of Left Menu.
 * @dated 24-10-2022
 */
public class OR_MenuLeft {
    @CacheLookup
    @FindBy(how = How.XPATH, using = ("//div[normalize-space()='Electronics']//ancestor::a"))
    public WebElement menuItemElectronics;

    @CacheLookup
    @FindBy(how = How.XPATH, using = ("//a[normalize-space()='Television & Video']"))
    public WebElement subMenuItemTelevisionAndVideo;

    @CacheLookup
    @FindBy(how = How.XPATH, using = ("//span[@class='a-size-base a-color-base'][normalize-space()='Sony']"))
    public WebElement checkBoxBrand;
}
