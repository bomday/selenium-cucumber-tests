package stepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.*;

public class RegistrationPage {
    @Then("^user should be able to view the registration page$")
    public void user_should_be_able_to_view_the_registration_page() {
        String actualRegistrationPageHeading = visibility_registration_heading();
        assertEquals(actualRegistrationPageHeading, "User Registration Page");
    }
}