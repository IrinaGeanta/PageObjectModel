package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class ShippingAddressTest extends BaseTest {

    @Test
    public void shippingAddress(){
        app.menu.navigateTo(app.menu.loginLink);
        app.login.loginInApp("TestUser","12345@67890");

        app.login.openProfileDetails();
        app.accountSettings.click(app.accountSettings.addresses);

        app.editAddresses.click(app.editAddresses.shippingAddressButton);
        app.shippingAddress.selectByIndex(41,app.shippingAddress.countryDropdown);

        assertEquals(app.shippingAddress.getSelectedOption(app.shippingAddress.countryDropdown),"Canada");

        app.shippingAddress.selectByValue("NL",app.shippingAddress.shippingState);
        assertEquals(app.shippingAddress.getSelectedOption(app.shippingAddress.shippingState),"Newfoundland and Labrador");


    }
}
