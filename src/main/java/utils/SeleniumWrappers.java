package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWrappers extends BaseTest{

    public void click(By locator){
        //WebElement element = driver.findElement(locator);
        waitForElementToBeVisible(locator);
        returnElement(locator).click();
    }

    public void sendKeys(By locator, String text){
        waitForElementToBeVisible(locator);
        returnElement(locator).sendKeys(text);
    }

    public WebElement returnElement(By locator){
        waitForElementToBeVisible(locator);
        return driver.findElement(locator);
    }

    public void waitForElementToBeVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isDisplayed(By locator){
        waitForElementToBeVisible(locator);
        return returnElement(locator).isDisplayed();
    }
}
