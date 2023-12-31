package pages;

import tests.ShippingAddressTest;
import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers {
    public MenuPage menu = new MenuPage(driver);
    public LoginPage login = new LoginPage(driver);
    public ShopPage shop = new ShopPage(driver);
    public DetailsPage detailsPage = new DetailsPage(driver);
    public CartPage cartPage = new CartPage();
    public CheckoutPage checkoutPage = new CheckoutPage();
    public BookCategoryMenuPage bookCategoryMenuPage = new BookCategoryMenuPage();
    public AccountSettingsMenuPage accountSettings = new AccountSettingsMenuPage(driver);
    public EditAddressesPage editAddresses = new EditAddressesPage(driver);
    public ShippingAddressPage shippingAddress = new ShippingAddressPage(driver);
    public BlogSubMenuPage blogSubMenu = new BlogSubMenuPage(driver);
    public ClassicCategoryPage classicCategory = new ClassicCategoryPage(driver);
    public BlogPostPage blogPost = new BlogPostPage(driver);

    public SearchResultPage searchResultPage = new SearchResultPage();
    public RomansCategoryPage romansCategoryPage = new RomansCategoryPage();
    public PostFormatsPage postFormat = new PostFormatsPage();
    public ContactPage contactPage = new ContactPage();
    public EventsPage eventsPage = new EventsPage();
    public GenericEventPage genericEvent = new GenericEventPage();
    public AudioPostPage audioPost = new AudioPostPage();
    public GalleryFormatPage galleryFormat = new GalleryFormatPage();


}
