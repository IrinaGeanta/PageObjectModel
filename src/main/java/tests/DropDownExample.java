package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class DropDownExample extends BaseTest {

    @Test(priority = 1)
    public void testSelectByValue(){
        app.click(app.menu.shopLink);
        app.shop.selectByValue("date");

        assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/?orderby=date");
        assertEquals(app.shop.getSelectedOption(),"Sort by latest");
    }

    @Test(priority = 2)
    public void testSelectByIndex(){
        app.click(app.menu.shopLink);
        app.shop.selectByIndex(4);

        assertEquals(app.shop.getSelectedOption(),"Sort by price: low to high");
    }

    @Test(priority = 3)
    public void testSelectByVisibleText(){
        app.click(app.menu.shopLink);
        app.shop.selectByVisibleText("Sort by average rating");

        assertEquals(app.shop.getSelectedOption(),"Sort by average rating");
    }
}
