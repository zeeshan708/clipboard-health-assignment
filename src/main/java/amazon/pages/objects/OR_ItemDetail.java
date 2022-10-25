package amazon.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Zeeshan Asghar
 * This class implements the page factory pattern.It contains locators related to ItemDetail
 * page and returns the web elements of ItemDetail page.
 * @date 24-10-2022
 */
public class OR_ItemDetail {
    @FindBy(how = How.CSS, using = ("h1[class='a-size-base-plus a-text-bold']"))
    public WebElement txtAboutItem;
}
