package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class WindowHandle extends BaseTest {
    @Test
    public void windowHandleTest() throws InterruptedException {

        app.click(app.menu.eventsLink);
        app.click(app.eventsPage.seminarOfModernArtLink);

        app.scrollVertically(800);

        System.out.println("selenium tab: " + driver.getWindowHandle());
        app.genericEvent.clickLargerMap();
        System.out.println("selenium tab after click: " + driver.getWindowHandle());
        System.out.println("all tabs: " + driver.getWindowHandles());

        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));

        driver.findElement(By.xpath("//span[contains(text(), 'Accept all')]")).click();
        Thread.sleep(3000);
        driver.close(); // inchide tabul, nu stie sa faca switch la tabul anterior, trebuie facut switch chiar si asa.
        driver.switchTo().window(browserTabs.get(0));
        app.genericEvent.clickLargerMap();

        /*
         * for(int i = 0, i<browserTabs.size(); i++){
         *
         *  driver.switchTo().window(browserTabs.get(i));

         *   if(driver.getCurrentUrl().equals("My url")){
         *   	app.click()
         *
         *   }
         * }
         */

    }
}
