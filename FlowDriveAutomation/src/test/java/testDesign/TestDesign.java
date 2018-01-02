package testDesign;

import base.BaseSetUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testImplementation.TestImplementation;

public class TestDesign {
    TestImplementation implObj = new TestImplementation();

    @Given("^User is on launch page$")
    public void user_is_on_launch_page() throws Exception{
        Thread.sleep(300);
        implObj.LaunchPage();
    }

    @When("^User clicks signup and provide valid inputs$")
    public void user_clicks_signup() throws Exception{
        implObj.create_account();
    }

    @Then("^The account is created and user should redirect to login page$")
    public void the_account_is_created_and_user_should_redirect_to_login_page() throws  Exception  {
        implObj.user_in_loginpage();
    }

    @When("^User provide valid login inputs and submit$")
    public void user_provide_valid_login_inputs_and_submit() throws Throwable {
        implObj.user_input_for_login();
    }

    @Then("^The user should launch in homepage$")
    public void the_user_should_launch_in_homepage() throws Throwable {
        implObj.user_in_loginpage();
    }

    @When("^User clicks start button & get duration information$")
    public void user_clicks_start_button_get_duration_information() throws Throwable {
        implObj.start_journey();
    }

    @When("^User clicks stop button & get duration information$")
    public void user_clicks_stop_button_get_duration_information() throws Throwable {
        implObj.stop_journey();
    }

    @Then("^The user should able to start journey correctly$")
    public void the_user_should_able_to_start_journey_correctly() throws Throwable {
        implObj.get_start_journey_duration();
    }

    @Then("^The user should able to stop journey correctly$")
    public void the_user_should_able_to_stop_journey_correctly() throws Throwable {
        implObj.get_stop_journey_duration();
    }

    @When("^User clicks emergency button$")
    public void user_clicks_emergency_button() throws Throwable {
        implObj.click_emergency_button();
    }

    @When("^User clicks accident button$")
    public void user_clicks_accident_button() throws Throwable {
        implObj.click_accident_button();
    }

    @Then("^The user should be provided with call option$")
    public void the_user_should_be_provided_with_call_option() throws Throwable {
        implObj.display_emergencycall_asst();
    }

    @When("^User clicks breakdown button$")
    public void user_clicks_breakdown_button() throws Throwable {
        implObj.click_breakdown_button();
    }

    @When("^User clicks social page$")
    public void user_clicks_social_page() throws Throwable {
        implObj.click_social_page();
    }

    @When("^User provides screen name$")
    public void user_provides_screen_name() throws Throwable {
        implObj.provide_screen_name();
    }

    @When("^User provides profile picture$")
    public void user_provides_profile_picture() throws Throwable {
        implObj.attach_profile_pic();
    }

    @When("^User provides about me$")
    public void user_provides_about_me() throws Throwable {
        implObj.provide_about_me();
    }

    @Then("^The user should be displayed with scores, friend & my profile icon$")
    public void the_user_should_be_displayed_with_scores_friend_my_profile_icon() throws Throwable {
        implObj.social_page_after_profile_info();
    }

    @When("^User clicks my profile$")
    public void user_clicks_my_profile() throws Throwable {
        implObj.click_my_profile();
    }

    @When("^User edit profile$")
    public void user_edit_my_profile() throws Throwable {
        implObj.edit_profile();
    }

    @Then("^The user should be displayed with changed screen name$")
    public void the_user_should_be_displayed_with_changed_screen_name() throws Throwable {
        implObj.verify_edited_profile();
    }

}
