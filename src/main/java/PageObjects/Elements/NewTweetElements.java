package PageObjects.Elements;

import org.openqa.selenium.By;

public class NewTweetElements {

    public static By plusBtn = By.id("com.twitter.android:id/composer_write");

    public static By newTweet = By.xpath("//android.widget.ImageButton[@content-desc='New Tweet']");

    public static By tweetText = By.id("com.twitter.android:id/tweet_text");

    public static By tweetBtn = By.id("com.twitter.android:id/button_tweet");

    public static By tweetToast= By.id("com.twitter.android:id/toast_title");

}
