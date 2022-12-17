package PageObjects.Methods;

import PageObjects.Elements.FollowAccountElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import static BasePackage.BaseDeviceTest.driver;
import static BasePackage.BaseDeviceTest.element;

public class FollowAccountActions extends FollowAccountElements {

    SoftAssert sa = new SoftAssert();
    public void clickOnSearchIcon(){
        sa.assertEquals(element(search_icon).isDisplayed(),true);
        element(search_icon).click();
        sa.assertAll();
    }

    public void clickOnSearchTwitter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(search_twitter));
        sa.assertTrue(element(search_twitter).isDisplayed(),"Search For Twitter Account");
        element(search_twitter).click();
        sa.assertAll();
    }

    public void searchOnTwitterAccount(String accountname) {
        sa.assertTrue(element(search_field).isEnabled());
        element(search_field).sendKeys(accountname);
        sa.assertAll();
    }

    public void clickOnSearchedAccount(){
        sa.assertTrue(element(user_account).isDisplayed());
        element(user_account).click();
        sa.assertAll();
    }

    public void clickOnFollowBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(follow_btn));
        sa.assertTrue(element(follow_btn).isDisplayed());
        element(follow_btn).click();
        sa.assertTrue(element(following_btn).isDisplayed());
        sa.assertEquals(element(following_btn).getText(),"FOLLOWING");
        sa.assertAll();
    }
}
