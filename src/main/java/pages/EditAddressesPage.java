package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class EditAddressesPage extends SeleniumWrappers {
    public WebDriver driver;
    public EditAddressesPage(WebDriver driver){
        this.driver = driver;
    }

    public By shippingAddressButton = By.cssSelector("a[href*='shipping']");

}
