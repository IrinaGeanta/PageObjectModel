package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class ContactPage extends SeleniumWrappers {

    public By nameField = By.cssSelector("input[name='your-name']");
}
