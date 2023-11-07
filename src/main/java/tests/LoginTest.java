package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    @Test(priority=1)
    public void validLogin(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);

        LoginPage login = new LoginPage(driver);
        login.loginInApp("TestUser","12345@67890");
        login.click(login.logoutButton);
    }

    @Test(priority = 2)
    public void invalidLogin(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);

        LoginPage login = new LoginPage(driver);
        login.loginInApp("blabla","blabla");
    }

}
