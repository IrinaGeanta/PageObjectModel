package pages;

import tests.ShippingAddressTest;
import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers {
    public MenuPage menu = new MenuPage(driver);
    public LoginPage login = new LoginPage(driver);
    public ShopPage shop = new ShopPage(driver);
    public AccountSettingsMenuPage accountSettings = new AccountSettingsMenuPage(driver);
    public EditAddressesPage editAddresses = new EditAddressesPage(driver);
    public ShippingAddressPage shippingAddress = new ShippingAddressPage(driver);
    public BlogSubMenuPage blogSubMenu = new BlogSubMenuPage(driver);
    public ClassicCategoryPage classicCategory = new ClassicCategoryPage(driver);
    public BlogPostPage blogPost = new BlogPostPage(driver);

    public SearchResultPage searchResultPage = new SearchResultPage();
}
