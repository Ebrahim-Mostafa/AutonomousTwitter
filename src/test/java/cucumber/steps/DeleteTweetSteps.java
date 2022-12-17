package cucumber.steps;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.DeleteTweetActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteTweetSteps extends BaseDeviceTest {

    DeleteTweetActions DTA = new DeleteTweetActions();

//    @Given("^User is already logged in$")
    public void user_is_already_logged_in() {
        System.out.println("======================== Ensure that user should be logged in before running the script ========================");
    }

    @And("^User clicks on tweet options$")
    public void user_clicks_on_tweet_options() {
        DTA.clickOnTweetOptions();
    }
    @And("^User clicks on delete tweet option$")
    public void user_clicks_on_delete_tweet_option() {
        DTA.clickOnDeleteTweetOption();
    }
    @When("^User confirms deleting tweet$")
    public void user_confirms_deleting_tweet() {
        DTA.clickOnConfirmTweetDeleteBtn();
    }

    @Then("^Tweet should be deleted$")
    public void tweet_should_be_deleted() {
        System.out.println("Tweet should be deleted by now");
    }
}
