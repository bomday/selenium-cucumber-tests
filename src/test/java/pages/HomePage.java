package pages;

import org.openqa.selenium.By;
import static utils.BrowserDriver.driver;

// Each class in the "pages" directory represents a page on the website
// Each method represents different operations that occur on the page
public class HomePage {
    public static String hamburguer_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";

    public static void click_hamburguer_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburguer_menu_xpath)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }
}
