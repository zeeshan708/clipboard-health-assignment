package amazon.pages.pages;

import amazon.pages.objects.OR_MenuLeft;
import amazon.utils.Timer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static amazon.utils.SmartWait.waitFor;

/**
 * @author Zeeshan Asghar
 *This is Lefe menu page class which contains methods related to left menu page class.
 * @date 24-10-2022
 */
public class MenuLeft {
    WebDriver driver;
    OR_MenuLeft or_menuLeft;

    /**
     * parameterized constructor of Menu Left class
     * @param driver instance of web driver
     */
    public MenuLeft(WebDriver driver) {

        this.driver = driver;
        or_menuLeft = PageFactory.initElements(driver, OR_MenuLeft.class);
    }

    /**
     * clicks electronics menu item in left menu
     */
    public void clickElectronicsMenuItem() {
        waitFor(or_menuLeft.menuItemElectronics, Timer.getWaitTime());
        or_menuLeft.menuItemElectronics.click();
    }

    /**
     * clicks Television And Video sub menu item in left menu
     */
    public void clickTelevisionAndVideoSubMenuItem() {
        waitFor(or_menuLeft.subMenuItemTelevisionAndVideo, Timer.getWaitTime());
        or_menuLeft.subMenuItemTelevisionAndVideo.click();
    }

    /**
     * clicks the brand checkbox in brand filters
     */
    public void selectBrand() {
        waitFor(or_menuLeft.checkBoxBrand, Timer.getWaitTime());
        or_menuLeft.checkBoxBrand.click();
    }
}
