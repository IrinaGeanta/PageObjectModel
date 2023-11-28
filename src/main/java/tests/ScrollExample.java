package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;
import org.openqa.selenium.interactions.Actions;

public class ScrollExample extends BaseTest {
    //@Test
    public void scrollExample(){

        //JS Executor scroll

        //Actions class scroll
        Actions action = new Actions(driver);
        action.scrollByAmount(0,2500).perform();

    }
    //@Test
    public void scrollToWebElement(){
        //JSExecutor <- TBD

        WebElement signUp= driver.findElement(By.cssSelector("input[value='Sign up']"));
        //Actions class scroll
        Actions action = new Actions(driver);
        //action.moveToElement(signUp).perform();
        action.scrollToElement(signUp).perform();

    }

    @Test
    public void scrollTopAndDown() throws InterruptedException {
        //JSExecutor scroll <- TBD

        //Actions class scroll

        Actions action = new Actions(driver);
        action.sendKeys(Keys.END).perform();
        Thread.sleep(4000);
        action.sendKeys(Keys.HOME).perform();


    }
}
