package PageObjects.Elements;

import org.openqa.selenium.By;

public class DeleteTweetElements {

    public static By tweetOptions = By.id("com.twitter.android:id/tweet_curation_action");

    public static By deleteTweetOption = By.xpath("//*[@text='Delete Tweet']");

    public static By deleteTweetAlertTitle = By.id("com.twitter.android:id/alertTitle");

    public static By deleteTweetMessage = By.id("android:id/message");

    public static By deleteBtn = By.id("android:id/button1");
}
