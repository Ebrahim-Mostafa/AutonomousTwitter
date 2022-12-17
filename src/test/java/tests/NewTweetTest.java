package tests;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.NewTweetActions;
import org.testng.annotations.Test;

public class NewTweetTest extends BaseDeviceTest {

    public NewTweetActions NTA = new NewTweetActions();

    @Test
    public void Create_New_Autonomous_Tweet() {
        NTA.clickOnPlusBtn();
        NTA.clickOnCreatNewTweetBtn();
        NTA.writeNewTweet("This is Autonomous Tweet");
        NTA.clickOnPostTweetBtn();
        NTA.clickOnTweetToast();
    }
}
