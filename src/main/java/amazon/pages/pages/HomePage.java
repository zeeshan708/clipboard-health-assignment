package amazon.pages.pages;

import amazon.pages.objects.OR_HomePage;
import amazon.utils.Timer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static amazon.utils.SmartWait.waitFor;

/**
 * @author Zeeshan Asghar
 * This is Home page class which contains methods related to Home page
 * @date 24-10-2022
 */
public class HomePage {
    WebDriver driver;
    OR_HomePage or_homepage;

    /**
     * parameterized constructor of home page class
     * @param driver instance of web driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        or_homepage = PageFactory.initElements(driver, OR_HomePage.class);
    }

    /**
     * clicks Hamburger menu button on header
     */
    public void clickMenuBtn() {
        waitFor(or_homepage.menuTabbed, Timer.getWaitTime());
        or_homepage.menuTabbed.click();
    }

}
