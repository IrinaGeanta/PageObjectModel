package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers {
    public WebDriver driver;
    public MenuPage(WebDriver driver){
        this.driver = driver;
    }

    //WebElement shopLink = driver.findElement(By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']"));
    //WebElement loginLink = driver.findElement(By.linkText("Login"));

    public By shopLink = By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']");
    public By loginLink = By.linkText("Login");
    public By searchIcon = By.cssSelector("button[class*='icon-search']");
    public By searchField = By.cssSelector("input[class='search_field']");
    public By contactsLink = By.linkText("CONTACTS");
    public By eventsLink = By.linkText("EVENTS");

    public By facebookLink = By.xpath("(//a[contains(@href,'keytraining.ro')])[1]");
    public By twitterLink = By.xpath("(//a[contains(@href,'twitter')])[1]");
    public By instagramLink = By.xpath("(//a[contains(@href,'instagram')])[1]");

    public By blog = By.xpath("(//a[text()='Blog'])[1]");
    public By booksLink = By.xpath("(//a[text() = 'Books'])[1]");
    public By aboutLink = By.linkText("ABOUT");

    public void navigateTo(By locator){
        click(locator);
    }

    public void search(String text){
        click(searchIcon);
        sendKeys(searchField,text);
        click(searchIcon);
    }

}
