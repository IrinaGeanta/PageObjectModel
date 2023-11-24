package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class PlaceAnOrderTest extends BaseTest {
    @Test(priority=1)
    public void searchAndAddToCart(){
        app.menu.search("The story about me");
        app.searchResultPage.click(app.searchResultPage.loadMoreResults);
        app.searchResultPage.click(app.searchResultPage.loadMoreResults);
        app.searchResultPage.click(app.searchResultPage.storyAboutMeBookLink);
        // aici probabil ar fi trebuit sa fac un search mai destept, dc nu e pe pagina sa dea loadmore ..
        // o sa incerc sa fac pana data viitoare.. tot pendulez intre faptul ca stiu ca e pe pagina care e, sau poate
        // sa fi facut inteligent treaba. ..

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
        action.scrollToElement(app.returnElement(app.cartPage.proceedToCheckout));

        Thread.sleep(2000);
        // aici e sf pt mine de ce nu merge fara sleep, mi-a iesit fara sleep unconsistently though dc faceam
        // scroll by amount din 2 bucati ca altfel tot asa nu pricep de ce nu vrea sa scroleze acolo  fara acest sleep...
        // nu inteleg

        app.cartPage.click(app.cartPage.proceedToCheckout);
        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/checkout/");

        assertEquals(app.checkoutPage.getText(app.checkoutPage.billingDetails),"Billing details");
        assertEquals(app.checkoutPage.getText(app.checkoutPage.additionalInformation),"Additional information");


    }
}
