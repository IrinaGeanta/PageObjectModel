package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class PlaceAnOrderTest extends BaseTest {
    @Test(priority=1)
    public void searchAndAddToCart(){
        app.menu.search("The story about me");
        app.searchResultPage.searchInSearchResult(app.searchResultPage.storyAboutMeBookLink);

        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/the-story-about-me/");

        app.detailsPage.click(app.detailsPage.addToCartButton);
        assertEquals(app.detailsPage.getText(app.detailsPage.addToCartMessage).substring(10),"“The story about me” has been added to your cart.");

        app.detailsPage.click(app.detailsPage.viewCartButton);
        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/cart/");
    }

    @Test(priority = 2)
    public void checkoutOrder() throws InterruptedException {
        app.cartPage.sendKeys(app.cartPage.quantity, "2");
        app.cartPage.click(app.cartPage.updateCartButton);
        assertEquals(app.cartPage.getText(app.cartPage.updateCartMessage), "Cart updated.");

        Actions action = new Actions(driver);
        action.scrollToElement(app.returnElement(app.cartPage.proceedToCheckout)).perform();
        Thread.sleep(2000);
        //aici nu facusem perform()

        app.cartPage.click(app.cartPage.proceedToCheckout);
        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/checkout/");

        assertEquals(app.checkoutPage.getText(app.checkoutPage.billingDetails),"Billing details");
        assertEquals(app.checkoutPage.getText(app.checkoutPage.additionalInformation),"Additional information");


    }
}
