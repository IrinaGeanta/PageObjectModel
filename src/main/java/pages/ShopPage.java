package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {
    public WebDriver driver;
    public ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public By cookingWithLoveBookLink = By.linkText("Cooking with love");
    public By aHundredAndOneReceiptsBookLink = By.linkText("A hundred and one receipes");
    public By sliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
    public By sliderFinalPosition = By.cssSelector("span[style='left: 100%;']");

    public By dropdown = By.name("orderby");

    public void selectByValue(String value){
        Select select = new Select(returnElement(dropdown));
        select.selectByValue(value);
    }

    public void selectByIndex(int index){
        Select select = new Select(returnElement(dropdown));
        select.selectByIndex(index);
    }

    public void selectByVisibleText(String text){
        Select select = new Select(returnElement(dropdown));
        select.selectByVisibleText(text);
    }

    public void openDetails(By locator){
        click(locator);
    }

    public String getSelectedOption(){
        Select select = new Select(returnElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }

}
