package amazon.pages.pages;

import amazon.pages.objects.OR_Header;
import amazon.utils.Timer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static amazon.utils.SmartWait.waitFor;

/**
 * @author Zeeshan Asghar
 * This is header page class which contains methods related to header menu
 * @date 24-10-2022
 */
public class Header {
    WebDriver driver;
    OR_Header or_header;

    /**
     * parameterized constructor of header class
     * @param driver instance of web driver
     */
    public Header (WebDriver driver)
    {
        this.driver = driver;
        or_header = PageFactory.initElements (driver, OR_Header.class);
    }


    /**
     * method clicks on sort by button
     */
    public void clickSortByBtn ()
    {
        waitFor (or_header.btnSortBy, Timer.getWaitTime ());
        or_header.btnSortBy.click();
    }

    /**
     * method clicks on high to low price option of sort by dropdown
     */
    public void clickPriceHighToLowDrpDwn ()
    {
        waitFor (or_header.drpDownHighToLow, Timer.getWaitTime ());
        or_header.drpDownHighToLow.click();
    }
}
