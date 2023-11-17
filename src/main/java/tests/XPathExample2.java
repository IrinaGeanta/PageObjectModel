package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class XPathExample2 extends BaseTest {
    //xpath access
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

        //following-sibling:: > coboara pe urmatorul frate

        WebElement forgotPass = driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following-sibling::div/a"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:pink; border:4px solid red')", forgotPass);

        //ancestor:: > stie sa urce pe parintic si bunici

        WebElement form = driver.findElement(By.xpath("//input[@id='rememberme']/ancestor::div[@class='form_wrap']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:4px solid red')", form);

        //urc pe stramos cu ancestor si cobor pe copil cu child

        WebElement closeButton = driver.findElement(By.xpath("//input[@id='rememberme']/ancestor::div[@id='popup_login']/child::a[@class='popup_close']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:purple; border:4px solid red')", closeButton);

        //preceding-sibling::  > urca pe fratele precedent
        WebElement rememberForgetBox = driver.findElement(By.xpath("//div[contains(@class, 'submit_field')]/preceding-sibling::div[contains(@class, 'remember_field')]"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:purple; border:4px solid red')", rememberForgetBox);

        //preceding::  -> urca in sus in dom nu are nevoie de relatie de rudenie

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='top_panel_middle']/preceding::input[@class='submit_button']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:purple; border:4px solid pink')", submitButton);



    }
}
