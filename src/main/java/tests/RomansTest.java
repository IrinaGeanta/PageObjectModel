package tests;

import org.testng.annotations.Test;
import utils.BaseTest;
import utils.DataProviderClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RomansTest extends BaseTest {

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "romansBookCategory")
    public void romansBooks(String name, String url){
        app.menu.navigateTo(app.menu.booksLink);
        app.click(app.bookCategoryMenuPage.romansCategory);

        app.click(app.romansCategoryPage.getRomanBookLink(name));
        assertEquals(driver.getCurrentUrl(), url);
        assertTrue((app.getText(app.detailsPage.bookCategory)).contains("Romans"));
       // driver.navigate().back();

    }
}
