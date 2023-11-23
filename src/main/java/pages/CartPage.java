package pages;

import org.openqa.selenium.By;
import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers {
public By quantity = By.xpath("//input[@type='number']");
public By updateCartButton = By.xpath("//button[@name='update_cart']");
public By updateCartMessage = By.xpath("//div[@role='alert']");
public By proceedToCheckout = By.xpath("//a[contains(@class,'checkout-button')]");
}
