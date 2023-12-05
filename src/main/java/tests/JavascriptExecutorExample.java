package tests;

import com.beust.ah.A;
import com.sun.security.jgss.GSSUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
    public void example2() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
/*
        //alternativa pt. click()
        jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon)); //nu ar tr sa folosim asa ca dc selenium a identificat un element atunci poate sa si execute actiuni asupra lui

        //alternativa pt. sendKeys()
        jse.executeScript("arguments[0].value='cooking'",app.returnElement(app.menu.searchField));
        jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon));

        jse.executeScript("arguments[0].click(); arguments[1].value='cooking'; arguments[0].click()",app.returnElement(app.menu.searchIcon),app.returnElement(app.menu.searchField));
*/
        //alternativa pt click()
        jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"); // aici elementul este identificat in consola direct si aici are sens, dc folosim jse dc selenium nu a reusit sa identifice elementul
        //alternativa pt sendKeys()
        jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking';");
        jse.executeScript("document.getElementsByClassName('icon-search')[0].click();");

        //Selenium getTitle()
        String title = driver.getTitle();
        System.out.println(title);

        //alternativa pt getTitle()
        String title2 = jse.executeScript("return document.title").toString();
        System.out.println(title2);

        //selenium get current url
        String url= driver.getCurrentUrl();
        System.out.println(url);

        //alternativa pt get current url
        String url2= jse.executeScript("return document.URL").toString();
        System.out.println(url2);

        //alternativa pt isDisplayed
        String isVisible = jse.executeScript("return document.getElementsByClassName('post_title')[0].checkVisibility()").toString();
        System.out.println(isVisible);

        assertEquals(isVisible,"true");

        boolean visible = Boolean.valueOf(isVisible);
        System.out.println(visible);
        assertTrue(visible);

        //alternativa pt getText
        String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[4].childNodes[0].innerText").toString();
        System.out.println(bookTitle);

        assertEquals(bookTitle,"Healthy Lifestyle");

        jse.executeScript("document.getElementsByClassName('popup_link')[0].click()");
        //alternativa pt isSelected
        String isSelected = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
        assertEquals(isSelected,"false");
        jse.executeScript("document.getElementsByName('rememberme')[0].click()");
        String isSelected2 = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
        assertEquals(isSelected2,"true");

        //alternativa pt isEnabled()
        String disabled = jse.executeScript("return document.getElementsByName('log')[0].disabled").toString();
        assertEquals(disabled, "false");

        //reset un formular
        jse.executeScript("document.getElementsByName('log')[0].value='blablabla'");
        jse.executeScript("document.getElementsByName('pwd')[0].value='blablabla'");

        Thread.sleep(2000);
        //ca sa putem face reset trebuie sa identificam elementul de tip form (formularul)
        //<form action="https://keybooks.ro/wp-login.php" method="post" name="login_form" class="popup_form login_form">
        jse.executeScript("document.getElementsByClassName('login_form')[0].reset()");

        //se poate face si submit pe formular
        jse.executeScript("document.getElementsByName('log')[0].value='test'");
        jse.executeScript("document.getElementsByName('pwd')[0].value='test'");
        jse.executeScript("document.getElementsByClassName('login_form')[0].submit()");

        //intoarce systemul pe care execut
        String platform = Platform.getCurrent().toString();
        System.out.println(platform);

        String platform2 = jse.executeScript("return navigator.platform").toString();
        System.out.println(platform2);


    }
}
