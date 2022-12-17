package tests;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.DeleteTweetActions;
import org.testng.annotations.Test;

public class DeleteTweetTest extends BaseDeviceTest {

    DeleteTweetActions DTA = new DeleteTweetActions();

    @Test
    public void Delete_Newly_Created_Tweet(){
        DTA.clickOnTweetOptions();
        DTA.clickOnDeleteTweetOption();
        DTA.clickOnConfirmTweetDeleteBtn();
    }
}
