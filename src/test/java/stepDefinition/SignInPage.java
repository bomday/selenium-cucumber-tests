package stepDefinition;

import io.cucumber.java.en.When;

import static pages.SignInPage.*;

public class SignInPage {
    @When("^user successfully enters the log in details$")
    public void user_successfully_enters_the_log_in_details() {
        sendKeys_username();
        sendKeys_password();
        click_login_btn();
    }

    @When("user clicks on new registration button")
    public void user_clicks_on_new_registration_button() {
        click_registration_btn();
    }
}
