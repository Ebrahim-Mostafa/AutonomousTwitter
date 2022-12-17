package PageObjects.Methods;

import PageObjects.Elements.DeleteTweetElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import static BasePackage.BaseDeviceTest.driver;
import static BasePackage.BaseDeviceTest.element;

public class DeleteTweetActions extends DeleteTweetElements {

    SoftAssert sa = new SoftAssert();

    public void clickOnTweetOptions(){
        sa.assertTrue(element(tweetOptions).isDisplayed());
        element(tweetOptions).click();
        sa.assertAll();
    }

    public void clickOnDeleteTweetOption(){
        sa.assertEquals(element(deleteTweetOption).getText(),"Delete Tweet");
        element(deleteTweetOption).click();
        sa.assertAll();
    }

    public void clickOnConfirmTweetDeleteBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteTweetAlertTitle));
        sa.assertEquals(element(deleteTweetAlertTitle).isDisplayed(),true);
        sa.assertTrue(element(deleteTweetMessage).isDisplayed());
        sa.assertEquals(element(deleteBtn).isEnabled(),true);
        element(deleteBtn).click();
        sa.assertAll();
    }
}
