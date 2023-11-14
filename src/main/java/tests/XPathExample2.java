package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class XPathExample2 extends BaseTest {

    @Test
    public void xpathExample(){

        JavascriptExecutor jse  = (JavascriptExecutor) driver;
        //  parent::  --> ne ajuta sa identificam un element pe baza copiilor sai
        //in cazul acesta plecam de la copil si cu ajutorul parent:: selectam parintele
        // --> //a[text()='Login']/parent::li[@class='menu_user_login']

        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']/parent::li[@class='menu_user_login']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", loginLink);

        loginLink.click();

        //descendant::
        WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='log']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", username);

        username.sendKeys("blabla");

        //child::
        // --> //ul[@id='menu_user']/child::li/descendant::form[contains(@class, 'popup_form')]/descendant::input[@id='password' and @type='password']
        // --> //ul//input[@id='password']
        // --> (//input[@id='password'])[1]

        WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/child::li/descendant::input[@id='password']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", password);

        password.sendKeys("blabla");

        /*
         * Diferente majore intre CSS Selector si XPath:
         *
         * 1. Xpath poate sa urce in sus in DOM. Css nu poate decat sa coboare
         * 2. Xpath poate sa citeasca textul dintre tagurile HTML. Css nu poate accesa decat ce se afla intre < >
         * 3. Xpath poate sa acceseze pe baza de index orice element. Css doar list items
         *
         */

        /*
         * following --> stie sa coboare in DOM fara sa tina cont de relatia de mostenire
         *
         * //div[@class='contact_phone_in_top']/following::input[@id='rememberme']
         */

        WebElement rememberme = driver.findElement(By.xpath("//div[@class='contact_phone_in_top']/following::input[@id='rememberme']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", rememberme);
        rememberme.click();
    }
}
