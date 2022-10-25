//package amazon.utils;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import static amazon.utils.SmartWait.waitFor;
//
//public class CommonMethods {
//
//    public void selectByVisibleText (WebElement webElement, String strValue)
//    {
//        waitFor (webElement, Timer.getWaitTime ());
//        Select dropdownList = new Select (webElement);
//        waitFor (dropdownList, Timer.getWaitTime ());
//        dropdownList.selectByVisibleText (strValue);
//        System.out.println (strValue + " is selected successfully.");
//    }
//}
