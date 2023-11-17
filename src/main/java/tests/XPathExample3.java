package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BaseTest;

public class XPathExample3 extends BaseTest {
    @Test
    public void example3(){
        JavascriptExecutor jse  = (JavascriptExecutor) driver;
        app.click(app.menu.shopLink);
        Actions action = new Actions(driver);
        action.scrollByAmount(0,700).perform();

        WebElement price999 = driver.findElement(By.xpath("//bdi[text()='9.99']"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", price999);

        String price = price999.getText();
        System.out.println(price);

        System.out.println(price.substring(1,price.length()));

        WebElement currency = driver.findElement(By.xpath("//bdi[text()='9.99']/span"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue')", currency);
        /*
        WebElement priceWithoutCurrency = driver.findElement(By.xpath("//bdi[text()='9.99']/text()"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue')", priceWithoutCurrency);
        */

        WebElement priceSale1120 = driver.findElement(By.xpath("//bdi[text()='10.35']/../../../del//bdi"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid blue')", priceSale1120);

        WebElement rating = driver.findElement(By.xpath("//bdi[text()='10.35']/ancestor::span[@class='price']/preceding-sibling::div"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", rating);

        WebElement addToCart = driver.findElement(By.xpath("(//bdi[text()='18.49'])[2]/../../../following-sibling::a"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", addToCart);

        action.scrollByAmount(0,1000).perform();
        //xpath operators
        /*
         *  = equals
         * != not equals
         * < less than
         * <= less than or equal to
         * > greater than
         * >= greather than or equal to
         * or
         * and
         */

        //less than
        WebElement price7 = driver.findElement(By.xpath("//bdi[text()<8]"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price7);

       //greater than
        WebElement price100 = driver.findElement(By.xpath("//bdi[text()>80.20]"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price100);

        //multiple operators

        WebElement price8020 = driver.findElement(By.xpath("//bdi[text()>80.00 and text()<100]"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid green')", price8020);

        /*
         * Ne referim la elementul care contine 2, adica numarul de pagini din shop (jos sub carti)
         *
         * Varianta mai complexa :
         * //*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '→'))]
         *
         * Varianta mai simpla :
         *	//ul/li[*>1]
         *
         * //*
         * *
         * @*
         *
         *
         */

    }
}
