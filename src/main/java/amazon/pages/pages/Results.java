package amazon.pages.pages;

import amazon.pages.objects.OR_Results;
import amazon.utils.Timer;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


import static amazon.utils.SmartWait.waitFor;

/**
 * @author Zeeshan Asghar
 *This is Results page class which contains methods related to Results page
 * @date 24-10-2022
 */
public class Results {
    WebDriver driver;
    OR_Results or_results;

    /**
     * parameterized constructor of Results class
     * @param driver instance of web driver
     */
    public Results(WebDriver driver) {
        this.driver = driver;
        or_results = PageFactory.initElements(driver, OR_Results.class);
    }

    /**
     * clicks second item in search results
     */
    public void clickSecondItem() {
        waitFor(or_results.itemSecond, Timer.getWaitTime());
        or_results.itemSecond.click();
    }

}
