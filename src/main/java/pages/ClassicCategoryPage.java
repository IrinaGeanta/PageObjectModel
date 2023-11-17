package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class ClassicCategoryPage extends SeleniumWrappers {
    public WebDriver driver;
    public ClassicCategoryPage(WebDriver driver){
        this.driver = driver;
    }

    public By bestBusinessBooks = By.xpath("(//a[contains(text(),'business books')])[1]");
}
