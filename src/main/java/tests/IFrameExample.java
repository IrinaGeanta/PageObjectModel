package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

public class IFrameExample extends BaseTest {

    @Test
    public void iFrameExample() throws InterruptedException {
        app.click(app.menu.contactsLink);
        Thread.sleep(5000);
        app.contactPage.zoomMap(app.contactPage.zoomOutMap);
        driver.switchTo().defaultContent();
        app.sendKeys(app.contactPage.nameField, "Test ceva");
    }
}
