package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {
    public WebDriver driver;
    public ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public By cookingWithLoveBookLink = By.linkText("Cooking with love");
    public By aHundredAndOneReceiptsBookLink = By.linkText("A hundred and one receipes");

    public void openDetails(By locator){
        click(locator);
    }

}
