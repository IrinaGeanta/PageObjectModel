package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
    @Parameters({"user","pass"}) // daca punem parameters rulam din xml .. ca altfel nu stie de unde sa ii ia
    @Test(priority=1, groups="LoginFunctionality")
    public void validLogin(String username, String password){
        //MenuPage menu = new MenuPage(driver);
        app.menu.navigateTo(app.menu.loginLink);

        app.login.loginInApp(username, password);
        app.login.click(app.login.logoutButton);
    }

    @Test(priority = 2, groups="LoginFunctionality")
    public void invalidLogin(){
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.loginLink);

        LoginPage login = new LoginPage(driver);
        login.loginInApp("blabla","blabla");
    }

}
