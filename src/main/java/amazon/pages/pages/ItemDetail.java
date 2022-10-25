package amazon.pages.pages;

import amazon.pages.objects.OR_ItemDetail;
import amazon.utils.Timer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static amazon.utils.SmartWait.waitFor;

/**
 * @author Zeeshan Asghar
 * This is Item Detail page class which contains methods related to Item Detail page
 * @date 24-10-2022
 */
public class ItemDetail {
    WebDriver driver;
    OR_ItemDetail or_itemDetail;

    /**
     * parameterized constructor of item detail class
     * @param driver instance of web driver
     */
    public ItemDetail(WebDriver driver) {
        this.driver = driver;
        or_itemDetail = PageFactory.initElements(driver, OR_ItemDetail.class);
    }

    /**
     * returns the text of heading of about section of item detail
     */
    public String getTxtAboutItem() {
        waitFor(or_itemDetail.txtAboutItem, Timer.getWaitTime());
        return or_itemDetail.txtAboutItem.getText();
    }
}
