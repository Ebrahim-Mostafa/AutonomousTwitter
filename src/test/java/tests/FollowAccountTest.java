package tests;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.FollowAccountActions;
import org.testng.annotations.Test;

public class FollowAccountTest extends BaseDeviceTest {

    FollowAccountActions FAA = new FollowAccountActions();

    @Test
    public void Follow_Twitter_Account() {
        FAA.clickOnSearchIcon();
        FAA.clickOnSearchTwitter();
        FAA.searchOnTwitterAccount("@elonmusk");
        FAA.clickOnSearchedAccount();
        FAA.clickOnFollowBtn();
    }
}
