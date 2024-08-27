package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class BasePage {
    @Given("^user navigates to the login page$")
    public void user_navigates_to_the_login_page() throws Throwable {
        click_hamburguer_menu();
        click_signIn_link();
    }
}
