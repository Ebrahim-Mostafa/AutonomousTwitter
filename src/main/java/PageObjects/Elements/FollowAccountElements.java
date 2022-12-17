package PageObjects.Elements;

import org.openqa.selenium.By;

public class FollowAccountElements {

    public static By search_icon = By.xpath("//android.widget.LinearLayout[@content-desc='Search and Explore']/android.view.View");

    public static By search_twitter = By.id("com.twitter.android:id/query_view");

    public static By search_field = By.id("com.twitter.android:id/query");

    public static By user_account = By.xpath("//*[@text='Elon Musk']");

    public static By follow_btn = By.id("com.twitter.android:id/button_bar_follow");

    public static By following_btn = By.id("com.twitter.android:id/button_bar_following");

}
