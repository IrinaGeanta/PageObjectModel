package pages;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers {
    public MenuPage menu = new MenuPage(driver);
    public LoginPage login = new LoginPage(driver);
    public ShopPage shop = new ShopPage(driver);
}
