package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

public class ActionClassExample extends BaseTest {
   // @Test
    public void hoverExample() throws InterruptedException {
    app.hoverElement(app.menu.blog);
    Thread.sleep(2000);
    app.hoverElement(app.blogSubMenu.portfolioOption);
    Thread.sleep(2000);
    app.hoverElement(app.blogSubMenu.masonry);
    Thread.sleep(2000);
    app.hoverElement(app.menu.aboutLink);
    }

   // @Test
    public void dragAndDropExample(){
        app.click(app.menu.shopLink);
        app.scrollVertically(350);
        app.dragAndDrop(app.shop.sliderInitialPosition, 100,0);
        app.dragAndDrop(app.shop.sliderFinalPosition,-100,0);
    }

    //@Test
    public void sendKeysExample(){
        app.hoverElement(app.menu.blog);
        app.click(app.blogSubMenu.postFormatsLink);

        WebElement searchField = app.returnElement(app.postFormat.searchField);
        Actions action = new Actions(driver);
        action.moveToElement(searchField)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys(searchField,"abracadabra")
                .perform();

    }

   // @Test
    public void sendKeysExample2() throws InterruptedException {
        app.click(app.menu.contactsLink);
        Actions action = new Actions(driver);
        action
                .sendKeys(app.returnElement(app.contactPage.nameField),"Name")
                .sendKeys(Keys.TAB,"email@email.com")
                .sendKeys(Keys.TAB,"My subject")
                .sendKeys(Keys.TAB,"My message")
                .sendKeys(Keys.TAB, Keys.ENTER)
                .perform();

        /*Thread.sleep(3000);
        action.click().perform();
        for(int i=0; i<10; i++){
            action.sendKeys(Keys.TAB).perform();
        }
        action
                .sendKeys(Keys.TAB,"Name")
                .sendKeys(Keys.TAB,"email@email.com")
                .sendKeys(Keys.TAB,"My subject")
                .sendKeys(Keys.TAB,"My message")
                .sendKeys(Keys.TAB, Keys.ENTER)
                .perform();
*/
    }
    @Test
    public void keysExample(){
        app.click(app.menu.loginLink);
        Actions action = new Actions(driver);
        action.sendKeys(app.returnElement(app.login.usernameField),"abracadabra").perform();
        action.doubleClick().perform();
        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

        action.keyDown(cmdCtrl).sendKeys("c").keyUp(cmdCtrl)
                .sendKeys(Keys.TAB).keyDown(cmdCtrl).sendKeys("v").keyUp(cmdCtrl).perform();
    }


}
