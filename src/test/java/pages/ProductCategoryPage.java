package pages;

import org.openqa.selenium.By;

import static utils.BrowserDriver.driver;

public class ProductCategoryPage {
    public static String product_heading_xpath = "//*[@id=\"ShoeType\"]";
    public static void visibility_product() {
        driver.findElement(By.xpath(product_heading_xpath));
    }
}
