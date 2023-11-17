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
    }
}
