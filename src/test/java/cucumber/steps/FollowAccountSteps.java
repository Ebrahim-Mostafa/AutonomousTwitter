package cucumber.steps;

import BasePackage.BaseDeviceTest;
import PageObjects.Methods.FollowAccountActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FollowAccountSteps extends BaseDeviceTest {

    FollowAccountActions FAA = new FollowAccountActions();

//    @Given("^User is already logged in$")
    public void user_is_already_logged_in() {
        System.out.println("======================== Ensure that user should be logged in before running the script ========================");
    }

    @And("^User clicks on search icon$")
    public void user_clicks_on_search_icon() {
        FAA.clickOnSearchIcon();
    }

    @And("^User clicks on search field$")
    public void user_clicks_on_search_field() {
        FAA.clickOnSearchTwitter();
    }

    @When("^User type searched account$")
    public void user_type_searched_account() {
        FAA.searchOnTwitterAccount("@elonmusk");
    }

    @Then("^User can see the searched account$")
    public void user_can_see_the_searched_account() {
        System.out.println("User should see Elon Musk account");
    }

    @Then("^User clicks on searched account$")
    public void user_clicks_on_searched_account() {
        FAA.clickOnSearchedAccount();
    }

    @Then("^User click on follow button$")
    public void user_click_on_follow_button() {
        FAA.clickOnFollowBtn();
    }
}
