package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class BlogSubMenuPage extends SeleniumWrappers {
    public WebDriver driver;
    public BlogSubMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public By classicOption = By.xpath("(//a[text()='Classic'])[1]");
}
