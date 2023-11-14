package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class AccountSettingsMenuPage extends SeleniumWrappers {
    public WebDriver driver;
    public AccountSettingsMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public By addresses = By.linkText("Addresses");
}
