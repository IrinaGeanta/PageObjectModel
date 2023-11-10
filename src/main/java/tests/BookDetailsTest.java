package tests;

import org.testng.annotations.Test;
import pages.DetailsPage;
import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

public class BookDetailsTest extends BaseTest {

    @Test
    public void bookDetailsDisplayed(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.shopLink);

        ShopPage shop = new ShopPage(driver);
        shop.click(shop.aHundredAndOneReceiptsBookLink);
        //shop.click(shop.cookingWithLoveBookLink);

        DetailsPage book = new DetailsPage(driver);
        assertTrue(book.isDisplayed(book.imageBook));
        assertTrue(book.isDisplayed(book.bookTitle));
        assertTrue(book.isDisplayed(book.bookRating));
        assertTrue(book.isDisplayed(book.bookPrice));
        assertTrue(book.isDisplayed(book.bookDescription));
        assertTrue(book.isDisplayed(book.bookQuantity));
        assertTrue(book.isDisplayed(book.addToCartButton));
        assertTrue(book.isDisplayed(book.bookCategory));
        assertTrue(book.isDisplayed(book.bookTags));
        assertTrue(book.isDisplayed(book.bookId));

    }
}
