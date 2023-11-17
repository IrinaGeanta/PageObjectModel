package tests;

import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class BlogCommentTest extends BaseTest {
    @Test
    public void blogComment(){
        app.menu.navigateTo(app.menu.blog);
        app.blogSubMenu.click(app.blogSubMenu.classicOption);
        app.classicCategory.click(app.classicCategory.bestBusinessBooks);
        app.blogPost.sendKeys(app.blogPost.comment, "Best article ever!"+Math.random());
        app.blogPost.sendKeys(app.blogPost.nameField, "Irina");
        app.blogPost.sendKeys(app.blogPost.emailField, "irina@email.com");
        app.blogPost.click(app.blogPost.postCommentButton);

        assertEquals(app.blogPost.returnElement(app.blogPost.commentAwaitsModeration).getText(), "Your comment is awaiting moderation.");

    }
}
