import amazon.config.EnvFactory;
import amazon.constants.CONSTANTS;
import amazon.factories.DriverFactory;
import amazon.pages.pages.Header;
import amazon.pages.pages.HomePage;
import amazon.pages.pages.ItemDetail;
import amazon.pages.pages.MenuLeft;
import amazon.pages.pages.Results;
import com.typesafe.config.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestVerifyAboutSectionExists {
    private static final Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    private final WebDriver driver = DriverFactory.getDriver();

    @Tag("smokeTest")
    @DisplayName("To Verify that the about item section exists on item detail page.")

    @Test
    void assertThatItemAboutSectionExists() {
        try {
            driver.get(HOME_PAGE_URL);
            HomePage homepage = new HomePage(driver);
            MenuLeft menuLeft = new MenuLeft(driver);
            Header header = new Header(driver);
            Results results = new Results(driver);
            ItemDetail itemDetail = new ItemDetail(driver);

            homepage.clickMenuBtn();
            menuLeft.clickElectronicsMenuItem();
            menuLeft.clickTelevisionAndVideoSubMenuItem();

            // scroll down to brand filter
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");

            menuLeft.selectBrand();
            header.clickSortByBtn();
            header.clickPriceHighToLowDrpDwn();
            results.clickSecondItem();

            // Verify that the item detail page contains the item about section
            assertEquals(CONSTANTS.ABOUT_ITEM_TEXT, itemDetail.getTxtAboutItem());
            driver.close();
        } catch (Exception exception) {
            fail("Test Failed.", exception);
        }
    }
}
