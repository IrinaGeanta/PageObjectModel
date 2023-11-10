package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import utils.SeleniumWrappers;

public class DetailsPage extends SeleniumWrappers {

    public WebDriver driver;
    public DetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public By imageBook = By.cssSelector("figure[class*='gallery']"); // aici am luat tot ala din stange ca nu stiu sagetica la ce pointa acolo in tema :))
    public By bookTitle = By.cssSelector("h1[class*='product_title']");
    public By bookRating = RelativeLocator.with(By.cssSelector("div[class='star-rating']")).below(bookTitle);
    public By bookPrice = RelativeLocator.with(By.cssSelector("span[class*='Price-amount']")).below(bookTitle); // am pus asa ca am vazut ca unele n-au rating
    public By bookDescription = By.cssSelector("div[class*='short-description']>p");
    public By bookQuantity = By.cssSelector("input[name='quantity']");
    public By addToCartButton = By.cssSelector("button[name='add-to-cart']");
    public By bookCategory = By.cssSelector("span[class='posted_in']");
    public By bookTags = By.cssSelector("span[class='tagged_as']");
    public By bookId = By.cssSelector("span[class='product_id']");
}
