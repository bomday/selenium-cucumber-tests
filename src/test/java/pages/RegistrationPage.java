package pages;

import org.openqa.selenium.By;

import static utils.BrowserDriver.driver;

public class RegistrationPage {
    public static String registration_heading_xpath = "/html/body/center/h1";

    public static String visibility_registration_heading() {
        return driver.findElement(By.xpath(registration_heading_xpath)).getText();
    }
}
