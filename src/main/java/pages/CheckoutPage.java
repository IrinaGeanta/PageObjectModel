package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers {
    public By billingDetails = By.xpath("//div[contains(@class,'billing')]/h3");
    public By additionalInformation = By.xpath("//div[contains(@class,'additional')]/h3");
}
