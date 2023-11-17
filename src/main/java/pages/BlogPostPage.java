package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class BlogPostPage extends SeleniumWrappers {
    public WebDriver driver;
    public BlogPostPage(WebDriver driver){
        this.driver = driver;
    }
    public By comment = By.xpath("//textarea[@id='comment']");
    public By nameField = By.xpath("//input[@id='author']");
    public By emailField = By.xpath("//input[@id='email']");
    public By postCommentButton = By.xpath("//input[@name='submit']");
    public By commentAwaitsModeration = By.xpath("(//div[@class='comment_not_approved'])[1]");
}
