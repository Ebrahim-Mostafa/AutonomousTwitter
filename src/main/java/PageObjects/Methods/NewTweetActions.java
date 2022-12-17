package PageObjects.Methods;

import PageObjects.Elements.NewTweetElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import static BasePackage.BaseDeviceTest.driver;
import static BasePackage.BaseDeviceTest.element;

public class NewTweetActions extends NewTweetElements {

    SoftAssert sa = new SoftAssert();

    public void clickOnPlusBtn(){
        sa.assertTrue(element(plusBtn).isDisplayed());
        element(plusBtn).click();
        sa.assertAll();
    }

    public void clickOnCreatNewTweetBtn(){
        sa.assertEquals(element(newTweet).isDisplayed(),true);
        element(newTweet).click();
        sa.assertAll();
    }

    public void writeNewTweet(String tweetcontent){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tweetText));
        sa.assertTrue(element(tweetText).isDisplayed());
        element(tweetText).sendKeys(tweetcontent);
        driver.hideKeyboard();
        sa.assertAll();
    }

    public void clickOnPostTweetBtn(){
        sa.assertTrue(element(tweetBtn).isEnabled());
        element(tweetBtn).click();
        sa.assertAll();
    }

    public void clickOnTweetToast(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tweetToast));
        element(tweetToast).click();
    }
}
