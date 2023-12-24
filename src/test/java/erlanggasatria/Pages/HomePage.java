package erlanggasatria.Pages;

import erlanggasatria.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.AppiumDriver;


public class HomePage extends BaseTest {

    By Cartklikbutton = AppiumBy.accessibilityId("test-Cart");
    By FilterKlikButton = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]");
    By FilterPriceLowtoHigh = AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]");
    By validasifilterlowtohigh = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[1]");

    public void cartbutton(){
        driver.findElement(Cartklikbutton).click();
    }
    public void Filterbutton(){
        driver.findElement(FilterKlikButton).click();
    }
    public void FilterlowtoHigh(){
        wait.until(ExpectedConditions.presenceOfElementLocated(FilterPriceLowtoHigh));
        driver.findElement(FilterPriceLowtoHigh).click();
    }
    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("test-Cart")));
    }

    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));
    }
}

