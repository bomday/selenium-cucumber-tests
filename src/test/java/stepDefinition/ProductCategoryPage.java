package stepDefinition;

import io.cucumber.java.en.Then;

import static pages.ProductCategoryPage.*;

public class ProductCategoryPage {
    @Then("^user should be able to view the product category page$")
    public void user_should_be_able_to_view_the_product_category_page() {
        visibility_product();
    }
}
