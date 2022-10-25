package amazon.utils;

import amazon.factories.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @author Zeeshan Asghar
 * This class contains methods to wait for elements during execution.
 * @date 24-10-2022
 */
public class SmartWait {

    /**
     * waitFor method will wait until specified web element is loaded and ready to use
     *
     * @param webElement the located web element
     * @param timer the timeout time in seconds
     */
    public static void waitFor (WebElement webElement, int timer) {
        try {
             WebDriver driver = DriverFactory.getDriver();
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timer))
                    .pollingEvery(Duration.ofSeconds(1))
                    .ignoreAll(Arrays.asList
                            (
                                    NoSuchElementException.class,
                                    StaleElementReferenceException.class
                            ))
                    .withMessage("TimeoutException is thrown");
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(webElement)));
            wait.until(SmartWait.elementLoaded(webElement));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
        } catch (StaleElementReferenceException | TimeoutException | NoSuchElementException  e) {
            e.printStackTrace();
        }
    }

    /**
     * elementLoaded function to be used in WaitFor method to assure element is loaded
     * @param webElement element to be loaded
     */
    public static Function<WebDriver, Boolean> elementLoaded (WebElement webElement)
    {
        return driver ->
        {
            return webElement != null && webElement.isDisplayed ();
        };
    }

}
