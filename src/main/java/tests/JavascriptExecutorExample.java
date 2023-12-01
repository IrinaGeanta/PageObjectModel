package tests;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest {

    //@Test
    public void example(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.location='http://emag.ro'");
        //driver.get(url);
        //driver.navigate().to(url); -- toate 3 fac acelasi lucru

        jse.executeScript("window.history.go(-1)");
        //driver.navigate().back();

        jse.executeScript("window.history.forward(-1)");
        //driver.navigate().forward();

        //pt. refresh
        //1
        driver.navigate().refresh();
        //2 actions
        Actions action = new Actions(driver);
        action.sendKeys(Keys.F5).perform();
        //3 javascriptexecutor
        jse.executeScript("window.history.go(0)");
        //4
        driver.get(driver.getCurrentUrl());
    }

    @Test
    public void example2(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //alternativa pt. click()
        jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon)); //nu ar tr sa folosim asa ca dc selenium a identificat un element atunci poate sa si execute actiuni asupra lui

        //alternativa pt. sendKeys()
        jse.executeScript("arguments[0].value='cooking'",app.returnElement(app.menu.searchField));
        jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon));

        jse.executeScript("arguments[0].click(); arguments[1].value='cooking'; arguments[0].click()",app.returnElement(app.menu.searchIcon),app.returnElement(app.menu.searchField));

        jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"); // aici elementul este identificat in consola direct si aici are sens, dc folosim jse dc selenium nu a reusit sa identifice elementul
    }
}
