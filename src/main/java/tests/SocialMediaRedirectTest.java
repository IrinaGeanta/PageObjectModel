package tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

//deci aci am facut 2 variante, prima pare complicata .. adica atat am vrut sa faca chestiile inteligent ca cred
//ca era mai simplu dc le puneam unele sub altele toate comenzile, fara atatea floricele :))
//am avut o problema cu acel browserTabs, care am incercat sa il initializez numa o data cum e normal, doar ca nu am putut
//sa ii reasignez o valoare pt ca e set ce rezulta din ala si nu mi-a mers cast .. nu pricep exact ce gresesc acolo, nici nu m-am gandit f mult :)
// .. nu stiu exact ce am facut .. asa am ajuns la aceasta forma care merge
// este comentat @Test ca mai jos e rezolvarea 2 :))
public class SocialMediaRedirectTest extends BaseTest {
   // @Test
    public void socialMediaRedirect(){


        List<By> socialMediaLinks = new ArrayList<>();
        socialMediaLinks.add(app.menu.facebookLink);
        socialMediaLinks.add(app.menu.twitterLink);
        socialMediaLinks.add(app.menu.instagramLink);

        List<String> urls = new ArrayList<>();
        urls.add(driver.getCurrentUrl());

        for (int i =0; i<socialMediaLinks.size();i++) {
            app.click(socialMediaLinks.get(i));
            List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(browserTabs.get(i+1));
            urls.add(driver.getCurrentUrl());

            driver.switchTo().window(browserTabs.get(0));
        }
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        for(int i = 0; i<browserTabs.size(); i++) {

            driver.switchTo().window(browserTabs.get(i));
            assertEquals(driver.getCurrentUrl(),urls.get(i));
        }
    }


    //am vrut initial sa fac cu data provider si dupa m-am razgandit si dupa am  zis totusi sa incerc si cu data provider local
    @DataProvider(name = "linkTest")
    public Object[][] loginTestData(){

        Object[][] data = new Object[3][2];

        data[0][0] = app.menu.facebookLink;
        data[0][1] = "https://www.facebook.com/keytraining.ro";

        data[1][0] = app.menu.twitterLink;
        data[1][1] = "https://twitter.com/";

        data[2][0] = app.menu.instagramLink;
        data[2][1] = "https://www.instagram.com/";

        return data;
    }

    @Test(dataProvider = "linkTest")
    public void socialMediaRedirect2(By locator, String url){
        app.click(locator);
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        assertEquals(driver.getCurrentUrl(),url);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }
}
