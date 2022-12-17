package cucumber.steps;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.NewTweetActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewTweetSteps extends BaseDeviceTest {

    NewTweetActions NTA = new NewTweetActions();


    @Given("^User is already logged in$")
    public void user_is_already_logged_in() {
        System.out.println("======================== Ensure that user should be logged in before running the script ========================");
    }

    @And("^User clicks on twitter plus icon on home screen$")
    public void user_clicks_on_twitter_plus_icon_on_home_screen() {
        NTA.clickOnPlusBtn();
    }

    @And("^User clicks on create new tweet$")
    public void user_clicks_on_create_new_tweet() {
        NTA.clickOnCreatNewTweetBtn();
    }

    @And("^User clicks write new tweet from his account$")
    public void user_clicks_write_new_tweet_from_his_account() {
        System.out.println("User is typing tweet content by now");
    }

    @And("^User write tweet$")
    public void user_write_tweet() {
        NTA.writeNewTweet("This is Autonomous Tweet");
    }

    @When("^User clicks on tweet button$")
    public void user_clicks_on_tweet_button() {
        NTA.clickOnPostTweetBtn();
    }

    @Then("^User clicks on new tweet toast$")
    public void user_clicks_on_new_tweet_toast() {
        NTA.clickOnTweetToast();
    }

}
